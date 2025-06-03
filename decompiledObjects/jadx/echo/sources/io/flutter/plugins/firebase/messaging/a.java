package io.flutter.plugins.firebase.messaging;

import O5.I;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a extends Service {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f15118v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final HashMap f15119w = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public b f15120o;

    /* renamed from: p, reason: collision with root package name */
    public i f15121p;

    /* renamed from: q, reason: collision with root package name */
    public AsyncTaskC0220a f15122q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15123r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15124s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15125t = false;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f15126u = new ArrayList();

    /* renamed from: io.flutter.plugins.firebase.messaging.a$a, reason: collision with other inner class name */
    public final class AsyncTaskC0220a extends AsyncTask {
        public AsyncTaskC0220a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                f a7 = a.this.a();
                if (a7 == null) {
                    return null;
                }
                a.this.g(a7.getIntent());
                a7.a();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            a.this.i();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            a.this.i();
        }
    }

    public interface b {
        f a();

        IBinder b();
    }

    public static final class c extends i {

        /* renamed from: d, reason: collision with root package name */
        public final Context f15128d;

        /* renamed from: e, reason: collision with root package name */
        public final PowerManager.WakeLock f15129e;

        /* renamed from: f, reason: collision with root package name */
        public final PowerManager.WakeLock f15130f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15131g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f15132h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f15128d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f15129e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f15130f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // io.flutter.plugins.firebase.messaging.a.i
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f15145a);
            if (this.f15128d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f15131g) {
                            this.f15131g = true;
                            if (!this.f15132h) {
                                this.f15129e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.a.i
        public void c() {
            synchronized (this) {
                try {
                    if (this.f15132h) {
                        if (this.f15131g) {
                            this.f15129e.acquire(60000L);
                        }
                        this.f15132h = false;
                        this.f15130f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.a.i
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f15132h) {
                        this.f15132h = true;
                        this.f15130f.acquire(600000L);
                        this.f15129e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.a.i
        public void e() {
            synchronized (this) {
                this.f15131g = false;
            }
        }
    }

    public final class d implements f {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f15133a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15134b;

        public d(Intent intent, int i7) {
            this.f15133a = intent;
            this.f15134b = i7;
        }

        @Override // io.flutter.plugins.firebase.messaging.a.f
        public void a() {
            a.this.stopSelf(this.f15134b);
        }

        @Override // io.flutter.plugins.firebase.messaging.a.f
        public Intent getIntent() {
            return this.f15133a;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public ComponentName f15136a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15137b;

        public e(ComponentName componentName, boolean z7) {
            this.f15136a = componentName;
            this.f15137b = z7;
        }
    }

    public interface f {
        void a();

        Intent getIntent();
    }

    public static final class g extends JobServiceEngine implements b {

        /* renamed from: a, reason: collision with root package name */
        public final a f15138a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f15139b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f15140c;

        /* renamed from: io.flutter.plugins.firebase.messaging.a$g$a, reason: collision with other inner class name */
        public final class C0221a implements f {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f15141a;

            public C0221a(JobWorkItem jobWorkItem) {
                this.f15141a = jobWorkItem;
            }

            @Override // io.flutter.plugins.firebase.messaging.a.f
            public void a() {
                String str;
                String str2;
                synchronized (g.this.f15139b) {
                    JobParameters jobParameters = g.this.f15140c;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.f15141a);
                        } catch (IllegalArgumentException e7) {
                            e = e7;
                            str = "JobServiceEngineImpl";
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        } catch (SecurityException e8) {
                            e = e8;
                            str = "JobServiceEngineImpl";
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        }
                    }
                }
            }

            @Override // io.flutter.plugins.firebase.messaging.a.f
            public Intent getIntent() {
                Intent intent;
                intent = this.f15141a.getIntent();
                return intent;
            }
        }

        public g(a aVar) {
            super(aVar);
            this.f15139b = new Object();
            this.f15138a = aVar;
        }

        @Override // io.flutter.plugins.firebase.messaging.a.b
        public f a() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f15139b) {
                JobParameters jobParameters = this.f15140c;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    intent = dequeueWork.getIntent();
                    intent.setExtrasClassLoader(this.f15138a.getClassLoader());
                    return new C0221a(dequeueWork);
                } catch (SecurityException e7) {
                    Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e7);
                    return null;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.a.b
        public IBinder b() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f15140c = jobParameters;
            this.f15138a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b7 = this.f15138a.b();
            synchronized (this.f15139b) {
                this.f15140c = null;
            }
            return b7;
        }
    }

    public static final class h extends i {

        /* renamed from: d, reason: collision with root package name */
        public final JobInfo f15143d;

        /* renamed from: e, reason: collision with root package name */
        public final JobScheduler f15144e;

        public h(Context context, ComponentName componentName, int i7) {
            super(componentName);
            b(i7);
            this.f15143d = new JobInfo.Builder(i7, this.f15145a).setOverrideDeadline(0L).build();
            this.f15144e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // io.flutter.plugins.firebase.messaging.a.i
        public void a(Intent intent) {
            this.f15144e.enqueue(this.f15143d, I.a(intent));
        }
    }

    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f15145a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15146b;

        /* renamed from: c, reason: collision with root package name */
        public int f15147c;

        public i(ComponentName componentName) {
            this.f15145a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i7) {
            if (!this.f15146b) {
                this.f15146b = true;
                this.f15147c = i7;
            } else {
                if (this.f15147c == i7) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i7 + " is different than previous " + this.f15147c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i7, Intent intent, boolean z7) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f15118v) {
            i f7 = f(context, componentName, true, i7, z7);
            f7.b(i7);
            try {
                f7.a(intent);
            } catch (IllegalStateException e7) {
                if (!z7) {
                    throw e7;
                }
                f(context, componentName, true, i7, false).a(intent);
            }
        }
    }

    public static void d(Context context, Class cls, int i7, Intent intent, boolean z7) {
        c(context, new ComponentName(context, (Class<?>) cls), i7, intent, z7);
    }

    public static i f(Context context, ComponentName componentName, boolean z7, int i7, boolean z8) {
        i cVar;
        e eVar = new e(componentName, z8);
        HashMap hashMap = f15119w;
        i iVar = (i) hashMap.get(eVar);
        if (iVar == null) {
            if (Build.VERSION.SDK_INT < 26 || z8) {
                cVar = new c(context, componentName);
            } else {
                if (!z7) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                cVar = new h(context, componentName, i7);
            }
            iVar = cVar;
            hashMap.put(eVar, iVar);
        }
        return iVar;
    }

    public f a() {
        f a7;
        b bVar = this.f15120o;
        if (bVar != null && (a7 = bVar.a()) != null) {
            return a7;
        }
        synchronized (this.f15126u) {
            try {
                if (this.f15126u.size() > 0) {
                    return (f) this.f15126u.remove(0);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        AsyncTaskC0220a asyncTaskC0220a = this.f15122q;
        if (asyncTaskC0220a != null) {
            asyncTaskC0220a.cancel(this.f15123r);
        }
        this.f15124s = true;
        return h();
    }

    public void e(boolean z7) {
        if (this.f15122q == null) {
            this.f15122q = new AsyncTaskC0220a();
            i iVar = this.f15121p;
            if (iVar != null && z7) {
                iVar.d();
            }
            this.f15122q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    public void i() {
        ArrayList arrayList = this.f15126u;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f15122q = null;
                    ArrayList arrayList2 = this.f15126u;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f15125t) {
                        this.f15121p.c();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f15120o;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15120o = new g(this);
            this.f15121p = null;
        }
        this.f15121p = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f15126u) {
            this.f15125t = true;
            this.f15121p.c();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        this.f15121p.e();
        synchronized (this.f15126u) {
            ArrayList arrayList = this.f15126u;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i8));
            e(true);
        }
        return 3;
    }
}
