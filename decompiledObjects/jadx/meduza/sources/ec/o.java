package ec;

import jc.g;

/* loaded from: classes.dex */
public abstract class o extends q implements jc.g {
    public o(Class cls) {
        super(b.NO_RECEIVER, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override // jc.g
    public final g.a a() {
        return ((jc.g) getReflected()).a();
    }

    @Override // ec.b
    public final jc.b computeReflected() {
        t.f5273a.getClass();
        return this;
    }

    @Override // dc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) this).a().call(obj, obj2);
    }
}
