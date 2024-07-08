import org.junit.jupiter.api.Test;

public class MashinTest {

    //Nested Class
    class Mashin{

        //Dade:
        boolean ayaMashinRoshanAST;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;

        //Tabe (Method):

        void roshan(){
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAST = true;

        }
        void khamoush(){
            System.out.println("Mashin Khamoush ast");
            ayaMashinRoshanAST = false;

        }
        void bazKardanDar(){
            System.out.println("Dar Baz ast");
            ayaDarMashinBazAst = true;

        }
        void bastanDar(){
            System.out.println("Dar Baste shod");
            ayaDarMashinBazAst = false;
        }
        void harekat(){
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAST){
                System.out.println("MashinDarHaleHarekatAst");
            } else {
                System.out.println("Mashin Park ast");
            }

        }


    }
}
