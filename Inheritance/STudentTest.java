public class StudentTest {
    Student[] students = new Student[3];

    public void getDetail() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details of Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].InputData();
        }
    }

    public void displayInfo() {
        System.out.println("\nDetails of Students:");
        for (Student s : students) {
            s.showinfo();
        }
    }
}
