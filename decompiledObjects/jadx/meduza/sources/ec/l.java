package ec;

import nc.g0;
import sc.j;

/* loaded from: classes.dex */
public class l extends q implements dc.a {
    public l(Object obj) {
        super(obj, g0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // ec.b
    public final jc.b computeReflected() {
        t.f5273a.getClass();
        return this;
    }

    @Override // dc.a
    public final Object invoke() {
        return ((j.b) this).receiver.getClass().getSimpleName();
    }
}
