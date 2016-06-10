package Fabricas;

import Interface.MecanicaDoJogo;
import Mecanicas.MecanicaDois;
import Mecanicas.MecanicaUm;

import java.util.Random;

/**
 * Created by jocsa on 11/04/16.
 */
public class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo retornarMecanicaDoJogo(){
        Random random = new Random();

        if (random.nextBoolean()){
            return new MecanicaUm();
        }else{
            return new MecanicaDois();
        }

    }

}
