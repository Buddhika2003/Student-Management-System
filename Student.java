public class Student{
    private String name;
    private int id;
    private String course;
    private String email;

    public Student(String name, int id, String course, String email) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

}