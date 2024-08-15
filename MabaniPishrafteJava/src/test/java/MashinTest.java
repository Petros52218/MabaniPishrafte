import org.junit.jupiter.api.Test;

public class MashinTest {
    //Nested Class
    class Mashin{

        //Dade: Shakhsiathaa
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;



        //Tabe(Methode): Raftaarhaa
        void roshan() {
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush(){
            System.out.println("Mashin khamoush ast");
            ayaMashinRoshanAst = false;
        }

        void BazKardanDAR(){
            System.out.println("Dar baz ast");
            ayaDarMashinBazAst = true;
        }

        void BastanDar(){
            System.out.println("Dar baste shod");
            ayaDarMashinBazAst = false;
        }

        void Harekat(){
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("MashinDarHaleHarekatAst ");
            } else {
                System.out.println("Mashin Park ast");
            }
        }

    }
}