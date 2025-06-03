package c3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import p3.C1792A;
import p3.C1794C;
import p3.I;

/* renamed from: c3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837o {

    /* renamed from: a, reason: collision with root package name */
    public final C1794C.b f10105a;

    public C0837o(C1794C.b bVar) {
        this.f10105a = bVar;
    }

    public static C0837o i() {
        return new C0837o(C1794C.d0());
    }

    public static C0837o j(C0836n c0836n) {
        return new C0837o((C1794C.b) c0836n.h().T());
    }

    public synchronized C0837o a(C0834l c0834l) {
        b(c0834l.b(), false);
        return this;
    }

    public synchronized int b(C1792A c1792a, boolean z7) {
        C1794C.c f7;
        try {
            f7 = f(c1792a);
            this.f10105a.y(f7);
            if (z7) {
                this.f10105a.C(f7.a0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7.a0();
    }

    public final synchronized C1794C.c c(p3.y yVar, I i7) {
        int g7;
        g7 = g();
        if (i7 == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C1794C.c) C1794C.c.e0().y(yVar).z(g7).B(p3.z.ENABLED).A(i7).n();
    }

    public synchronized C0836n d() {
        return C0836n.e((C1794C) this.f10105a.n());
    }

    public final synchronized boolean e(int i7) {
        Iterator it = this.f10105a.B().iterator();
        while (it.hasNext()) {
            if (((C1794C.c) it.next()).a0() == i7) {
                return true;
            }
        }
        return false;
    }

    public final synchronized C1794C.c f(C1792A c1792a) {
        return c(AbstractC0846x.k(c1792a), c1792a.Z());
    }

    public final synchronized int g() {
        int c7;
        do {
            c7 = k3.t.c();
        } while (e(c7));
        return c7;
    }

    public synchronized C0837o h(int i7) {
        for (int i8 = 0; i8 < this.f10105a.A(); i8++) {
            C1794C.c z7 = this.f10105a.z(i8);
            if (z7.a0() == i7) {
                if (!z7.c0().equals(p3.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i7);
                }
                this.f10105a.C(i7);
            }
        }
        throw new GeneralSecurityException("key not found: " + i7);
        return this;
    }
}
