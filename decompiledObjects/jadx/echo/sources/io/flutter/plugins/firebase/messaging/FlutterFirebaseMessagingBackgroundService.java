package io.flutter.plugins.firebase.messaging;

import O5.C0464e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import v5.C2071j;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingBackgroundService extends a {

    /* renamed from: x, reason: collision with root package name */
    public static final List f15115x = Collections.synchronizedList(new LinkedList());

    /* renamed from: y, reason: collision with root package name */
    public static C0464e f15116y;

    public static void k(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        a.d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, ((T) extras.get("notification")).S() == 1);
    }

    public static /* synthetic */ void l(Intent intent, CountDownLatch countDownLatch) {
        f15116y.d(intent, countDownLatch);
    }

    public static void m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List list = f15115x;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f15116y.d((Intent) it.next(), null);
                }
                f15115x.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(long j7) {
        C0464e.m(j7);
    }

    public static void o(long j7) {
        C0464e.n(j7);
    }

    public static void p(long j7, C2071j c2071j) {
        if (f15116y != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        C0464e c0464e = new C0464e();
        f15116y = c0464e;
        c0464e.p(j7, c2071j);
    }

    @Override // io.flutter.plugins.firebase.messaging.a
    public void g(final Intent intent) {
        if (!f15116y.h()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List list = f15115x;
        synchronized (list) {
            try {
                if (f15116y.i()) {
                    Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                    list.add(intent);
                    return;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(getMainLooper()).post(new Runnable() { // from class: O5.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterFirebaseMessagingBackgroundService.l(intent, countDownLatch);
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e7) {
                    Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.a
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f15116y == null) {
            f15116y = new C0464e();
        }
        f15116y.o();
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, i7, i8);
    }
}
