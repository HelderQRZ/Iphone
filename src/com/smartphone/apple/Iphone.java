package com.smartphone.apple;

import com.smartphone.apple.aplicativo.AparelhoTelefonico;
import com.smartphone.apple.aplicativo.NavegadorDeInternet;
import com.smartphone.apple.aplicativo.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        ReprodutorMusical playerDeMusica = new ReprodutorMusical();
        playerDeMusica.tocar();
        playerDeMusica.pausar();
        playerDeMusica.selecionarMusica("Feel Good Inc - Gorillaz");

        AparelhoTelefonico chamadas = new AparelhoTelefonico();
        chamadas.ligar("123-456-7890");
        chamadas.atender();
        chamadas.iniciarCorreioVoz();

        NavegadorDeInternet safari = new NavegadorDeInternet();
        safari.exibirPagina("https://www.example.com");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
    }
}