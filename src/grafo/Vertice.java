/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author charleshenriqueportoferreira
 */
public class Vertice {
    //public static int BRANCO = 0;
    //public static int PRETO = 1;
    private String cor;
    private double distancia;
    private int id;
    private final String nome;
    private final List<Arco> arcos;

    public Vertice(String nome) {
        this.nome = nome;
        arcos = new ArrayList<>();
    }
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void addArco(Arco arco){
        this.arcos.add(arco);
    }

    public List<Arco> getArcos() {
        return arcos;
    }
    
    

}
