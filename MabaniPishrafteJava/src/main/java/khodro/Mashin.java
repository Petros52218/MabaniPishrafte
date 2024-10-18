package khodro;

// Mashin yek Khodro ast : Car is a Vehicle // Liskov Substitution Principle
public class Mashin extends Khodro  { //DRY : Do not Repeat Yourself

    boolean ayaDarBazAst;
    String mark;

    Ranande ranande;

    public Mashin(){
    }

    public Mashin(String mark){
        this.mark = mark;
    }




    void bazKardanDAR(){
        ayaDarBazAst = true;
    }

    void bastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        } else {
            return false;
        }
    }
}


