public class People {
    private String firstName;
    private String lastName;

    public People(){
    }

    public People(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public void show(){
        System.out.printf("Imię: %s, Nazwisko: %s.", firstName, lastName);
    }
}
