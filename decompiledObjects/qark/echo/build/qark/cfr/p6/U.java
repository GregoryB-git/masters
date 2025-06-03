/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package p6;

import V5.a;
import V5.n;
import V5.o;
import V5.t;
import X5.d;
import X5.g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p6.E;
import p6.H;
import p6.L;
import p6.V;
import p6.q0;
import p6.z;
import u6.F;
import u6.J;
import u6.j;
import w6.h;
import w6.i;

public abstract class U
extends h {
    public int q;

    public U(int n8) {
        this.q = n8;
    }

    public abstract void b(Object var1, Throwable var2);

    public abstract d c();

    public Throwable e(Object object) {
        boolean bl = object instanceof z;
        Throwable throwable = null;
        object = bl ? (z)object : null;
        if (object != null) {
            throwable = object.a;
        }
        return throwable;
    }

    public Object f(Object object) {
        return object;
    }

    public final void h(Throwable object, Throwable throwable) {
        if (object == null && throwable == null) {
            return;
        }
        if (object != null && throwable != null) {
            a.a((Throwable)object, throwable);
        }
        Throwable throwable2 = object;
        if (object == null) {
            throwable2 = throwable;
        }
        object = new StringBuilder();
        object.append("Fatal exception in coroutines machinery for ");
        object.append((Object)this);
        object.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        object = object.toString();
        Intrinsics.b((Object)throwable2);
        object = new L((String)object, throwable2);
        H.a(this.c().getContext(), (Throwable)object);
    }

    public abstract Object i();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        block17 : {
            block16 : {
                block15 : {
                    var3_1 = this.p;
                    try {
                        var1_2 = this.c();
                        Intrinsics.c(var1_2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
                        var1_2 = (j)var1_2;
                        var5_6 = var1_2.s;
                        var1_2 = var1_2.u;
                        var4_7 = var5_6.getContext();
                        var6_8 = J.c(var4_7, var1_2);
                        var2_9 = var6_8 != J.a ? E.g(var5_6, var4_7, var6_8) : null;
                    }
                    catch (Throwable var2_10) {}
                    var1_2 = var5_6.getContext();
                    var7_11 = this.i();
                    var8_12 = this.e(var7_11);
                    var1_2 = var8_12 == null && V.b(this.q) != false ? (q0)var1_2.b(q0.n) : null;
                    if (var1_2 != null && !var1_2.a()) {
                        var1_2 = var1_2.s();
                        this.b(var7_11, (Throwable)var1_2);
                        var7_11 = n.o;
                        var1_2 = n.a(o.a((Throwable)var1_2));
                    } else if (var8_12 != null) {
                        var1_2 = n.o;
                        var1_2 = n.a(o.a(var8_12));
                    } else {
                        var1_2 = n.o;
                        var1_2 = n.a(this.f(var7_11));
                    }
                    var5_6.resumeWith(var1_2);
                    var1_2 = t.a;
                    if (var2_9 == null) ** GOTO lbl34
                    if (!var2_9.K0()) break block15;
lbl34: // 2 sources:
                    J.a(var4_7, var6_8);
                }
                try {
                    var3_1.a();
                    var1_2 = n.a(t.a);
                }
                catch (Throwable var1_3) {
                    var2_9 = n.o;
                    var1_2 = n.a(o.a(var1_3));
                }
                this.h(null, n.b(var1_2));
                return;
                catch (Throwable var1_4) {}
                if (var2_9 != null) {
                    if (var2_9.K0() == false) throw var1_4;
                    break block16;
                }
                break block16;
                break block17;
            }
            J.a(var4_7, var6_8);
            throw var1_4;
        }
        try {
            var1_2 = n.o;
            var3_1.a();
            var1_2 = n.a(t.a);
        }
        catch (Throwable var1_5) {
            var3_1 = n.o;
            var1_2 = n.a(o.a(var1_5));
        }
        this.h(var2_10, n.b(var1_2));
    }
}

