package util;

import Model.Student;

public class MenuStudent {
    static Student studentLogged ;

    public static void ShowMenu(){
        int response = -1;
            System.out.println("Welcome "+" , select a valid option");
            System.out.println("1- register a course.");
            System.out.println("2- Delete a course.");
            System.out.println("3- show your courses");
            System.out.println("0- return");
            response = Menu.listenDataNumber(0,1,3);
        System.out.println(response);
            switch (response){
                case 1 :
                    addCourse();
                    break;
                case 2:
                    removeCourse();
                    break;
                case 3:
                    showCourses();
                    break;

            }

    }

    private static void removeCourse() {
    }

    private static void showCourses() {
    }

    private static void addCourse() {
        int response = -1;
        int totalOption = MenuAdmin.showCourse();
        response = Menu.listenDataNumber(0,1,totalOption);
        //studentLogged.addCourse(new  Course ());
    }
}
