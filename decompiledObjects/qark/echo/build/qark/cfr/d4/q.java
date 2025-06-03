/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package d4;

import d4.b;
import d4.c;
import d4.h;
import d4.m;
import d4.n;
import d4.o;
import d4.t;

public class q
extends h {
    public static final q o = new q();

    public static q j() {
        return o;
    }

    @Override
    public String c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override
    public boolean e(n n8) {
        return n8.t().isEmpty() ^ true;
    }

    public boolean equals(Object object) {
        return object instanceof q;
    }

    @Override
    public m f(b b8, n n8) {
        return new m(b8, new t("[PRIORITY-POST]", n8));
    }

    @Override
    public m g() {
        return this.f(b.m(), n.l);
    }

    public int hashCode() {
        return 3155577;
    }

    public int i(m m8, m m9) {
        n n8 = m8.d().t();
        n n9 = m9.d().t();
        return o.c(m8.c(), n8, m9.c(), n9);
    }

    public String toString() {
        return "PriorityIndex";
    }
}

