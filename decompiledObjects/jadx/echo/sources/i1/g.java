package i1;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f14792a;

    /* renamed from: b, reason: collision with root package name */
    public int f14793b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14794c;

    /* renamed from: d, reason: collision with root package name */
    public int f14795d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14796e;

    /* renamed from: k, reason: collision with root package name */
    public float f14802k;

    /* renamed from: l, reason: collision with root package name */
    public String f14803l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f14806o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f14807p;

    /* renamed from: r, reason: collision with root package name */
    public C1343b f14809r;

    /* renamed from: f, reason: collision with root package name */
    public int f14797f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f14798g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f14799h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f14800i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f14801j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f14804m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f14805n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f14808q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f14810s = Float.MAX_VALUE;

    public g A(String str) {
        this.f14803l = str;
        return this;
    }

    public g B(boolean z7) {
        this.f14800i = z7 ? 1 : 0;
        return this;
    }

    public g C(boolean z7) {
        this.f14797f = z7 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f14807p = alignment;
        return this;
    }

    public g E(int i7) {
        this.f14805n = i7;
        return this;
    }

    public g F(int i7) {
        this.f14804m = i7;
        return this;
    }

    public g G(float f7) {
        this.f14810s = f7;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f14806o = alignment;
        return this;
    }

    public g I(boolean z7) {
        this.f14808q = z7 ? 1 : 0;
        return this;
    }

    public g J(C1343b c1343b) {
        this.f14809r = c1343b;
        return this;
    }

    public g K(boolean z7) {
        this.f14798g = z7 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f14796e) {
            return this.f14795d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f14794c) {
            return this.f14793b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f14792a;
    }

    public float e() {
        return this.f14802k;
    }

    public int f() {
        return this.f14801j;
    }

    public String g() {
        return this.f14803l;
    }

    public Layout.Alignment h() {
        return this.f14807p;
    }

    public int i() {
        return this.f14805n;
    }

    public int j() {
        return this.f14804m;
    }

    public float k() {
        return this.f14810s;
    }

    public int l() {
        int i7 = this.f14799h;
        if (i7 == -1 && this.f14800i == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f14800i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f14806o;
    }

    public boolean n() {
        return this.f14808q == 1;
    }

    public C1343b o() {
        return this.f14809r;
    }

    public boolean p() {
        return this.f14796e;
    }

    public boolean q() {
        return this.f14794c;
    }

    public final g r(g gVar, boolean z7) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f14794c && gVar.f14794c) {
                w(gVar.f14793b);
            }
            if (this.f14799h == -1) {
                this.f14799h = gVar.f14799h;
            }
            if (this.f14800i == -1) {
                this.f14800i = gVar.f14800i;
            }
            if (this.f14792a == null && (str = gVar.f14792a) != null) {
                this.f14792a = str;
            }
            if (this.f14797f == -1) {
                this.f14797f = gVar.f14797f;
            }
            if (this.f14798g == -1) {
                this.f14798g = gVar.f14798g;
            }
            if (this.f14805n == -1) {
                this.f14805n = gVar.f14805n;
            }
            if (this.f14806o == null && (alignment2 = gVar.f14806o) != null) {
                this.f14806o = alignment2;
            }
            if (this.f14807p == null && (alignment = gVar.f14807p) != null) {
                this.f14807p = alignment;
            }
            if (this.f14808q == -1) {
                this.f14808q = gVar.f14808q;
            }
            if (this.f14801j == -1) {
                this.f14801j = gVar.f14801j;
                this.f14802k = gVar.f14802k;
            }
            if (this.f14809r == null) {
                this.f14809r = gVar.f14809r;
            }
            if (this.f14810s == Float.MAX_VALUE) {
                this.f14810s = gVar.f14810s;
            }
            if (z7 && !this.f14796e && gVar.f14796e) {
                u(gVar.f14795d);
            }
            if (z7 && this.f14804m == -1 && (i7 = gVar.f14804m) != -1) {
                this.f14804m = i7;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f14797f == 1;
    }

    public boolean t() {
        return this.f14798g == 1;
    }

    public g u(int i7) {
        this.f14795d = i7;
        this.f14796e = true;
        return this;
    }

    public g v(boolean z7) {
        this.f14799h = z7 ? 1 : 0;
        return this;
    }

    public g w(int i7) {
        this.f14793b = i7;
        this.f14794c = true;
        return this;
    }

    public g x(String str) {
        this.f14792a = str;
        return this;
    }

    public g y(float f7) {
        this.f14802k = f7;
        return this;
    }

    public g z(int i7) {
        this.f14801j = i7;
        return this;
    }
}
