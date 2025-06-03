/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.FutureTask
 */
package O1;

import O1.A;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

public final class B {
    public Object a;
    public CountDownLatch b;

    public B(Callable callable) {
        Intrinsics.checkNotNullParameter((Object)callable, "callable");
        this.b = new CountDownLatch(1);
        x1.B.t().execute((Runnable)new FutureTask((Callable)new A(this, callable)));
    }

    public static /* synthetic */ Void a(B b8, Callable callable) {
        return B.b(b8, callable);
    }

    public static final Void b(B b8, Callable callable) {
        Intrinsics.checkNotNullParameter(b8, "this$0");
        Intrinsics.checkNotNullParameter((Object)callable, "$callable");
        try {
            b8.a = callable.call();
            return null;
        }
        finally {
            b8 = b8.b;
            if (b8 != null) {
                b8.countDown();
            }
        }
    }
}

