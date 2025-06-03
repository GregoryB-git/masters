package O1;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public Object f3713a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownLatch f3714b;

    public B(final Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f3714b = new CountDownLatch(1);
        C2146B.t().execute(new FutureTask(new Callable() { // from class: O1.A
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void b7;
                b7 = B.b(B.this, callable);
                return b7;
            }
        }));
    }

    public static final Void b(B this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.f3713a = callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f3714b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
