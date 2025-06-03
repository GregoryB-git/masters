package ec;

import jc.f;

/* loaded from: classes.dex */
public abstract class m extends q implements jc.f {
    public m(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // jc.f
    public final f.a a() {
        return ((jc.f) getReflected()).a();
    }

    @Override // ec.b
    public final jc.b computeReflected() {
        t.f5273a.getClass();
        return this;
    }

    @Override // dc.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
