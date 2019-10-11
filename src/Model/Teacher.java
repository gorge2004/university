package Model;


public class Teacher extends User implements CRUDSemester {

    private Semester semester = new Semester();

    public Semester getSemester() {
        return semester;
    }

    public void addCourse(Course course) {
        this.semester.addCourses(course) ;
    }

    public Teacher(String dni, String password, String name, String lastName, String type, String birthday, Genre genre) {
        super(dni, password, name, lastName, type, birthday, genre);
    }
    public Teacher(){

    }
}
