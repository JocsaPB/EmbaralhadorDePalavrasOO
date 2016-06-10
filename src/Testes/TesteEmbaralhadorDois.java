package Testes;

import Embaralhadores.EmbaralhadorDois;
import Embaralhadores.EmbaralhadorUm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jocsa on 11/04/16.
 */
public class TesteEmbaralhadorDois {

    private EmbaralhadorDois embaralhadorDois;

    @Before
    public void setarVariavel(){
        embaralhadorDois = new EmbaralhadorDois();
    }

    @Test
    public void testarSelecionadorDePalavra(){

        String palavra = embaralhadorDois.selecionarPalavra();
        Assert.assertNotNull(palavra);
    }

    @Test
    public void testarEmbaralharPalavra(){
        String palavraEmbaralhada = embaralhadorDois.embaralhar(embaralhadorDois.selecionarPalavra());
        System.out.println("A palavra embaralhada é: "+palavraEmbaralhada);
        Assert.assertNotNull(palavraEmbaralhada);
    }


}
