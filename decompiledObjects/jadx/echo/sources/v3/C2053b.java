package v3;

import com.google.android.gms.internal.measurement.AbstractC0991p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053b extends ThreadPoolExecutor {
    public C2053b(FirebaseAnalytics firebaseAnalytics, int i7, int i8, long j7, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(AbstractC0991p0.a().b(runnable));
    }
}
