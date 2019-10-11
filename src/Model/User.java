package Model;

public abstract class User {


    private String dni;
    private Genre genre;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String dni, String password, String name, String lastName, String type, String birthday, Genre genre) {
        this.setDni(dni);
        this.setName(name);
        this.setLastName( lastName);
        this.setType(type);
        this.setBirthday(birthday);
        this.setGenre(genre);
        this.setPassword(password);
    }
    public User(){

    }

    private String name;
    private String lastName;
    private String type;
    private String birthday;
    private String startAt;


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public boolean isEmpty(){
        return  getDni() == null  ;
    }

}
