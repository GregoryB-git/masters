/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package V3;

import Q3.c;
import V3.i;
import Y3.m;
import a4.d;
import a4.e;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class h {
    public AtomicBoolean a = new AtomicBoolean(false);
    public i b;
    public boolean c = false;

    public abstract h a(a4.i var1);

    public abstract d b(a4.c var1, a4.i var2);

    public abstract void c(c var1);

    public abstract void d(d var1);

    public abstract a4.i e();

    public abstract boolean f(h var1);

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.a.get();
    }

    public abstract boolean i(e.a var1);

    public void j(boolean bl) {
        this.c = bl;
    }

    public void k(i i8) {
        boolean bl = this.h();
        boolean bl2 = true;
        m.f(bl ^ true);
        if (this.b != null) {
            bl2 = false;
        }
        m.f(bl2);
        this.b = i8;
    }

    public void l() {
        i i8;
        if (this.a.compareAndSet(false, true) && (i8 = this.b) != null) {
            i8.a(this);
            this.b = null;
        }
    }
}

