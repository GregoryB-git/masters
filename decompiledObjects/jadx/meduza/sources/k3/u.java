package k3;

import java.util.HashMap;
import k3.h;

/* loaded from: classes.dex */
public final class u<T> implements h3.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s f8916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8917b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.c f8918c;

    /* renamed from: d, reason: collision with root package name */
    public final h3.g<T, byte[]> f8919d;

    /* renamed from: e, reason: collision with root package name */
    public final v f8920e;

    public u(s sVar, String str, h3.c cVar, h3.g<T, byte[]> gVar, v vVar) {
        this.f8916a = sVar;
        this.f8917b = str;
        this.f8918c = cVar;
        this.f8919d = gVar;
        this.f8920e = vVar;
    }

    public final void a(h3.a aVar, h3.j jVar) {
        v vVar = this.f8920e;
        s sVar = this.f8916a;
        if (sVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = this.f8917b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        h3.g<T, byte[]> gVar = this.f8919d;
        if (gVar == null) {
            throw new NullPointerException("Null transformer");
        }
        h3.c cVar = this.f8918c;
        if (cVar == null) {
            throw new NullPointerException("Null encoding");
        }
        i iVar = new i(sVar, str, aVar, gVar, cVar);
        w wVar = (w) vVar;
        p3.d dVar = wVar.f8924c;
        j e10 = iVar.f8891a.e(iVar.f8893c.d());
        h.a aVar2 = new h.a();
        aVar2.f = new HashMap();
        aVar2.f8885d = Long.valueOf(wVar.f8922a.a());
        aVar2.f8886e = Long.valueOf(wVar.f8923b.a());
        aVar2.d(iVar.f8892b);
        aVar2.c(new m(iVar.f8895e, iVar.f8894d.apply(iVar.f8893c.c())));
        aVar2.f8883b = iVar.f8893c.a();
        if (iVar.f8893c.e() != null && iVar.f8893c.e().a() != null) {
            aVar2.f8887g = iVar.f8893c.e().a();
        }
        iVar.f8893c.b();
        dVar.a(jVar, aVar2.b(), e10);
    }
}
