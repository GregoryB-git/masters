/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.u;
import java.util.Iterator;

public final class o
implements Iterator {
    public final /* synthetic */ Iterator o;

    public o(Iterator iterator) {
        this.o = iterator;
    }

    public final boolean hasNext() {
        return this.o.hasNext();
    }

    public final /* synthetic */ Object next() {
        return new u((String)this.o.next());
    }
}

