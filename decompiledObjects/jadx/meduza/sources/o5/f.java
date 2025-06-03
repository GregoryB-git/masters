package o5;

import android.text.Layout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f11909a;

    /* renamed from: b, reason: collision with root package name */
    public int f11910b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11911c;

    /* renamed from: d, reason: collision with root package name */
    public int f11912d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11913e;

    /* renamed from: k, reason: collision with root package name */
    public float f11918k;

    /* renamed from: l, reason: collision with root package name */
    public String f11919l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f11922o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f11923p;

    /* renamed from: r, reason: collision with root package name */
    public b f11925r;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f11914g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f11915h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f11916i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f11917j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f11920m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f11921n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f11924q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f11926s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f11911c && fVar.f11911c) {
                this.f11910b = fVar.f11910b;
                this.f11911c = true;
            }
            if (this.f11915h == -1) {
                this.f11915h = fVar.f11915h;
            }
            if (this.f11916i == -1) {
                this.f11916i = fVar.f11916i;
            }
            if (this.f11909a == null && (str = fVar.f11909a) != null) {
                this.f11909a = str;
            }
            if (this.f == -1) {
                this.f = fVar.f;
            }
            if (this.f11914g == -1) {
                this.f11914g = fVar.f11914g;
            }
            if (this.f11921n == -1) {
                this.f11921n = fVar.f11921n;
            }
            if (this.f11922o == null && (alignment2 = fVar.f11922o) != null) {
                this.f11922o = alignment2;
            }
            if (this.f11923p == null && (alignment = fVar.f11923p) != null) {
                this.f11923p = alignment;
            }
            if (this.f11924q == -1) {
                this.f11924q = fVar.f11924q;
            }
            if (this.f11917j == -1) {
                this.f11917j = fVar.f11917j;
                this.f11918k = fVar.f11918k;
            }
            if (this.f11925r == null) {
                this.f11925r = fVar.f11925r;
            }
            if (this.f11926s == Float.MAX_VALUE) {
                this.f11926s = fVar.f11926s;
            }
            if (!this.f11913e && fVar.f11913e) {
                this.f11912d = fVar.f11912d;
                this.f11913e = true;
            }
            if (this.f11920m != -1 || (i10 = fVar.f11920m) == -1) {
                return;
            }
            this.f11920m = i10;
        }
    }
}
