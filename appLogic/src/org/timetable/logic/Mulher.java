/*
 */
package org.timetable.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Eric <itseric@mail.ru>
 */
class Mulher {
    
    boolean casada = false;
    List<Homem> listaPreferencias = new ArrayList<Homem>();
    int idHorario;
    Homem marido;
    String informacao;
    
    public Mulher(int idHorario, String informacao) {
        this.idHorario = idHorario;
    }

    public void inicializarPreferencias(List<Homem> listaHomens) {
        listaPreferencias = listaHomens;
        Collections.shuffle(listaPreferencias);
    }

    boolean analisarProposta(Homem h) {
        if((!casada) || (listaPreferencias.indexOf(h) > listaPreferencias.indexOf(marido))){
            casada = true;
            marido = h;
            return true;
        }
        else return false;
    }
    
}
