package a1;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.T;
import F0.r;
import android.net.Uri;
import d0.C1162A;
import g0.AbstractC1297a;
import g0.z;
import java.util.List;
import java.util.Map;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0736d implements r {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC0378x f8022d = new InterfaceC0378x() { // from class: a1.c
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] f7;
            f7 = C0736d.f();
            return f7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0374t f8023a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0741i f8024b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8025c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r[] f() {
        return new r[]{new C0736d()};
    }

    public static z h(z zVar) {
        zVar.T(0);
        return zVar;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        AbstractC0741i abstractC0741i = this.f8024b;
        if (abstractC0741i != null) {
            abstractC0741i.m(j7, j8);
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f8023a = interfaceC0374t;
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        try {
            return j(interfaceC0373s);
        } catch (C1162A unused) {
            return false;
        }
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        AbstractC1297a.h(this.f8023a);
        if (this.f8024b == null) {
            if (!j(interfaceC0373s)) {
                throw C1162A.a("Failed to determine bitstream type", null);
            }
            interfaceC0373s.h();
        }
        if (!this.f8025c) {
            T a7 = this.f8023a.a(0, 1);
            this.f8023a.j();
            this.f8024b.d(this.f8023a, a7);
            this.f8025c = true;
        }
        return this.f8024b.g(interfaceC0373s, l7);
    }

    public final boolean j(InterfaceC0373s interfaceC0373s) {
        AbstractC0741i c0740h;
        C0738f c0738f = new C0738f();
        if (c0738f.a(interfaceC0373s, true) && (c0738f.f8032b & 2) == 2) {
            int min = Math.min(c0738f.f8039i, 8);
            z zVar = new z(min);
            interfaceC0373s.n(zVar.e(), 0, min);
            if (C0734b.p(h(zVar))) {
                c0740h = new C0734b();
            } else if (C0742j.r(h(zVar))) {
                c0740h = new C0742j();
            } else if (C0740h.o(h(zVar))) {
                c0740h = new C0740h();
            }
            this.f8024b = c0740h;
            return true;
        }
        return false;
    }

    @Override // F0.r
    public void release() {
    }
}
