/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.ListIterator
 */
package X2;

import X2.e0;
import java.util.Iterator;
import java.util.ListIterator;

public abstract class f0
extends e0
implements ListIterator {
    public f0(ListIterator listIterator) {
        super((Iterator)listIterator);
    }

    public void add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator d() {
        return (ListIterator)this.o;
    }

    public final boolean hasPrevious() {
        return this.d().hasPrevious();
    }

    public final int nextIndex() {
        return this.d().nextIndex();
    }

    public final Object previous() {
        return this.b(this.d().previous());
    }

    public final int previousIndex() {
        return this.d().previousIndex();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException();
    }
}

