/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicLongFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package y6;

import V5.t;
import g6.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import p6.P0;
import p6.l;
import r6.h;
import u.b;
import u6.C;
import u6.D;
import y6.e;
import y6.f;

public class d {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, (String)"head");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(d.class, (String)"deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, (String)"tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(d.class, (String)"enqIdx");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(d.class, (String)"_availablePermits");
    private volatile int _availablePermits;
    public final int a;
    public final g6.l b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public d(int n8, int n9) {
        this.a = n8;
        if (n8 > 0) {
            if (n9 >= 0 && n9 <= n8) {
                f f8 = new f(0L, null, 2);
                this.head = f8;
                this.tail = f8;
                this._availablePermits = n8 - n9;
                this.b = new g6.l(){

                    public final void a(Throwable throwable) {
                        this.i();
                    }
                };
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The number of acquired permits should be in 0..");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Semaphore should have at least 1 permit, but had ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public final void d(l l8) {
        do {
            if (this.g() > 0) {
                l8.j(t.a, this.b);
                return;
            }
            Intrinsics.c(l8, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        } while (!this.e((P0)((Object)l8)));
    }

    public final boolean e(P0 p02) {
        Object object;
        Object object2 = e;
        Object object3 = (f)object2.get((Object)this);
        long l8 = f.getAndIncrement((Object)this);
        Object object4 = .o;
        long l9 = l8 / (long)e.f();
        block0 : while (!D.c(object = u6.d.c((C)object3, l9, (p)object4))) {
            C c8 = D.b(object);
            do {
                C c9 = (C)object2.get((Object)this);
                if (c9.q >= c8.q) break block0;
                if (!c8.q()) continue block0;
                if (b.a((AtomicReferenceFieldUpdater)object2, this, c9, c8)) {
                    if (!c9.m()) break block0;
                    c9.k();
                    break block0;
                }
                if (!c8.m()) continue;
                c8.k();
            } while (true);
        }
        object2 = (f)D.b(object);
        int n8 = (int)(l8 % (long)e.f());
        if (h.a(object2.r(), n8, null, p02)) {
            p02.a((C)object2, n8);
            return true;
        }
        object3 = e.e();
        object4 = e.g();
        if (h.a(object2.r(), n8, object3, object4)) {
            if (p02 instanceof l) {
                Intrinsics.c(p02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((l)((Object)p02)).j(t.a, this.b);
                return true;
            }
            object2 = new StringBuilder();
            object2.append("unexpected: ");
            object2.append((Object)p02);
            throw new IllegalStateException(object2.toString().toString());
        }
        return false;
    }

    public final void f() {
        int n8;
        int n9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        while ((n8 = (atomicIntegerFieldUpdater = g).get((Object)this)) > (n9 = this.a) && !atomicIntegerFieldUpdater.compareAndSet((Object)this, n8, n9)) {
        }
    }

    public final int g() {
        int n8;
        while ((n8 = g.getAndDecrement((Object)this)) > this.a) {
        }
        return n8;
    }

    public int h() {
        return Math.max((int)g.get((Object)this), (int)0);
    }

    public void i() {
        int n8;
        while ((n8 = g.getAndIncrement((Object)this)) < this.a) {
            if (n8 >= 0) {
                return;
            }
            if (!this.l()) continue;
            return;
        }
        this.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The number of released permits cannot be greater than ");
        stringBuilder.append(this.a);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public boolean j() {
        do {
            int n8;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            if ((n8 = (atomicIntegerFieldUpdater = g).get((Object)this)) > this.a) {
                this.f();
                continue;
            }
            if (n8 <= 0) {
                return false;
            }
            if (atomicIntegerFieldUpdater.compareAndSet((Object)this, n8, n8 - 1)) break;
        } while (true);
        return true;
    }

    public final boolean k(Object object) {
        if (object instanceof l) {
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            object = (l)object;
            Object object2 = object.g(t.a, null, this.b);
            if (object2 != null) {
                object.p(object2);
                return true;
            }
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected: ");
        stringBuilder.append(object);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public final boolean l() {
        Object object;
        Object object2 = c;
        Object object3 = (f)object2.get((Object)this);
        long l8 = d.getAndIncrement((Object)this);
        long l9 = l8 / (long)e.f();
        Object object4 = .o;
        block0 : while (!D.c(object = u6.d.c((C)object3, l9, (p)object4))) {
            C c8 = D.b(object);
            do {
                C c9 = (C)object2.get((Object)this);
                if (c9.q >= c8.q) break block0;
                if (!c8.q()) continue block0;
                if (b.a((AtomicReferenceFieldUpdater)object2, this, c9, c8)) {
                    if (!c9.m()) break block0;
                    c9.k();
                    break block0;
                }
                if (!c8.m()) continue;
                c8.k();
            } while (true);
        }
        object2 = (f)D.b(object);
        object2.b();
        long l10 = object2.q;
        if (l10 > l9) {
            return false;
        }
        int n8 = (int)(l8 % (long)e.f());
        object3 = e.e();
        object3 = object2.r().getAndSet(n8, object3);
        if (object3 == null) {
            int n9 = e.d();
            for (int i8 = 0; i8 < n9; ++i8) {
                if (object2.r().get(n8) != e.g()) continue;
                return true;
            }
            object3 = e.e();
            object4 = e.b();
            return h.a(object2.r(), n8, object3, object4) ^ true;
        }
        if (object3 == e.c()) {
            return false;
        }
        return this.k(object3);
    }

}

