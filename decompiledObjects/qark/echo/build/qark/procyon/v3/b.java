// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v3;

import com.google.android.gms.internal.measurement.p0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.ThreadPoolExecutor;

public final class b extends ThreadPoolExecutor
{
    public b(final FirebaseAnalytics firebaseAnalytics, final int n, final int n2, final long n3, final TimeUnit unit, final BlockingQueue workQueue) {
        super(0, 1, 30L, unit, workQueue);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        super.execute(p0.a().b(runnable));
    }
}
