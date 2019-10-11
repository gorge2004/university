package util;

import Model.Course;
import Model.Days;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuAdmin {
    static ArrayList<Course> courses = new ArrayList<>();

    public static void showMenu(){
        int response = -1;
        do{
            try {
                System.out.println("you choose a option:");
                System.out.println("1- Add course");
                System.out.println("2- Remove course");
                System.out.println("3- Show course");
                System.out.println("0- Return");
                response = Integer.parseInt(scannerText());
                switch (response){
                    case 1:
                        addCourse();
                        break;
                    case 2:
                        deleteCourse();
                        break;
                    case 3 :
                        showCourse();
                        break;
                }
            }catch (NumberFormatException e){
                System.err.println("MUST BE A NUMBER");
            }

            optionCheckingMessage(0,3,response) ;
        }while ( response != 0   );

    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static  Course getCourse(int i){
        return courses.get(i);
    }
    public static void addCourse(){
        Course course = new Course();

        int days = 0;

        course.setName(  typingData(3,"Type course's name"));
        course.setSection(typingData(1, "type course's section"));
        days =  Integer.parseInt(typingData(1,"how many weekdays have Course?"));
        addDays(days, course);
        courses.add(course);

    }

    public static void  addDays(int days, Course course){
        for (int i = 0; i < days ; i++) {
            System.out.println("Select a day:");
            System.out.println("1- Monday");
            System.out.println("2- Tuesday");
            System.out.println("3- Wednesday");
            System.out.println("4- thursday");
            System.out.println("5- friday");
            System.out.println("6- saturday");
            System.out.println("7- sunday");
            int aux = -1;
            do {
                aux = Integer.parseInt( scannerText() );
                optionCheckingMessage(1,7, aux);
            }while (!checkingMenuSelect(1,7,aux));
            switch (aux){
                case 1 :
                    course.addDays(Days.MONDAY);
                    break;
                case 2 :
                    course.addDays(Days.TUESDAY);
                    break;
                case 3 :
                    course.addDays(Days.WEDNESDAY);
                    break;
                case 4 :
                    course.addDays(Days.THURSDAY);
                    break;
                case 5 :
                    course.addDays(Days.FRIDAY);
                    break;
                case 6 :
                    course.addDays(Days.SATURDAY);
                    break;
                case 7 :
                    course.addDays(Days.SUNDAY);
                    break;
            }
            String startAt = "";
            startAt =  typingData(5,"Type start time(00:00 / 23:59):");
            course.addStarAt(startAt);

            String finishAt = "";
            finishAt =  typingData(5,"Type finish time(00:00 / 23:59):");
            course.addFinishAt(finishAt);


        }
    }

    public static void deleteCourse(){
        boolean auxResponse = false;
        int response = -1;


        do {
            AtomicInteger count = new AtomicInteger(1);
            System.out.println("which course would you like to delete?");
            for (Course course: courses){
                System.out.println(count.getAndIncrement()+"- "+course.getName()+" section: "+course.getSection());

            }
            try {
                System.out.println("0- Return");
                response = Integer.parseInt(scannerText());

            }catch (NumberFormatException e){
                System.err.println("MUST BE A NUMBER");
            }
            auxResponse = (checkingMenuSelect(1,count.get(),response));
            if (auxResponse){
                deletingCourse((response-1));
            }else if(response != 0){
                System.out.println("wrong. select a valid option");
            }

        }while (response != 0);

    }

    public static void deletingCourse( int index) {
        int response = -1;

        System.out.println("are you sure you would want to remove it?");
        System.out.println(courses.get(index));
        System.out.println("1- Yes");
        System.out.println("2- No");
        response = Integer.parseInt(scannerText());
        if(response == 1){
            courses.remove(index);
        }

    }


    public static void optionCheckingMessage(int a,int b, int response){
        boolean condition = checkingMenuSelect(a,b, response);
        if (!condition){
            System.out.println("you choose a valid option please");
        }
    }
    public static boolean checkingMenuSelect(int a,int b, int response){
        return response >=  a && response <= b;
    }
    public  static String scannerText(){
        Scanner sc = new Scanner(System.in);
        return  sc.nextLine();
    }
    public static String typingData(int min,String question){

        String txt= "";
        System.out.println(question);

        do {
            txt = scannerText();
            if ( txt.length()< min){
                System.out.println("it is very short, you type something longer");
            }
        }while ( txt.length()< min);
        return txt;
    }
    public static int showCourse(){

        AtomicInteger counter = new AtomicInteger(1);
        courses.stream().forEach(course -> System.out.println(counter.getAndIncrement()+"- "+course)
        );
        return courses.size();

    }
}
