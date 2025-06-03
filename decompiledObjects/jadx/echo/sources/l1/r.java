package l1;

import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import l1.K;

/* loaded from: classes.dex */
public final class r implements InterfaceC1597m {

    /* renamed from: b, reason: collision with root package name */
    public T f17047b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17048c;

    /* renamed from: e, reason: collision with root package name */
    public int f17050e;

    /* renamed from: f, reason: collision with root package name */
    public int f17051f;

    /* renamed from: a, reason: collision with root package name */
    public final g0.z f17046a = new g0.z(10);

    /* renamed from: d, reason: collision with root package name */
    public long f17049d = -9223372036854775807L;

    @Override // l1.InterfaceC1597m
    public void a(g0.z zVar) {
        AbstractC1297a.h(this.f17047b);
        if (this.f17048c) {
            int a7 = zVar.a();
            int i7 = this.f17051f;
            if (i7 < 10) {
                int min = Math.min(a7, 10 - i7);
                System.arraycopy(zVar.e(), zVar.f(), this.f17046a.e(), this.f17051f, min);
                if (this.f17051f + min == 10) {
                    this.f17046a.T(0);
                    if (73 != this.f17046a.G() || 68 != this.f17046a.G() || 51 != this.f17046a.G()) {
                        g0.o.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f17048c = false;
                        return;
                    } else {
                        this.f17046a.U(3);
                        this.f17050e = this.f17046a.F() + 10;
                    }
                }
            }
            int min2 = Math.min(a7, this.f17050e - this.f17051f);
            this.f17047b.e(zVar, min2);
            this.f17051f += min2;
        }
    }

    @Override // l1.InterfaceC1597m
    public void b() {
        this.f17048c = false;
        this.f17049d = -9223372036854775807L;
    }

    @Override // l1.InterfaceC1597m
    public void c(boolean z7) {
        int i7;
        AbstractC1297a.h(this.f17047b);
        if (this.f17048c && (i7 = this.f17050e) != 0 && this.f17051f == i7) {
            AbstractC1297a.f(this.f17049d != -9223372036854775807L);
            this.f17047b.b(this.f17049d, 1, this.f17050e, 0, null);
            this.f17048c = false;
        }
    }

    @Override // l1.InterfaceC1597m
    public void d(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f17048c = true;
        this.f17049d = j7;
        this.f17050e = 0;
        this.f17051f = 0;
    }

    @Override // l1.InterfaceC1597m
    public void e(InterfaceC0374t interfaceC0374t, K.d dVar) {
        dVar.a();
        T a7 = interfaceC0374t.a(dVar.c(), 5);
        this.f17047b = a7;
        a7.d(new C1194q.b().a0(dVar.b()).o0("application/id3").K());
    }
}
