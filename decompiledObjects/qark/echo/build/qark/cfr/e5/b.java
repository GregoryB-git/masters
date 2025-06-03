/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package e5;

public final class b {
    public final byte[] a;
    public int b;

    public b(int n8) {
        this.a = new byte[n8];
        this.b = 0;
    }

    public void a(boolean bl, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = this.b;
            this.b = n9 + 1;
            this.c(n9, bl);
        }
    }

    public byte[] b(int n8) {
        int n9 = this.a.length * n8;
        byte[] arrby = new byte[n9];
        for (int i8 = 0; i8 < n9; ++i8) {
            arrby[i8] = this.a[i8 / n8];
        }
        return arrby;
    }

    public final void c(int n8, boolean bl) {
        this.a[n8] = (byte)(bl ? 1 : 0);
    }
}

