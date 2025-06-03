/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.u;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class x
implements Iterator {
    public int o;
    public final /* synthetic */ u p;

    public x(u u8) {
        this.p = u8;
        this.o = 0;
    }

    public final boolean hasNext() {
        if (this.o < u.a(this.p).length()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        if (this.o < u.a(this.p).length()) {
            int n8 = this.o;
            this.o = n8 + 1;
            return new u(String.valueOf((int)n8));
        }
        throw new NoSuchElementException();
    }
}

