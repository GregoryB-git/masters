// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.messaging;

import O5.H;
import O5.I;
import android.app.job.JobInfo$Builder;
import android.app.job.JobScheduler;
import android.app.job.JobInfo;
import O5.G;
import O5.F;
import android.app.job.JobWorkItem;
import android.util.Log;
import O5.E;
import O5.D;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.os.IBinder;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.ComponentName;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import android.app.Service;

public abstract class a extends Service
{
    public static final Object v;
    public static final HashMap w;
    public b o;
    public i p;
    public a q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ArrayList u;
    
    static {
        v = new Object();
        w = new HashMap();
    }
    
    public a() {
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = new ArrayList();
    }
    
    public static void c(Context context, final ComponentName componentName, final int n, final Intent intent, final boolean b) {
        if (intent != null) {
            final Object v = a.v;
            // monitorenter(v)
            while (true) {
                i f;
                try {
                    f = f(context, componentName, true, n, b);
                    f.b(n);
                    final i i = f;
                    final Intent intent2 = intent;
                    i.a(intent2);
                    break Label_0061;
                }
                finally {
                    final Context context2;
                    context = context2;
                    // monitorexit(v)
                    throw;
                    f(context, componentName, true, n, false).a(intent);
                    // monitorexit(v)
                    return;
                }
                try {
                    final i i = f;
                    final Intent intent2 = intent;
                    i.a(intent2);
                    continue;
                }
                catch (IllegalStateException ex2) {}
                break;
            }
        }
        throw new IllegalArgumentException("work must not be null");
    }
    
    public static void d(final Context context, final Class clazz, final int n, final Intent intent, final boolean b) {
        c(context, new ComponentName(context, clazz), n, intent, b);
    }
    
    public static i f(final Context context, final ComponentName componentName, final boolean b, final int n, final boolean b2) {
        final e e = new e(componentName, b2);
        final HashMap w = a.w;
        i i;
        if ((i = w.get(e)) == null) {
            i value;
            if (Build$VERSION.SDK_INT >= 26 && !b2) {
                if (!b) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                value = new h(context, componentName, n);
            }
            else {
                value = new c(context, componentName);
            }
            w.put(e, value);
            i = value;
        }
        return i;
    }
    
