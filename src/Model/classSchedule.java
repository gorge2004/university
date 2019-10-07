package Model;

import java.util.ArrayList;

public  class classSchedule {
    static ArrayList<Course> coursesAvailable = new ArrayList<>();

    public static ArrayList<Course> getCoursesAvailable() {
        return coursesAvailable;
    }

    public static void setCoursesAvailable(ArrayList<Course> coursesAvailable) {
        classSchedule.coursesAvailable = coursesAvailable;
    }
}
