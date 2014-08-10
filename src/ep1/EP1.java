/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep1;

import grafo.Arco;
import grafo.Grafo;
import grafo.Vertice;
import java.util.Stack;
import util.LerGrafoTXT;

/**
 *
 * @author charleshenriqueportoferreira
 */
public class EP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LerGrafoTXT leGrafo = new LerGrafoTXT();
        Grafo grafo = leGrafo.LerArquivo(args[0]);
        System.out.println("\nMatriz de distâncias");
        for (int i = 0; i < grafo.getVertices().size(); i++) {
            BFS(grafo, grafo.getVertices().get(i));
            imprimeMatrizDistancias(grafo);
        }
        System.out.println();
    }

    public static void BFS(Grafo grafo, Vertice verticeInicial) {
        for (Vertice vertice : grafo.getVertices()) {
            vertice.setDistancia(Double.POSITIVE_INFINITY);
            vertice.setCor("Branco");
        }

        verticeInicial.setDistancia(0);
        verticeInicial.setCor("Cinza");
        Stack fila = new Stack();
        fila.push(verticeInicial);
        while (!fila.empty()) {
            Vertice verticeAtual = (Vertice) fila.pop();
            for (Arco arco : verticeAtual.getArcos()) {
                Vertice verticeAdjacente = arco.getVerticeDestino();
                if (verticeAdjacente.getCor().equals("Branco")) {
                    verticeAdjacente.setDistancia(verticeAtual.getDistancia() + 1);
                    verticeAdjacente.setCor("Cinza");
                    fila.push(verticeAdjacente);
                }
            }
            verticeAtual.setCor("Preto");
        }
    }

    public static void imprimeMatrizDistancias(Grafo grafo) {
        System.out.println();
        for (Vertice vertice : grafo.getVertices()) {
            System.out.print(vertice.getDistancia() + "\t");
        }
    }

}
