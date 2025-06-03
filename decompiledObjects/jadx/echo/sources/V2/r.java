package V2;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6446a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f6447b;

    /* renamed from: c, reason: collision with root package name */
    public final K f6448c;

    /* renamed from: d, reason: collision with root package name */
    public int f6449d;

    /* renamed from: e, reason: collision with root package name */
    public int f6450e;

    /* renamed from: f, reason: collision with root package name */
    public int f6451f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f6452g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6453h;

    public r(int i7, K k7) {
        this.f6447b = i7;
        this.f6448c = k7;
    }

    private final void c() {
        if (this.f6449d + this.f6450e + this.f6451f == this.f6447b) {
            if (this.f6452g == null) {
                if (this.f6453h) {
                    this.f6448c.s();
                    return;
                } else {
                    this.f6448c.r(null);
                    return;
                }
            }
            this.f6448c.q(new ExecutionException(this.f6450e + " out of " + this.f6447b + " underlying tasks failed", this.f6452g));
        }
    }

    @Override // V2.InterfaceC0656g
    public final void a(Object obj) {
        synchronized (this.f6446a) {
            this.f6449d++;
            c();
        }
    }

    @Override // V2.InterfaceC0653d
    public final void b() {
        synchronized (this.f6446a) {
            this.f6451f++;
            this.f6453h = true;
            c();
        }
    }

    @Override // V2.InterfaceC0655f
    public final void d(Exception exc) {
        synchronized (this.f6446a) {
            this.f6450e++;
            this.f6452g = exc;
            c();
        }
    }
}
