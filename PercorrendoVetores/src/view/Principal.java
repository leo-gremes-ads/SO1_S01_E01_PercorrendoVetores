package view;

import controller.*;

public class Principal
{
    public static void main(String[] args)
    {
        PercorreVetor pv = new PercorreVetor();
        int[] hum = new int[1000];
        int[] dez = new int[10000];
        int[] cem = new int[100000];

        System.out.println();
        System.out.println("Vetor com 1.000 posições:");
        System.out.print("\t      Tamahnho no laço: ");
        pv.percorrerSemTamanho(hum);
        System.out.print("\tTamanho como parâmetro: ");
        pv.percorrerComTamanho(hum, 1000);
        System.out.println();
        System.out.println("Vetor com 10.000 posições:");
        System.out.print("\t      Tamahnho no laço: ");
        pv.percorrerSemTamanho(dez);
        System.out.print("\tTamanho como parâmetro: ");
        pv.percorrerComTamanho(dez, 10000);
        System.out.println();
        System.out.println("Vetor com 100.000 posições:");
        System.out.print("\t      Tamahnho no laço: ");
        pv.percorrerSemTamanho(cem);
        System.out.print("\tTamanho como parâmetro: ");
        pv.percorrerComTamanho(cem, 100000);
        System.out.println();
    }
}