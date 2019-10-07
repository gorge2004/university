package Model;

public enum Days {
    SUNDAY("Domingo"),
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miercoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sabado");
    String spanish;
    private Days(String day){
        spanish = day;
    }
    public String getSpanish(){
        return spanish;
    }
}
