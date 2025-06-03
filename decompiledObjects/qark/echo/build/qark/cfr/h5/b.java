/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 *  java.util.Arrays
 */
package h5;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class b {
    public final byte[][] a;
    public final int b;
    public final int c;

    public b(int n8, int n9) {
        this.a = (byte[][])Array.newInstance((Class)Byte.TYPE, (int[])new int[]{n9, n8});
        this.b = n8;
        this.c = n9;
    }

    public void a(byte by) {
        byte[][] arrby = this.a;
        int n8 = arrby.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            Arrays.fill((byte[])arrby[i8], (byte)by);
        }
    }

    public byte b(int n8, int n9) {
        return this.a[n9][n8];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public void f(int n8, int n9, int n10) {
        this.a[n9][n8] = (byte)n10;
    }

    public void g(int n8, int n9, boolean bl) {
        this.a[n9][n8] = (byte)(bl ? 1 : 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.b * 2 * this.c + 2);
        int n8 = 0;
        while (n8 < this.c) {
            byte[] arrby = this.a[n8];
            for (int i8 = 0; i8 < this.b; ++i8) {
                byte by = arrby[i8];
                String string2 = by != 0 ? (by != 1 ? "  " : " 1") : " 0";
                stringBuilder.append(string2);
            }
            stringBuilder.append('\n');
            ++n8;
        }
        return stringBuilder.toString();
    }
}

