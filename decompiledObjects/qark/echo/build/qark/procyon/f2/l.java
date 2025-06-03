// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import j2.a;
import c2.d;
import c2.f;

public abstract class l
{
    public static void a(final f f, final d d) {
        if (f instanceof s) {
            u.c().e().u(((s)f).d().f(d), 1);
            return;
        }
        a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", f);
    }
}
