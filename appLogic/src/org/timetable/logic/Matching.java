/*
 */
package org.timetable.logic;

import java.util.List;

/**
 *
 * @author Eric <itseric@mail.ru>
 */
public class Matching {
    
    List<Homem> listaHomens;
    List<Mulher> listaMulheres;
    int contagemPropostas;
    int totalHomens;

    public Matching(List<Homem> listaHomens, List<Mulher> listaMulheres) {
        this.listaHomens = listaHomens;
        this.listaMulheres = listaMulheres;
        totalHomens = listaHomens.size();
    }
    
    public void inicializarPreferencias(){
        for(Homem h: listaHomens){
            h.inicializarPreferencias(listaMulheres);
        }
        for(Mulher m: listaMulheres){
            m.inicializarPreferencias(listaHomens);
        }
    }
    
    public void casar(){
        do{
            contagemPropostas = 0;
            for(Homem h : listaHomens){
                if(!h.casado){
                    contagemPropostas++;
                    boolean resposta = listaMulheres.get(h.proximaProposta).analisarProposta(h);
                    if(resposta){
                       h.casado = true;
                       h.esposa = listaMulheres.get(h.proximaProposta);
                    }
                    h.proximaProposta++;
                }
            }
        }while(contagemPropostas > 0);
    }

    void mostrarCasamentos() {
        for(Homem h : listaHomens){
            System.out.println(h.informacao + " casado com " + h.esposa.informacao);
        }
    }
    
  
}
