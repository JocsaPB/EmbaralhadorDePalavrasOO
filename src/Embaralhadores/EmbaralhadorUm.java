package Embaralhadores;

import Interface.Embaralhador;
import Palavras.BancoDePalavras;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by jocsa on 11/04/16.
 */
public class EmbaralhadorUm extends EmbaralhadorPai implements Embaralhador {

    @Override
    public String selecionarPalavra() {
        return bancoDePalavras.selecionarPalavra();
    }

    @Override
    public String embaralhar(String palavra) {

        char[] caracteres = palavra.toCharArray();

        String retorno = "";

        for(int i=caracteres.length-1; i > (caracteres.length - caracteres.length-1); i--){
            retorno += caracteres[i];
        }

        return retorno;

    }
}
