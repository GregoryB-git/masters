/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.util.NoSuchElementException
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.v3;
import java.util.NoSuchElementException;

public final class t3
extends v3 {
    public int o;
    public final int p;
    public final /* synthetic */ q3 q;

    public t3(q3 q32) {
        this.q = q32;
        this.o = 0;
        this.p = q32.S();
    }

    @Override
    public final byte a() {
        int n8 = this.o;
        if (n8 < this.p) {
            this.o = n8 + 1;
            return this.q.M(n8);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        if (this.o < this.p) {
            return true;
        }
        return false;
    }
}

