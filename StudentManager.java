import java.util.*;


public class StudentManager{
    private ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students to display.");
        }else{
            System.out.println("---Student List---");
            for(Student students : students){
                System.out.println(students);
                System.out.println("------------------");
            }
        }
    }

    public void deleteStudent(int id){
        boolean removed = students.removeIf(student -> student.getId() == id);

        if(removed){
            System.out.println("Student deleted successfully.");
        }else{
            System.out.println("Student not found.");
        }
    }

    public void searchStudent(String name){
        for(Student s : students){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println(s);
                return;
            }
        }
    
        System.out.println("Student not found.");
    }
}
