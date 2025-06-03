// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.BaseBundle;
import android.app.PendingIntent$CanceledException;
import android.app.PendingIntent;
import V2.j;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import V2.m;
import android.text.TextUtils;
import android.os.Parcelable;
import android.content.BroadcastReceiver$PendingResult;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import F2.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import L2.e;
import java.util.concurrent.ExecutorService;
import android.content.BroadcastReceiver;

public abstract class b extends BroadcastReceiver
{
    public final ExecutorService a;
    
    public b() {
        e.a();
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new a("firebase-iid-executor"));
        executor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(executor);
    }
    
    public Executor a() {
        return this.a;
    }
    
    public abstract int b(final Context p0, final w2.a p1);
    
    public abstract void c(final Context p0, final Bundle p1);
    
    public final int e(final Context obj, final Intent intent) {
        if (intent.getExtras() == null) {
            return 500;
        }
        final String stringExtra = intent.getStringExtra("google.message_id");
        j j;
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            j = m.e(null);
        }
        else {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("google.message_id", stringExtra);
            j = w.b((Context)obj).c(2, bundle);
        }
        final int b = this.b((Context)obj, new w2.a(intent));
        try {
            m.b(j, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return b;
        }
        catch (TimeoutException obj) {}
        catch (InterruptedException obj) {}
        catch (ExecutionException ex) {}
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(value.length() + 20);
        sb.append("Message ack failed: ");
        sb.append(value);
        Log.w("CloudMessagingReceiver", sb.toString());
        return b;
    }
    
    public final int f(final Context context, final Intent intent) {
        final PendingIntent pendingIntent = (PendingIntent)intent.getParcelableExtra("pending_intent");
    Label_0029:
        while (true) {
            if (pendingIntent == null) {
                break Label_0029;
            }
            while (true) {
                while (true) {
                    try {
                        pendingIntent.send();
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        }
                        else {
                            extras = new Bundle();
                        }
                        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
                            this.c(context, extras);
                            return -1;
                        }
                        Log.e("CloudMessagingReceiver", "Unknown notification action");
                        return 500;
                        Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
                        continue Label_0029;
                    }
                    catch (PendingIntent$CanceledException ex) {}
                    continue;
                }
            }
            break;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        this.a().execute(new i(this, intent, context, this.isOrderedBroadcast(), this.goAsync()));
    }
}
