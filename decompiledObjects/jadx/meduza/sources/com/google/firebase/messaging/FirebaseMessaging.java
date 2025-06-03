package com.google.firebase.messaging;

import aa.b0;
import aa.f0;
import aa.j0;
import aa.k;
import aa.m;
import aa.m0;
import aa.o;
import aa.r;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c9.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import h3.i;
import i6.c;
import i6.e;
import i6.y;
import i6.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m6.j;
import s9.a;
import t9.b;
import u7.f;
import x0.q0;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    public static com.google.firebase.messaging.a f3229m;

    /* renamed from: o, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3231o;

    /* renamed from: a, reason: collision with root package name */
    public final f f3232a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.a f3233b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3234c;

    /* renamed from: d, reason: collision with root package name */
    public final o f3235d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f3236e;
    public final a f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f3237g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f3238h;

    /* renamed from: i, reason: collision with root package name */
    public final Task<j0> f3239i;

    /* renamed from: j, reason: collision with root package name */
    public final r f3240j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3241k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f3228l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    public static b<i> f3230n = new d8.r(2);

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final d f3242a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3243b;

        /* renamed from: c, reason: collision with root package name */
        public m f3244c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f3245d;

        public a(d dVar) {
            this.f3242a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [aa.m] */
        public final synchronized void a() {
            if (this.f3243b) {
                return;
            }
            Boolean b10 = b();
            this.f3245d = b10;
            if (b10 == null) {
                ?? r02 = new c9.b() { // from class: aa.m
                    @Override // c9.b
                    public final void a(c9.a aVar) {
                        boolean booleanValue;
                        FirebaseMessaging.a aVar2 = FirebaseMessaging.a.this;
                        synchronized (aVar2) {
                            aVar2.a();
                            Boolean bool = aVar2.f3245d;
                            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f3232a.k();
                        }
                        if (booleanValue) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            com.google.firebase.messaging.a aVar3 = FirebaseMessaging.f3229m;
                            firebaseMessaging.m();
                        }
                    }
                };
                this.f3244c = r02;
                this.f3242a.a(r02);
            }
            this.f3243b = true;
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            f fVar = FirebaseMessaging.this.f3232a;
            fVar.a();
            Context context = fVar.f15084a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [aa.l] */
    public FirebaseMessaging(f fVar, s9.a aVar, b<ca.f> bVar, b<q9.f> bVar2, u9.d dVar, b<i> bVar3, d dVar2) {
        fVar.a();
        final r rVar = new r(fVar.f15084a);
        final o oVar = new o(fVar, rVar, bVar, bVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new w6.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new w6.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w6.a("Firebase-Messaging-File-Io"));
        this.f3241k = false;
        f3230n = bVar3;
        this.f3232a = fVar;
        this.f3233b = aVar;
        this.f = new a(dVar2);
        fVar.a();
        final Context context = fVar.f15084a;
        this.f3234c = context;
        k kVar = new k();
        this.f3240j = rVar;
        this.f3235d = oVar;
        this.f3236e = new b0(newSingleThreadExecutor);
        this.f3237g = scheduledThreadPoolExecutor;
        this.f3238h = threadPoolExecutor;
        fVar.a();
        Context context2 = fVar.f15084a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != 0) {
            aVar.c(new a.InterfaceC0223a() { // from class: aa.l
                @Override // s9.a.InterfaceC0223a
                public final void a(String str) {
                    FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                    com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f3229m;
                    firebaseMessaging.i(str);
                }
            });
        }
        scheduledThreadPoolExecutor.execute(new b.d(this, 20));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new w6.a("Firebase-Messaging-Topics-Io"));
        int i10 = j0.f315j;
        Task<j0> call = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: aa.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                h0 h0Var;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                r rVar2 = rVar;
                o oVar2 = oVar;
                synchronized (h0.class) {
                    WeakReference<h0> weakReference = h0.f301b;
                    h0Var = weakReference != null ? weakReference.get() : null;
                    if (h0Var == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        h0 h0Var2 = new h0(sharedPreferences, scheduledExecutorService);
                        synchronized (h0Var2) {
                            h0Var2.f302a = e0.a(sharedPreferences, scheduledExecutorService);
                        }
                        h0.f301b = new WeakReference<>(h0Var2);
                        h0Var = h0Var2;
                    }
                }
                return new j0(firebaseMessaging, rVar2, h0Var, oVar2, context3, scheduledExecutorService);
            }
        });
        this.f3239i = call;
        call.addOnSuccessListener(scheduledThreadPoolExecutor, new m0(this, 13));
        scheduledThreadPoolExecutor.execute(new b.m(this, 19));
    }

    public static void c(f0 f0Var, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f3231o == null) {
                f3231o = new ScheduledThreadPoolExecutor(1, new w6.a("TAG"));
            }
            f3231o.schedule(f0Var, j10, TimeUnit.SECONDS);
        }
    }

    public static synchronized FirebaseMessaging d() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(f.e());
        }
        return firebaseMessaging;
    }

    public static synchronized com.google.firebase.messaging.a e(Context context) {
        com.google.firebase.messaging.a aVar;
        synchronized (FirebaseMessaging.class) {
            if (f3229m == null) {
                f3229m = new com.google.firebase.messaging.a(context);
            }
            aVar = f3229m;
        }
        return aVar;
    }

    public static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.c(FirebaseMessaging.class);
            j.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Task task;
        s9.a aVar = this.f3233b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.d());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        a.C0055a g10 = g();
        if (!o(g10)) {
            return g10.f3249a;
        }
        String a10 = r.a(this.f3232a);
        b0 b0Var = this.f3236e;
        synchronized (b0Var) {
            task = (Task) b0Var.f270b.getOrDefault(a10, null);
            int i10 = 3;
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + a10);
                }
                o oVar = this.f3235d;
                task = oVar.a(oVar.c(r.a(oVar.f342a), "*", new Bundle())).onSuccessTask(this.f3238h, new r3.r(this, a10, g10, i10)).continueWithTask(b0Var.f269a, new k1.a(12, b0Var, a10));
                b0Var.f270b.put(a10, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + a10);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public final Task<Void> b() {
        if (this.f3233b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f3237g.execute(new x0.f(22, this, taskCompletionSource));
            return taskCompletionSource.getTask();
        }
        if (g() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new w6.a("Firebase-Messaging-Network-Io")).execute(new q0(17, this, taskCompletionSource2));
        return taskCompletionSource2.getTask();
    }

    public final String f() {
        f fVar = this.f3232a;
        fVar.a();
        return "[DEFAULT]".equals(fVar.f15085b) ? "" : this.f3232a.g();
    }

    public final a.C0055a g() {
        a.C0055a b10;
        com.google.firebase.messaging.a e10 = e(this.f3234c);
        String f = f();
        String a10 = r.a(this.f3232a);
        synchronized (e10) {
            b10 = a.C0055a.b(e10.f3247a.getString(com.google.firebase.messaging.a.a(f, a10), null));
        }
        return b10;
    }

    public final void h() {
        Task forException;
        int i10;
        c cVar = this.f3235d.f344c;
        if (cVar.f7576c.a() >= 241100000) {
            z a10 = z.a(cVar.f7575b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a10) {
                i10 = a10.f7625d;
                a10.f7625d = i10 + 1;
            }
            forException = a10.b(new y(i10, 5, bundle)).continueWith(i6.b0.f7570a, e.f7580a);
        } else {
            forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(this.f3237g, new defpackage.e(this, 10));
    }

    public final void i(String str) {
        f fVar = this.f3232a;
        fVar.a();
        if ("[DEFAULT]".equals(fVar.f15085b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder l10 = defpackage.f.l("Invoking onNewToken for app: ");
                f fVar2 = this.f3232a;
                fVar2.a();
                l10.append(fVar2.f15085b);
                Log.d("FirebaseMessaging", l10.toString());
            }
            Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
            intent.putExtra("token", str);
            new aa.j(this.f3234c).b(intent);
        }
    }

    @Deprecated
    public final void j(aa.z zVar) {
        if (TextUtils.isEmpty(zVar.f364a.getString("google.to"))) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f3234c, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(zVar.f364a);
        this.f3234c.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public final void k(boolean z10) {
        a aVar = this.f;
        synchronized (aVar) {
            aVar.a();
            m mVar = aVar.f3244c;
            if (mVar != null) {
                aVar.f3242a.c(mVar);
                aVar.f3244c = null;
            }
            f fVar = FirebaseMessaging.this.f3232a;
            fVar.a();
            SharedPreferences.Editor edit = fVar.f15084a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z10);
            edit.apply();
            if (z10) {
                FirebaseMessaging.this.m();
            }
            aVar.f3245d = Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f3234c
            aa.x.a(r0)
            android.content.Context r0 = r7.f3234c
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 1
            r4 = 0
            if (r1 < r2) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r4
        L12:
            r2 = 3
            java.lang.String r5 = "FirebaseMessaging"
            if (r1 != 0) goto L23
            boolean r0 = android.util.Log.isLoggable(r5, r2)
            if (r0 == 0) goto L6a
            java.lang.String r0 = "Platform doesn't support proxying."
            android.util.Log.d(r5, r0)
            goto L6a
        L23:
            int r1 = android.os.Binder.getCallingUid()
            android.content.pm.ApplicationInfo r6 = r0.getApplicationInfo()
            int r6 = r6.uid
            if (r1 != r6) goto L31
            r1 = r3
            goto L32
        L31:
            r1 = r4
        L32:
            if (r1 != 0) goto L49
            java.lang.String r1 = "error retrieving notification delegate for package "
            java.lang.StringBuilder r1 = defpackage.f.l(r1)
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r5, r0)
            goto L6a
        L49:
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r0 = aa.u.e(r0)
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
            boolean r0 = android.util.Log.isLoggable(r5, r2)
            if (r0 == 0) goto L68
            java.lang.String r0 = "GMS core is set for proxying"
            android.util.Log.d(r5, r0)
        L68:
            r0 = r3
            goto L6b
        L6a:
            r0 = r4
        L6b:
            if (r0 != 0) goto L6e
            return r4
        L6e:
            u7.f r0 = r7.f3232a
            java.lang.Class<w7.a> r1 = w7.a.class
            java.lang.Object r0 = r0.c(r1)
            if (r0 == 0) goto L79
            return r3
        L79:
            boolean r0 = aa.q.a()
            if (r0 == 0) goto L84
            t9.b<h3.i> r0 = com.google.firebase.messaging.FirebaseMessaging.f3230n
            if (r0 == 0) goto L84
            goto L85
        L84:
            r3 = r4
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.l():boolean");
    }

    public final void m() {
        s9.a aVar = this.f3233b;
        if (aVar != null) {
            aVar.a();
        } else if (o(g())) {
            synchronized (this) {
                if (!this.f3241k) {
                    n(0L);
                }
            }
        }
    }

    public final synchronized void n(long j10) {
        c(new f0(this, Math.min(Math.max(30L, 2 * j10), f3228l)), j10);
        this.f3241k = true;
    }

    public final boolean o(a.C0055a c0055a) {
        String str;
        if (c0055a != null) {
            r rVar = this.f3240j;
            synchronized (rVar) {
                if (rVar.f358b == null) {
                    rVar.d();
                }
                str = rVar.f358b;
            }
            if (!(System.currentTimeMillis() > c0055a.f3251c + a.C0055a.f3248d || !str.equals(c0055a.f3250b))) {
                return false;
            }
        }
        return true;
    }
}
