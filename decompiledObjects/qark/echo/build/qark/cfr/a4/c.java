/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a4;

import a4.e;
import d4.b;
import d4.i;
import d4.n;

public class c {
    public final e.a a;
    public final i b;
    public final i c;
    public final b d;
    public final b e;

    public c(e.a a8, i i8, b b8, b b9, i i9) {
        this.a = a8;
        this.b = i8;
        this.d = b8;
        this.e = b9;
        this.c = i9;
    }

    public static c b(b b8, i i8) {
        return new c(e.a.p, i8, b8, null, null);
    }

    public static c c(b b8, n n8) {
        return c.b(b8, i.d(n8));
    }

    public static c d(b b8, i i8, i i9) {
        return new c(e.a.r, i8, b8, null, i9);
    }

    public static c e(b b8, n n8, n n9) {
        return c.d(b8, i.d(n8), i.d(n9));
    }

    public static c f(b b8, i i8) {
        return new c(e.a.q, i8, b8, null, null);
    }

    public static c g(b b8, i i8) {
        return new c(e.a.o, i8, b8, null, null);
    }

    public static c h(b b8, n n8) {
        return c.g(b8, i.d(n8));
    }

    public static c n(i i8) {
        return new c(e.a.s, i8, null, null, null);
    }

    public c a(b b8) {
        return new c(this.a, this.b, this.d, b8, this.c);
    }

    public b i() {
        return this.d;
    }

    public e.a j() {
        return this.a;
    }

    public i k() {
        return this.b;
    }

    public i l() {
        return this.c;
    }

    public b m() {
        return this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Change: ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.d);
        return stringBuilder.toString();
    }
}

