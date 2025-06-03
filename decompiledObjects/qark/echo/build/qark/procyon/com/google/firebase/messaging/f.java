// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import V2.m;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import w.h;
import android.app.NotificationManager;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.os.SystemClock;
import E2.l;
import android.app.KeyguardManager;
import android.content.Context;
import java.util.concurrent.ExecutorService;

public class f
{
    public final ExecutorService a;
    public final Context b;
    public final L c;
    
    public f(final Context b, final L c, final ExecutorService a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (this.b()) {
            return false;
        }
        final H d = this.d();
        final d.a e = com.google.firebase.messaging.d.e(this.b, this.c);
        this.e(e.a, d);
        this.c(e);
        return true;
    }
    
    public final boolean b() {
        final boolean inKeyguardRestrictedInputMode = ((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        final boolean b = false;
        if (inKeyguardRestrictedInputMode) {
            return false;
        }
        if (!l.f()) {
            SystemClock.sleep(10L);
        }
        final int myPid = Process.myPid();
        final List runningAppProcesses = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
        boolean b2 = b;
        if (runningAppProcesses != null) {
            final Iterator<ActivityManager$RunningAppProcessInfo> iterator = runningAppProcesses.iterator();
            ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo;
            do {
                b2 = b;
                if (!iterator.hasNext()) {
                    return b2;
                }
                activityManager$RunningAppProcessInfo = iterator.next();
            } while (activityManager$RunningAppProcessInfo.pid != myPid);
            b2 = b;
            if (activityManager$RunningAppProcessInfo.importance == 100) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void c(final d.a a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager)this.b.getSystemService("notification")).notify(a.b, a.c, a.a.c());
    }
    
    public final H d() {
        final H e = H.e(this.c.p("gcm.n.image"));
        if (e != null) {
            e.k(this.a);
        }
        return e;
    }
    
    public final void e(final h.e e, final H h) {
        if (h == null) {
            return;
        }
        try {
            final Bitmap bitmap = (Bitmap)m.b(h.h(), 5L, TimeUnit.SECONDS);
            e.p(bitmap);
            e.y(new h.b().i(bitmap).h(null));
            return;
        }
        catch (ExecutionException ex) {
            goto Label_0085;
        }
        catch (InterruptedException ex2) {}
        catch (TimeoutException ex3) {}
        goto Label_0053;
    }
}
