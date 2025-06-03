/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.e5;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class f5
implements Iterator {
    public int o;
    public Iterator p;
    public final /* synthetic */ d5 q;

    public f5(d5 d52) {
        this.q = d52;
        this.o = d5.e(d52).size();
    }

    public /* synthetic */ f5(d5 d52, e5 e52) {
        this(d52);
    }

    public final Iterator b() {
        if (this.p == null) {
            this.p = d5.l(this.q).entrySet().iterator();
        }
        return this.p;
    }

    public final boolean hasNext() {
        int n8 = this.o;
        if (n8 > 0 && n8 <= d5.e(this.q).size() || this.b().hasNext()) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ Object next() {
        int n8;
        Object object;
        if (this.b().hasNext()) {
            object = this.b().next();
            do {
                return (Map.Entry)object;
                break;
            } while (true);
        }
        object = d5.e(this.q);
        this.o = n8 = this.o - 1;
        object = object.get(n8);
        return (Map.Entry)object;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

