package R2;

import A2.AbstractC0328n;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class I2 {

    /* renamed from: A, reason: collision with root package name */
    public long f4710A;

    /* renamed from: B, reason: collision with root package name */
    public long f4711B;

    /* renamed from: C, reason: collision with root package name */
    public long f4712C;

    /* renamed from: D, reason: collision with root package name */
    public long f4713D;

    /* renamed from: E, reason: collision with root package name */
    public long f4714E;

    /* renamed from: F, reason: collision with root package name */
    public long f4715F;

    /* renamed from: G, reason: collision with root package name */
    public long f4716G;

    /* renamed from: H, reason: collision with root package name */
    public String f4717H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f4718I;

    /* renamed from: J, reason: collision with root package name */
    public long f4719J;

    /* renamed from: K, reason: collision with root package name */
    public long f4720K;

    /* renamed from: a, reason: collision with root package name */
    public final N2 f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4722b;

    /* renamed from: c, reason: collision with root package name */
    public String f4723c;

    /* renamed from: d, reason: collision with root package name */
    public String f4724d;

    /* renamed from: e, reason: collision with root package name */
    public String f4725e;

    /* renamed from: f, reason: collision with root package name */
    public String f4726f;

    /* renamed from: g, reason: collision with root package name */
    public long f4727g;

    /* renamed from: h, reason: collision with root package name */
    public long f4728h;

    /* renamed from: i, reason: collision with root package name */
    public long f4729i;

    /* renamed from: j, reason: collision with root package name */
    public String f4730j;

    /* renamed from: k, reason: collision with root package name */
    public long f4731k;

    /* renamed from: l, reason: collision with root package name */
    public String f4732l;

    /* renamed from: m, reason: collision with root package name */
    public long f4733m;

    /* renamed from: n, reason: collision with root package name */
    public long f4734n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4735o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4736p;

    /* renamed from: q, reason: collision with root package name */
    public String f4737q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f4738r;

    /* renamed from: s, reason: collision with root package name */
    public long f4739s;

    /* renamed from: t, reason: collision with root package name */
    public List f4740t;

    /* renamed from: u, reason: collision with root package name */
    public String f4741u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4742v;

    /* renamed from: w, reason: collision with root package name */
    public long f4743w;

    /* renamed from: x, reason: collision with root package name */
    public long f4744x;

    /* renamed from: y, reason: collision with root package name */
    public int f4745y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4746z;

    public I2(N2 n22, String str) {
        AbstractC0328n.i(n22);
        AbstractC0328n.e(str);
        this.f4721a = n22;
        this.f4722b = str;
        n22.e().n();
    }

    public final void A(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4719J != j7;
        this.f4719J = j7;
    }

    public final void B(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4732l, str);
        this.f4732l = str;
    }

    public final void C(boolean z7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4742v != z7;
        this.f4742v = z7;
    }

    public final long D() {
        this.f4721a.e().n();
        return this.f4710A;
    }

    public final void E(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4714E != j7;
        this.f4714E = j7;
    }

    public final void F(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4730j, str);
        this.f4730j = str;
    }

    public final void G(boolean z7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4746z != z7;
        this.f4746z = z7;
    }

    public final long H() {
        this.f4721a.e().n();
        return this.f4719J;
    }

    public final void I(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4715F != j7;
        this.f4715F = j7;
    }

    public final void J(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4726f, str);
        this.f4726f = str;
    }

    public final long K() {
        this.f4721a.e().n();
        return this.f4714E;
    }

    public final void L(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4713D != j7;
        this.f4713D = j7;
    }

    public final void M(String str) {
        this.f4721a.e().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4718I |= !AbstractC0521h2.a(this.f4724d, str);
        this.f4724d = str;
    }

    public final long N() {
        this.f4721a.e().n();
        return this.f4715F;
    }

    public final void O(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4712C != j7;
        this.f4712C = j7;
    }

    public final void P(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4717H, str);
        this.f4717H = str;
    }

    public final long Q() {
        this.f4721a.e().n();
        return this.f4713D;
    }

    public final void R(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4716G != j7;
        this.f4716G = j7;
    }

    public final void S(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4725e, str);
        this.f4725e = str;
    }

    public final long T() {
        this.f4721a.e().n();
        return this.f4712C;
    }

    public final void U(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4711B != j7;
        this.f4711B = j7;
    }

    public final void V(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4741u, str);
        this.f4741u = str;
    }

    public final long W() {
        this.f4721a.e().n();
        return this.f4716G;
    }

    public final void X(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4734n != j7;
        this.f4734n = j7;
    }

    public final long Y() {
        this.f4721a.e().n();
        return this.f4711B;
    }

    public final void Z(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4739s != j7;
        this.f4739s = j7;
    }

    public final int a() {
        this.f4721a.e().n();
        return this.f4745y;
    }

    public final long a0() {
        this.f4721a.e().n();
        return this.f4734n;
    }

    public final void b(int i7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4745y != i7;
        this.f4745y = i7;
    }

    public final void b0(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4720K != j7;
        this.f4720K = j7;
    }

    public final void c(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4731k != j7;
        this.f4731k = j7;
    }

    public final long c0() {
        this.f4721a.e().n();
        return this.f4739s;
    }

    public final void d(Boolean bool) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4738r, bool);
        this.f4738r = bool;
    }

    public final void d0(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4733m != j7;
        this.f4733m = j7;
    }

    public final void e(String str) {
        this.f4721a.e().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f4718I |= !AbstractC0521h2.a(this.f4737q, str);
        this.f4737q = str;
    }

    public final long e0() {
        this.f4721a.e().n();
        return this.f4720K;
    }

    public final void f(List list) {
        this.f4721a.e().n();
        if (AbstractC0521h2.a(this.f4740t, list)) {
            return;
        }
        this.f4718I = true;
        this.f4740t = list != null ? new ArrayList(list) : null;
    }

    public final void f0(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4729i != j7;
        this.f4729i = j7;
    }

    public final void g(boolean z7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4736p != z7;
        this.f4736p = z7;
    }

    public final long g0() {
        this.f4721a.e().n();
        return this.f4733m;
    }

    public final String h() {
        this.f4721a.e().n();
        return this.f4730j;
    }

    public final void h0(long j7) {
        AbstractC0328n.a(j7 >= 0);
        this.f4721a.e().n();
        this.f4718I |= this.f4727g != j7;
        this.f4727g = j7;
    }

    public final String i() {
        this.f4721a.e().n();
        return this.f4726f;
    }

    public final long i0() {
        this.f4721a.e().n();
        return this.f4729i;
    }

    public final String j() {
        this.f4721a.e().n();
        return this.f4724d;
    }

    public final void j0(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4728h != j7;
        this.f4728h = j7;
    }

    public final String k() {
        this.f4721a.e().n();
        return this.f4717H;
    }

    public final long k0() {
        this.f4721a.e().n();
        return this.f4727g;
    }

    public final String l() {
        this.f4721a.e().n();
        return this.f4725e;
    }

    public final void l0(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4744x != j7;
        this.f4744x = j7;
    }

    public final String m() {
        this.f4721a.e().n();
        return this.f4741u;
    }

    public final long m0() {
        this.f4721a.e().n();
        return this.f4728h;
    }

    public final List n() {
        this.f4721a.e().n();
        return this.f4740t;
    }

    public final void n0(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4743w != j7;
        this.f4743w = j7;
    }

    public final void o() {
        this.f4721a.e().n();
        this.f4718I = false;
    }

    public final long o0() {
        this.f4721a.e().n();
        return this.f4744x;
    }

    public final void p() {
        this.f4721a.e().n();
        long j7 = this.f4727g + 1;
        if (j7 > 2147483647L) {
            this.f4721a.j().L().b("Bundle index overflow. appId", Y1.v(this.f4722b));
            j7 = 0;
        }
        this.f4718I = true;
        this.f4727g = j7;
    }

    public final long p0() {
        this.f4721a.e().n();
        return this.f4743w;
    }

    public final boolean q() {
        this.f4721a.e().n();
        return this.f4736p;
    }

    public final Boolean q0() {
        this.f4721a.e().n();
        return this.f4738r;
    }

    public final boolean r() {
        this.f4721a.e().n();
        return this.f4735o;
    }

    public final String r0() {
        this.f4721a.e().n();
        return this.f4737q;
    }

    public final boolean s() {
        this.f4721a.e().n();
        return this.f4718I;
    }

    public final String s0() {
        this.f4721a.e().n();
        String str = this.f4717H;
        P(null);
        return str;
    }

    public final boolean t() {
        this.f4721a.e().n();
        return this.f4742v;
    }

    public final String t0() {
        this.f4721a.e().n();
        return this.f4722b;
    }

    public final boolean u() {
        this.f4721a.e().n();
        return this.f4746z;
    }

    public final String u0() {
        this.f4721a.e().n();
        return this.f4723c;
    }

    public final long v() {
        this.f4721a.e().n();
        return 0L;
    }

    public final String v0() {
        this.f4721a.e().n();
        return this.f4732l;
    }

    public final void w(long j7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4710A != j7;
        this.f4710A = j7;
    }

    public final void x(String str) {
        this.f4721a.e().n();
        this.f4718I |= !AbstractC0521h2.a(this.f4723c, str);
        this.f4723c = str;
    }

    public final void y(boolean z7) {
        this.f4721a.e().n();
        this.f4718I |= this.f4735o != z7;
        this.f4735o = z7;
    }

    public final long z() {
        this.f4721a.e().n();
        return this.f4731k;
    }
}
