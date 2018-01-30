public class Student extends People {

    private int schoolClass;

    public Student(){
    }

    public Student(String firstName, String lastName, int schoolClass){
        super(firstName, lastName);
        this.schoolClass = schoolClass;
    }

    public int getSchoolClass(){
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass){
        this.schoolClass = schoolClass;
    }

    @Override
    public void show(){
        super.show();
        System.out.printf(" Klasa: %d", schoolClass);
    }
}
