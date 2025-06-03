package v7;

import com.google.android.gms.internal.measurement.zzdi;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends ThreadPoolExecutor {
    public b(TimeUnit timeUnit, ArrayBlockingQueue arrayBlockingQueue) {
        super(0, 1, 30L, timeUnit, arrayBlockingQueue);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(zzdi.zza().zza(runnable));
    }
}
