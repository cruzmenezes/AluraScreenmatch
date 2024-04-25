package br.com.alura.screenmatch.modelos;

public class Titulos {
    public String name;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDaAvaliacao;
    private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibirFichaTecnica (){
        System.out.println("Ficha Técnica");
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + anoDelancamento);
        System.out.println("Duração em Minutos do Filme: " + duracaoEmMinutos);


    }

    public void avalia (double nota){
        somaDaAvaliacao += nota;
        totalDeAvaliacoes ++;

    }

    public double pegarMedia(){
        return somaDaAvaliacao / totalDeAvaliacoes;
    }
}
