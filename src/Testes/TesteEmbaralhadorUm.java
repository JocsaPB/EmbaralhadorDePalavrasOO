package Testes;

import Embaralhadores.EmbaralhadorUm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jocsa on 11/04/16.
 */
public class TesteEmbaralhadorUm {

    private EmbaralhadorUm embaralhadorUm;

    @Before
    public void setarVariavel(){
        embaralhadorUm = new EmbaralhadorUm();
    }


    @Test
    public void testarSelecionadorDePalavra(){

        String palavra = embaralhadorUm.selecionarPalavra();
        Assert.assertNotNull(palavra);
    }

    @Test
    public void testarEmbaralharPalavra(){
        String palavraEmbaralhada = embaralhadorUm.embaralhar(embaralhadorUm.selecionarPalavra());
        Assert.assertNotNull(palavraEmbaralhada);
    }


}
