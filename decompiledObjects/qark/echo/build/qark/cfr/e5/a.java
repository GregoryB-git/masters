/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 */
package e5;

import e5.b;
import java.lang.reflect.Array;

public final class a {
    public final b[] a;
    public int b;
    public final int c;
    public final int d;

    public a(int n8, int n9) {
        b[] arrb = new b[n8];
        this.a = arrb;
        int n10 = arrb.length;
        for (int i8 = 0; i8 < n10; ++i8) {
            this.a[i8] = new b((n9 + 4) * 17 + 1);
        }
        this.d = n9 * 17;
        this.c = n8;
        this.b = -1;
    }

    public b a() {
        return this.a[this.b];
    }

    public byte[][] b(int n8, int n9) {
        int n10 = this.c;
        int n11 = this.d;
        byte[][] arrby = (byte[][])Array.newInstance((Class)Byte.TYPE, (int[])new int[]{n10 * n9, n11 * n8});
        n11 = this.c * n9;
        for (n10 = 0; n10 < n11; ++n10) {
            arrby[n11 - n10 - 1] = this.a[n10 / n9].b(n8);
        }
        return arrby;
    }

    public void c() {
        ++this.b;
    }
}

