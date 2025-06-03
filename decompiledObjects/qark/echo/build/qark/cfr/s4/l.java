/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package s4;

import V2.k;
import s4.n;
import s4.p;
import s4.q;
import u4.d;

public class l
implements p {
    public final q a;
    public final k b;

    public l(q q8, k k8) {
        this.a = q8;
        this.b = k8;
    }

    @Override
    public boolean a(Exception exception) {
        this.b.d(exception);
        return true;
    }

    @Override
    public boolean b(d d8) {
        if (d8.k() && !this.a.f(d8)) {
            this.b.c(n.a().b(d8.b()).d(d8.c()).c(d8.h()).a());
            return true;
        }
        return false;
    }
}

