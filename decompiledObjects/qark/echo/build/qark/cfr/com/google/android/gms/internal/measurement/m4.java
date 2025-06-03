/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

public final class m4
implements Iterator {
    public Iterator o;

    public m4(Iterator iterator) {
        this.o = iterator;
    }

    public final boolean hasNext() {
        return this.o.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry)this.o.next();
        entry.getValue();
        return entry;
    }

    public final void remove() {
        this.o.remove();
    }
}