    public f a() {
        final b o = this.o;
        if (o != null) {
            final f a = o.a();
            if (a != null) {
                return a;
            }
        }
        final ArrayList u = this.u;
        // monitorenter(u)
        while (true) {
            try {
                if (this.u.size() > 0) {
                    // monitorexit(u)
                    return this.u.remove(0);
                }
                // monitorexit(u)
                return null;
                // monitorexit(u)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean b() {
        final a q = this.q;
        if (q != null) {
            q.cancel(this.r);
        }
        this.s = true;
        return this.h();
    }
    
    public void e(final boolean b) {
        if (this.q == null) {
            this.q = new a();
            final i p = this.p;
            if (p != null && b) {
                p.d();
            }
            this.q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }
    
    public abstract void g(final Intent p0);
    
    public boolean h() {
        return true;
    }
    
    public void i() {
        final ArrayList u = this.u;
        if (u != null) {
            // monitorenter(u)
            while (true) {
                try {
                    this.q = null;
                    final ArrayList u2 = this.u;
                    if (u2 != null && u2.size() > 0) {
                        this.e(false);
                    }
                    else if (!this.t) {
                        this.p.c();
                    }
                    // monitorexit(u)
                    return;
                }
                // monitorexit(u)
                finally {}
                continue;
            }
        }
    }
    
    public IBinder onBind(final Intent intent) {
        final b o = this.o;
        if (o != null) {
            return o.b();
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 26) {
            this.o = (b)new g(this);
            this.p = null;
        }
        this.p = f((Context)this, new ComponentName((Context)this, (Class)this.getClass()), false, 0, true);
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.b();
        synchronized (this.u) {
            this.t = true;
            this.p.c();
        }
    }
    
    public int onStartCommand(Intent intent, final int n, final int n2) {
        this.p.e();
        synchronized (this.u) {
            final ArrayList u = this.u;
            if (intent == null) {
                intent = new Intent();
            }
            u.add(new d(intent, n2));
            this.e(true);
            return 3;
        }
    }
    
    public final class a extends AsyncTask
    {
        public Void a(final Void... array) {
            while (true) {
                final f a = io.flutter.plugins.firebase.messaging.a.this.a();
                if (a == null) {
                    break;
                }
                io.flutter.plugins.firebase.messaging.a.this.g(a.getIntent());
                a.a();
            }
            return null;
        }
        
        public void b(final Void void1) {
            io.flutter.plugins.firebase.messaging.a.this.i();
        }
        
        public void c(final Void void1) {
            io.flutter.plugins.firebase.messaging.a.this.i();
        }
    }
    
    public interface b
    {
        f a();
        
        IBinder b();
    }
    
    public static final class c extends i
    {
        public final Context d;
        public final PowerManager$WakeLock e;
        public final PowerManager$WakeLock f;
        public boolean g;
        public boolean h;
        
        public c(final Context context, final ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            final PowerManager powerManager = (PowerManager)context.getSystemService("power");
            final StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            (this.e = powerManager.newWakeLock(1, sb.toString())).setReferenceCounted(false);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            (this.f = powerManager.newWakeLock(1, sb2.toString())).setReferenceCounted(false);
        }
        
        @Override
        public void a(Intent intent) {
            intent = new Intent(intent);
            intent.setComponent(super.a);
            if (this.d.startService(intent) != null) {
                // monitorenter(this)
                while (true) {
                    try {
                        if (!this.g) {
                            this.g = true;
                            if (!this.h) {
                                this.e.acquire(60000L);
                            }
                        }
                        // monitorexit(this)
                        return;
                        // monitorexit(this)
                        return;
                    }
                    finally {}
                    continue;
                }
            }
        }
        
        @Override
        public void c() {
            // monitorenter(this)
            while (true) {
                try {
                    if (this.h) {
                        if (this.g) {
                            this.e.acquire(60000L);
                        }
                        this.h = false;
                        this.f.release();
                    }
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public void d() {
            // monitorenter(this)
            while (true) {
                try {
                    if (!this.h) {
                        this.h = true;
                        this.f.acquire(600000L);
                        this.e.release();
                    }
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }
    
    public final class d implements f
    {
        public final Intent a;
        public final int b;
        
        public d(final Intent a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a() {
            io.flutter.plugins.firebase.messaging.a.this.stopSelf(this.b);
        }
        
        @Override
        public Intent getIntent() {
            return this.a;
        }
    }
    
    public static class e
    {
        public ComponentName a;
        public boolean b;
        
        public e(final ComponentName a, final boolean b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public interface f
    {
        void a();
        
        Intent getIntent();
    }
    
    public static final class g extends JobServiceEngine implements b
    {
        public final io.flutter.plugins.firebase.messaging.a a;
        public final Object b;
        public JobParameters c;
        
        public g(final io.flutter.plugins.firebase.messaging.a a) {
            super((Service)a);
            this.b = new Object();
            this.a = a;
        }
        
        @Override
        public f a() {
            final Object b = this.b;
            // monitorenter(b)
            Label_0024: {
                try {
                    final JobParameters c = this.c;
                    if (c == null) {
                        // monitorexit(b)
                        return null;
                    }
                    break Label_0024;
                }
                finally {
                    // monitorexit(b)
                    try {
                        final JobParameters c;
                        final JobWorkItem a = D.a(c);
                        // monitorexit(b)
                        if (a != null) {
                            E.a(a).setExtrasClassLoader(((Context)this.a).getClassLoader());
                            return new a(a);
                        }
                        return null;
                    }
                    catch (SecurityException ex) {
                        Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", (Throwable)ex);
                        // monitorexit(b)
                        return null;
                    }
                }
            }
        }
        
        @Override
        public IBinder b() {
            return F.a(this);
        }
        
        public boolean onStartJob(final JobParameters c) {
            this.c = c;
            this.a.e(false);
            return true;
        }
        
        public boolean onStopJob(final JobParameters jobParameters) {
            final boolean b = this.a.b();
            synchronized (this.b) {
                this.c = null;
                return b;
            }
        }
        
        public final class a implements f
        {
            public final JobWorkItem a;
            
            public a(final JobWorkItem a) {
                this.a = a;
            }
            
            @Override
            public void a() {
                final Object b = g.this.b;
                // monitorenter(b)
                while (true) {
                    JobParameters c;
                    try {
                        c = g.this.c;
                        if (c != null) {
                            final JobParameters jobParameters = c;
                            final a a = this;
                            final JobWorkItem jobWorkItem = a.a;
                            G.a(jobParameters, jobWorkItem);
                        }
                        break Label_0059;
                    }
                    finally {
                        // monitorexit(b)
                        // monitorexit(b)
                        return;
                        final IllegalArgumentException ex;
                        Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", (Throwable)ex);
                        continue;
                    }
                    try {
                        final JobParameters jobParameters = c;
                        final a a = this;
                        final JobWorkItem jobWorkItem = a.a;
                        G.a(jobParameters, jobWorkItem);
                        continue;
                    }
                    catch (IllegalArgumentException ex2) {}
                    catch (SecurityException ex3) {}
                    break;
                }
            }
            
            @Override
            public Intent getIntent() {
                return E.a(this.a);
            }
        }
    }
    
    public static final class h extends i
    {
        public final JobInfo d;
        public final JobScheduler e;
        
        public h(final Context context, final ComponentName componentName, final int n) {
            super(componentName);
            ((i)this).b(n);
            this.d = new JobInfo$Builder(n, super.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
        }
        
        @Override
        public void a(final Intent intent) {
            H.a(this.e, this.d, I.a(intent));
        }
    }
    
    public abstract static class i
    {
        public final ComponentName a;
        public boolean b;
        public int c;
        
        public i(final ComponentName a) {
            this.a = a;
        }
        
        public abstract void a(final Intent p0);
        
        public void b(final int n) {
            if (!this.b) {
                this.b = true;
                this.c = n;
                return;
            }
            if (this.c == n) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Given job ID ");
            sb.append(n);
            sb.append(" is different than previous ");
            sb.append(this.c);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public void c() {
        }
        
        public void d() {
        }
        
        public void e() {
        }
    }
}
