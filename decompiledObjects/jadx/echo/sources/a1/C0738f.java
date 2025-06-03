package a1;

import F0.AbstractC0375u;
import F0.InterfaceC0373s;
import d0.C1162A;
import g0.AbstractC1297a;
import g0.z;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738f {

    /* renamed from: a, reason: collision with root package name */
    public int f8031a;

    /* renamed from: b, reason: collision with root package name */
    public int f8032b;

    /* renamed from: c, reason: collision with root package name */
    public long f8033c;

    /* renamed from: d, reason: collision with root package name */
    public long f8034d;

    /* renamed from: e, reason: collision with root package name */
    public long f8035e;

    /* renamed from: f, reason: collision with root package name */
    public long f8036f;

    /* renamed from: g, reason: collision with root package name */
    public int f8037g;

    /* renamed from: h, reason: collision with root package name */
    public int f8038h;

    /* renamed from: i, reason: collision with root package name */
    public int f8039i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f8040j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    public final z f8041k = new z(255);

    public boolean a(InterfaceC0373s interfaceC0373s, boolean z7) {
        b();
        this.f8041k.P(27);
        if (!AbstractC0375u.b(interfaceC0373s, this.f8041k.e(), 0, 27, z7) || this.f8041k.I() != 1332176723) {
            return false;
        }
        int G6 = this.f8041k.G();
        this.f8031a = G6;
        if (G6 != 0) {
            if (z7) {
                return false;
            }
            throw C1162A.d("unsupported bit stream revision");
        }
        this.f8032b = this.f8041k.G();
        this.f8033c = this.f8041k.u();
        this.f8034d = this.f8041k.w();
        this.f8035e = this.f8041k.w();
        this.f8036f = this.f8041k.w();
        int G7 = this.f8041k.G();
        this.f8037g = G7;
        this.f8038h = G7 + 27;
        this.f8041k.P(G7);
        if (!AbstractC0375u.b(interfaceC0373s, this.f8041k.e(), 0, this.f8037g, z7)) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8037g; i7++) {
            this.f8040j[i7] = this.f8041k.G();
            this.f8039i += this.f8040j[i7];
        }
        return true;
    }

    public void b() {
        this.f8031a = 0;
        this.f8032b = 0;
        this.f8033c = 0L;
        this.f8034d = 0L;
        this.f8035e = 0L;
        this.f8036f = 0L;
        this.f8037g = 0;
        this.f8038h = 0;
        this.f8039i = 0;
    }

    public boolean c(InterfaceC0373s interfaceC0373s) {
        return d(interfaceC0373s, -1L);
    }

    public boolean d(InterfaceC0373s interfaceC0373s, long j7) {
        AbstractC1297a.a(interfaceC0373s.p() == interfaceC0373s.m());
        this.f8041k.P(4);
        while (true) {
            if ((j7 == -1 || interfaceC0373s.p() + 4 < j7) && AbstractC0375u.b(interfaceC0373s, this.f8041k.e(), 0, 4, true)) {
                this.f8041k.T(0);
                if (this.f8041k.I() == 1332176723) {
                    interfaceC0373s.h();
                    return true;
                }
                interfaceC0373s.i(1);
            }
        }
        do {
            if (j7 != -1 && interfaceC0373s.p() >= j7) {
                break;
            }
        } while (interfaceC0373s.b(1) != -1);
        return false;
    }
}
