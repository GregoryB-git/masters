package H0;

import g0.M;
import g0.o;
import g0.z;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2143c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2144d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2145e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2146f;

    public d(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f2141a = i7;
        this.f2142b = i8;
        this.f2143c = i9;
        this.f2144d = i10;
        this.f2145e = i11;
        this.f2146f = i12;
    }

    public static d d(z zVar) {
        int t7 = zVar.t();
        zVar.U(12);
        int t8 = zVar.t();
        int t9 = zVar.t();
        int t10 = zVar.t();
        zVar.U(4);
        int t11 = zVar.t();
        int t12 = zVar.t();
        zVar.U(8);
        return new d(t7, t8, t9, t10, t11, t12);
    }

    @Override // H0.a
    public int a() {
        return 1752331379;
    }

    public long b() {
        return M.W0(this.f2145e, this.f2143c * 1000000, this.f2144d);
    }

    public int c() {
        int i7 = this.f2141a;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        o.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f2141a));
        return -1;
    }
}
