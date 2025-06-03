package g9;

import g9.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x extends l {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6099d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(j9.l r2, ka.d0 r3) {
        /*
            r1 = this;
            g9.l$a r0 = g9.l.a.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6099d = r2
            java.util.ArrayList r3 = h(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.x.<init>(j9.l, ka.d0):void");
    }

    public static ArrayList h(l.a aVar, ka.d0 d0Var) {
        x6.b.Z("extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", aVar == l.a.IN || aVar == l.a.NOT_IN, new Object[0]);
        x6.b.Z("KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", j9.s.h(d0Var), new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (ka.d0 d0Var2 : d0Var.R().h()) {
            x6.b.Z(defpackage.g.f(defpackage.f.l("Comparing on key with "), aVar.f6023a, ", but an array value was not a ReferenceValue"), j9.s.k(d0Var2), new Object[0]);
            arrayList.add(j9.i.h(d0Var2.Z()));
        }
        return arrayList;
    }

    @Override // g9.l, g9.m
    public final boolean d(j9.g gVar) {
        return this.f6099d.contains(gVar.getKey());
    }
}
