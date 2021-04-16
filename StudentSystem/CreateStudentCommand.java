package StudentSystem;
public class CreateStudentCommand {
    public static Student createStudent(String[] data) {

        String name = data[1];
        int age = Integer.parseInt(data[2]);
        double grade = Double.parseDouble(data[3]);
        Student student = new Student(name, age, grade);
        return new Student(name, age, grade);
    }
}
