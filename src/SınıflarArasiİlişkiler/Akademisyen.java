package SınıflarArasiİlişkiler;

public class Akademisyen {
    private String name;
    private String surname;
    private String dep;

    Akademisyen(String name, String surname, String dep){
        this.name=name;
        this.surname=surname;
        this.dep=dep;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDep() {
        return dep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
