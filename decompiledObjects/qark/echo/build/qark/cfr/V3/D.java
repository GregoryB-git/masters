/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package V3;

import Q3.b;
import Q3.s;
import V3.h;
import V3.k;
import V3.m;
import a4.c;
import a4.d;
import a4.e;
import a4.i;

public class D
extends h {
    public final m d;
    public final s e;
    public final i f;

    public D(m m8, s s8, i i8) {
        this.d = m8;
        this.e = s8;
        this.f = i8;
    }

    @Override
    public h a(i i8) {
        return new D(this.d, this.e, i8);
    }

    @Override
    public d b(c object, i i8) {
        object = Q3.k.a(Q3.k.c(this.d, i8.e()), object.k());
        return new d(e.a.s, this, (b)object, null);
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
        this.e.b(d8.e());
    }

    @Override
    public i e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object instanceof D) {
            object = (D)object;
            if (object.e.equals((Object)this.e) && object.d.equals((Object)this.d) && object.f.equals(this.f)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean f(h h8) {
        if (h8 instanceof D && ((D)h8).e.equals((Object)this.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31 + this.d.hashCode()) * 31 + this.f.hashCode();
    }

    @Override
    public boolean i(e.a a8) {
        if (a8 == e.a.s) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}

