/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package p6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.L0;
import p6.N;
import p6.S;
import p6.a0;
import p6.c;
import p6.c0;
import p6.e0;
import u.b;
import u6.F;
import u6.L;
import u6.s;

public abstract class b0
extends c0
implements S {
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, (String)"_queue");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, (String)"_delayed");
    public static final AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(b0.class, (String)"_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    private final boolean Z() {
        if (v.get((Object)this) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void E(g g8, Runnable runnable) {
        this.X(runnable);
    }

    @Override
    public long L() {
        if (a0.super.L() == 0L) {
            return 0L;
        }
        Object object = t.get((Object)this);
        if (object != null) {
            if (object instanceof s) {
                if (!((s)object).g()) {
                    return 0L;
                }
            } else {
                if (object == e0.a()) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        object = (a)u.get((Object)this);
        return Long.MAX_VALUE;
    }

    @Override
    public long Q() {
        if (this.R()) {
            return 0L;
        }
        a a8 = (a)u.get((Object)this);
        a8 = this.W();
        if (a8 != null) {
            a8.run();
            return 0L;
        }
        return this.L();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void V() {
        var1_1 = b0.t;
        do lbl-1000: // 3 sources:
        {
            block3 : {
                if ((var2_2 = var1_1.get((Object)this)) != null) break block3;
                if (!b.a(b0.t, this, null, e0.a())) ** GOTO lbl-1000
                return;
            }
            if (var2_2 instanceof s) {
                ((s)var2_2).d();
                return;
            }
            if (var2_2 == e0.a()) {
                return;
            }
            var3_3 = new s(8, true);
            Intrinsics.c(var2_2, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            var3_3.a((Object)((Runnable)var2_2));
        } while (!b.a(b0.t, this, var2_2, var3_3));
    }

    public final Runnable W() {
        Object object;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        do {
            if ((object = atomicReferenceFieldUpdater.get((Object)this)) == null) {
                return null;
            }
            if (object instanceof s) {
                Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s s8 = (s)object;
                Object object2 = s8.j();
                if (object2 != s.h) {
                    return (Runnable)object2;
                }
                b.a(t, this, object, s8.i());
                continue;
            }
            if (object == e0.a()) {
                return null;
            }
            if (b.a(t, this, object, null)) break;
        } while (true);
        Intrinsics.c(object, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        return (Runnable)object;
    }

    public void X(Runnable runnable) {
        if (this.Y(runnable)) {
            this.U();
            return;
        }
        N.w.X(runnable);
    }

    public final boolean Y(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        do {
            s s8;
            Object object = atomicReferenceFieldUpdater.get((Object)this);
            if (this.Z()) {
                return false;
            }
            if (object == null) {
                if (!b.a(t, this, null, (Object)runnable)) continue;
                return true;
            }
            if (object instanceof s) {
                Intrinsics.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s8 = (s)object;
                int n8 = s8.a((Object)runnable);
                if (n8 != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) continue;
                        return false;
                    }
                    b.a(t, this, object, s8.i());
                    continue;
                }
                return true;
            }
            if (object == e0.a()) {
                return false;
            }
            s8 = new s(8, true);
            Intrinsics.c(object, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            s8.a((Object)((Runnable)object));
            s8.a((Object)runnable);
            if (b.a(t, this, object, s8)) break;
        } while (true);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a0() {
        if (!this.P()) {
            return false;
        }
        Object object = (a)u.get((Object)this);
        object = t.get((Object)this);
        if (object == null) {
            return true;
        }
        if (object instanceof s) {
            return ((s)object).g();
        }
        if (object != e0.a()) return false;
        return true;
    }

    public final void b0() {
        c.a();
        System.nanoTime();
        a a8 = (a)u.get((Object)this);
    }

    public final void c0() {
        t.set((Object)this, (Object)null);
        u.set((Object)this, (Object)null);
    }

    public final void d0(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void shutdown() {
        L0.a.c();
        this.d0(true);
        this.V();
        while (this.Q() <= 0L) {
        }
        this.b0();
    }

    public static final abstract class a
    extends L {
    }

}

