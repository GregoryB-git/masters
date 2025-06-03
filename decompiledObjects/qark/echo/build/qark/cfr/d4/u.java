/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package d4;

import d4.b;
import d4.c;
import d4.h;
import d4.m;
import d4.n;

public class u
extends h {
    public static final u o = new u();

    public static u j() {
        return o;
    }

    @Override
    public String c() {
        return ".value";
    }

    @Override
    public boolean e(n n8) {
        return true;
    }

    public boolean equals(Object object) {
        return object instanceof u;
    }

    @Override
    public m f(b b8, n n8) {
        return new m(b8, n8);
    }

    @Override
    public m g() {
        return new m(b.m(), n.l);
    }

    public int hashCode() {
        return 4;
    }

    public int i(m m8, m m9) {
        int n8 = m8.d().compareTo((Object)m9.d());
        if (n8 == 0) {
            return m8.c().h(m9.c());
        }
        return n8;
    }

    public String toString() {
        return "ValueIndex";
    }
}

