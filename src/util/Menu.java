package util;

import Model.Genre;
import Model.Student;
import Model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static Student studentLogged ;
    static Teacher teacherLogged =  new Teacher();

    public static int listenDataNumber(int breakCond, int from, int to){
        int response = -1;
        boolean cond = true;
        do{
        try {
            response = Integer.parseInt(scannerText());

        }catch (NumberFormatException e){
            System.err.println("MUST BE A NUMBER");

        }
            cond = checkingMenuSelect(from, to, response);
        if(!cond){
            System.out.println("you MUST choose a valid option please");
        }else
            break;

        }while (response != breakCond );
        return  response;

    }
    public static String listenDataText(int minChar){
        String response = "";
        boolean condition ;

        do {
            response = scannerText();
            condition = checkingTextLength(minChar, response.length());
            if (condition){
                System.out.println("it is very short, you type something longer");
            }
        }while(condition);
        return response;
    }
    public  static String scannerText(){
        Scanner sc = new Scanner(System.in);
        return  sc.nextLine();
    }

    public static boolean checkingMenuSelect(int a,int b, int response)
    {
        return response >=  a && response <= b;

    }
    public static boolean checkingTextLength(int minChar, int lenghtString){
        return lenghtString < minChar;
    }
    public static void loadStudents() {
        students.add(new Student("12345", "1234","Jorge","es","1","20/04/1993", Genre.Male) );
        students.add(new Student("123456","1234","nicolas","verde","1","20/04/1992", Genre.Male) );
        students.add(new Student("12345","1234","julio","valle","1","20/04/1995", Genre.Male) );
        students.add(new Student("12345","1234","Jorge","lifstic","1","20/04/1994", Genre.Male) );
        students.add(new Student("12345","1234","Carla","solano","1","20/04/1998", Genre.Female) );
        students.add(new Student("123","1234","Maria","salgado","1","20/04/1999", Genre.Female) );


    }
    public void loadTeacher() {
        teachers.add(new Teacher("12345", "1234","Jorge","es","1","20/04/1993", Genre.Male) );
        teachers.add(new Teacher("123456","1234","nicolas","verde","1","20/04/1992", Genre.Male) );
        teachers.add(new Teacher("12345","1234","julio","valle","1","20/04/1995", Genre.Male) );
        teachers.add(new Teacher("12345","1234","Jorge","lifstic","1","20/04/1994", Genre.Male) );
        teachers.add(new Teacher("12345","1234","Carla","solano","1","20/04/1998", Genre.Female) );
        teachers.add(new Teacher("1235","1234","Maria","salgado","1","20/04/1999", Genre.Female) );


    }
    public static  boolean loginStudent(){
        ArrayList<Student> users = students;
        String dni = "";
        String password = "";
        boolean correctUser = false;
        loadStudents();
        do {
            System.out.println("Type your DNI(EXIT to return)");
            dni = Menu.listenDataText(4);

            if (dni.equals("EXIT")){
                break;

            }
            System.out.println("Type your Password");
            password = Menu.listenDataText(4);

            for (Student user :  users){
                if(user.getDni().equals(dni) ){
                    correctUser = user.getPassword().equals(password);
                    if(!correctUser){
                        System.out.println("Invalid password");
                    }else {
                        studentLogged = user;
                    }
                    break;
                }
            }

        }while (!correctUser);
        return  correctUser;
    }

}

