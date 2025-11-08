
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do { 
            System.out.println("---Student Management System---");
            System.out.println("1. Add Student ");
            System.out.println("2. Display All Students ");
            System.out.println("3. Exit ");
            System.out.println("4.Delete Student ");
            System.out.println("5.Search Student ");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                System.out.println("Enter student ID: ");
                int id=sc.nextInt();
                sc.nextLine();
                
                System.out.println("Enter student name: ");
                String name = sc.nextLine();
                
                System.out.println("Enter student course: ");
                String course = sc.nextLine();
                
                System.out.println("Enter student email: ");
                String email = sc.nextLine();

                manager.addStudent(new Student(name, id, course, email));
                break;

                case 2:
                manager.displayAllStudents();
                break;
                
                case 3:
                System.out.println("Exited...");
                break;

                case 4:
                System.out.println("Enter student ID to delete: ");
                int deleteId=sc.nextInt();
                manager.deleteStudent(deleteId);
                break;

                case 5:
                System.out.println("Enter student name to search: ");
                String searchName = sc.nextLine();
                manager.searchStudent(searchName);
                break;
                default:
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        sc.close();
    }

}
