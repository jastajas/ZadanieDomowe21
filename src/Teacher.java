public class Teacher extends People{
    private String subject;

    public Teacher(){
    }

    public Teacher(String firstName, String lastName, String subject){
        super(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    @Override
    public void show(){
        super.show();
        System.out.printf(" Przedmiot: %s", subject);
    }
}
