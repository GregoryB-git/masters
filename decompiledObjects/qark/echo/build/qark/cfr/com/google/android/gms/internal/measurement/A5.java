/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y5;
import java.util.Iterator;

public final class A5
implements Iterator {
    public Iterator o;
    public final /* synthetic */ y5 p;

    public A5(y5 y52) {
        this.p = y52;
        this.o = y5.a(y52).iterator();
    }

    public final boolean hasNext() {
        return this.o.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String)this.o.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

