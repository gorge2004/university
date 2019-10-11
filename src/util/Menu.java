package util;

import Model.Genre;
import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<Student> students = new ArrayList<>();

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
    public void loadStudents() {
        students.add(new Student("12345","Jorge","es","1","20/04/1993", Genre.Male) );
        students.add(new Student("123456","nicolas","verde","1","20/04/1992", Genre.Male) );
        students.add(new Student("12345","julio","valle","1","20/04/1995", Genre.Male) );
        students.add(new Student("12345","Jorge","lifstic","1","20/04/1994", Genre.Male) );
        students.add(new Student("12345","Carla","solano","1","20/04/1998", Genre.Female) );
        students.add(new Student("123","Maria","salgado","1","20/04/1999", Genre.Female) );


    }

}

