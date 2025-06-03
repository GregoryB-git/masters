/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.Executor
 */
package V2;

import A2.n;
import V2.B;
import V2.D;
import V2.F;
import V2.G;
import V2.H;
import V2.b;
import V2.c;
import V2.d;
import V2.e;
import V2.f;
import V2.g;
import V2.h;
import V2.i;
import V2.j;
import V2.l;
import V2.t;
import V2.v;
import V2.x;
import V2.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class K
extends j {
    public final Object a = new Object();
    public final H b = new H();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override
    public final j a(Executor executor, d d8) {
        this.b.a(new x(executor, d8));
        this.y();
        return this;
    }

    @Override
    public final j b(e e8) {
        Executor executor = l.a;
        this.b.a(new z(executor, e8));
        this.y();
        return this;
    }

    @Override
    public final j c(Executor executor, e e8) {
        this.b.a(new z(executor, e8));
        this.y();
        return this;
    }

    @Override
    public final j d(Executor executor, f f8) {
        this.b.a(new B(executor, f8));
        this.y();
        return this;
    }

    @Override
    public final j e(Executor executor, g g8) {
        this.b.a(new D(executor, g8));
        this.y();
        return this;
    }

    @Override
    public final j f(b b8) {
        return this.g(l.a, b8);
    }

    @Override
    public final j g(Executor executor, b b8) {
        K k8 = new K();
        this.b.a(new t(executor, b8, k8));
        this.y();
        return k8;
    }

    @Override
    public final j h(Executor executor, b b8) {
        K k8 = new K();
        this.b.a(new v(executor, b8, k8));
        this.y();
        return k8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Exception i() {
        Object object = this.a;
        synchronized (object) {
            return this.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object j() {
        Object object = this.a;
        synchronized (object) {
            try {
                this.v();
                this.w();
                Exception exception = this.f;
                if (exception != null) throw new h((Throwable)exception);
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object k(Class object) {
        Object object2 = this.a;
        synchronized (object2) {
            try {
                this.v();
                this.w();
                if (object.isInstance((Object)this.f)) {
                    throw (Throwable)object.cast((Object)this.f);
                }
                object = this.f;
                if (object != null) throw new h((Throwable)object);
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final boolean l() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean m() {
        Object object = this.a;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean n() {
        Object object = this.a;
        synchronized (object) {
            try {
                boolean bl;
                boolean bl2 = this.c;
                boolean bl3 = bl = false;
                if (!bl2) return bl3;
                bl3 = bl;
                if (this.d) return bl3;
                bl3 = bl;
                if (this.f != null) return bl3;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final j o(i i8) {
        Executor executor = l.a;
        K k8 = new K();
        this.b.a(new F(executor, i8, k8));
        this.y();
        return k8;
    }

    @Override
    public final j p(Executor executor, i i8) {
        K k8 = new K();
        this.b.a(new F(executor, i8, k8));
        this.y();
        return k8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(Exception exception) {
        n.j((Object)exception, "Exception must not be null");
        Object object = this.a;
        synchronized (object) {
            this.x();
            this.c = true;
            this.f = exception;
        }
        this.b.b(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r(Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            this.x();
            this.c = true;
            this.e = object;
        }
        this.b.b(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean s() {
        Object object = this.a;
        // MONITORENTER : object
        if (this.c) {
            // MONITOREXIT : object
            return false;
        }
        this.c = true;
        this.d = true;
        // MONITOREXIT : object
        this.b.b(this);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean t(Exception exception) {
        n.j((Object)exception, "Exception must not be null");
        Object object = this.a;
        // MONITORENTER : object
        if (this.c) {
            // MONITOREXIT : object
            return false;
        }
        this.c = true;
        this.f = exception;
        // MONITOREXIT : object
        this.b.b(this);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean u(Object object) {
        Object object2 = this.a;
        // MONITORENTER : object2
        if (this.c) {
            // MONITOREXIT : object2
            return false;
        }
        this.c = true;
        this.e = object;
        // MONITOREXIT : object2
        this.b.b(this);
        return true;
    }

    public final void v() {
        n.m(this.c, "Task is not yet complete");
    }

    public final void w() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    public final void x() {
        if (!this.c) {
            return;
        }
        throw c.a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void y() {
        Object object = this.a;
        // MONITORENTER : object
        if (!this.c) {
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        this.b.b(this);
    }
}

