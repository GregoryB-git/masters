/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package p6;

import V5.n;
import V5.o;
import V5.t;
import X5.d;
import X5.g;
import kotlin.jvm.internal.Intrinsics;
import p6.E;
import p6.F;
import p6.L0;
import p6.U;
import p6.a0;
import u6.J;
import u6.j;

public abstract class V {
    public static final void a(U u8, int n8) {
        Object object = u8.c();
        boolean bl = n8 == 4;
        if (!bl && object instanceof j && V.b(n8) == V.b(u8.q)) {
            F f8 = ((j)object).r;
            if (f8.F((g)(object = object.getContext()))) {
                f8.E((g)object, u8);
                return;
            }
            V.e(u8);
            return;
        }
        V.d(u8, (d)object, bl);
    }

    public static final boolean b(int n8) {
        boolean bl = true;
        if (n8 != 1) {
            if (n8 == 2) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public static final boolean c(int n8) {
        if (n8 == 2) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(U object, d object2, boolean bl) {
        Object object3 = object.i();
        Object object4 = object.e(object3);
        if (object4 != null) {
            object = n.o;
            object = o.a((Throwable)object4);
        } else {
            object4 = n.o;
            object = object.f(object3);
        }
        object3 = n.a(object);
        if (bl) {
            Intrinsics.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            j j8 = (j)object2;
            object = j8.s;
            object4 = j8.u;
            object2 = object.getContext();
            object4 = J.c((g)object2, object4);
            object = object4 != J.a ? E.g((d)object, (g)object2, object4) : null;
            try {
                j8.s.resumeWith(object3);
                object3 = t.a;
            }
            catch (Throwable throwable) {
                if (object != null && !object.K0()) throw throwable;
                {
                    J.a((g)object2, object4);
                }
                throw throwable;
            }
            if (object != null && !object.K0()) return;
            {
                J.a((g)object2, object4);
                return;
            }
        }
        object2.resumeWith(object3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void e(U u8) {
        a0 a02 = L0.a.b();
        if (a02.O()) {
            a02.K(u8);
            return;
        }
        a02.M(true);
        try {
            boolean bl;
            V.d(u8, u8.c(), true);
            while (bl = a02.R()) {
            }
            do {
                return;
                break;
            } while (true);
        }
        catch (Throwable throwable) {
            try {
                u8.h(throwable, null);
                return;
            }
            finally {
                a02.H(true);
            }
        }
    }
}

