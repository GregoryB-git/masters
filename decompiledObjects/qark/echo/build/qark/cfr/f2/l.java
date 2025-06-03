/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package f2;

import c2.d;
import c2.f;
import f2.p;
import f2.s;
import f2.u;
import g2.g;
import j2.a;
import m2.r;

public abstract class l {
    public static void a(f object, d d8) {
        if (object instanceof s) {
            object = ((s)object).d().f(d8);
            u.c().e().u((p)object, 1);
            return;
        }
        a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", object);
    }
}

