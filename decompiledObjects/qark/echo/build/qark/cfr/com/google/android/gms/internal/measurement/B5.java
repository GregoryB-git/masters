/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.ListIterator
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y5;
import java.util.ListIterator;

public final class B5
implements ListIterator {
    public ListIterator o;
    public final /* synthetic */ int p;
    public final /* synthetic */ y5 q;

    public B5(y5 y52, int n8) {
        this.q = y52;
        this.p = n8;
        this.o = y5.a(y52).listIterator(n8);
    }

    public final /* synthetic */ void add(Object object) {
        object = (String)object;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.o.hasNext();
    }

    public final boolean hasPrevious() {
        return this.o.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String)this.o.next();
    }

    public final int nextIndex() {
        return this.o.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String)this.o.previous();
    }

    public final int previousIndex() {
        return this.o.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object object) {
        object = (String)object;
        throw new UnsupportedOperationException();
    }
}

