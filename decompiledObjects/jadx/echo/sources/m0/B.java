package m0;

import android.media.AudioTrack;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: A, reason: collision with root package name */
    public long f17330A;

    /* renamed from: B, reason: collision with root package name */
    public long f17331B;

    /* renamed from: C, reason: collision with root package name */
    public long f17332C;

    /* renamed from: D, reason: collision with root package name */
    public long f17333D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17334E;

    /* renamed from: F, reason: collision with root package name */
    public long f17335F;

    /* renamed from: G, reason: collision with root package name */
    public long f17336G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17337H;

    /* renamed from: I, reason: collision with root package name */
    public long f17338I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC1299c f17339J;

    /* renamed from: a, reason: collision with root package name */
    public final a f17340a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17341b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f17342c;

    /* renamed from: d, reason: collision with root package name */
    public int f17343d;

    /* renamed from: e, reason: collision with root package name */
    public int f17344e;

    /* renamed from: f, reason: collision with root package name */
    public C1634A f17345f;

    /* renamed from: g, reason: collision with root package name */
    public int f17346g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17347h;

    /* renamed from: i, reason: collision with root package name */
    public long f17348i;

    /* renamed from: j, reason: collision with root package name */
    public float f17349j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17350k;

    /* renamed from: l, reason: collision with root package name */
    public long f17351l;

    /* renamed from: m, reason: collision with root package name */
    public long f17352m;

    /* renamed from: n, reason: collision with root package name */
    public Method f17353n;

    /* renamed from: o, reason: collision with root package name */
    public long f17354o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17355p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17356q;

    /* renamed from: r, reason: collision with root package name */
    public long f17357r;

    /* renamed from: s, reason: collision with root package name */
    public long f17358s;

    /* renamed from: t, reason: collision with root package name */
    public long f17359t;

    /* renamed from: u, reason: collision with root package name */
    public long f17360u;

    /* renamed from: v, reason: collision with root package name */
    public long f17361v;

    /* renamed from: w, reason: collision with root package name */
    public int f17362w;

    /* renamed from: x, reason: collision with root package name */
    public int f17363x;

    /* renamed from: y, reason: collision with root package name */
    public long f17364y;

    /* renamed from: z, reason: collision with root package name */
    public long f17365z;

    public interface a {
        void a(int i7, long j7);

        void b(long j7);

        void c(long j7, long j8, long j9, long j10);

        void d(long j7, long j8, long j9, long j10);

        void e(long j7);
    }

    public B(a aVar) {
        this.f17340a = (a) AbstractC1297a.e(aVar);
        try {
            this.f17353n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f17341b = new long[10];
        this.f17339J = InterfaceC1299c.f14278a;
    }

    public static boolean o(int i7) {
        return g0.M.f14261a < 23 && (i7 == 5 || i7 == 6);
    }

    public void a() {
        this.f17337H = true;
        C1634A c1634a = this.f17345f;
        if (c1634a != null) {
            c1634a.b();
        }
    }

    public final boolean b() {
        return this.f17347h && ((AudioTrack) AbstractC1297a.e(this.f17342c)).getPlayState() == 2 && e() == 0;
    }

    public int c(long j7) {
        return this.f17344e - ((int) (j7 - (e() * this.f17343d)));
    }

    public long d(boolean z7) {
        long f7;
        if (((AudioTrack) AbstractC1297a.e(this.f17342c)).getPlayState() == 3) {
            m();
        }
        long c7 = this.f17339J.c() / 1000;
        C1634A c1634a = (C1634A) AbstractC1297a.e(this.f17345f);
        boolean e7 = c1634a.e();
        if (e7) {
            f7 = g0.M.V0(c1634a.c(), this.f17346g) + g0.M.c0(c7 - c1634a.d(), this.f17349j);
        } else {
            f7 = this.f17363x == 0 ? f() : g0.M.c0(this.f17351l + c7, this.f17349j);
            if (!z7) {
                f7 = Math.max(0L, f7 - this.f17354o);
            }
        }
        if (this.f17334E != e7) {
            this.f17336G = this.f17333D;
            this.f17335F = this.f17332C;
        }
        long j7 = c7 - this.f17336G;
        if (j7 < 1000000) {
            long c02 = this.f17335F + g0.M.c0(j7, this.f17349j);
            long j8 = (j7 * 1000) / 1000000;
            f7 = ((f7 * j8) + ((1000 - j8) * c02)) / 1000;
        }
        if (!this.f17350k) {
            long j9 = this.f17332C;
            if (f7 > j9) {
                this.f17350k = true;
                this.f17340a.b(this.f17339J.a() - g0.M.i1(g0.M.h0(g0.M.i1(f7 - j9), this.f17349j)));
            }
        }
        this.f17333D = c7;
        this.f17332C = f7;
        this.f17334E = e7;
        return f7;
    }

    public final long e() {
        long b7 = this.f17339J.b();
        if (this.f17364y != -9223372036854775807L) {
            if (((AudioTrack) AbstractC1297a.e(this.f17342c)).getPlayState() == 2) {
                return this.f17330A;
            }
            return Math.min(this.f17331B, this.f17330A + g0.M.F(g0.M.c0(g0.M.J0(b7) - this.f17364y, this.f17349j), this.f17346g));
        }
        if (b7 - this.f17358s >= 5) {
            w(b7);
            this.f17358s = b7;
        }
        return this.f17359t + this.f17338I + (this.f17360u << 32);
    }

    public final long f() {
        return g0.M.V0(e(), this.f17346g);
    }

    public void g(long j7) {
        this.f17330A = e();
        this.f17364y = g0.M.J0(this.f17339J.b());
        this.f17331B = j7;
    }

    public boolean h(long j7) {
        return j7 > g0.M.F(d(false), this.f17346g) || b();
    }

    public boolean i() {
        return ((AudioTrack) AbstractC1297a.e(this.f17342c)).getPlayState() == 3;
    }

    public boolean j(long j7) {
        return this.f17365z != -9223372036854775807L && j7 > 0 && this.f17339J.b() - this.f17365z >= 200;
    }

    public boolean k(long j7) {
        int playState = ((AudioTrack) AbstractC1297a.e(this.f17342c)).getPlayState();
        if (this.f17347h) {
            if (playState == 2) {
                this.f17355p = false;
                return false;
            }
            if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z7 = this.f17355p;
        boolean h7 = h(j7);
        this.f17355p = h7;
        if (z7 && !h7 && playState != 1) {
            this.f17340a.a(this.f17344e, g0.M.i1(this.f17348i));
        }
        return true;
    }

    public final void l(long j7) {
        C1634A c1634a = (C1634A) AbstractC1297a.e(this.f17345f);
        if (c1634a.f(j7)) {
            long d7 = c1634a.d();
            long c7 = c1634a.c();
            long f7 = f();
            if (Math.abs(d7 - j7) > 5000000) {
                this.f17340a.d(c7, d7, j7, f7);
            } else {
                if (Math.abs(g0.M.V0(c7, this.f17346g) - f7) <= 5000000) {
                    c1634a.a();
                    return;
                }
                this.f17340a.c(c7, d7, j7, f7);
            }
            c1634a.g();
        }
    }

    public final void m() {
        long c7 = this.f17339J.c() / 1000;
        if (c7 - this.f17352m >= 30000) {
            long f7 = f();
            if (f7 != 0) {
                this.f17341b[this.f17362w] = g0.M.h0(f7, this.f17349j) - c7;
                this.f17362w = (this.f17362w + 1) % 10;
                int i7 = this.f17363x;
                if (i7 < 10) {
                    this.f17363x = i7 + 1;
                }
                this.f17352m = c7;
                this.f17351l = 0L;
                int i8 = 0;
                while (true) {
                    int i9 = this.f17363x;
                    if (i8 >= i9) {
                        break;
                    }
                    this.f17351l += this.f17341b[i8] / i9;
                    i8++;
                }
            } else {
                return;
            }
        }
        if (this.f17347h) {
            return;
        }
        l(c7);
        n(c7);
    }

    public final void n(long j7) {
        Method method;
        if (!this.f17356q || (method = this.f17353n) == null || j7 - this.f17357r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) g0.M.i((Integer) method.invoke(AbstractC1297a.e(this.f17342c), new Object[0]))).intValue() * 1000) - this.f17348i;
            this.f17354o = intValue;
            long max = Math.max(intValue, 0L);
            this.f17354o = max;
            if (max > 5000000) {
                this.f17340a.e(max);
                this.f17354o = 0L;
            }
        } catch (Exception unused) {
            this.f17353n = null;
        }
        this.f17357r = j7;
    }

    public boolean p() {
        r();
        if (this.f17364y == -9223372036854775807L) {
            ((C1634A) AbstractC1297a.e(this.f17345f)).h();
            return true;
        }
        this.f17330A = e();
        return false;
    }

    public void q() {
        r();
        this.f17342c = null;
        this.f17345f = null;
    }

    public final void r() {
        this.f17351l = 0L;
        this.f17363x = 0;
        this.f17362w = 0;
        this.f17352m = 0L;
        this.f17333D = 0L;
        this.f17336G = 0L;
        this.f17350k = false;
    }

    public void s(AudioTrack audioTrack, boolean z7, int i7, int i8, int i9) {
        this.f17342c = audioTrack;
        this.f17343d = i8;
        this.f17344e = i9;
        this.f17345f = new C1634A(audioTrack);
        this.f17346g = audioTrack.getSampleRate();
        this.f17347h = z7 && o(i7);
        boolean A02 = g0.M.A0(i7);
        this.f17356q = A02;
        this.f17348i = A02 ? g0.M.V0(i9 / i8, this.f17346g) : -9223372036854775807L;
        this.f17359t = 0L;
        this.f17360u = 0L;
        this.f17337H = false;
        this.f17338I = 0L;
        this.f17361v = 0L;
        this.f17355p = false;
        this.f17364y = -9223372036854775807L;
        this.f17365z = -9223372036854775807L;
        this.f17357r = 0L;
        this.f17354o = 0L;
        this.f17349j = 1.0f;
    }

    public void t(float f7) {
        this.f17349j = f7;
        C1634A c1634a = this.f17345f;
        if (c1634a != null) {
            c1634a.h();
        }
        r();
    }

    public void u(InterfaceC1299c interfaceC1299c) {
        this.f17339J = interfaceC1299c;
    }

    public void v() {
        if (this.f17364y != -9223372036854775807L) {
            this.f17364y = g0.M.J0(this.f17339J.b());
        }
        ((C1634A) AbstractC1297a.e(this.f17345f)).h();
    }

    public final void w(long j7) {
        int playState = ((AudioTrack) AbstractC1297a.e(this.f17342c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f17347h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f17361v = this.f17359t;
            }
            playbackHeadPosition += this.f17361v;
        }
        if (g0.M.f14261a <= 29) {
            if (playbackHeadPosition == 0 && this.f17359t > 0 && playState == 3) {
                if (this.f17365z == -9223372036854775807L) {
                    this.f17365z = j7;
                    return;
                }
                return;
            }
            this.f17365z = -9223372036854775807L;
        }
        long j8 = this.f17359t;
        if (j8 > playbackHeadPosition) {
            if (this.f17337H) {
                this.f17338I += j8;
                this.f17337H = false;
            } else {
                this.f17360u++;
            }
        }
        this.f17359t = playbackHeadPosition;
    }
}
