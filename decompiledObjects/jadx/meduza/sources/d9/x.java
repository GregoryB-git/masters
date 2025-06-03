package d9;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final n9.i<n9.a, g9.u> f3733a;

    /* renamed from: b, reason: collision with root package name */
    public g9.u f3734b;

    /* renamed from: c, reason: collision with root package name */
    public n9.a f3735c = new n9.a();

    public x(defpackage.e eVar) {
        this.f3733a = eVar;
    }

    public final synchronized <T> T a(n9.i<g9.u, T> iVar) {
        b();
        return iVar.apply(this.f3734b);
    }

    public final synchronized void b() {
        if (!(this.f3734b != null)) {
            this.f3734b = this.f3733a.apply(this.f3735c);
        }
    }
}
