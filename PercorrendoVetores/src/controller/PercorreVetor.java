package controller;

public class PercorreVetor
{
    public PercorreVetor()
    {
        super();
    }

    public void percorrerSemTamanho(int[] vetor)
    {
        double inicio = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            //Nada aqui!!!
        }
        double termino = System.nanoTime();
        double tempoTotal = (termino - inicio) / Math.pow(10, 9);
        System.out.println("Tempo: " + String.format("%.7f", tempoTotal) + " s");
    }

    public void percorrerComTamanho(int[] vetor, int tamanho)
    {
        double inicio = System.nanoTime();
        for (int i = 0; i < tamanho; i++) {
            //Nada aqui!!!
        }
        double termino = System.nanoTime();
        double tempoTotal = (termino - inicio) / Math.pow(10, 9);
        System.out.println("Tempo: " + String.format("%.7f", tempoTotal) + " s");
    }
}
