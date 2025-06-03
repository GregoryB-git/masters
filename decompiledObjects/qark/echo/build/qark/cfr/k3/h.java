/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReference
 */
package k3;

import c3.g;
import c3.v;
import c3.w;
import java.util.concurrent.atomic.AtomicReference;
import k3.l;
import k3.n;

public final class h {
    public static h b = new h();
    public final AtomicReference a = new AtomicReference((Object)new n.b().c());

    public static h c() {
        return b;
    }

    public Class a(Class class_) {
        return ((n)this.a.get()).c(class_);
    }

    public Object b(g g8, Class class_) {
        return ((n)this.a.get()).d(g8, class_);
    }

    public void d(l object) {
        synchronized (this) {
            object = new n.b((n)this.a.get()).d((l)object).c();
            this.a.set(object);
            return;
        }
    }

    public void e(w object) {
        synchronized (this) {
            object = new n.b((n)this.a.get()).e((w)object).c();
            this.a.set(object);
            return;
        }
    }

    public Object f(v v8, Class class_) {
        return ((n)this.a.get()).e(v8, class_);
    }
}

