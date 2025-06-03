/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a4;

import a4.a;
import d4.i;
import d4.n;

public class k {
    public final a a;
    public final a b;

    public k(a a8, a a9) {
        this.a = a8;
        this.b = a9;
    }

    public n a() {
        if (this.a.f()) {
            return this.a.b();
        }
        return null;
    }

    public n b() {
        if (this.b.f()) {
            return this.b.b();
        }
        return null;
    }

    public a c() {
        return this.a;
    }

    public a d() {
        return this.b;
    }

    public k e(i i8, boolean bl, boolean bl2) {
        return new k(new a(i8, bl, bl2), this.b);
    }

    public k f(i i8, boolean bl, boolean bl2) {
        return new k(this.a, new a(i8, bl, bl2));
    }
}

