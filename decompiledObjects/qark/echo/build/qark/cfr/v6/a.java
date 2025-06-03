/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package v6;

import V5.n;
import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import g6.l;
import g6.p;
import u6.k;

public abstract class a {
    public static final void a(d d8, Throwable throwable) {
        n.a a8 = n.o;
        d8.resumeWith(n.a(o.a(throwable)));
        throw throwable;
    }

    public static final void b(d d8, d d9) {
        try {
            d8 = b.b(d8);
            n.a a8 = n.o;
            k.c(d8, n.a(t.a), null, 2, null);
            return;
        }
        catch (Throwable throwable) {
            a.a(d9, throwable);
            return;
        }
    }

    public static final void c(p object, Object object2, d d8, l l8) {
        try {
            object = b.b(b.a((p)object, object2, d8));
            object2 = n.o;
            k.b((d)object, n.a(t.a), l8);
            return;
        }
        catch (Throwable throwable) {
            a.a(d8, throwable);
            return;
        }
    }

    public static /* synthetic */ void d(p p8, Object object, d d8, l l8, int n8, Object object2) {
        if ((n8 & 4) != 0) {
            l8 = null;
        }
        a.c(p8, object, d8, l8);
    }
}

