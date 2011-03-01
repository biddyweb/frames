package com.tinkerpop.frames.util;

import com.tinkerpop.blueprints.pgm.Vertex;
import com.tinkerpop.frames.FramesManager;
import com.tinkerpop.frames.Relation;

import java.util.Iterator;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class FullRelationCollection<T> extends AbstractRelationCollection<T> {


    public FullRelationCollection(final FramesManager manager, final Vertex source, final String label, final Relation.Direction direction, final Class<T> kind) {
        super(manager, source, label, direction, kind);
    }

    public Iterator<T> iterator() {
        return new FullRelationIterator<T>(this);
    }
}
