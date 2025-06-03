/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package B4;

import B4.a;
import N4.d;
import java.lang.ref.WeakReference;

public abstract class b
implements a.b {
    public final a o;
    public final WeakReference p;
    public boolean q = false;
    public d r = d.p;

    public b(a a8) {
        this.o = a8;
        this.p = new WeakReference((Object)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(d d8) {
        block3 : {
            block2 : {
                d d9 = this.r;
                d d10 = d.p;
                if (d9 == d10) break block2;
                if (d9 == d8 || d8 == d10) break block3;
                d8 = d.s;
            }
            this.r = d8;
            return;
        }
    }

    public d c() {
        return this.r;
    }

    public void d(int n8) {
        this.o.e(n8);
    }

    public void e() {
        if (this.q) {
            return;
        }
        this.r = this.o.a();
        this.o.j(this.p);
        this.q = true;
    }

    public void f() {
        if (!this.q) {
            return;
        }
        this.o.o(this.p);
        this.q = false;
    }
}

