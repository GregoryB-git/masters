package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Method f10976b = e();

    /* renamed from: c, reason: collision with root package name */
    public static final Method f10977c = d();

    /* renamed from: a, reason: collision with root package name */
    public final JobScheduler f10978a;

    public C0928i0(JobScheduler jobScheduler) {
        this.f10978a = jobScheduler;
    }

    public static int a() {
        Method method = f10977c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e7) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e7);
                }
            }
        }
        return 0;
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) W2.m.j((JobScheduler) context.getSystemService("jobscheduler"));
        return (f10976b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C0928i0(jobScheduler).b(jobInfo, str, a(), str2);
    }

    public static Method d() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No myUserId method available");
            return null;
        }
    }

    public static Method e() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    public final int b(JobInfo jobInfo, String str, int i7, String str2) {
        Method method = f10976b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f10978a, jobInfo, str, Integer.valueOf(i7), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e7) {
                Log.e(str2, "error calling scheduleAsPackage", e7);
            }
        }
        return this.f10978a.schedule(jobInfo);
    }
}
