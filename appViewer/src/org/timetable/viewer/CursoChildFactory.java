/*
 */
package org.timetable.viewer;

import model.Curso;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author Eric <itseric@mail.ru>
 */
public class CursoChildFactory extends ChildFactory<Curso>{

    private List<Curso> resultList;

    public CursoChildFactory(List<Curso> resultList) {
        this.resultList = resultList;
    }

    @Override
    protected boolean createKeys(List<Curso> list) {
        for (Curso curso : resultList) {
            list.add(curso);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(Curso c) {
        try {
            return new BeanNode(c);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
            return null;
        }
    }

    
}
