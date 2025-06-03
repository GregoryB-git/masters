package V3;

import a4.C0747c;
import a4.C0748d;
import a4.InterfaceC0749e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: V3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0669h {

    /* renamed from: b, reason: collision with root package name */
    public i f6537b;

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f6536a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f6538c = false;

    public abstract AbstractC0669h a(a4.i iVar);

    public abstract C0748d b(C0747c c0747c, a4.i iVar);

    public abstract void c(Q3.c cVar);

    public abstract void d(C0748d c0748d);

    public abstract a4.i e();

    public abstract boolean f(AbstractC0669h abstractC0669h);

    public boolean g() {
        return this.f6538c;
    }

    public boolean h() {
        return this.f6536a.get();
    }

    public abstract boolean i(InterfaceC0749e.a aVar);

    public void j(boolean z7) {
        this.f6538c = z7;
    }

    public void k(i iVar) {
        Y3.m.f(!h());
        Y3.m.f(this.f6537b == null);
        this.f6537b = iVar;
    }

    public void l() {
        i iVar;
        if (!this.f6536a.compareAndSet(false, true) || (iVar = this.f6537b) == null) {
            return;
        }
        iVar.a(this);
        this.f6537b = null;
    }
}
