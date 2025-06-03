package e7;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4097a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4098b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f4100d;

    public b1(a1 a1Var, int i10, boolean z10, boolean z11) {
        this.f4100d = a1Var;
        this.f4097a = i10;
        this.f4098b = z10;
        this.f4099c = z11;
    }

    public final void a(Object obj, Object obj2, Object obj3, String str) {
        this.f4100d.t(this.f4097a, this.f4098b, this.f4099c, str, obj, obj2, obj3);
    }

    public final void b(String str) {
        this.f4100d.t(this.f4097a, this.f4098b, this.f4099c, str, null, null, null);
    }

    public final void c(String str, Object obj) {
        this.f4100d.t(this.f4097a, this.f4098b, this.f4099c, str, obj, null, null);
    }

    public final void d(String str, Object obj, Object obj2) {
        this.f4100d.t(this.f4097a, this.f4098b, this.f4099c, str, obj, obj2, null);
    }
}
