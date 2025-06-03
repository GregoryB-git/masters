package f2;

import c2.EnumC0821d;
import j2.AbstractC1370a;

/* loaded from: classes.dex */
public abstract class l {
    public static void a(c2.f fVar, EnumC0821d enumC0821d) {
        if (!(fVar instanceof s)) {
            AbstractC1370a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fVar);
        } else {
            u.c().e().u(((s) fVar).d().f(enumC0821d), 1);
        }
    }
}
