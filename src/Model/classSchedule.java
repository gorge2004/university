package Model;

import java.util.ArrayList;

public  class classSchedule {
    static ArrayList<Course> coursesAvailable = new ArrayList<>();

    public static ArrayList<Course> getCoursesAvailable() {
        return coursesAvailable;
    }

    public static void setCoursesAvailable(Course coursesAvailable) {
        classSchedule.coursesAvailable.add(coursesAvailable) ;
    }
    public static void showCourseSchedule(){
        for (Course course : coursesAvailable){
            System.out.println(course);
        }
    }
}
