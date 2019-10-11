package Model;

public class Student extends User {
    private int lvl = 1;

    public Semester getSemester() {
        return semester;
    }

    public void addCourse(Course course) {
        this.semester.addCourses(course);
    }

    private Semester semester = new Semester();


    public Student(String dni, String name, String lastName, String type, String birthday, Genre genre) {
        super(dni, name, lastName, type, birthday, genre);
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
