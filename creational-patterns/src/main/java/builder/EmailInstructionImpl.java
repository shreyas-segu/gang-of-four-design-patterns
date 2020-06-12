package builder;

public class EmailInstructionImpl implements EmailInstruction {
    private String subject;
    private String body;
    private String from;
    private String recipient;
    private String attachment;


    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getFrom() {
        return from;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public EmailInstructionImpl build() {
        return this;
    }
}
