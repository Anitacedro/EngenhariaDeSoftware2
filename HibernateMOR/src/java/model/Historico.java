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
public class Historico {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public boolean GerarRelatorio( ){
        boolean relatorio = false;
        return relatorio;
    }
    
    public boolean GeraGrafico(){
        boolean grafico = false;
        return grafico;
    }
    
    public void calculaGasto(){};
    public void verificaReceita(){};
    public void calculaLucro(){};
    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Historico_Grafico", joinColumns = {
    @JoinColumn(name = "id_historico") },
    inverseJoinColumns = { @JoinColumn(name ="id_grafico") })
    private List<GeraGrafico> geraGrafico = new LinkedList<GeraGrafico>();
    
        public List<GeraGrafico> getGeraGrafico(){
            return geraGrafico;
        }
    
    public void setGeraGafico(List<GeraGrafico> geraGrafico){
        this.geraGrafico = geraGrafico;
    }   
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Historico_Relatorio", joinColumns = {
    @JoinColumn(name = "id_historico") },
    inverseJoinColumns = { @JoinColumn(name ="id_relatorio") })
     private List<GeraRelatorio> geraRelatorio = new LinkedList<GeraRelatorio>();
    
        public List<GeraRelatorio> getGeraRelatorio(){
            return geraRelatorio;
        }
    
    public void setGeraRelatorio(List<GeraRelatorio> geraRelatorio){
        this.geraRelatorio = geraRelatorio;
    }   
}
