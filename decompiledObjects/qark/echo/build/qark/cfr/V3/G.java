/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package V3;

import V3.F;
import V3.k;
import a4.a;
import d4.b;
import d4.h;
import d4.m;
import d4.n;
import java.util.Collections;
import java.util.List;

public class G {
    public final k a;
    public final F b;

    public G(k k8, F f8) {
        this.a = k8;
        this.b = f8;
    }

    public n a(b b8, a a8) {
        return this.b.c(this.a, b8, a8);
    }

    public n b(n n8) {
        return this.c(n8, Collections.emptyList());
    }

    public n c(n n8, List list) {
        return this.d(n8, list, false);
    }

    public n d(n n8, List list, boolean bl) {
        return this.b.d(this.a, n8, list, bl);
    }

    public n e(n n8) {
        return this.b.e(this.a, n8);
    }

    public n f(k k8, n n8, n n9) {
        return this.b.f(this.a, k8, n8, n9);
    }

    public m g(n n8, m m8, boolean bl, h h8) {
        return this.b.g(this.a, n8, m8, bl, h8);
    }

    public G h(b b8) {
        return new G(this.a.U(b8), this.b);
    }

    public n i(k k8) {
        return this.b.o(this.a.T(k8));
    }
}

