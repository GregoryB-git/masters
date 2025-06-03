package e7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k1 {
    public Long A;
    public Long B;
    public long C;
    public String D;
    public int E;
    public int F;
    public long G;
    public String H;
    public byte[] I;
    public int J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public String Q;
    public boolean R;
    public long S;
    public long T;

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4394b;

    /* renamed from: c, reason: collision with root package name */
    public String f4395c;

    /* renamed from: d, reason: collision with root package name */
    public String f4396d;

    /* renamed from: e, reason: collision with root package name */
    public String f4397e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public long f4398g;

    /* renamed from: h, reason: collision with root package name */
    public long f4399h;

    /* renamed from: i, reason: collision with root package name */
    public long f4400i;

    /* renamed from: j, reason: collision with root package name */
    public String f4401j;

    /* renamed from: k, reason: collision with root package name */
    public long f4402k;

    /* renamed from: l, reason: collision with root package name */
    public String f4403l;

    /* renamed from: m, reason: collision with root package name */
    public long f4404m;

    /* renamed from: n, reason: collision with root package name */
    public long f4405n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4406o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4407p;

    /* renamed from: q, reason: collision with root package name */
    public String f4408q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f4409r;

    /* renamed from: s, reason: collision with root package name */
    public long f4410s;
    public ArrayList t;

    /* renamed from: u, reason: collision with root package name */
    public String f4411u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4412v;

    /* renamed from: w, reason: collision with root package name */
    public long f4413w;

    /* renamed from: x, reason: collision with root package name */
    public long f4414x;

    /* renamed from: y, reason: collision with root package name */
    public int f4415y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4416z;

    public k1(j2 j2Var, String str) {
        m6.j.i(j2Var);
        m6.j.e(str);
        this.f4393a = j2Var;
        this.f4394b = str;
        j2Var.zzl().l();
    }

    public final void A(String str) {
        this.f4393a.zzl().l();
        this.R |= !Objects.equals(this.f4397e, str);
        this.f4397e = str;
    }

    public final void B(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.f4405n != j10;
        this.f4405n = j10;
    }

    public final void C(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.f4410s != j10;
        this.f4410s = j10;
    }

    public final void D(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.f4404m != j10;
        this.f4404m = j10;
    }

    public final void E(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.G != j10;
        this.G = j10;
    }

    public final void F(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.f4400i != j10;
        this.f4400i = j10;
    }

    public final void G(long j10) {
        m6.j.b(j10 >= 0);
        this.f4393a.zzl().l();
        this.R |= this.f4398g != j10;
        this.f4398g = j10;
    }

    public final void H(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.f4399h != j10;
        this.f4399h = j10;
    }

    public final void a(long j10) {
        this.f4393a.zzl().l();
        long j11 = this.f4398g + j10;
        if (j11 > 2147483647L) {
            this.f4393a.zzj().f4063r.c("Bundle index overflow. appId", a1.p(this.f4394b));
            j11 = j10 - 1;
        }
        long j12 = this.G + 1;
        if (j12 > 2147483647L) {
            this.f4393a.zzj().f4063r.c("Delivery index overflow. appId", a1.p(this.f4394b));
            j12 = 0;
        }
        this.R = true;
        this.f4398g = j11;
        this.G = j12;
    }

    public final void b(String str) {
        this.f4393a.zzl().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.R |= !Objects.equals(this.f4408q, str);
        this.f4408q = str;
    }

    public final void c(List<String> list) {
        this.f4393a.zzl().l();
        if (Objects.equals(this.t, list)) {
            return;
        }
        this.R = true;
        this.t = list != null ? new ArrayList(list) : null;
    }

    public final String d() {
        this.f4393a.zzl().l();
        return this.f4408q;
    }

    public final String e() {
        this.f4393a.zzl().l();
        String str = this.Q;
        z(null);
        return str;
    }

    public final String f() {
        this.f4393a.zzl().l();
        return this.f4394b;
    }

    public final String g() {
        this.f4393a.zzl().l();
        return this.f4395c;
    }

    public final String h() {
        this.f4393a.zzl().l();
        return this.f4401j;
    }

    public final String i() {
        this.f4393a.zzl().l();
        return this.f;
    }

    public final String j() {
        this.f4393a.zzl().l();
        return this.f4396d;
    }

    public final String k() {
        this.f4393a.zzl().l();
        return this.D;
    }

    public final boolean l() {
        this.f4393a.zzl().l();
        return this.f4412v;
    }

    public final int m() {
        this.f4393a.zzl().l();
        return this.J;
    }

    public final void n(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.f4402k != j10;
        this.f4402k = j10;
    }

    public final void o(String str) {
        this.f4393a.zzl().l();
        this.R |= !Objects.equals(this.f4395c, str);
        this.f4395c = str;
    }

    public final void p(boolean z10) {
        this.f4393a.zzl().l();
        this.R |= this.f4406o != z10;
        this.f4406o = z10;
    }

    public final void q(int i10) {
        this.f4393a.zzl().l();
        this.R |= this.F != i10;
        this.F = i10;
    }

    public final void r(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.C != j10;
        this.C = j10;
    }

    public final void s(String str) {
        this.f4393a.zzl().l();
        this.R |= !Objects.equals(this.f4403l, str);
        this.f4403l = str;
    }

    public final void t(int i10) {
        this.f4393a.zzl().l();
        this.R |= this.E != i10;
        this.E = i10;
    }

    public final void u(long j10) {
        this.f4393a.zzl().l();
        this.R |= this.S != j10;
        this.S = j10;
    }

    public final void v(String str) {
        this.f4393a.zzl().l();
        this.R |= !Objects.equals(this.f4401j, str);
        this.f4401j = str;
    }

    public final long w() {
        this.f4393a.zzl().l();
        return this.f4402k;
    }

    public final void x(String str) {
        this.f4393a.zzl().l();
        this.R |= !Objects.equals(this.f, str);
        this.f = str;
    }

    public final void y(String str) {
        this.f4393a.zzl().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.R |= !Objects.equals(this.f4396d, str);
        this.f4396d = str;
    }

    public final void z(String str) {
        this.f4393a.zzl().l();
        this.R |= !Objects.equals(this.Q, str);
        this.Q = str;
    }
}
