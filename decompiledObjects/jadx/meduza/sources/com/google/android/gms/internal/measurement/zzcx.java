package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class zzcx {
    private static final Method zza = zzc();
    private static final Method zzb = zzb();
    private final JobScheduler zzc;

    private zzcx(JobScheduler jobScheduler) {
        this.zzc = jobScheduler;
    }

    private static int zza() {
        Method method = zzb;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
        }
        return 0;
    }

    private final int zza(JobInfo jobInfo, String str, int i10, String str2) {
        Method method = zza;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.zzc, jobInfo, str, Integer.valueOf(i10), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.e(str2, "error calling scheduleAsPackage", e10);
            }
        }
        return this.zzc.schedule(jobInfo);
    }

    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        return (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new zzcx(jobScheduler).zza(jobInfo, str, zza(), str2);
    }

    private static Method zzb() {
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

    private static Method zzc() {
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
}
