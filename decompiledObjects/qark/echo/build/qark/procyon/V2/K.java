// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.CancellationException;
import A2.n;
import java.util.concurrent.Executor;

public final class K extends j
{
    public final Object a;
    public final H b;
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;
    
    public K() {
        this.a = new Object();
        this.b = new H();
    }
    
    @Override
    public final j a(final Executor executor, final d d) {
        this.b.a(new x(executor, d));
        this.y();
        return this;
    }
    
    @Override
    public final j b(final e e) {
        this.b.a(new z(l.a, e));
        this.y();
        return this;
    }
    
    @Override
    public final j c(final Executor executor, final e e) {
        this.b.a(new z(executor, e));
        this.y();
        return this;
    }
    
    @Override
    public final j d(final Executor executor, final f f) {
        this.b.a(new B(executor, f));
        this.y();
        return this;
    }
    
    @Override
    public final j e(final Executor executor, final g g) {
        this.b.a(new D(executor, g));
        this.y();
        return this;
    }
    
    @Override
    public final j f(final b b) {
        return this.g(l.a, b);
    }
    
    @Override
    public final j g(final Executor executor, final b b) {
        final K k = new K();
        this.b.a(new t(executor, b, k));
        this.y();
        return k;
    }
    
    @Override
    public final j h(final Executor executor, final b b) {
        final K k = new K();
        this.b.a(new v(executor, b, k));
        this.y();
        return k;
    }
    
    @Override
    public final Exception i() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    @Override
    public final Object j() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                this.v();
                this.w();
                final Exception f = this.f;
                if (f == null) {
                    // monitorexit(a)
                    return this.e;
                }
                throw new h(f);
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final Object k(final Class clazz) {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                this.v();
                this.w();
                if (clazz.isInstance(this.f)) {
                    throw (Throwable)clazz.cast(this.f);
                }
                final Exception f = this.f;
                if (f == null) {
                    // monitorexit(a)
                    return this.e;
                }
                throw new h(f);
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final boolean l() {
        return this.d;
    }
    
    @Override
    public final boolean m() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    @Override
    public final boolean n() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final boolean c = this.c;
                boolean b2;
                final boolean b = b2 = false;
                if (c) {
                    b2 = b;
                    if (!this.d) {
                        b2 = b;
                        if (this.f == null) {
                            b2 = true;
                        }
                    }
                }
                // monitorexit(a)
                return b2;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final j o(final i i) {
        final Executor a = l.a;
        final K k = new K();
        this.b.a(new F(a, i, k));
        this.y();
        return k;
    }
    
    @Override
    public final j p(final Executor executor, final i i) {
        final K k = new K();
        this.b.a(new F(executor, i, k));
        this.y();
        return k;
    }
    
    public final void q(final Exception f) {
        n.j(f, "Exception must not be null");
        synchronized (this.a) {
            this.x();
            this.c = true;
            this.f = f;
            // monitorexit(this.a)
            this.b.b(this);
        }
    }
    
    public final void r(final Object e) {
        synchronized (this.a) {
            this.x();
            this.c = true;
            this.e = e;
            // monitorexit(this.a)
            this.b.b(this);
        }
    }
    
    public final boolean s() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.c) {
                    // monitorexit(a)
                    return false;
                }
                this.c = true;
                this.d = true;
                // monitorexit(a)
                this.b.b(this);
                return true;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean t(final Exception f) {
        n.j(f, "Exception must not be null");
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.c) {
                    // monitorexit(a)
                    return false;
                }
                this.c = true;
                this.f = f;
                // monitorexit(a)
                this.b.b(this);
                return true;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean u(final Object e) {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.c) {
                    // monitorexit(a)
                    return false;
                }
                this.c = true;
                this.e = e;
                // monitorexit(a)
                this.b.b(this);
                return true;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
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
        throw V2.c.a(this);
    }
    
    public final void y() {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (!this.c) {
                    // monitorexit(a)
                    return;
                }
                // monitorexit(a)
                this.b.b(this);
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
