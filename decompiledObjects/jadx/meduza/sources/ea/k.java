package ea;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final t9.b<h3.i> f4946a;

    public k(t9.b<h3.i> bVar) {
        this.f4946a = bVar;
    }

    @Override // ea.l
    public final void a(y yVar) {
        k3.u a10 = this.f4946a.get().a("FIREBASE_APPQUALITY_SESSION", new h3.c("json"), new defpackage.d(this, 14));
        h3.a aVar = new h3.a(yVar, h3.e.DEFAULT, null);
        a10.getClass();
        a10.a(aVar, new w3.v(1));
    }
}
