import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghti_Dar_Baste_Ast_va_Mashin_Roshan_Ast() {

        //Given
        Mashin benz = new Mashin( "Benz");
        Mashin volvo = new Mashin("volvo");


        //When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHaleHarekatAst();



        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);




        
        // Object Mashin
//        Mashin mashin = new Mashin();
//        mashin.BazKardanDAR();
//        mashin.BastanDar();
//        System.out.println("Dar Mashin Baz Ast? " + mashin.ayaDarMashinBazAst);
//        mashin.ayaMashinDarHaleHarekatAst();
//        System.out.println("--------------------------------------");
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.BazKardanDAR();
//        pride.ayaMashinDarHaleHarekatAst();
    }

    //Nested Class
    class Mashin{

        // Constructor
        Mashin(){
            out.println("Yek Mashin bedune Dade Sakhte Shod");
        }
        Mashin(String mark){
            this.mark = mark;
            out.println("Yek Mashin " + this.mark + " Sakhte Shod");

        }


        //Dade: Shakhsiathaa
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String mark;



        //Tabe(Methode): Raftaarhaa
        void roshan() {
            out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush(){
            out.println("Mashin khamoush ast");
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

        boolean ayaMashinDarHaleHarekatAst(){
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println("MashinDarHaleHarekatAst ");
                return true;
            } else {
                out.println("Mashin Park ast");
                return false;
            }
        }

    }
}