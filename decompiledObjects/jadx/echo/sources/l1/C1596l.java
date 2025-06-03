package l1;

import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.Collections;
import java.util.List;
import l1.K;

/* renamed from: l1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596l implements InterfaceC1597m {

    /* renamed from: a, reason: collision with root package name */
    public final List f16915a;

    /* renamed from: b, reason: collision with root package name */
    public final T[] f16916b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16917c;

    /* renamed from: d, reason: collision with root package name */
    public int f16918d;

    /* renamed from: e, reason: collision with root package name */
    public int f16919e;

    /* renamed from: f, reason: collision with root package name */
    public long f16920f = -9223372036854775807L;

    public C1596l(List list) {
        this.f16915a = list;
        this.f16916b = new T[list.size()];
    }

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        if (this.f16917c) {
            if (this.f16918d != 2 || f(zVar, 32)) {
                if (this.f16918d != 1 || f(zVar, 0)) {
                    int f7 = zVar.f();
                    int a7 = zVar.a();
                    for (T t7 : this.f16916b) {
                        zVar.T(f7);
                        t7.e(zVar, a7);
                    }
                    this.f16919e += a7;
                }
            }
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f16917c = false;
        this.f16920f = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
        if (this.f16917c) {
            AbstractC1297a.f(this.f16920f != -9223372036854775807L);
            for (T t7 : this.f16916b) {
                t7.b(this.f16920f, 1, this.f16919e, 0, null);
            }
            this.f16917c = false;
        }
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f16917c = true;
        this.f16920f = j7;
        this.f16919e = 0;
        this.f16918d = 2;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        for (int i7 = 0; i7 < this.f16916b.length; i7++) {
            K.a aVar = (K.a) this.f16915a.get(i7);
            dVar.a();
            T a7 = interfaceC0374t.a(dVar.c(), 3);
            a7.d(new C1194q.b().a0(dVar.b()).o0("application/dvbsubs").b0(Collections.singletonList(aVar.f16813c)).e0(aVar.f16811a).K());
            this.f16916b[i7] = a7;
        }
    }

    public final boolean f(g0.z zVar, int i7) {
        if (zVar.a() == 0) {
            return false;
        }
        if (zVar.G() != i7) {
            this.f16917c = false;
        }
        this.f16918d--;
        return this.f16917c;
    }
}
