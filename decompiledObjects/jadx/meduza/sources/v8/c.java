package v8;

@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r4.c f16007a;

    /* renamed from: b, reason: collision with root package name */
    public final w8.a f16008b;

    public c(w8.a aVar) {
        if (aVar == null) {
            this.f16008b = null;
            this.f16007a = null;
        } else {
            if (aVar.f16444d == 0) {
                aVar.f16444d = System.currentTimeMillis();
            }
            this.f16008b = aVar;
            this.f16007a = new r4.c(aVar);
        }
    }
}
