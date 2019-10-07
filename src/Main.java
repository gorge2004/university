import Model.Course;
import Model.Days;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Matematicas 1");

        course.addDays(Days.MONDAY);
        course.addDays(Days.THURSDAY);
        System.out.println();
        for (Days day : course.getDays()){
            System.out.println(day.getSpanish());
        }
    }
}
