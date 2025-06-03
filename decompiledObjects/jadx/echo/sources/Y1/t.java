package Y1;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum t {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);


    /* renamed from: o, reason: collision with root package name */
    public final boolean f7463o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7464p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7465q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7466r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7467s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7468t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7469u;

    t(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f7463o = z7;
        this.f7464p = z8;
        this.f7465q = z9;
        this.f7466r = z10;
        this.f7467s = z11;
        this.f7468t = z12;
        this.f7469u = z13;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        t[] valuesCustom = values();
        return (t[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean e() {
        return this.f7467s;
    }

    public final boolean h() {
        return this.f7466r;
    }

    public final boolean j() {
        return this.f7463o;
    }

    public final boolean l() {
        return this.f7469u;
    }

    public final boolean m() {
        return this.f7464p;
    }

    public final boolean n() {
        return this.f7465q;
    }
}
