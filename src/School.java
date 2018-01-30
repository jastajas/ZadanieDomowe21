public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Kazimierz", "Nowak", "Matematyka");
        Student student1 = new Student("Jan", "Kowalski", 5);

        teacher1.show();
        System.out.println(" ");
        student1.show();
    }
}
