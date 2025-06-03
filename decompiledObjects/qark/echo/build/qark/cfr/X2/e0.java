/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package X2;

import W2.m;
import java.util.Iterator;

public abstract class e0
implements Iterator {
    public final Iterator o;

    public e0(Iterator iterator) {
        this.o = (Iterator)m.j((Object)iterator);
    }

    public abstract Object b(Object var1);

    public final boolean hasNext() {
        return this.o.hasNext();
    }

    public final Object next() {
        return this.b(this.o.next());
    }

    public final void remove() {
        this.o.remove();
    }
}

