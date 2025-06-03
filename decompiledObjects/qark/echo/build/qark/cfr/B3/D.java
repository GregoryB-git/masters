/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package B3;

import B3.A;
import B3.B;
import B3.C;
import r4.a;
import r4.b;

public class D
implements b,
a {
    public static final a.a c = new A();
    public static final b d = new B();
    public a.a a;
    public volatile b b;

    public D(a.a a8, b b8) {
        this.a = a8;
        this.b = b8;
    }

    public static /* synthetic */ Object b() {
        return D.g();
    }

    public static /* synthetic */ void c(a.a a8, a.a a9, b b8) {
        D.h(a8, a9, b8);
    }

    public static /* synthetic */ void d(b b8) {
        D.f(b8);
    }

    public static D e() {
        return new D(c, d);
    }

    public static /* synthetic */ void f(b b8) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(a.a a8, a.a a9, b b8) {
        a8.a(b8);
        a9.a(b8);
    }

    public static D i(b b8) {
        return new D(null, b8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void a(a.a a8) {
        b b8 = this.b;
        b b9 = d;
        if (b8 != b9) {
            a8.a(b8);
            return;
        }
        // MONITORENTER : this
        b8 = this.b;
        if (b8 != b9) {
            b9 = b8;
        } else {
            this.a = new C(this.a, a8);
            b9 = null;
        }
        // MONITOREXIT : this
        if (b9 == null) return;
        a8.a(b8);
    }

    @Override
    public Object get() {
        return this.b.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(b b8) {
        if (this.b == d) {
            a.a a8;
            synchronized (this) {
                a8 = this.a;
                this.a = null;
                this.b = b8;
            }
            a8.a(b8);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}

