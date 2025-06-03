/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.atomic.AtomicReference
 */
package R3;

import R3.c;
import R3.e;
import R3.f;
import V3.A;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.a;
import r4.b;

public class g
implements A {
    public final a a;
    public final AtomicReference b;

    public g(a a8) {
        this.a = a8;
        this.b = new AtomicReference();
        a8.a(new e(this));
    }

    public static /* synthetic */ void c(g g8, b b8) {
        g8.f(b8);
    }

    public static /* synthetic */ void d(ExecutorService executorService, A.b b8, b b9) {
        g.e(executorService, b8, b9);
    }

    private static /* synthetic */ void e(ExecutorService executorService, A.b b8, b b9) {
        android.support.v4.media.a.a(b9.get());
        new c(executorService, b8);
        throw null;
    }

    private /* synthetic */ void f(b b8) {
        AtomicReference atomicReference = this.b;
        android.support.v4.media.a.a(b8.get());
        atomicReference.set((Object)null);
    }

    @Override
    public void a(boolean bl, A.a a8) {
        android.support.v4.media.a.a(this.b.get());
        a8.a(null);
    }

    @Override
    public void b(ExecutorService executorService, A.b b8) {
        this.a.a(new f(executorService, b8));
    }
}

