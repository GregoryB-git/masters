package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.AbstractC1114d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w.h;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1116f {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11752a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11753b;

    /* renamed from: c, reason: collision with root package name */
    public final L f11754c;

    public C1116f(Context context, L l7, ExecutorService executorService) {
        this.f11752a = executorService;
        this.f11753b = context;
        this.f11754c = l7;
    }

    public boolean a() {
        if (this.f11754c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        H d7 = d();
        AbstractC1114d.a e7 = AbstractC1114d.e(this.f11753b, this.f11754c);
        e(e7.f11740a, d7);
        c(e7);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f11753b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!E2.l.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f11753b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    public final void c(AbstractC1114d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f11753b.getSystemService("notification")).notify(aVar.f11741b, aVar.f11742c, aVar.f11740a.c());
    }

    public final H d() {
        H e7 = H.e(this.f11754c.p("gcm.n.image"));
        if (e7 != null) {
            e7.k(this.f11752a);
        }
        return e7;
    }

    public final void e(h.e eVar, H h7) {
        if (h7 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) V2.m.b(h7.h(), 5L, TimeUnit.SECONDS);
            eVar.p(bitmap);
            eVar.y(new h.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            h7.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            h7.close();
        }
    }
}
