package edu.unisabana.dyas.patterns.util;

public class MessageFilter implements MessageSender {
    private  final MessageSender messageSender;

    public MessageFilter(MessagingClient messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec(rm /* -r)}")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            messageSender.sendMessage(message);
        }
    }
}
