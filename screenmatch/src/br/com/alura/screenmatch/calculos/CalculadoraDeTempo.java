package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal +=  f.getDuracaoEmMinutos();
//
//
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal +=  s.getDuracaoEmMinutos();
//
//
//    }

    public void inclui(Titulos titulos){
        this.tempoTotal += titulos.getDuracaoEmMinutos();
    }
}
