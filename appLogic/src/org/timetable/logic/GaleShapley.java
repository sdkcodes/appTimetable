/*
 */
package org.timetable.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Eric <itseric@mail.ru>
 */
public class GaleShapley {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalDisciplinas;
        
        System.out.println("Digite o número total de disciplinas do currículo: ");
        totalDisciplinas = s.nextInt();
        System.out.println("Digite a seguir os pares de professores e disciplinas: ");
        
        List<Homem> listaProfessoresDisciplinas = new ArrayList<Homem>();
        for (int i = 0; i < totalDisciplinas; i++) {
            System.out.println("Professor:");
            String professor = s.next();
            System.out.println("Disciplina:");
            String disciplina = s.next();     
           
            listaProfessoresDisciplinas.add(new Homem(0, 0, professor + " , " + disciplina));
        }
        
        List<String> diasSemana = new ArrayList<String>();
        diasSemana.add("segunda");
        diasSemana.add("terça");
        diasSemana.add("quarta");
        diasSemana.add("quinta");
        diasSemana.add("sexta");
        
        List<String> horariosDisponiveis = new ArrayList<String>();
        horariosDisponiveis.add("07:30");
        horariosDisponiveis.add("09:30");
        horariosDisponiveis.add("11:30");
        
        List<Mulher> listaHorarios = new ArrayList<Mulher>();
        for(String dia: diasSemana){
            for(String horario : horariosDisponiveis){
                listaHorarios.add(new Mulher(0, dia + " as " + horario));
            }
        }
        
        Matching combinacaoEstavel = new Matching(listaProfessoresDisciplinas, listaHorarios);
        combinacaoEstavel.inicializarPreferencias();
        combinacaoEstavel.casar();
        combinacaoEstavel.mostrarCasamentos();
    }
}
