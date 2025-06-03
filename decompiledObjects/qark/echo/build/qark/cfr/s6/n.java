/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package s6;

import V5.n;
import V5.t;
import Y5.b;
import Z5.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import s6.l;
import s6.m;
import t6.c;
import t6.d;

public final class n
extends d {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, (String)"_state");
    private volatile Object _state;

    public boolean d(l l8) {
        l8 = a;
        if (l8.get((Object)this) != null) {
            return false;
        }
        l8.set((Object)this, (Object)m.b());
        return true;
    }

    public final Object e(X5.d d8) {
        Object object = new p6.m(b.b(d8), 1);
        object.z();
        if (!u.b.a(a, this, m.b(), object)) {
            n.a a8 = V5.n.o;
            object.resumeWith(V5.n.a(t.a));
        }
        if ((object = object.w()) == b.c()) {
            h.c(d8);
        }
        if (object == b.c()) {
            return object;
        }
        return t.a;
    }

    public X5.d[] f(l l8) {
        a.set((Object)this, (Object)null);
        return c.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void g() {
        var1_1 = n.a;
        do lbl-1000: // 3 sources:
        {
            if ((var2_2 = var1_1.get((Object)this)) == null) {
                return;
            }
            if (var2_2 == m.c()) {
                return;
            }
            if (var2_2 != m.b()) continue;
            if (!u.b.a(n.a, this, var2_2, m.c())) ** GOTO lbl-1000
            return;
        } while (!u.b.a(n.a, this, var2_2, m.b()));
        var1_1 = (p6.m)var2_2;
        var2_2 = V5.n.o;
        var1_1.resumeWith(V5.n.a(t.a));
    }

    public final boolean h() {
        Object object = a.getAndSet((Object)this, (Object)m.b());
        Intrinsics.b(object);
        if (object == m.c()) {
            return true;
        }
        return false;
    }
}

