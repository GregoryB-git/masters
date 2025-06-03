/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.PendingIntent$CanceledException
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package w2;

import L2.e;
import V2.j;
import V2.m;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w2.a;
import w2.i;
import w2.w;

public abstract class b
extends BroadcastReceiver {
    public final ExecutorService a;

    public b() {
        e.a();
        F2.a a8 = new F2.a("firebase-iid-executor");
        a8 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), (ThreadFactory)a8);
        a8.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService((ExecutorService)a8);
    }

    public Executor a() {
        return this.a;
    }

    public abstract int b(Context var1, a var2);

    public abstract void c(Context var1, Bundle var2);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void d(Intent intent, Context context, boolean bl, BroadcastReceiver.PendingResult pendingResult) {
        Throwable throwable2;
        block2 : {
            try {
                Parcelable parcelable = intent.getParcelableExtra("wrapped_intent");
                parcelable = parcelable instanceof Intent ? (Intent)parcelable : null;
                int n8 = parcelable != null ? this.f(context, (Intent)parcelable) : this.e(context, intent);
                if (!bl) break block2;
                pendingResult.setResultCode(n8);
            }
            catch (Throwable throwable2) {}
        }
        pendingResult.finish();
        return;
        pendingResult.finish();
        throw throwable2;
    }

    public final int e(Context context, Intent intent) {
        String string2;
        if (intent.getExtras() == null) {
            return 500;
        }
        Object object = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = m.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", (String)object);
            object = w.b(context).c(2, bundle);
        }
        int n8 = this.b(context, new a(intent));
        try {
            m.b((j)object, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return n8;
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        string2 = String.valueOf((Object)string2);
        intent = new StringBuilder(string2.length() + 20);
        intent.append("Message ack failed: ");
        intent.append(string2);
        Log.w((String)"CloudMessagingReceiver", (String)intent.toString());
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int f(Context context, Intent intent) {
        PendingIntent pendingIntent;
        block6 : {
            pendingIntent = (PendingIntent)intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                    break block6;
                }
                catch (PendingIntent.CanceledException canceledException) {}
                Log.e((String)"CloudMessagingReceiver", (String)"Notification pending intent canceled");
            }
        }
        if ((pendingIntent = intent.getExtras()) != null) {
            pendingIntent.remove("pending_intent");
        } else {
            pendingIntent = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals((Object)intent.getAction())) {
            this.c(context, (Bundle)pendingIntent);
            return -1;
        }
        Log.e((String)"CloudMessagingReceiver", (String)"Unknown notification action");
        return 500;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        boolean bl = this.isOrderedBroadcast();
        BroadcastReceiver.PendingResult pendingResult = this.goAsync();
        this.a().execute((Runnable)new i(this, intent, context, bl, pendingResult));
    }
}

