import Model.Course;
import Model.Days;
import Model.Genre;
import Model.Student;
import util.Menu;
import util.MenuAdmin;
import util.MenuStudent;
import util.MenuTeacher;


public class Main {

    public static void main(String[] args) {
        int response = -1;

        do{
            System.out.println("Welcome select a option:");
            System.out.println("1- admin");
            System.out.println("2- student");
            System.out.println("3- teacher");
            System.out.println("0- exit");
            response = Menu.listenDataNumber(0,1,3);
            switch (response){
                case 1:
                    MenuAdmin.showMenu();
                    break;
                case 2:
                    MenuStudent.ShowMenu();
                    break;

                case 3:
                    MenuTeacher.ShowMenu();


            }


        }while (response != 0);



    }


}
