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

import R3.a;
import R3.b;
import R3.c;
import V3.A;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.a;

public class d
implements A {
    public final r4.a a;
    public final AtomicReference b;

    public d(r4.a a8) {
        this.a = a8;
        this.b = new AtomicReference();
        a8.a(new a(this));
    }

    public static /* synthetic */ void c(d d8, r4.b b8) {
        d8.f(b8);
    }

    public static /* synthetic */ void d(ExecutorService executorService, A.b b8, r4.b b9) {
        d.e(executorService, b8, b9);
    }

    public static /* synthetic */ void e(ExecutorService executorService, A.b b8, r4.b b9) {
        android.support.v4.media.a.a(b9.get());
        new c(executorService, b8);
        throw null;
    }

    @Override
    public void a(boolean bl, A.a a8) {
        android.support.v4.media.a.a(this.b.get());
        a8.a(null);
    }

    @Override
    public void b(ExecutorService executorService, A.b b8) {
        this.a.a(new b(executorService, b8));
    }

    public final /* synthetic */ void f(r4.b b8) {
        AtomicReference atomicReference = this.b;
        android.support.v4.media.a.a(b8.get());
        atomicReference.set((Object)null);
    }
}

