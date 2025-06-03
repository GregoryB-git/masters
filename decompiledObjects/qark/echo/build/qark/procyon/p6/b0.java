// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import u6.L;
import kotlin.jvm.internal.Intrinsics;
import u.b;
import u6.F;
import u6.s;
import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b0 extends c0 implements S
{
    public static final AtomicReferenceFieldUpdater t;
    public static final AtomicReferenceFieldUpdater u;
    public static final AtomicIntegerFieldUpdater v;
    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;
    
    static {
        t = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_queue");
        u = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_delayed");
        v = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_isCompleted");
    }
    
    public b0() {
        this._isCompleted = 0;
    }
    
    private final boolean Z() {
        return b0.v.get(this) != 0;
    }
    
    @Override
    public final void E(final g g, final Runnable runnable) {
        this.X(runnable);
    }
    
    @Override
    public long L() {
        if (super.L() == 0L) {
            return 0L;
        }
        final u6.F value = b0.t.get(this);
        if (value != null) {
            if (value instanceof s) {
                if (!((s)value).g()) {
                    return 0L;
                }
            }
            else {
                if (value == e0.a()) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        final a a = b0.u.get(this);
        return Long.MAX_VALUE;
    }
    
    @Override
    public long Q() {
        if (this.R()) {
            return 0L;
        }
        final a a = b0.u.get(this);
        final Runnable w = this.W();
        if (w != null) {
            w.run();
            return 0L;
        }
        return this.L();
    }
    
    public final void V() {
        final AtomicReferenceFieldUpdater t = b0.t;
        while (true) {
            final s value = t.get(this);
            if (value == null) {
                if (b.a(b0.t, this, null, e0.a())) {
                    return;
                }
                continue;
            }
            else {
                if (value instanceof s) {
                    value.d();
                    return;
                }
                if (value == e0.a()) {
                    return;
                }
                final s s = new s(8, true);
                Intrinsics.c(value, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                s.a(value);
                if (b.a(b0.t, this, value, s)) {
                    return;
                }
                continue;
            }
        }
    }
    
    public final Runnable W() {
        final AtomicReferenceFieldUpdater t = b0.t;
        while (true) {
            final s value = t.get(this);
            if (value == null) {
                return null;
            }
            if (value instanceof s) {
                Intrinsics.c(value, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                final s s = value;
                final Object j = s.j();
                if (j != u6.s.h) {
                    return (Runnable)j;
                }
                b.a(b0.t, this, value, s.i());
            }
            else {
                if (value == e0.a()) {
                    return null;
                }
                if (b.a(b0.t, this, value, null)) {
                    Intrinsics.c(value, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable)value;
                }
                continue;
            }
        }
    }
    
    public void X(final Runnable runnable) {
        if (this.Y(runnable)) {
            this.U();
            return;
        }
        N.w.X(runnable);
    }
    
    public final boolean Y(final Runnable runnable) {
        final AtomicReferenceFieldUpdater t = b0.t;
        while (true) {
            final s value = t.get(this);
            if (this.Z()) {
                return false;
            }
            if (value == null) {
                if (b.a(b0.t, this, null, runnable)) {
                    return true;
                }
                continue;
            }
            else if (value instanceof s) {
                Intrinsics.c(value, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                final s s = value;
                final int a = s.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    if (a != 2) {
                        continue;
                    }
                    return false;
                }
                else {
                    b.a(b0.t, this, value, s.i());
                }
            }
            else {
                if (value == e0.a()) {
                    return false;
                }
                final s s2 = new s(8, true);
                Intrinsics.c(value, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                s2.a(value);
                s2.a(runnable);
                if (b.a(b0.t, this, value, s2)) {
                    return true;
                }
                continue;
            }
        }
    }
    
    public boolean a0() {
        if (!this.P()) {
            return false;
        }
        final a a = b0.u.get(this);
        final u6.F value = b0.t.get(this);
        if (value != null) {
            if (value instanceof s) {
                return ((s)value).g();
            }
            if (value != e0.a()) {
                return false;
            }
        }
        return true;
    }
    
    public final void b0() {
        c.a();
        System.nanoTime();
        final a a = b0.u.get(this);
    }
    
    public final void c0() {
        b0.t.set(this, null);
        b0.u.set(this, null);
    }
    
    public final void d0(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public void shutdown() {
        L0.a.c();
        this.d0(true);
        this.V();
        while (this.Q() <= 0L) {}
        this.b0();
    }
    
    public abstract static final class a extends L
    {
    }
}
