package Embaralhadores;

import Interface.Embaralhador;
import Palavras.BancoDePalavras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jocsa on 11/04/16.
 */
public class EmbaralhadorTres extends EmbaralhadorPai implements Embaralhador {

    @Override
    public String selecionarPalavra() {
        return bancoDePalavras.selecionarPalavra();
    }

    @Override
    public String embaralhar(String palavra) {

        char[] caracteres = palavra.toCharArray();
        String retorno = "";

        for (int i=0; i < caracteres.length-1; i++){

            if (i < caracteres.length -1) {

                if (i % 2 == 0) {
                    retorno += String.valueOf(caracteres[i + 1]);
                    retorno += String.valueOf(caracteres[i])+"x";
                }

            }
        }
        retorno += caracteres[caracteres.length-1];
        return retorno;

    }
}
