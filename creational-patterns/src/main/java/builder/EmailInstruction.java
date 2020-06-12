package builder;

public interface EmailInstruction {
    public void setSubject(String subject);

    public void setBody(String body);

    public void setFrom(String from);

    public void setRecipient(String recipient);

    public void setAttachment(String attachment);
}
