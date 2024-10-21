public class Student {
    private String id;
    private String name;
    private String dateofbirth;
    private String classlist;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", classlist='" + classlist + '\'' +
                '}';
    }

    public Student(String id, String name, String dateofbirth, String classlist) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.classlist = classlist;

    }

}
