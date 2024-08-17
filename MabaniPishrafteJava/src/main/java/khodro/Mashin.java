package khodro;

public class Mashin { //DRY : Do not Repeat Yourself


    boolean ayaRoshanAst;
    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;

    public Mashin(){
    }

    public Mashin(String mark){
        this.mark = mark;
    }



    public void roshan() {
        ayaRoshanAst = true;
    }

    void khamoush(){
        ayaRoshanAst = false;
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
