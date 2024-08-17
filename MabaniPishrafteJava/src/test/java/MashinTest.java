import mashin.Mashin;
import org.junit.jupiter.api.Test;

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




        // Object mashin.Mashin
//        mashin.Mashin mashin = new mashin.Mashin();
//        mashin.BazKardanDAR();
//        mashin.BastanDar();
//        System.out.println("Dar mashin.Mashin Baz Ast? " + mashin.ayaDarMashinBazAst);
//        mashin.ayaMashinDarHaleHarekatAst();
//        System.out.println("--------------------------------------");
//        mashin.Mashin pride = new mashin.Mashin("pride");
//        pride.roshan();
//        pride.BazKardanDAR();
//        pride.ayaMashinDarHaleHarekatAst();
    }


}