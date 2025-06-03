package k7;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f9116b;

    public l(m mVar) {
        this.f9116b = mVar;
    }

    @Override // k7.e
    public final void a() {
        n nVar = this.f9116b.f9117a;
        nVar.f9120b.a("unlinkToDeath", new Object[0]);
        nVar.f9130m.asBinder().unlinkToDeath(nVar.f9127j, 0);
        n nVar2 = this.f9116b.f9117a;
        nVar2.f9130m = null;
        nVar2.f9124g = false;
    }
}
