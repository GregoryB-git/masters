/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Arrays
 */
package l1;

import g0.a;
import java.util.Arrays;

public final class w {
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public w(int n8, int n9) {
        this.a = n8;
        byte[] arrby = new byte[n9 + 3];
        this.d = arrby;
        arrby[2] = 1;
    }

    public void a(byte[] arrby, int n8, int n9) {
        if (!this.b) {
            return;
        }
        byte[] arrby2 = this.d;
        int n10 = arrby2.length;
        int n11 = this.e;
        if (n10 < n11 + (n9 -= n8)) {
            this.d = Arrays.copyOf((byte[])arrby2, (int)((n11 + n9) * 2));
        }
        System.arraycopy((Object)arrby, (int)n8, (Object)this.d, (int)this.e, (int)n9);
        this.e += n9;
    }

    public boolean b(int n8) {
        if (!this.b) {
            return false;
        }
        this.e -= n8;
        this.b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void e(int n8) {
        boolean bl = this.b;
        boolean bl2 = true;
        a.f(bl ^ true);
        if (n8 != this.a) {
            bl2 = false;
        }
        this.b = bl2;
        if (bl2) {
            this.e = 3;
            this.c = false;
        }
    }
}

