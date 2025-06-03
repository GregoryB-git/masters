/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.m5;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class n5
implements Iterator {
    public int o;
    public boolean p;
    public Iterator q;
    public final /* synthetic */ d5 r;

    public n5(d5 d52) {
        this.r = d52;
        this.o = -1;
    }

    public /* synthetic */ n5(d5 d52, m5 m52) {
        this(d52);
    }

    public final Iterator b() {
        if (this.q == null) {
            this.q = d5.i(this.r).entrySet().iterator();
        }
        return this.q;
    }

    public final boolean hasNext() {
        if (this.o + 1 >= d5.e(this.r).size()) {
            if (!d5.i(this.r).isEmpty() && this.b().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ Object next() {
        int n8;
        Object object;
        this.p = true;
        this.o = n8 = this.o + 1;
        if (n8 < d5.e(this.r).size()) {
            object = d5.e(this.r).get(this.o);
            do {
                return (Map.Entry)object;
                break;
            } while (true);
        }
        object = this.b().next();
        return (Map.Entry)object;
    }

    public final void remove() {
        if (this.p) {
            this.p = false;
            d5.n(this.r);
            if (this.o < d5.e(this.r).size()) {
                d5 d52 = this.r;
                int n8 = this.o;
                this.o = n8 - 1;
                d5.c(d52, n8);
                return;
            }
            this.b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

