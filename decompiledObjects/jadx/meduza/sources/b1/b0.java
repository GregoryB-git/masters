package b1;

import b1.b;
import b1.k;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class b0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1716a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f1717b;

    public b0(Object obj) {
        this.f1716a = obj;
        this.f1717b = b.f1709c.b(obj.getClass());
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        b.a aVar2 = this.f1717b;
        Object obj = this.f1716a;
        b.a.a((List) aVar2.f1712a.get(aVar), oVar, aVar, obj);
        b.a.a((List) aVar2.f1712a.get(k.a.ON_ANY), oVar, aVar, obj);
    }
}
