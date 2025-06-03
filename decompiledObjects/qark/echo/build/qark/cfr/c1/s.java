/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Objects
 */
package c1;

import X2.v;
import c1.g;
import c1.k;
import c1.r;
import c1.t;
import java.util.List;
import java.util.Objects;

public abstract class s {
    public static k a(t t8, byte[] arrby, int n8, int n9) {
        v.a a8 = v.M();
        t.b b8 = t.b.a();
        Objects.requireNonNull((Object)a8);
        t8.c(arrby, n8, n9, b8, new r(a8));
        return new g(a8.k());
    }

    public static void b(t t8) {
    }
}

