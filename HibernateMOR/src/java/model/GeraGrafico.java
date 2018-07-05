/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Eduardo
 */
public class GeraGrafico {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public boolean exibirGrafico(){
        boolean tiposGraficos = false;
        return tiposGraficos;
    }
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Grafico_Historico", joinColumns = {
    @JoinColumn(name = "id_grafico") },
    inverseJoinColumns = { @JoinColumn(name ="id_historico") })
    private List<Historico> historico = new LinkedList<Historico>();
    
        public List<Historico> getHistorico(){
            return historico;
        }
    
    public void setHistorico(List<Historico> historico){
        this.historico = historico;
    }   
}
