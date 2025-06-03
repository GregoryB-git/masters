/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.util.NoSuchElementException
 */
package l6;

import W5.B;
import java.util.NoSuchElementException;

public final class b
extends B {
    public final int o;
    public final int p;
    public boolean q;
    public int r;

    public b(int n8, int n9, int n10) {
        this.o = n10;
        this.p = n9;
        boolean bl = true;
        if (!(n10 > 0 ? n8 <= n9 : n8 >= n9)) {
            bl = false;
        }
        this.q = bl;
        if (!bl) {
            n8 = n9;
        }
        this.r = n8;
    }

    @Override
    public int b() {
        int n8 = this.r;
        if (n8 == this.p) {
            if (this.q) {
                this.q = false;
                return n8;
            }
            throw new NoSuchElementException();
        }
        this.r = this.o + n8;
        return n8;
    }

    public boolean hasNext() {
        return this.q;
    }
}

