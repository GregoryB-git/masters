package V2;

import A2.AbstractC0328n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class K extends AbstractC0659j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6433a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final H f6434b = new H();

    /* renamed from: c, reason: collision with root package name */
    public boolean f6435c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6436d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6437e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f6438f;

    @Override // V2.AbstractC0659j
    public final AbstractC0659j a(Executor executor, InterfaceC0653d interfaceC0653d) {
        this.f6434b.a(new x(executor, interfaceC0653d));
        y();
        return this;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j b(InterfaceC0654e interfaceC0654e) {
        this.f6434b.a(new z(AbstractC0661l.f6442a, interfaceC0654e));
        y();
        return this;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j c(Executor executor, InterfaceC0654e interfaceC0654e) {
        this.f6434b.a(new z(executor, interfaceC0654e));
        y();
        return this;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j d(Executor executor, InterfaceC0655f interfaceC0655f) {
        this.f6434b.a(new B(executor, interfaceC0655f));
        y();
        return this;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j e(Executor executor, InterfaceC0656g interfaceC0656g) {
        this.f6434b.a(new D(executor, interfaceC0656g));
        y();
        return this;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j f(InterfaceC0651b interfaceC0651b) {
        return g(AbstractC0661l.f6442a, interfaceC0651b);
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j g(Executor executor, InterfaceC0651b interfaceC0651b) {
        K k7 = new K();
        this.f6434b.a(new t(executor, interfaceC0651b, k7));
        y();
        return k7;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j h(Executor executor, InterfaceC0651b interfaceC0651b) {
        K k7 = new K();
        this.f6434b.a(new v(executor, interfaceC0651b, k7));
        y();
        return k7;
    }

    @Override // V2.AbstractC0659j
    public final Exception i() {
        Exception exc;
        synchronized (this.f6433a) {
            exc = this.f6438f;
        }
        return exc;
    }

    @Override // V2.AbstractC0659j
    public final Object j() {
        Object obj;
        synchronized (this.f6433a) {
            try {
                v();
                w();
                Exception exc = this.f6438f;
                if (exc != null) {
                    throw new C0657h(exc);
                }
                obj = this.f6437e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // V2.AbstractC0659j
    public final Object k(Class cls) {
        Object obj;
        synchronized (this.f6433a) {
            try {
                v();
                w();
                if (cls.isInstance(this.f6438f)) {
                    throw ((Throwable) cls.cast(this.f6438f));
                }
                Exception exc = this.f6438f;
                if (exc != null) {
                    throw new C0657h(exc);
                }
                obj = this.f6437e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // V2.AbstractC0659j
    public final boolean l() {
        return this.f6436d;
    }

    @Override // V2.AbstractC0659j
    public final boolean m() {
        boolean z7;
        synchronized (this.f6433a) {
            z7 = this.f6435c;
        }
        return z7;
    }

    @Override // V2.AbstractC0659j
    public final boolean n() {
        boolean z7;
        synchronized (this.f6433a) {
            try {
                z7 = false;
                if (this.f6435c && !this.f6436d && this.f6438f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j o(InterfaceC0658i interfaceC0658i) {
        Executor executor = AbstractC0661l.f6442a;
        K k7 = new K();
        this.f6434b.a(new F(executor, interfaceC0658i, k7));
        y();
        return k7;
    }

    @Override // V2.AbstractC0659j
    public final AbstractC0659j p(Executor executor, InterfaceC0658i interfaceC0658i) {
        K k7 = new K();
        this.f6434b.a(new F(executor, interfaceC0658i, k7));
        y();
        return k7;
    }

    public final void q(Exception exc) {
        AbstractC0328n.j(exc, "Exception must not be null");
        synchronized (this.f6433a) {
            x();
            this.f6435c = true;
            this.f6438f = exc;
        }
        this.f6434b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.f6433a) {
            x();
            this.f6435c = true;
            this.f6437e = obj;
        }
        this.f6434b.b(this);
    }

    public final boolean s() {
        synchronized (this.f6433a) {
            try {
                if (this.f6435c) {
                    return false;
                }
                this.f6435c = true;
                this.f6436d = true;
                this.f6434b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Exception exc) {
        AbstractC0328n.j(exc, "Exception must not be null");
        synchronized (this.f6433a) {
            try {
                if (this.f6435c) {
                    return false;
                }
                this.f6435c = true;
                this.f6438f = exc;
                this.f6434b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.f6433a) {
            try {
                if (this.f6435c) {
                    return false;
                }
                this.f6435c = true;
                this.f6437e = obj;
                this.f6434b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        AbstractC0328n.m(this.f6435c, "Task is not yet complete");
    }

    public final void w() {
        if (this.f6436d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void x() {
        if (this.f6435c) {
            throw C0652c.a(this);
        }
    }

    public final void y() {
        synchronized (this.f6433a) {
            try {
                if (this.f6435c) {
                    this.f6434b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
