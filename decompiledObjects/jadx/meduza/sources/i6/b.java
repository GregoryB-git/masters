package i6;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static SoftReference f7568a;

    /* renamed from: b, reason: collision with root package name */
    public static SoftReference f7569b;

    public abstract int a(Context context, a aVar);

    public void b(Bundle bundle) {
    }

    public final int c(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (b.class) {
            SoftReference softReference = f7568a;
            ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorService2 == null) {
                zze.zza();
                executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new w6.a("firebase-iid-executor")));
                f7568a = new SoftReference(executorService2);
            }
            executorService = executorService2;
        }
        executorService.execute(new Runnable() { // from class: i6.o
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor;
                int i10;
                b bVar = b.this;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z10 = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                bVar.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        i10 = bVar.c(context2, intent3);
                    } else if (intent2.getExtras() == null) {
                        i10 = 500;
                    } else {
                        a aVar = new a(intent2);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (b.class) {
                            SoftReference softReference2 = b.f7569b;
                            executor = softReference2 != null ? (Executor) softReference2.get() : null;
                            if (executor == null) {
                                zze.zza();
                                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w6.a("pscm-ack-executor"));
                                threadPoolExecutor.allowCoreThreadTimeOut(true);
                                executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                b.f7569b = new SoftReference(executor);
                            }
                        }
                        executor.execute(new n(context2, aVar, countDownLatch));
                        int a10 = bVar.a(context2, aVar);
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e10) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                        }
                        i10 = a10;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i10);
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            }
        });
    }
}
