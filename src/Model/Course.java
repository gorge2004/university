package Model;

import java.util.ArrayList;

public class Course {


    private String name;
    ArrayList<Days> days = new ArrayList<>();



    ArrayList<String> starAt = new ArrayList<>();
    ArrayList<String> finishAt = new ArrayList<>();
    String section = "";
    ArrayList<Test> tests = new ArrayList<>();

    public ArrayList<String> getStarAt() {
        return starAt;
    }

    public void addStarAt(String starAt) {
        this.starAt.add(starAt) ;
    }

    public ArrayList<String> getFinishAt() {
        return finishAt;
    }

    public void addFinishAt(String finishAt) {
        this.finishAt.add(finishAt) ;
    }


    public ArrayList<Days>  getDays() {
        return days;
    }

    public void addDays(  Days day) {
        this.days.add(day);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        String day = "";
        for (int i = 0; i < days.size() ; i++) {
            day += days.get(i)+"/"+days.get(i).getSpanish()+"\nStart: "+starAt.get(i)
                    +"\nFinish: "+finishAt.get(i)+"\n"
                ;

        }
        //return super.toString();
        return "\nCourse: "+getName()
                +"\nSection:"+getSection()
                +"\n"+day;
    }
}
