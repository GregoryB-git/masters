package m7;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10361c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile k f10362a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10363b = f10361c;

    public h(i iVar) {
        this.f10362a = iVar;
    }

    public static k b(i iVar) {
        return iVar instanceof h ? iVar : new h(iVar);
    }

    @Override // m7.k
    public final Object a() {
        Object obj = this.f10363b;
        Object obj2 = f10361c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f10363b;
                if (obj == obj2) {
                    obj = this.f10362a.a();
                    Object obj3 = this.f10363b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f10363b = obj;
                    this.f10362a = null;
                }
            }
        }
        return obj;
    }
}
