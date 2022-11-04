package EmailSender;

public class Mail {
    private String email;
    private String message;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Mail(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
