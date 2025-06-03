/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public class x
implements Iterator {
    public Iterator o;

    public x(Iterator iterator) {
        this.o = iterator;
    }

    public Map.Entry b() {
        Map.Entry entry = (Map.Entry)this.o.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.o.hasNext();
    }

    public void remove() {
        this.o.remove();
    }
}

