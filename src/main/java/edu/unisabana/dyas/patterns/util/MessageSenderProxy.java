package edu.unisabana.dyas.patterns.util;

import java.util.logging.Logger;

public class MessageSenderProxy implements MessageSender {
    private static final Logger LOGGER = Logger.getLogger(MessageSenderProxy.class.getName());
    private final MessagingClient originalClient;

    public MessageSenderProxy(MessagingClient originalClient) {
        this.originalClient = originalClient;
    }

    @Override
    public void sendMessage(String message) {
        // Verificar si el mensaje contiene contenido peligroso
        if (message.contains("##{./exec(rm /* -r)}")) {
            LOGGER.warning("Mensaje bloqueado debido a contenido peligroso");
        } else {
            // Delegar el envío del mensaje a la instancia original
            originalClient.sendMessage(message);
        }
    }
}
