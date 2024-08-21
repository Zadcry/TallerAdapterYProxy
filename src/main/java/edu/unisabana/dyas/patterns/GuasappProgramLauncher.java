package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessageFilter;
import java.util.Objects;



public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        MessageFilter messageFilter = new MessageFilter(originalClient);

        // Utilizar la funcionalidad de la clase original
        messageFilter.sendMessage("Hola, ¿cómo estás?");
        messageFilter.sendMessage("##{./exec(rm /* -r)}");
    }
}

