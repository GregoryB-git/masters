/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobParameters
 *  android.app.job.JobScheduler
 *  android.app.job.JobWorkItem
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.concurrent.Executor
 */
package io.flutter.plugins.firebase.messaging;

import O5.E;
import O5.F;
import O5.G;
import O5.H;
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
import java.util.concurrent.Executor;

public abstract class a
extends Service {
    public static final Object v = new Object();
    public static final HashMap w = new HashMap();
    public b o;
    public i p;
    public a q;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public final ArrayList u = new ArrayList();

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void c(Context context, ComponentName componentName, int n8, Intent intent, boolean bl) {
        if (intent == null) throw new IllegalArgumentException("work must not be null");
        Object object = v;
        // MONITORENTER : object
        i i8 = a.f(context, componentName, true, n8, bl);
        i8.b(n8);
        i8.a(intent);
        return;
        catch (IllegalStateException illegalStateException222) {
            if (!bl) throw illegalStateException222;
            a.f(context, componentName, true, n8, false).a(intent);
        }
        // MONITOREXIT : object
    }

    public static void d(Context context, Class class_, int n8, Intent intent, boolean bl) {
        a.c(context, new ComponentName(context, class_), n8, intent, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static i f(Context object, ComponentName componentName, boolean bl, int n8, boolean bl2) {
        e e8 = new e(componentName, bl2);
        HashMap hashMap = w;
        i i8 = (i)hashMap.get((Object)e8);
        i i9 = i8;
        if (i8 != null) return i9;
        if (Build.VERSION.SDK_INT >= 26 && !bl2) {
            if (!bl) throw new IllegalArgumentException("Can't be here without a job id");
            object = new h((Context)object, componentName, n8);
        } else {
            object = new c((Context)object, componentName);
        }
        hashMap.put((Object)e8, object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f a() {
        Object object = this.o;
        if (object != null && (object = object.a()) != null) {
            return object;
        }
        object = this.u;
        synchronized (object) {
            try {
                if (this.u.size() <= 0) return null;
                return (f)this.u.remove(0);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean b() {
        a a8 = this.q;
        if (a8 != null) {
            a8.cancel(this.r);
        }
        this.s = true;
        return this.h();
    }

    public void e(boolean bl) {
        if (this.q == null) {
            this.q = new a();
            i i8 = this.p;
            if (i8 != null && bl) {
                i8.d();
            }
            this.q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }

    public abstract void g(Intent var1);

    public boolean h() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i() {
        ArrayList arrayList = this.u;
        if (arrayList == null) {
            return;
        }
        synchronized (arrayList) {
            try {
                this.q = null;
                ArrayList arrayList2 = this.u;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.e(false);
                } else if (!this.t) {
                    this.p.c();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public IBinder onBind(Intent object) {
        object = this.o;
        if (object != null) {
            return object.b();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.o = new g(this);
            this.p = null;
        }
        this.p = a.f((Context)this, new ComponentName((Context)this, this.getClass()), false, 0, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        super.onDestroy();
        this.b();
        ArrayList arrayList = this.u;
        synchronized (arrayList) {
            this.t = true;
            this.p.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int onStartCommand(Intent intent, int n8, int n9) {
        this.p.e();
        ArrayList arrayList = this.u;
        synchronized (arrayList) {
            ArrayList arrayList2 = this.u;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList2.add((Object)new d(intent, n9));
            this.e(true);
            return 3;
        }
    }

    public final class a
    extends AsyncTask {
        public /* varargs */ Void a(Void ... object) {
            while ((object = a.this.a()) != null) {
                a.this.g(object.getIntent());
                object.a();
            }
            return null;
        }

        public void b(Void void_) {
            a.this.i();
        }

        public void c(Void void_) {
            a.this.i();
        }
    }

    public static interface b {
        public f a();

        public IBinder b();
    }

    public static final class c
    extends i {
        public final Context d;
        public final PowerManager.WakeLock e;
        public final PowerManager.WakeLock f;
        public boolean g;
        public boolean h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            context = (PowerManager)context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(componentName.getClassName());
            stringBuilder.append(":launch");
            stringBuilder = context.newWakeLock(1, stringBuilder.toString());
            this.e = stringBuilder;
            stringBuilder.setReferenceCounted(false);
            stringBuilder = new StringBuilder();
            stringBuilder.append(componentName.getClassName());
            stringBuilder.append(":run");
            context = context.newWakeLock(1, stringBuilder.toString());
            this.f = context;
            context.setReferenceCounted(false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(Intent intent) {
            intent = new Intent(intent);
            intent.setComponent(this.a);
            if (this.d.startService(intent) == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000L);
                        }
                    }
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void c() {
            synchronized (this) {
                try {
                    if (this.h) {
                        if (this.g) {
                            this.e.acquire(60000L);
                        }
                        this.h = false;
                        this.f.release();
                    }
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void d() {
            synchronized (this) {
                try {
                    if (!this.h) {
                        this.h = true;
                        this.f.acquire(600000L);
                        this.e.release();
                    }
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void e() {
            synchronized (this) {
                this.g = false;
                return;
            }
        }
    }

    public final class d
    implements f {
        public final Intent a;
        public final int b;

        public d(Intent intent, int n8) {
            this.a = intent;
            this.b = n8;
        }

        @Override
        public void a() {
            a.this.stopSelf(this.b);
        }

        @Override
        public Intent getIntent() {
            return this.a;
        }
    }

    public static class e {
        public ComponentName a;
        public boolean b;

        public e(ComponentName componentName, boolean bl) {
            this.a = componentName;
            this.b = bl;
        }
    }

    public static interface f {
        public void a();

        public Intent getIntent();
    }

    public static final class g
    extends JobServiceEngine
    implements b {
        public final io.flutter.plugins.firebase.messaging.a a;
        public final Object b = new Object();
        public JobParameters c;

        public g(io.flutter.plugins.firebase.messaging.a a8) {
            super((Service)a8);
            this.a = a8;
        }

        /*
         * Exception decompiling
         */
        @Override
        public f a() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        public IBinder b() {
            return F.a(this);
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.e(false);
            return true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean onStopJob(JobParameters object) {
            boolean bl = this.a.b();
            object = this.b;
            synchronized (object) {
                this.c = null;
                return bl;
            }
        }

        public final class a
        implements f {
            public final JobWorkItem a;

            public a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public void a() {
                String string2;
                void var1_6;
                block8 : {
                    block7 : {
                        Object object = g.this.b;
                        // MONITORENTER : object
                        JobParameters jobParameters = g.this.c;
                        if (jobParameters == null) return;
                        {
                            G.a(jobParameters, this.a);
                            return;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                        }
                        catch (SecurityException securityException) {
                            break block7;
                        }
                        string2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                        break block8;
                    }
                    string2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                }
                Log.e((String)"JobServiceEngineImpl", (String)string2, (Throwable)var1_6);
                // MONITOREXIT : object
            }

            @Override
            public Intent getIntent() {
                return E.a(this.a);
            }
        }

    }

    public static final class h
    extends i {
        public final JobInfo d;
        public final JobScheduler e;

        public h(Context context, ComponentName componentName, int n8) {
            super(componentName);
            this.b(n8);
            this.d = new JobInfo.Builder(n8, this.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override
        public void a(Intent intent) {
            H.a(this.e, this.d, I.a(intent));
        }
    }

    public static abstract class i {
        public final ComponentName a;
        public boolean b;
        public int c;

        public i(ComponentName componentName) {
            this.a = componentName;
        }

        public abstract void a(Intent var1);

        public void b(int n8) {
            if (!this.b) {
                this.b = true;
                this.c = n8;
                return;
            }
            if (this.c == n8) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Given job ID ");
            stringBuilder.append(n8);
            stringBuilder.append(" is different than previous ");
            stringBuilder.append(this.c);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

}

