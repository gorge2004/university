package util;

import Model.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class MenuTeacher {
    public static void ShowMenu(){
        int response = -1;

        boolean login =  Menu.teacherLogged != null || Menu.loginTeacher();
        if (login){
            do {
                System.out.println("Welcome "+Menu.teacherLogged.getName()+" , select a valid option");
                System.out.println("1- register a course.");
                System.out.println("2- Delete a course.");
                System.out.println("3- show your courses");
                System.out.println("4- add test to Course");
                System.out.println("0- return");
                response = Menu.listenDataNumber(0,1,4);
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
                    case 4:
                        addTest();

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
        Menu.teacherLogged.getSemester().getCourses().stream().forEach( course ->  System.out.println( counter.getAndIncrement()+" - "+course ) );

        return Menu.teacherLogged.getSemester().getCourses().size();
    }

    private static void addCourse() {
        int response = -1;
        int totalOption = MenuAdmin.showCourse();
        response = Menu.listenDataNumber(0,1,totalOption);
        Menu.teacherLogged.addCourse( MenuAdmin.getCourse(response - 1));
        System.out.println("Ready!");
        ShowMenu();
    }
    private static void addTest() {
        int response = -1, numberCourse = 0;
        do {
            System.out.println("Which course would you like to add?");
            numberCourse = showCourses();
            System.out.println("0- Return");
            response = Menu.listenDataNumber(0,0, numberCourse);
            int aux = -1;
            Test test = new Test();
            if (response != 0){
                do {
                    System.out.println("type your question");
                    String question = Menu.listenDataText(5);
                    test.addQuestion(question);
                    System.out.println("do you want exit?");
                    System.out.println("0- Yes");
                    System.out.println("1- no");
                    aux = Menu.listenDataNumber(0,0,1);
                }while (aux != 0);
                Menu.teacherLogged.getSemester().getCourses().get((response-1)).setTests(test);
            }


        }while (response != 0 );
    }
}
