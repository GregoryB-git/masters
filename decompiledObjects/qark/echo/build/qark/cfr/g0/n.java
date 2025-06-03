/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d0.p;
import g0.k;
import g0.l;
import g0.m;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class n {
    public final g0.c a;
    public final k b;
    public final b c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;

    public n(Looper looper, g0.c c8, b b8) {
        this(new CopyOnWriteArraySet(), looper, c8, b8, true);
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, g0.c c8, b b8, boolean bl) {
        this.a = c8;
        this.d = copyOnWriteArraySet;
        this.c = b8;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = c8.e(looper, new l(this));
        this.i = bl;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int n8, a a8) {
        n.h(copyOnWriteArraySet, n8, a8);
    }

    public static /* synthetic */ boolean b(n n8, Message message) {
        return n8.g(message);
    }

    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int n8, a a8) {
        copyOnWriteArraySet = copyOnWriteArraySet.iterator();
        while (copyOnWriteArraySet.hasNext()) {
            ((c)copyOnWriteArraySet.next()).a(n8, a8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(Object object) {
        g0.a.e(object);
        Object object2 = this.g;
        synchronized (object2) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add((Object)new c(object));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public n d(Looper looper, g0.c c8, b b8) {
        return new n(this.d, looper, c8, b8, this.i);
    }

    public n e(Looper looper, b b8) {
        return this.d(looper, this.a, b8);
    }

    public void f() {
        this.l();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a(1)) {
            k k8 = this.b;
            k8.d(k8.k(1));
        }
        boolean bl = this.e.isEmpty();
        this.e.addAll((Collection)this.f);
        this.f.clear();
        if (bl ^ true) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((Runnable)this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public final boolean g(Message message) {
        message = this.d.iterator();
        while (message.hasNext()) {
            ((c)message.next()).b(this.c);
            if (!this.b.a(1)) continue;
        }
        return true;
    }

    public void i(int n8, a a8) {
        this.l();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet((Collection)this.d);
        this.f.add((Object)new m(copyOnWriteArraySet, n8, a8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j() {
        this.l();
        Object object = this.g;
        synchronized (object) {
            this.h = true;
        }
        object = this.d.iterator();
        do {
            if (!object.hasNext()) {
                this.d.clear();
                return;
            }
            ((c)object.next()).c(this.c);
        } while (true);
    }

    public void k(int n8, a a8) {
        this.i(n8, a8);
        this.f();
    }

    public final void l() {
        if (!this.i) {
            return;
        }
        boolean bl = Thread.currentThread() == this.b.i().getThread();
        g0.a.f(bl);
    }

    public static interface a {
        public void invoke(Object var1);
    }

    public static interface b {
        public void a(Object var1, p var2);
    }

    public static final class c {
        public final Object a;
        public p.b b;
        public boolean c;
        public boolean d;

        public c(Object object) {
            this.a = object;
            this.b = new p.b();
        }

        public void a(int n8, a a8) {
            if (!this.d) {
                if (n8 != -1) {
                    this.b.a(n8);
                }
                this.c = true;
                a8.invoke(this.a);
            }
        }

        public void b(b b8) {
            if (!this.d && this.c) {
                p p8 = this.b.e();
                this.b = new p.b();
                this.c = false;
                b8.a(this.a, p8);
            }
        }

        public void c(b b8) {
            this.d = true;
            if (this.c) {
                this.c = false;
                b8.a(this.a, this.b.e());
            }
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && c.class == object.getClass()) {
                return this.a.equals(((c)object).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

}

