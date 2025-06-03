package b0;

import b0.l;

/* loaded from: classes.dex */
public final class i implements d0.a<l.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1682a;

    public i(c cVar) {
        this.f1682a = cVar;
    }

    @Override // d0.a
    public final void accept(l.a aVar) {
        l.a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = new l.a(-3);
        }
        this.f1682a.a(aVar2);
    }
}
