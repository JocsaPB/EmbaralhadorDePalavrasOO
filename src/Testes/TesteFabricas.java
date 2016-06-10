package Testes;

import Fabricas.FabricaEmbaralhadores;
import Fabricas.FabricaMecanicaDoJogo;
import Interface.Embaralhador;
import Interface.MecanicaDoJogo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jocsa on 11/04/16.
 */
public class TesteFabricas {

    @Test
    public void FabricaEmbaralhadores(){
        FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
        Embaralhador embaralhador = fabricaEmbaralhadores.retornarEmbaralhador();

        Assert.assertNotNull(embaralhador);
    }

    @Test
    public void FabricaMecanicaDoJogo(){
        FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
        MecanicaDoJogo mecanicaDoJogo =  fabricaMecanicaDoJogo.retornarMecanicaDoJogo();

        Assert.assertNotNull(mecanicaDoJogo);


    }


}
