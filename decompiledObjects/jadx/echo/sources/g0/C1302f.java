package g0;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1302f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1299c f14285a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14286b;

    public C1302f() {
        this(InterfaceC1299c.f14278a);
    }

    public synchronized void a() {
        while (!this.f14286b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z7 = false;
        while (!this.f14286b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z7;
        z7 = this.f14286b;
        this.f14286b = false;
        return z7;
    }

    public synchronized boolean d() {
        return this.f14286b;
    }

    public synchronized boolean e() {
        if (this.f14286b) {
            return false;
        }
        this.f14286b = true;
        notifyAll();
        return true;
    }

    public C1302f(InterfaceC1299c interfaceC1299c) {
        this.f14285a = interfaceC1299c;
    }
}
