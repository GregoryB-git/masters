package j8;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class y extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f8662b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8664d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8661a = "awaitEvenIfOnMainThread task continuation executor";

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8663c = 2;

    public y(ExecutorService executorService, TimeUnit timeUnit) {
        this.f8662b = executorService;
        this.f8664d = timeUnit;
    }

    @Override // j8.d
    public final void a() {
        try {
            String str = "Executing shutdown hook for " + this.f8661a;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            this.f8662b.shutdown();
            if (this.f8662b.awaitTermination(this.f8663c, this.f8664d)) {
                return;
            }
            String str2 = this.f8661a + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            this.f8662b.shutdownNow();
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f8661a);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", format, null);
            }
            this.f8662b.shutdownNow();
        }
    }
}
