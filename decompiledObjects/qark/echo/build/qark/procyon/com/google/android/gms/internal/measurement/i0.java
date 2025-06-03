// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Build$VERSION;
import W2.m;
import android.app.job.JobInfo;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.UserHandle;
import android.app.job.JobScheduler;
import java.lang.reflect.Method;

public final class i0
{
    public static final Method b;
    public static final Method c;
    public final JobScheduler a;
    
    static {
        b = e();
        c = d();
    }
    
    public i0(final JobScheduler a) {
        this.a = a;
    }
    
    public static int a() {
        final Method c = i0.c;
        if (c != null) {
            Label_0043: {
                try {
                    final Integer n = (Integer)c.invoke(UserHandle.class, new Object[0]);
                    if (n != null) {
                        return n;
                    }
                }
                catch (InvocationTargetException ex) {
                    break Label_0043;
                }
                catch (IllegalAccessException ex) {
                    break Label_0043;
                }
                return 0;
            }
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                final InvocationTargetException ex;
                Log.e("JobSchedulerCompat", "myUserId invocation illegal", (Throwable)ex);
            }
        }
        return 0;
    }
    
    public static int c(final Context context, final JobInfo jobInfo, final String s, final String s2) {
        final JobScheduler jobScheduler = (JobScheduler)m.j(context.getSystemService("jobscheduler"));
        if (i0.b != null && context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            return new i0(jobScheduler).b(jobInfo, s, a(), s2);
        }
        return jobScheduler.schedule(jobInfo);
    }
    
    public static Method d() {
        Label_0040: {
            if (Build$VERSION.SDK_INT < 24) {
                break Label_0040;
            }
            while (true) {
                while (true) {
                    try {
                        return UserHandle.class.getDeclaredMethod("myUserId", (Class<?>[])new Class[0]);
                        // iftrue(Label_0040:, !Log.isLoggable("JobSchedulerCompat", 6))
                        Block_3: {
                            break Block_3;
                            return null;
                        }
                        Log.e("JobSchedulerCompat", "No myUserId method available");
                        return null;
                    }
                    catch (NoSuchMethodException ex) {}
                    continue;
                }
            }
        }
    }
    
    public static Method e() {
        Label_0061: {
            if (Build$VERSION.SDK_INT < 24) {
                break Label_0061;
            }
        Label_0043_Outer:
            while (true) {
                while (true) {
                    try {
                        return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
                        // iftrue(Label_0061:, !Log.isLoggable("JobSchedulerCompat", 6))
                        while (true) {
                            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                            return null;
                            continue Label_0043_Outer;
                        }
                        return null;
                    }
                    catch (NoSuchMethodException ex) {}
                    continue;
                }
            }
        }
    }
    
    public final int b(final JobInfo jobInfo, final String s, int intValue, final String s2) {
        final Method b = i0.b;
        if (b != null) {
            Label_0068: {
                try {
                    final Integer n = (Integer)b.invoke(this.a, jobInfo, s, intValue, s2);
                    if (n != null) {
                        intValue = n;
                        return intValue;
                    }
                }
                catch (InvocationTargetException ex) {
                    break Label_0068;
                }
                catch (IllegalAccessException ex) {
                    break Label_0068;
                }
                return 0;
            }
            final InvocationTargetException ex;
            Log.e(s2, "error calling scheduleAsPackage", (Throwable)ex);
        }
        return this.a.schedule(jobInfo);
    }
}
