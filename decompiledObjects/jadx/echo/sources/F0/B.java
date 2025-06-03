package F0;

import d0.C1194q;
import d0.C1201x;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final int f1738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1740c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1741d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1742e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1743f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1744g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1745h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1746i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1747j;

    /* renamed from: k, reason: collision with root package name */
    public final a f1748k;

    /* renamed from: l, reason: collision with root package name */
    public final C1201x f1749l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f1750a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f1751b;

        public a(long[] jArr, long[] jArr2) {
            this.f1750a = jArr;
            this.f1751b = jArr2;
        }
    }

    public B(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, a aVar, C1201x c1201x) {
        this.f1738a = i7;
        this.f1739b = i8;
        this.f1740c = i9;
        this.f1741d = i10;
        this.f1742e = i11;
        this.f1743f = j(i11);
        this.f1744g = i12;
        this.f1745h = i13;
        this.f1746i = e(i13);
        this.f1747j = j7;
        this.f1748k = aVar;
        this.f1749l = c1201x;
    }

    public static int e(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int j(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public B a(List list) {
        return new B(this.f1738a, this.f1739b, this.f1740c, this.f1741d, this.f1742e, this.f1744g, this.f1745h, this.f1747j, this.f1748k, h(new C1201x(list)));
    }

    public B b(a aVar) {
        return new B(this.f1738a, this.f1739b, this.f1740c, this.f1741d, this.f1742e, this.f1744g, this.f1745h, this.f1747j, aVar, this.f1749l);
    }

    public B c(List list) {
        return new B(this.f1738a, this.f1739b, this.f1740c, this.f1741d, this.f1742e, this.f1744g, this.f1745h, this.f1747j, this.f1748k, h(W.d(list)));
    }

    public long d() {
        long j7;
        long j8;
        int i7 = this.f1741d;
        if (i7 > 0) {
            j7 = (i7 + this.f1740c) / 2;
            j8 = 1;
        } else {
            int i8 = this.f1738a;
            j7 = ((((i8 != this.f1739b || i8 <= 0) ? 4096L : i8) * this.f1744g) * this.f1745h) / 8;
            j8 = 64;
        }
        return j7 + j8;
    }

    public long f() {
        long j7 = this.f1747j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f1742e;
    }

    public C1194q g(byte[] bArr, C1201x c1201x) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.f1741d;
        if (i7 <= 0) {
            i7 = -1;
        }
        return new C1194q.b().o0("audio/flac").f0(i7).N(this.f1744g).p0(this.f1742e).i0(g0.M.e0(this.f1745h)).b0(Collections.singletonList(bArr)).h0(h(c1201x)).K();
    }

    public C1201x h(C1201x c1201x) {
        C1201x c1201x2 = this.f1749l;
        return c1201x2 == null ? c1201x : c1201x2.b(c1201x);
    }

    public long i(long j7) {
        return g0.M.q((j7 * this.f1742e) / 1000000, 0L, this.f1747j - 1);
    }

    public B(byte[] bArr, int i7) {
        g0.y yVar = new g0.y(bArr);
        yVar.p(i7 * 8);
        this.f1738a = yVar.h(16);
        this.f1739b = yVar.h(16);
        this.f1740c = yVar.h(24);
        this.f1741d = yVar.h(24);
        int h7 = yVar.h(20);
        this.f1742e = h7;
        this.f1743f = j(h7);
        this.f1744g = yVar.h(3) + 1;
        int h8 = yVar.h(5) + 1;
        this.f1745h = h8;
        this.f1746i = e(h8);
        this.f1747j = yVar.j(36);
        this.f1748k = null;
        this.f1749l = null;
    }
}
