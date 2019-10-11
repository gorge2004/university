package util;

import Model.Student;
import Model.User;

import java.util.concurrent.atomic.AtomicInteger;

public class MenuStudent {

    public static void ShowMenu(){
        int response = -1;
        boolean login =  Menu.studentLogged != null || Menu.loginStudent();
        if (login){
            do {
                System.out.println("Welcome "+Menu.studentLogged.getName()+" , select a valid option");
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

            }while (response != 0);
        }


    }

    private static void removeCourse() {
        int response = -1, numberCourse = 0;
        do {
            System.out.println("Which course would you like?");
            numberCourse = showCourses();
            System.out.println("0- Return");
            response = Menu.listenDataNumber(0,1, numberCourse);
            if (Menu.checkingMenuSelect(1,numberCourse, response)){
                System.out.println(" Are you sure ?");
                System.out.println("1- Yes");
                System.out.println("2- return");
                int auxResponse =  Menu.listenDataNumber(0,1, 2);
                if (auxResponse == 1 )
                    Menu.studentLogged.getSemester().deleteCourse( (response - 1) );
            }
        }while (response != 0 );
    }

    private static int showCourses() {
        AtomicInteger counter = new AtomicInteger(1);
        Menu.studentLogged.getSemester().getCourses().stream().forEach( course ->  System.out.println( counter.getAndIncrement()+" - "+course ) );

        return Menu.studentLogged.getSemester().getCourses().size();
    }

    private static void addCourse() {
        int response = -1;
        int totalOption = MenuAdmin.showCourse();
        response = Menu.listenDataNumber(0,1,totalOption);
        Menu.studentLogged.addCourse( MenuAdmin.getCourse(response - 1));
        System.out.println("Ready!");
        ShowMenu();
    }
}
