package gb;

import eb.k0;
import n7.g;

/* loaded from: classes.dex */
public final class v1 extends k0.j {

    /* renamed from: a, reason: collision with root package name */
    public final k0.f f6852a;

    public v1(Throwable th) {
        eb.e1 f = eb.e1.f5077m.g("Panic! This is a bug!").f(th);
        k0.f fVar = k0.f.f5160e;
        x6.b.s("drop status shouldn't be OK", !f.e());
        this.f6852a = new k0.f(null, null, f, true);
    }

    @Override // eb.k0.j
    public final k0.f a(k0.g gVar) {
        return this.f6852a;
    }

    public final String toString() {
        g.a aVar = new g.a(v1.class.getSimpleName());
        aVar.a(this.f6852a, "panicPickResult");
        return aVar.toString();
    }
}
