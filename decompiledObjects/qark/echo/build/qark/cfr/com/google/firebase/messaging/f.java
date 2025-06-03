/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.KeyguardManager
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Process
 *  android.os.SystemClock
 *  android.util.Log
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package com.google.firebase.messaging;

import E2.l;
import V2.j;
import V2.m;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.H;
import com.google.firebase.messaging.L;
import com.google.firebase.messaging.d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w.h;

public class f {
    public final ExecutorService a;
    public final Context b;
    public final L c;

    public f(Context context, L l8, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = l8;
    }

    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (this.b()) {
            return false;
        }
        H h8 = this.d();
        d.a a8 = d.e(this.b, this.c);
        this.e(a8.a, h8);
        this.c(a8);
        return true;
    }

    public final boolean b() {
        boolean bl;
        block5 : {
            bl = ((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            boolean bl2 = false;
            if (bl) {
                return false;
            }
            if (!l.f()) {
                SystemClock.sleep((long)10L);
            }
            int n8 = Process.myPid();
            List list = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
            bl = bl2;
            if (list != null) {
                list = list.iterator();
                do {
                    bl = bl2;
                    if (!list.hasNext()) break block5;
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)list.next();
                } while (runningAppProcessInfo.pid != n8);
                bl = bl2;
                if (runningAppProcessInfo.importance == 100) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final void c(d.a a8) {
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)"Showing notification");
        }
        ((NotificationManager)this.b.getSystemService("notification")).notify(a8.b, a8.c, a8.a.c());
    }

    public final H d() {
        H h8 = H.e(this.c.p("gcm.n.image"));
        if (h8 != null) {
            h8.k(this.a);
        }
        return h8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e(h.e e8, H h8) {
        if (h8 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap)m.b(h8.h(), 5L, TimeUnit.SECONDS);
            e8.p(bitmap);
            e8.y(new h.b().i(bitmap).h(null));
            return;
        }
        catch (ExecutionException executionException) {}
        h8 = new StringBuilder();
        h8.append("Failed to download image: ");
        h8.append((Object)executionException.getCause());
        Log.w((String)"FirebaseMessaging", (String)h8.toString());
        return;
        catch (InterruptedException interruptedException) {}
        Log.w((String)"FirebaseMessaging", (String)"Interrupted while downloading image, showing notification without it");
        h8.close();
        Thread.currentThread().interrupt();
        return;
        catch (TimeoutException timeoutException) {}
        Log.w((String)"FirebaseMessaging", (String)"Failed to download image in time, showing notification without it");
        h8.close();
    }
}

