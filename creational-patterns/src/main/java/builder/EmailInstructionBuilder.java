package builder;

public class EmailInstructionBuilder {
    private final EmailInstructionImpl emailInstruction;

    EmailInstructionBuilder() {
        this.emailInstruction = new EmailInstructionImpl();
        startProcessing();
    }

    private void startProcessing() {
        makeApiCallsToDBtoGetSubject(this.emailInstruction);
    }

    public void makeApiCallsToDBtoGetSubject(EmailInstructionImpl emailInstruction) {
        String subject = "Subject retrieved from database and set";
        EmailInstruction emailInstructionWithSubject = null;
        emailInstruction.setSubject(subject);
        emailInstructionWithSubject = emailInstruction.build();

        setBodyOfEmailInstruction(emailInstructionWithSubject);
    }

    private void setBodyOfEmailInstruction(EmailInstruction emailInstructionWithSubject) {
        String body = "Body from some other source";
        emailInstructionWithSubject.setBody(body);
    }
}
