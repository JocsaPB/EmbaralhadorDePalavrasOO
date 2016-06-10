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
public class EmbaralhadorDois extends EmbaralhadorPai implements Embaralhador {


    @Override
    public String selecionarPalavra() {
        return bancoDePalavras.selecionarPalavra();
    }

    @Override
    public String embaralhar(String palavra) {

        char[] caracteres = palavra.toCharArray();

        for (int i=0; i < caracteres.length-1; i++){

            if (i < caracteres.length - 1) {
                if (i % 2 == 0) {
                    char atual = caracteres[i];
                    caracteres[i] = caracteres[i + 1];
                    caracteres[i + 1] = atual;
                }
            }
        }

        return String.valueOf(caracteres);

    }
}
