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
public class Homem {
    
    boolean casado = false;
    List<Mulher> listaPreferencias = new ArrayList<Mulher>();
    int idDisciplina;
    int idProfessor;
    Mulher esposa;
    int proximaProposta = 0;
    String informacao;
    
    public Homem(int idDisciplina, int idProfessor, String informacao) {
        this.idDisciplina = idDisciplina;
        this.idProfessor = idProfessor;
        this.informacao = informacao;
    }

    public void inicializarPreferencias(List<Mulher> listaMulheres) {
        listaPreferencias = listaMulheres;
        Collections.shuffle(listaPreferencias);
    }

    
    
}
