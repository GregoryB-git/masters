/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package V3;

import V3.h;
import V3.k;
import V3.m;
import a4.c;
import a4.d;
import a4.e;
import a4.i;
import d4.b;

public class a
extends h {
    public final m d;
    public final Q3.a e;
    public final i f;

    public a(m m8, Q3.a a8, i i8) {
        this.d = m8;
        this.e = a8;
        this.f = i8;
    }

    @Override
    public h a(i i8) {
        return new a(this.d, this.e, i8);
    }

    @Override
    public d b(c c8, i object) {
        Q3.b b8 = Q3.k.a(Q3.k.c(this.d, object.e().U(c8.i())), c8.k());
        object = c8.m() != null ? c8.m().e() : null;
        return new d(c8.j(), this, b8, (String)object);
    }

    @Override
    public void c(Q3.c c8) {
        this.e.a(c8);
    }

    @Override
    public void d(d d8) {
        if (this.h()) {
            return;
        }
        int n8 = .a[d8.b().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return;
                    }
                    this.e.c(d8.e());
                    return;
                }
                this.e.d(d8.e(), d8.d());
                return;
            }
            this.e.e(d8.e(), d8.d());
            return;
        }
        this.e.f(d8.e(), d8.d());
    }

    @Override
    public i e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object instanceof a) {
            object = (a)object;
            if (object.e.equals((Object)this.e) && object.d.equals((Object)this.d) && object.f.equals(this.f)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean f(h h8) {
        if (h8 instanceof a && ((a)h8).e.equals((Object)this.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31 + this.d.hashCode()) * 31 + this.f.hashCode();
    }

    @Override
    public boolean i(e.a a8) {
        if (a8 != e.a.s) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ChildEventRegistration";
    }

}

