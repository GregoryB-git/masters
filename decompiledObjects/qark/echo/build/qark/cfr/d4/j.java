/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package d4;

import d4.b;
import d4.g;
import d4.h;
import d4.m;
import d4.n;
import d4.t;

public class j
extends h {
    public static final j o = new j();

    public static j j() {
        return o;
    }

    @Override
    public String c() {
        return ".key";
    }

    @Override
    public boolean e(n n8) {
        return true;
    }

    public boolean equals(Object object) {
        return object instanceof j;
    }

    @Override
    public m f(b b8, n n8) {
        Y3.m.f(n8 instanceof t);
        return new m(b.j((String)n8.getValue()), g.W());
    }

    @Override
    public m g() {
        return m.a();
    }

    public int hashCode() {
        return 37;
    }

    public int i(m m8, m m9) {
        return m8.c().h(m9.c());
    }

    public String toString() {
        return "KeyIndex";
    }
}

