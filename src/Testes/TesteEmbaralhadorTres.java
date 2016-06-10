package Testes;

import Embaralhadores.EmbaralhadorDois;
import Embaralhadores.EmbaralhadorTres;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jocsa on 11/04/16.
 */
public class TesteEmbaralhadorTres {

    private EmbaralhadorTres embaralhadorTres;

    @Before
    public void setarVariavel(){
        embaralhadorTres = new EmbaralhadorTres();
    }

    @Test
    public void testarSelecionadorDePalavra(){
        String palavra = embaralhadorTres.selecionarPalavra();
        Assert.assertNotNull(palavra);
    }

    @Test
    public void testarEmbaralharPalavra(){
        String palavraEmbaralhada = embaralhadorTres.embaralhar(embaralhadorTres.selecionarPalavra());
        System.out.println("A palavra embaralhada é: "+palavraEmbaralhada);
        Assert.assertNotNull(palavraEmbaralhada);
    }


}
