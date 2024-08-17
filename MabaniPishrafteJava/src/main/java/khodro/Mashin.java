package khodro;

// Mashin yek Khodro ast : Car is a Vehicle // Liskov Substitution Principle
public class Mashin extends Khodro { //DRY : Do not Repeat Yourself

    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;

    public Mashin(){
    }

    public Mashin(String mark){
        this.mark = mark;
    }


    void BazKardanDAR(){
        ayaDarBazAst = true;
    }

    void BastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst(){
        if (!ayaDarBazAst && ayaRoshanAst){
            return true;
        } else {
            return false;
        }
    }
}
