import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {


        @Test
        public void Mashin_Bayad_Harekat_Konad_Vaghti_Dar_Baste_AST_Va_Mashin_Roshan_Ast(){
            //Given
            Mashin benz = new Mashin("Benz");
            Mashin volvo = new Mashin("Volvo");


            //When
            boolean HarekatMikonad = benz.ayaMashinDarHaleHarekatAst();
            volvo.roshan();
            boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHaleHarekatAst();


            //Then
            assertFalse(HarekatMikonad);
            assertTrue(ayaVolvoHarekatMikonad);






//            //object Mashin
//            Mashin mashin = new Mashin();
//           mashin.bazKardanDar();
//           mashin.bastanDar();
//
//
//            System.out.println("Dar Mashin baz ast ?" + mashin.ayaDarMashinBazAst);
//
//            mashin.harekat();
//
//            System.out.println("-----------------------------------");
//
//            Mashin pride = new Mashin(mashin.mark = "Pride");
//            pride.roshan();
//            pride.bazKardanDar();
//
//            pride.harekat();


        }

    class Mashin{

        //Dade:

        boolean ayaMashinRoshanAST; //false
        boolean ayaDarMashinBazAst; //false
        String mark;

        //Constructor
        Mashin(){
            out.println("Yek Mashin bedone Dade Sakhte Shod");
        }
        Mashin(String mark){
            this.mark = mark;
            out.println("Yek Mashine " + this.mark + " sakhte shod" );

        }


        //Tabe (Method):
        void roshan(){
            out.println("Mashin roshan ast");
            ayaMashinRoshanAST = true;

        }
        void Khamoush(){
            out.println("Mashin Khamoush ast");
            ayaMashinRoshanAST = false;

        }
        void bazKardanDar(){
            out.println("Dar Baz ast");
            ayaDarMashinBazAst = true;

        }
        void bastanDar(){
            out.println("Dar Baste shod");
            ayaDarMashinBazAst = false;
        }
        boolean ayaMashinDarHaleHarekatAst(){
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAST){
                out.println("MashinDarHaleHarekatAst");
                return true;
            } else {
                out.println("Mashin Park ast");
                return false;
            }

        }


    }
}
