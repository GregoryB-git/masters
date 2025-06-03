/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.o;
import p6.M;
import u6.b;
import u6.p;
import u6.y;
import u6.z;

public class q {
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, (String)"_next");
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, (String)"_prev");
    public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, (String)"_removedRef");
    private volatile Object _next;
    private volatile Object _prev;
    private volatile Object _removedRef;

    public q() {
        this._next = this;
        this._prev = this;
    }

    public final boolean j(q q8) {
        p.lazySet((Object)q8, (Object)this);
        o.lazySet((Object)q8, (Object)this);
        do {
            if (this.n() == this) continue;
            return false;
        } while (!u.b.a(o, this, this, q8));
        q8.m(this);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final q k(y var1_1) {
        block0 : do {
            var4_4 = (q)q.p.get((Object)this);
            var2_2 = var4_4;
            block1 : do {
                var3_3 = null;
                do {
                    if ((var6_6 = (var5_5 = q.o).get(var2_2)) == this) {
                        if (var4_4 == var2_2) {
                            return var2_2;
                        }
                        if (u.b.a(q.p, this, var4_4, var2_2) != false) return var2_2;
                        continue block0;
                    }
                    if (this.q()) {
                        return null;
                    }
                    if (var6_6 == var1_1) {
                        return var2_2;
                    }
                    if (var6_6 instanceof y) {
                        ((y)var6_6).a(var2_2);
                        continue block0;
                    }
                    if (var6_6 instanceof z) {
                        if (var3_3 != null) {
                            if (u.b.a((AtomicReferenceFieldUpdater)var5_5, var3_3, var2_2, ((z)var6_6).a)) ** break;
                            continue block0;
                            var2_2 = var3_3;
                            continue block1;
                        }
                        var2_2 = (q)q.p.get(var2_2);
                        continue;
                    }
                    Intrinsics.c(var6_6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    var5_5 = (q)var6_6;
                    var3_3 = var2_2;
                    var2_2 = var5_5;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }

    public final q l(q q8) {
        while (q8.q()) {
            q8 = (q)p.get((Object)q8);
        }
        return q8;
    }

    public final void m(q q8) {
        q q9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
        do {
            q9 = (q)atomicReferenceFieldUpdater.get((Object)q8);
            if (this.n() == q8) continue;
            return;
        } while (!u.b.a(p, q8, q9, this));
        if (this.q()) {
            q8.k(null);
        }
    }

    public final Object n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        Object object;
        while ((object = atomicReferenceFieldUpdater.get((Object)this)) instanceof y) {
            ((y)object).a(this);
        }
        return object;
    }

    public final q o() {
        return p.b(this.n());
    }

    public final q p() {
        q q8;
        q q9 = q8 = this.k(null);
        if (q8 == null) {
            q9 = this.l((q)p.get((Object)this));
        }
        return q9;
    }

    public boolean q() {
        return this.n() instanceof z;
    }

    public boolean r() {
        if (this.s() == null) {
            return true;
        }
        return false;
    }

    public final q s() {
        z z8;
        Object object;
        q q8;
        do {
            if ((object = this.n()) instanceof z) {
                return ((z)object).a;
            }
            if (object == this) {
                return (q)object;
            }
            Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        } while (!u.b.a(o, this, object, z8 = (q8 = (q)object).t()));
        q8.k(null);
        return null;
    }

    public final z t() {
        z z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        z z9 = z8 = (z)atomicReferenceFieldUpdater.get((Object)this);
        if (z8 == null) {
            z9 = new z(this);
            atomicReferenceFieldUpdater.lazySet((Object)this, (Object)z9);
        }
        return z9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)new o(this){

            @Override
            public Object get() {
                return M.a(this.receiver);
            }
        });
        stringBuilder.append('@');
        stringBuilder.append(M.b(this));
        return stringBuilder.toString();
    }

    public final int u(q q8, q q9, a a8) {
        p.lazySet((Object)q8, (Object)this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        atomicReferenceFieldUpdater.lazySet((Object)q8, (Object)q9);
        a8.c = q9;
        if (!u.b.a(atomicReferenceFieldUpdater, this, q9, a8)) {
            return 0;
        }
        if (a8.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public static abstract class a
    extends b {
        public final q b;
        public q c;

        public a(q q8) {
            this.b = q8;
        }

        public void e(q q8, Object object) {
            boolean bl = object == null;
            object = bl ? this.b : this.c;
            if (object != null && u.b.a(o, q8, this, object) && bl) {
                q8 = this.b;
                object = this.c;
                Intrinsics.b(object);
                q8.m((q)object);
            }
        }
    }

}

