package org.example.three;

public interface NewsletterSender {
    void setStmpServer(String smtpServer);
    String getStmpServer();
    void setFromAddress(String fromAddress);
    String getFromAddress();
    void send();
}
