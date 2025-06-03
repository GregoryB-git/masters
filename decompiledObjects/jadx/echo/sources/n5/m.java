package n5;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final l f18025a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f18026b;

    public m(l lVar, Runnable runnable) {
        this.f18025a = lVar;
        this.f18026b = runnable;
    }

    public Integer a() {
        l lVar = this.f18025a;
        if (lVar != null) {
            return Integer.valueOf(lVar.a());
        }
        return null;
    }

    public boolean b() {
        l lVar = this.f18025a;
        return lVar != null && lVar.b();
    }
}
