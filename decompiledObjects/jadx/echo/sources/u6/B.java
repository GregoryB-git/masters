package u6;

import p6.AbstractC1836a;

/* loaded from: classes.dex */
public class B extends AbstractC1836a implements Z5.e {

    /* renamed from: r, reason: collision with root package name */
    public final X5.d f19953r;

    public B(X5.g gVar, X5.d dVar) {
        super(gVar, true, true);
        this.f19953r = dVar;
    }

    @Override // p6.x0
    public void F(Object obj) {
        X5.d b7;
        b7 = Y5.c.b(this.f19953r);
        AbstractC2041k.c(b7, p6.D.a(obj, this.f19953r), null, 2, null);
    }

    @Override // p6.AbstractC1836a
    public void G0(Object obj) {
        X5.d dVar = this.f19953r;
        dVar.resumeWith(p6.D.a(obj, dVar));
    }

    @Override // p6.x0
    public final boolean g0() {
        return true;
    }

    @Override // Z5.e
    public final Z5.e getCallerFrame() {
        X5.d dVar = this.f19953r;
        if (dVar instanceof Z5.e) {
            return (Z5.e) dVar;
        }
        return null;
    }
}
