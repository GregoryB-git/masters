/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a4;

import V3.k;
import d4.b;
import d4.i;
import d4.n;

public class a {
    public final i a;
    public final boolean b;
    public final boolean c;

    public a(i i8, boolean bl, boolean bl2) {
        this.a = i8;
        this.b = bl;
        this.c = bl2;
    }

    public i a() {
        return this.a;
    }

    public n b() {
        return this.a.k();
    }

    public boolean c(b b8) {
        if (this.f() && !this.c || this.a.k().Q(b8)) {
            return true;
        }
        return false;
    }

    public boolean d(k k8) {
        if (k8.isEmpty()) {
            if (this.f() && !this.c) {
                return true;
            }
            return false;
        }
        return this.c(k8.Z());
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.b;
    }
}

