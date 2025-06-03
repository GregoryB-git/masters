package k3;

import c3.AbstractC0829g;
import c3.C0847y;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import k3.r;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f16156b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f16157a = new AtomicReference(new r.b().e());

    public static i a() {
        return f16156b;
    }

    public boolean b(q qVar) {
        return ((r) this.f16157a.get()).e(qVar);
    }

    public AbstractC0829g c(q qVar, C0847y c0847y) {
        return ((r) this.f16157a.get()).f(qVar, c0847y);
    }

    public AbstractC0829g d(o oVar, C0847y c0847y) {
        if (c0847y == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, c0847y);
        }
        try {
            return new C1467e(oVar, c0847y);
        } catch (GeneralSecurityException e7) {
            throw new s("Creating a LegacyProtoKey failed", e7);
        }
    }

    public synchronized void e(AbstractC1464b abstractC1464b) {
        this.f16157a.set(new r.b((r) this.f16157a.get()).f(abstractC1464b).e());
    }

    public synchronized void f(AbstractC1465c abstractC1465c) {
        this.f16157a.set(new r.b((r) this.f16157a.get()).g(abstractC1465c).e());
    }

    public synchronized void g(j jVar) {
        this.f16157a.set(new r.b((r) this.f16157a.get()).h(jVar).e());
    }

    public synchronized void h(k kVar) {
        this.f16157a.set(new r.b((r) this.f16157a.get()).i(kVar).e());
    }
}
