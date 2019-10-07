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

    public void setFinishAt(String finishAt) {
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
        return super.toString()+"\nCourse: "+getName()
                +"\nSection:"+getSection();
    }
}
