package Fabricas;

import Embaralhadores.EmbaralhadorDois;
import Embaralhadores.EmbaralhadorTres;
import Embaralhadores.EmbaralhadorUm;
import Interface.Embaralhador;

import java.util.Random;

/**
 * Created by jocsa on 11/04/16.
 */
public class FabricaEmbaralhadores {

    public static Embaralhador retornarEmbaralhador(){

        Random random = new Random();

        int opcao = random.nextInt(3)+1;

        if (opcao==1){
            return new EmbaralhadorUm();
        }else if(opcao==2){
            return new EmbaralhadorDois();
        }else if(opcao==3){
            return new EmbaralhadorTres();
        }else{
            System.out.println("ERRO! EMBARALHADOR NÃO ENCONTRADO!");
            System.exit(0);
            return null;
        }
    }


}
