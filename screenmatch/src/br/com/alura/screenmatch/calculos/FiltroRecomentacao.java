package br.com.alura.screenmatch.calculos;

public class FiltroRecomentacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");

        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("Muito bem avaliado no momento!");

        }
        else {
            System.out.println("coloque na sua lista para assister depois");
        }
    }
}
