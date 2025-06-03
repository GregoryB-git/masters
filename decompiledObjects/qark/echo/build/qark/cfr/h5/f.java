/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package h5;

import g5.a;
import g5.c;
import h5.b;

public final class f {
    public g5.b a;
    public a b;
    public c c;
    public int d = -1;
    public b e;

    public static boolean b(int n8) {
        if (n8 >= 0 && n8 < 8) {
            return true;
        }
        return false;
    }

    public b a() {
        return this.e;
    }

    public void c(a a8) {
        this.b = a8;
    }

    public void d(int n8) {
        this.d = n8;
    }

    public void e(b b8) {
        this.e = b8;
    }

    public void f(g5.b b8) {
        this.a = b8;
    }

    public void g(c c8) {
        this.c = c8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append("<<\n");
        stringBuilder.append(" mode: ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append("\n ecLevel: ");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("\n version: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("\n maskPattern: ");
        stringBuilder.append(this.d);
        if (this.e == null) {
            stringBuilder.append("\n matrix: null\n");
        } else {
            stringBuilder.append("\n matrix:\n");
            stringBuilder.append((Object)this.e);
        }
        stringBuilder.append(">>\n");
        return stringBuilder.toString();
    }
}

