/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package u6;

import V5.t;
import X5.d;
import X5.g;
import Z5.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.A;
import p6.D;
import p6.L0;
import p6.M;
import p6.U;
import p6.a0;
import p6.l;
import p6.m;
import u.b;
import u6.F;
import u6.J;
import u6.k;

public final class j
extends U
implements e,
d {
    public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, (String)"_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final p6.F r;
    public final d s;
    public Object t;
    public final Object u;

    public j(p6.F f8, d d8) {
        super(-1);
        this.r = f8;
        this.s = d8;
        this.t = k.a();
        this.u = J.b(this.getContext());
    }

    @Override
    public void b(Object object, Throwable throwable) {
        if (object instanceof A) {
            ((A)object).b.invoke((Object)throwable);
        }
    }

    @Override
    public d c() {
        return this;
    }

    @Override
    public e getCallerFrame() {
        d d8 = this.s;
        if (d8 instanceof e) {
            return (e)((Object)d8);
        }
        return null;
    }

    @Override
    public g getContext() {
        return this.s.getContext();
    }

    @Override
    public Object i() {
        Object object = this.t;
        this.t = k.a();
        return object;
    }

    public final void k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
        while (atomicReferenceFieldUpdater.get((Object)this) == k.b) {
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final m l() {
        var2_1 = j.v;
        do lbl-1000: // 3 sources:
        {
            if ((var1_2 = var2_1.get((Object)this)) == null) {
                j.v.set((Object)this, (Object)k.b);
                return null;
            }
            if (!(var1_2 instanceof m)) continue;
            if (!b.a(j.v, this, var1_2, k.b)) ** GOTO lbl-1000
            return (m)var1_2;
        } while (var1_2 == k.b || var1_2 instanceof Throwable);
        var2_1 = new StringBuilder();
        var2_1.append("Inconsistent state ");
        var2_1.append(var1_2);
        throw new IllegalStateException(var2_1.toString().toString());
    }

    public final m m() {
        Object object = v.get((Object)this);
        if (object instanceof m) {
            return (m)object;
        }
        return null;
    }

    public final boolean n() {
        if (v.get((Object)this) != null) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean q(Throwable var1_1) {
        var2_2 = j.v;
        do lbl-1000: // 3 sources:
        {
            block1 : {
                if (!Intrinsics.a(var3_3 = var2_2.get((Object)this), var4_4 = k.b)) break block1;
                if (!b.a(j.v, this, var4_4, (Object)var1_1)) ** GOTO lbl-1000
                return true;
            }
            if (!(var3_3 instanceof Throwable)) continue;
            return true;
        } while (!b.a(j.v, this, var3_3, null));
        return false;
    }

    public final void r() {
        this.k();
        m m8 = this.m();
        if (m8 != null) {
            m8.r();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void resumeWith(Object object) {
        Throwable throwable222;
        boolean bl;
        g g8 = this.s.getContext();
        Object object2 = D.d(object, null, 1, null);
        if (this.r.F(g8)) {
            this.t = object2;
            this.q = 0;
            this.r.E(g8, this);
            return;
        }
        g8 = L0.a.b();
        if (g8.O()) {
            this.t = object2;
            this.q = 0;
            g8.K(this);
            return;
        }
        g8.M(true);
        object2 = this.getContext();
        Object object3 = J.c((g)object2, this.u);
        this.s.resumeWith(object);
        object = t.a;
        J.a((g)object2, object3);
        while (bl = g8.R()) {
        }
        return;
        {
            catch (Throwable throwable222) {}
        }
        catch (Throwable throwable3) {
            J.a((g)object2, object3);
            throw throwable3;
        }
        try {
            this.h(throwable222, null);
            return;
        }
        finally {
            g8.H(true);
        }
    }

    public final Throwable s(l l8) {
        Object object;
        F f8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
        while ((object = atomicReferenceFieldUpdater.get((Object)this)) == (f8 = k.b)) {
            if (!b.a(v, this, f8, l8)) continue;
            return null;
        }
        if (object instanceof Throwable) {
            if (b.a(v, this, object, null)) {
                return (Throwable)object;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        l8 = new StringBuilder();
        l8.append("Inconsistent state ");
        l8.append(object);
        throw new IllegalStateException(l8.toString().toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DispatchedContinuation[");
        stringBuilder.append((Object)this.r);
        stringBuilder.append(", ");
        stringBuilder.append(M.c(this.s));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

