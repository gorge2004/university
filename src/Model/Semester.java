package Model;

import java.util.ArrayList;

public class Semester {
    private ArrayList<Course> courses = new ArrayList<>();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        this.courses.add(course)  ;
    }
    public void deleteCourse(int index){
        courses.remove(index);
    }
}
