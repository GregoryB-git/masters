/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobScheduler
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.UserHandle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package com.google.android.gms.internal.measurement;

import W2.m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i0 {
    public static final Method b = i0.e();
    public static final Method c = i0.d();
    public final JobScheduler a;

    public i0(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a() {
        void var1_3;
        Method method = c;
        if (method == null) return 0;
        method = (Integer)method.invoke(UserHandle.class, new Object[0]);
        if (method == null) return 0;
        try {
            return method.intValue();
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {}
        if (!Log.isLoggable((String)"JobSchedulerCompat", (int)6)) return 0;
        Log.e((String)"JobSchedulerCompat", (String)"myUserId invocation illegal", (Throwable)var1_3);
        return 0;
    }

    public static int c(Context context, JobInfo jobInfo, String string2, String string3) {
        JobScheduler jobScheduler = (JobScheduler)m.j((Object)((JobScheduler)context.getSystemService("jobscheduler")));
        if (b != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            return new i0(jobScheduler).b(jobInfo, string2, i0.a(), string3);
        }
        return jobScheduler.schedule(jobInfo);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Method d() {
        if (Build.VERSION.SDK_INT < 24) return null;
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        if (!Log.isLoggable((String)"JobSchedulerCompat", (int)6)) return null;
        Log.e((String)"JobSchedulerCompat", (String)"No myUserId method available");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Method e() {
        if (Build.VERSION.SDK_INT < 24) return null;
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        if (!Log.isLoggable((String)"JobSchedulerCompat", (int)6)) return null;
        Log.e((String)"JobSchedulerCompat", (String)"No scheduleAsPackage method available, falling back to schedule");
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int b(JobInfo jobInfo, String string2, int n8, String string3) {
        void var2_5;
        Method method = b;
        if (method == null) return this.a.schedule(jobInfo);
        string2 = (Integer)method.invoke((Object)this.a, new Object[]{jobInfo, string2, n8, string3});
        if (string2 == null) return 0;
        try {
            return string2.intValue();
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {}
        Log.e((String)string3, (String)"error calling scheduleAsPackage", (Throwable)var2_5);
        return this.a.schedule(jobInfo);
    }
}

