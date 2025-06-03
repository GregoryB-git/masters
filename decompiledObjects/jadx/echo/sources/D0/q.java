package D0;

import android.content.Context;
import android.view.Surface;
import g0.InterfaceC1299c;
import g0.M;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final b f1175a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1176b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1177c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1178d;

    /* renamed from: g, reason: collision with root package name */
    public long f1181g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1184j;

    /* renamed from: e, reason: collision with root package name */
    public int f1179e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f1180f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f1182h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f1183i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f1185k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1299c f1186l = InterfaceC1299c.f14278a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1187a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public long f1188b = -9223372036854775807L;

        public long f() {
            return this.f1187a;
        }

        public long g() {
            return this.f1188b;
        }

        public final void h() {
            this.f1187a = -9223372036854775807L;
            this.f1188b = -9223372036854775807L;
        }
    }

    public interface b {
        boolean m(long j7, long j8, boolean z7);

        boolean n(long j7, long j8, long j9, boolean z7, boolean z8);

        boolean y(long j7, long j8);
    }

    public q(Context context, b bVar, long j7) {
        this.f1175a = bVar;
        this.f1177c = j7;
        this.f1176b = new s(context);
    }

    public void a() {
        if (this.f1179e == 0) {
            this.f1179e = 1;
        }
    }

    public final long b(long j7, long j8, long j9) {
        long j10 = (long) ((j9 - j7) / this.f1185k);
        return this.f1178d ? j10 - (M.J0(this.f1186l.b()) - j8) : j10;
    }

    public int c(long j7, long j8, long j9, long j10, boolean z7, a aVar) {
        aVar.h();
        if (this.f1180f == -9223372036854775807L) {
            this.f1180f = j8;
        }
        if (this.f1182h != j7) {
            this.f1176b.h(j7);
            this.f1182h = j7;
        }
        aVar.f1187a = b(j8, j9, j7);
        boolean z8 = false;
        if (s(j8, aVar.f1187a, j10)) {
            return 0;
        }
        if (!this.f1178d || j8 == this.f1180f) {
            return 5;
        }
        long c7 = this.f1186l.c();
        aVar.f1188b = this.f1176b.b((aVar.f1187a * 1000) + c7);
        aVar.f1187a = (aVar.f1188b - c7) / 1000;
        if (this.f1183i != -9223372036854775807L && !this.f1184j) {
            z8 = true;
        }
        if (this.f1175a.n(aVar.f1187a, j8, j9, z7, z8)) {
            return 4;
        }
        return this.f1175a.m(aVar.f1187a, j9, z7) ? z8 ? 3 : 2 : aVar.f1187a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z7) {
        if (z7 && this.f1179e == 3) {
            this.f1183i = -9223372036854775807L;
            return true;
        }
        if (this.f1183i == -9223372036854775807L) {
            return false;
        }
        if (this.f1186l.b() < this.f1183i) {
            return true;
        }
        this.f1183i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z7) {
        this.f1184j = z7;
        this.f1183i = this.f1177c > 0 ? this.f1186l.b() + this.f1177c : -9223372036854775807L;
    }

    public final void f(int i7) {
        this.f1179e = Math.min(this.f1179e, i7);
    }

    public void g() {
        f(0);
    }

    public void h(boolean z7) {
        this.f1179e = z7 ? 1 : 0;
    }

    public boolean i() {
        boolean z7 = this.f1179e != 3;
        this.f1179e = 3;
        this.f1181g = M.J0(this.f1186l.b());
        return z7;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f1178d = true;
        this.f1181g = M.J0(this.f1186l.b());
        this.f1176b.k();
    }

    public void l() {
        this.f1178d = false;
        this.f1183i = -9223372036854775807L;
        this.f1176b.l();
    }

    public void m() {
        this.f1176b.j();
        this.f1182h = -9223372036854775807L;
        this.f1180f = -9223372036854775807L;
        f(1);
        this.f1183i = -9223372036854775807L;
    }

    public void n(int i7) {
        this.f1176b.o(i7);
    }

    public void o(InterfaceC1299c interfaceC1299c) {
        this.f1186l = interfaceC1299c;
    }

    public void p(float f7) {
        this.f1176b.g(f7);
    }

    public void q(Surface surface) {
        this.f1176b.m(surface);
        f(1);
    }

    public void r(float f7) {
        if (f7 == this.f1185k) {
            return;
        }
        this.f1185k = f7;
        this.f1176b.i(f7);
    }

    public final boolean s(long j7, long j8, long j9) {
        if (this.f1183i != -9223372036854775807L && !this.f1184j) {
            return false;
        }
        int i7 = this.f1179e;
        if (i7 == 0) {
            return this.f1178d;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return j7 >= j9;
        }
        if (i7 == 3) {
            return this.f1178d && this.f1175a.y(j8, M.J0(this.f1186l.b()) - this.f1181g);
        }
        throw new IllegalStateException();
    }
}
