package mashin;

import static java.lang.System.out;

public class Mashin {
    // Constructor
    public Mashin(){
        out.println("Yek mashin.Mashin bedune Dade Sakhte Shod");
    }
    public Mashin(String mark){
        this.mark = mark;
        out.println("Yek mashin.Mashin " + this.mark + " Sakhte Shod");

    }


    //Dade: Shakhsiathaa
    boolean ayaMashinRoshanAst;
    boolean ayaDarMashinBazAst;
    String mark;
    Ranande ranande;



    //Tabe(Methode): Raftaarhaa
    public void roshan() {
        out.println("mashin.Mashin roshan ast");
        ayaMashinRoshanAst = true;
    }

    void khamoush(){
        out.println("mashin.Mashin khamoush ast");
        ayaMashinRoshanAst = false;
    }

    void BazKardanDAR(){
        out.println("Dar baz ast");
        ayaDarMashinBazAst = true;
    }

    void BastanDar(){
        out.println("Dar baste shod");
        ayaDarMashinBazAst = false;
    }

    public boolean ayaMashinDarHaleHarekatAst(){
        // dar baste bashad va mashin roshan bashad (rule)
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
            out.println("MashinDarHaleHarekatAst ");
            return true;
        } else {
            out.println("mashin.Mashin Park ast");
            return false;
        }
    }
}
