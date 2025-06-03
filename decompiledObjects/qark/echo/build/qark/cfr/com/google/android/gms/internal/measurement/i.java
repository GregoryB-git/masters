/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.s;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i
implements Iterator {
    public int o;
    public final /* synthetic */ g p;

    public i(g g8) {
        this.p = g8;
        this.o = 0;
    }

    public final boolean hasNext() {
        if (this.o < this.p.U()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        if (this.o < this.p.U()) {
            g g8 = this.p;
            int n8 = this.o;
            this.o = n8 + 1;
            return g8.M(n8);
        }
        int n9 = this.o;
        StringBuilder stringBuilder = new StringBuilder("Out of bounds index: ");
        stringBuilder.append(n9);
        throw new NoSuchElementException(stringBuilder.toString());
    }
}

