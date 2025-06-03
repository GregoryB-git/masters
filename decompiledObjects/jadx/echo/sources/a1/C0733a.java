package a1;

import F0.AbstractC0375u;
import F0.InterfaceC0373s;
import F0.M;
import F0.N;
import g0.AbstractC1297a;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733a implements InterfaceC0739g {

    /* renamed from: a, reason: collision with root package name */
    public final C0738f f8003a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8004b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8005c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0741i f8006d;

    /* renamed from: e, reason: collision with root package name */
    public int f8007e;

    /* renamed from: f, reason: collision with root package name */
    public long f8008f;

    /* renamed from: g, reason: collision with root package name */
    public long f8009g;

    /* renamed from: h, reason: collision with root package name */
    public long f8010h;

    /* renamed from: i, reason: collision with root package name */
    public long f8011i;

    /* renamed from: j, reason: collision with root package name */
    public long f8012j;

    /* renamed from: k, reason: collision with root package name */
    public long f8013k;

    /* renamed from: l, reason: collision with root package name */
    public long f8014l;

    /* renamed from: a1.a$b */
    public final class b implements M {
        public b() {
        }

        @Override // F0.M
        public boolean h() {
            return true;
        }

        @Override // F0.M
        public M.a j(long j7) {
            return new M.a(new N(j7, g0.M.q((C0733a.this.f8004b + BigInteger.valueOf(C0733a.this.f8006d.c(j7)).multiply(BigInteger.valueOf(C0733a.this.f8005c - C0733a.this.f8004b)).divide(BigInteger.valueOf(C0733a.this.f8008f)).longValue()) - 30000, C0733a.this.f8004b, C0733a.this.f8005c - 1)));
        }

        @Override // F0.M
        public long l() {
            return C0733a.this.f8006d.b(C0733a.this.f8008f);
        }
    }

    public C0733a(AbstractC0741i abstractC0741i, long j7, long j8, long j9, long j10, boolean z7) {
        AbstractC1297a.a(j7 >= 0 && j8 > j7);
        this.f8006d = abstractC0741i;
        this.f8004b = j7;
        this.f8005c = j8;
        if (j9 == j8 - j7 || z7) {
            this.f8008f = j10;
            this.f8007e = 4;
        } else {
            this.f8007e = 0;
        }
        this.f8003a = new C0738f();
    }

    @Override // a1.InterfaceC0739g
    public void b(long j7) {
        this.f8010h = g0.M.q(j7, 0L, this.f8008f - 1);
        this.f8007e = 2;
        this.f8011i = this.f8004b;
        this.f8012j = this.f8005c;
        this.f8013k = 0L;
        this.f8014l = this.f8008f;
    }

    @Override // a1.InterfaceC0739g
    public long c(InterfaceC0373s interfaceC0373s) {
        int i7 = this.f8007e;
        if (i7 == 0) {
            long p7 = interfaceC0373s.p();
            this.f8009g = p7;
            this.f8007e = 1;
            long j7 = this.f8005c - 65307;
            if (j7 > p7) {
                return j7;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                long i8 = i(interfaceC0373s);
                if (i8 != -1) {
                    return i8;
                }
                this.f8007e = 3;
            } else if (i7 != 3) {
                if (i7 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC0373s);
            this.f8007e = 4;
            return -(this.f8013k + 2);
        }
        this.f8008f = j(interfaceC0373s);
        this.f8007e = 4;
        return this.f8009g;
    }

    @Override // a1.InterfaceC0739g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f8008f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(InterfaceC0373s interfaceC0373s) {
        if (this.f8011i == this.f8012j) {
            return -1L;
        }
        long p7 = interfaceC0373s.p();
        if (!this.f8003a.d(interfaceC0373s, this.f8012j)) {
            long j7 = this.f8011i;
            if (j7 != p7) {
                return j7;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f8003a.a(interfaceC0373s, false);
        interfaceC0373s.h();
        long j8 = this.f8010h;
        C0738f c0738f = this.f8003a;
        long j9 = c0738f.f8033c;
        long j10 = j8 - j9;
        int i7 = c0738f.f8038h + c0738f.f8039i;
        if (0 <= j10 && j10 < 72000) {
            return -1L;
        }
        if (j10 < 0) {
            this.f8012j = p7;
            this.f8014l = j9;
        } else {
            this.f8011i = interfaceC0373s.p() + i7;
            this.f8013k = this.f8003a.f8033c;
        }
        long j11 = this.f8012j;
        long j12 = this.f8011i;
        if (j11 - j12 < 100000) {
            this.f8012j = j12;
            return j12;
        }
        long p8 = interfaceC0373s.p() - (i7 * (j10 <= 0 ? 2L : 1L));
        long j13 = this.f8012j;
        long j14 = this.f8011i;
        return g0.M.q(p8 + ((j10 * (j13 - j14)) / (this.f8014l - this.f8013k)), j14, j13 - 1);
    }

    public long j(InterfaceC0373s interfaceC0373s) {
        long j7;
        C0738f c0738f;
        this.f8003a.b();
        if (!this.f8003a.c(interfaceC0373s)) {
            throw new EOFException();
        }
        this.f8003a.a(interfaceC0373s, false);
        C0738f c0738f2 = this.f8003a;
        interfaceC0373s.i(c0738f2.f8038h + c0738f2.f8039i);
        do {
            j7 = this.f8003a.f8033c;
            C0738f c0738f3 = this.f8003a;
            if ((c0738f3.f8032b & 4) == 4 || !c0738f3.c(interfaceC0373s) || interfaceC0373s.p() >= this.f8005c || !this.f8003a.a(interfaceC0373s, true)) {
                break;
            }
            c0738f = this.f8003a;
        } while (AbstractC0375u.e(interfaceC0373s, c0738f.f8038h + c0738f.f8039i));
        return j7;
    }

    public final void k(InterfaceC0373s interfaceC0373s) {
        while (true) {
            this.f8003a.c(interfaceC0373s);
            this.f8003a.a(interfaceC0373s, false);
            C0738f c0738f = this.f8003a;
            if (c0738f.f8033c > this.f8010h) {
                interfaceC0373s.h();
                return;
            } else {
                interfaceC0373s.i(c0738f.f8038h + c0738f.f8039i);
                this.f8011i = interfaceC0373s.p();
                this.f8013k = this.f8003a.f8033c;
            }
        }
    }
}
