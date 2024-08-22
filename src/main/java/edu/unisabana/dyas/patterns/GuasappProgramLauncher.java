package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessageSenderProxy;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();
        
        // Crear una instancia del proxy y pasarle el cliente original
        MessageSender proxyClient = new MessageSenderProxy(originalClient);

        // Utilizar la funcionalidad de la clase proxy
        proxyClient.sendMessage("Hola, ¿cómo estás?");
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
    }
}
