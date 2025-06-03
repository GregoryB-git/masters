/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.NoSuchElementException
 */
package X2;

import W2.m;
import X2.h0;
import java.util.NoSuchElementException;

public abstract class a
extends h0 {
    public final int o;
    public int p;

    public a(int n8, int n9) {
        m.l(n9, n8);
        this.o = n8;
        this.p = n9;
    }

    public abstract Object b(int var1);

    public final boolean hasNext() {
        if (this.p < this.o) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.p > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.hasNext()) {
            int n8 = this.p;
            this.p = n8 + 1;
            return this.b(n8);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.p;
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            int n8;
            this.p = n8 = this.p - 1;
            return this.b(n8);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.p - 1;
    }
}

