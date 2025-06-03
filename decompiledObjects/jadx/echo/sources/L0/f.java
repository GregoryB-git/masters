package L0;

import F0.C0359d;
import F0.T;
import L0.e;
import d0.C1194q;
import g0.z;
import h0.AbstractC1329d;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final z f3317b;

    /* renamed from: c, reason: collision with root package name */
    public final z f3318c;

    /* renamed from: d, reason: collision with root package name */
    public int f3319d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3320e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3321f;

    /* renamed from: g, reason: collision with root package name */
    public int f3322g;

    public f(T t7) {
        super(t7);
        this.f3317b = new z(AbstractC1329d.f14524a);
        this.f3318c = new z(4);
    }

    @Override // L0.e
    public boolean b(z zVar) {
        int G6 = zVar.G();
        int i7 = (G6 >> 4) & 15;
        int i8 = G6 & 15;
        if (i8 == 7) {
            this.f3322g = i7;
            return i7 != 5;
        }
        throw new e.a("Video format not supported: " + i8);
    }

    @Override // L0.e
    public boolean c(z zVar, long j7) {
        int G6 = zVar.G();
        long q7 = j7 + (zVar.q() * 1000);
        if (G6 == 0 && !this.f3320e) {
            z zVar2 = new z(new byte[zVar.a()]);
            zVar.l(zVar2.e(), 0, zVar.a());
            C0359d b7 = C0359d.b(zVar2);
            this.f3319d = b7.f1862b;
            this.f3316a.d(new C1194q.b().o0("video/avc").O(b7.f1872l).v0(b7.f1863c).Y(b7.f1864d).k0(b7.f1871k).b0(b7.f1861a).K());
            this.f3320e = true;
            return false;
        }
        if (G6 != 1 || !this.f3320e) {
            return false;
        }
        int i7 = this.f3322g == 1 ? 1 : 0;
        if (!this.f3321f && i7 == 0) {
            return false;
        }
        byte[] e7 = this.f3318c.e();
        e7[0] = 0;
        e7[1] = 0;
        e7[2] = 0;
        int i8 = 4 - this.f3319d;
        int i9 = 0;
        while (zVar.a() > 0) {
            zVar.l(this.f3318c.e(), i8, this.f3319d);
            this.f3318c.T(0);
            int K6 = this.f3318c.K();
            this.f3317b.T(0);
            this.f3316a.e(this.f3317b, 4);
            this.f3316a.e(zVar, K6);
            i9 = i9 + 4 + K6;
        }
        this.f3316a.b(q7, i7, i9, 0, null);
        this.f3321f = true;
        return true;
    }
}
