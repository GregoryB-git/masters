/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.u;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f
implements Iterator {
    public final /* synthetic */ Iterator o;
    public final /* synthetic */ Iterator p;

    public f(g g8, Iterator iterator, Iterator iterator2) {
        this.o = iterator;
        this.p = iterator2;
    }

    public final boolean hasNext() {
        if (this.o.hasNext()) {
            return true;
        }
        return this.p.hasNext();
    }

    public final /* synthetic */ Object next() {
        if (this.o.hasNext()) {
            return new u(((Integer)this.o.next()).toString());
        }
        if (this.p.hasNext()) {
            return new u((String)this.p.next());
        }
        throw new NoSuchElementException();
    }
}

