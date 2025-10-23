package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhasMusica = new Musica();
        minhasMusica.setTitulo("My love");
        minhasMusica.setCantor("Route 94");

        for (int i = 0; i < 1000 ; i++) {
            minhasMusica.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            minhasMusica.curte();

        }

        Podcast meuPodCast = new Podcast();
        meuPodCast.setTitulo("Crossfit! Bora se movimentar!");
        meuPodCast.getApresentor("Poliana");

        for (int i = 0; i < 5000; i++) {
            meuPodCast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodCast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhasMusica);






    }
}
