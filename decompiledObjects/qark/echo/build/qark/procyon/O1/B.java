// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public final class B
{
    public Object a;
    public CountDownLatch b;
    
    public B(final Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.b = new CountDownLatch(1);
        x1.B.t().execute(new FutureTask<Object>(new A(this, callable)));
    }
    
    public static final Void b(final B b, final Callable callable) {
        Intrinsics.checkNotNullParameter(b, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            b.a = callable.call();
            return null;
        }
        finally {
            final CountDownLatch b2 = b.b;
            if (b2 != null) {
                b2.countDown();
            }
        }
    }
}
