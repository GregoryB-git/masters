package com.google.firebase.iid;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.util.Log;
import b.a0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import m6.j;
import r9.e;
import r9.h;
import r9.i;
import u7.f;
import u9.d;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: j, reason: collision with root package name */
    public static a f3203j;

    /* renamed from: l, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3205l;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3206a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3207b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3208c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3209d;

    /* renamed from: e, reason: collision with root package name */
    public final i f3210e;
    public final d f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3211g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3212h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f3202i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3204k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId() {
        throw null;
    }

    public FirebaseInstanceId(f fVar, t9.b<ca.f> bVar, t9.b<q9.f> bVar2, d dVar) {
        fVar.a();
        h hVar = new h(fVar.f15084a);
        ThreadPoolExecutor x10 = a0.x();
        ThreadPoolExecutor x11 = a0.x();
        this.f3211g = false;
        this.f3212h = new ArrayList();
        if (h.a(fVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f3203j == null) {
                fVar.a();
                f3203j = new a(fVar.f15084a);
            }
        }
        this.f3207b = fVar;
        this.f3208c = hVar;
        this.f3209d = new e(fVar, hVar, bVar, bVar2, dVar);
        this.f3206a = x11;
        this.f3210e = new i(x10);
        this.f = dVar;
    }

    public static <T> T b(Task<T> task) {
        if (task == null) {
            throw new NullPointerException("Task must not be null");
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(new Executor() { // from class: r9.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new OnCompleteListener(countDownLatch) { // from class: r9.c

            /* renamed from: a, reason: collision with root package name */
            public final CountDownLatch f13815a;

            {
                this.f13815a = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                CountDownLatch countDownLatch2 = this.f13815a;
                com.google.firebase.iid.a aVar = FirebaseInstanceId.f3203j;
                countDownLatch2.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    public static void d(f fVar) {
        fVar.a();
        j.f("Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.", fVar.f15086c.f15101g);
        fVar.a();
        j.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.", fVar.f15086c.f15097b);
        fVar.a();
        j.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.", fVar.f15086c.f15096a);
        fVar.a();
        j.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar.f15086c.f15097b.contains(":"));
        fVar.a();
        j.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", f3204k.matcher(fVar.f15086c.f15096a).matches());
    }

    public static void e(b bVar, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f3205l == null) {
                f3205l = new ScheduledThreadPoolExecutor(1, new w6.a("FirebaseInstanceId"));
            }
            f3205l.schedule(bVar, j10, TimeUnit.SECONDS);
        }
    }

    public static FirebaseInstanceId getInstance(f fVar) {
        d(fVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) fVar.c(FirebaseInstanceId.class);
        j.j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public final <T> T a(Task<T> task) {
        try {
            return (T) Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e10);
            }
            if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                synchronized (this) {
                    a aVar = f3203j;
                    synchronized (aVar) {
                        aVar.f3215b.clear();
                        aVar.f3214a.edit().clear().commit();
                    }
                }
            }
            throw ((IOException) cause);
        }
    }

    public final String c() {
        String a10 = h.a(this.f3207b);
        d(this.f3207b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((r9.f) a(Tasks.forResult(null).continueWithTask(this.f3206a, new l3.j(this, a10, "*")))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public final String f() {
        try {
            a aVar = f3203j;
            String g10 = this.f3207b.g();
            synchronized (aVar) {
                aVar.f3215b.put(g10, Long.valueOf(aVar.c(g10)));
            }
            return (String) b(this.f.getId());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final String g() {
        f fVar = this.f3207b;
        fVar.a();
        return "[DEFAULT]".equals(fVar.f15085b) ? "" : this.f3207b.g();
    }

    @Deprecated
    public final String h() {
        a.C0054a b10;
        d(this.f3207b);
        String a10 = h.a(this.f3207b);
        a aVar = f3203j;
        String g10 = g();
        synchronized (aVar) {
            b10 = a.C0054a.b(aVar.f3214a.getString(a.b(g10, a10, "*"), null));
        }
        if (k(b10)) {
            synchronized (this) {
                if (!this.f3211g) {
                    j(0L);
                }
            }
        }
        if (b10 == null) {
            return null;
        }
        return b10.f3217a;
    }

    public final boolean i() {
        int i10;
        h hVar = this.f3208c;
        synchronized (hVar) {
            int i11 = hVar.f13827e;
            if (i11 == 0) {
                PackageManager packageManager = hVar.f13823a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!v6.e.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            hVar.f13827e = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    i10 = 2;
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        hVar.f13827e = 2;
                    }
                    Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    if (v6.e.a()) {
                        hVar.f13827e = 2;
                        i11 = 2;
                    } else {
                        hVar.f13827e = 1;
                        i11 = 1;
                    }
                }
            }
            i10 = i11;
        }
        return i10 != 0;
    }

    public final synchronized void j(long j10) {
        e(new b(this, Math.min(Math.max(30L, j10 + j10), f3202i)), j10);
        this.f3211g = true;
    }

    public final boolean k(a.C0054a c0054a) {
        String str;
        if (c0054a != null) {
            h hVar = this.f3208c;
            synchronized (hVar) {
                if (hVar.f13824b == null) {
                    hVar.c();
                }
                str = hVar.f13824b;
            }
            if (!(System.currentTimeMillis() > c0054a.f3219c + a.C0054a.f3216d || !str.equals(c0054a.f3218b))) {
                return false;
            }
        }
        return true;
    }
}
