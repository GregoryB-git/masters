package p0;

import dc.l;
import ec.i;
import o0.b;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l<o0.a, T> f12749a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super o0.a, ? extends T> lVar) {
        i.e(lVar, "produceNewData");
        this.f12749a = lVar;
    }

    @Override // o0.b
    public final Object a(o0.a aVar) {
        return this.f12749a.invoke(aVar);
    }
}
