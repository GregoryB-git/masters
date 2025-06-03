/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.b;
import u6.F;
import u6.s;

public class r {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, (String)"_cur");
    private volatile Object _cur;

    public r(boolean bl) {
        this._cur = new s(8, bl);
    }

    public final boolean a(Object object) {
        s s8;
        int n8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while ((n8 = (s8 = (s)atomicReferenceFieldUpdater.get((Object)this)).a(object)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) continue;
                return false;
            }
            b.a(a, this, s8, s8.i());
        }
        return true;
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        s s8;
        while (!(s8 = (s)atomicReferenceFieldUpdater.get((Object)this)).d()) {
            b.a(a, this, s8, s8.i());
        }
        return;
    }

    public final int c() {
        return ((s)a.get((Object)this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        s s8;
        Object object;
        while ((object = (s8 = (s)atomicReferenceFieldUpdater.get((Object)this)).j()) == s.h) {
            b.a(a, this, s8, s8.i());
        }
        return object;
    }
}

