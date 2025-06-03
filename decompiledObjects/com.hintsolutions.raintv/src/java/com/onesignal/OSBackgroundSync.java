/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  androidx.annotation.RequiresApi
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.Iterator
 */
package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.util.Iterator;

abstract class OSBackgroundSync {
    public static final Object LOCK = new Object();
    public boolean needsJobReschedule = false;
    private Thread syncBgThread;

    private boolean hasBootPermission(Context context) {
        boolean bl = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
        return bl;
    }

    @RequiresApi(api=21)
    private boolean isJobIdRunning(Context context) {
        Iterator iterator = ((JobScheduler)context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (iterator.hasNext()) {
            if (((JobInfo)iterator.next()).getId() != this.getSyncTaskId() || (context = this.syncBgThread) == null || !context.isAlive()) continue;
            return true;
        }
        return false;
    }

    private void scheduleSyncServiceAsAlarm(Context context, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" scheduleServiceSyncTask:atTime: ");
        stringBuilder.append(l);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        lOG_LEVEL = this.syncServicePendingIntent(context);
        ((AlarmManager)context.getSystemService("alarm")).set(0, OneSignal.getTime().getCurrentTimeMillis() + l, (PendingIntent)lOG_LEVEL);
    }

    @RequiresApi(value=21)
    private void scheduleSyncServiceAsJob(Context object, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSBackgroundSync scheduleSyncServiceAsJob:atTime: ");
        stringBuilder.append(l);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (this.isJobIdRunning((Context)object)) {
            OneSignal.Log(lOG_LEVEL, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.needsJobReschedule = true;
            return;
        }
        stringBuilder = new JobInfo.Builder(this.getSyncTaskId(), new ComponentName(object, this.getSyncServiceJobClass()));
        stringBuilder.setMinimumLatency(l).setRequiredNetworkType(1);
        if (this.hasBootPermission((Context)object)) {
            stringBuilder.setPersisted(true);
        }
        object = (JobScheduler)object.getSystemService("jobscheduler");
        try {
            int n = object.schedule(stringBuilder.build());
            object = OneSignal.LOG_LEVEL.INFO;
            stringBuilder = new StringBuilder();
            stringBuilder.append("OSBackgroundSync scheduleSyncServiceAsJob:result: ");
            stringBuilder.append(n);
            OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        }
        catch (NullPointerException nullPointerException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", nullPointerException);
        }
    }

    private PendingIntent syncServicePendingIntent(Context context) {
        return PendingIntent.getService((Context)context, (int)this.getSyncTaskId(), (Intent)new Intent(context, this.getSyncServicePendingIntentClass()), (int)0xC000000);
    }

    private static boolean useJob() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cancelBackgroundSyncTask(Context context) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        Object object = new StringBuilder();
        object.append(this.getClass().getSimpleName());
        object.append(" cancel background sync");
        OneSignal.onesignalLog(lOG_LEVEL, object.toString());
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (OSBackgroundSync.useJob()) {
                ((JobScheduler)context.getSystemService("jobscheduler")).cancel(this.getSyncTaskId());
            } else {
                ((AlarmManager)context.getSystemService("alarm")).cancel(this.syncServicePendingIntent(context));
            }
            return;
        }
    }

    public void doBackgroundSync(Context context, Runnable runnable) {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSBackground sync, calling initWithContext");
        OneSignal.initWithContext(context);
        context = new Thread(runnable, this.getSyncTaskThreadId());
        this.syncBgThread = context;
        OSUtils.startThreadWithRetry((Thread)context);
    }

    public abstract Class getSyncServiceJobClass();

    public abstract Class getSyncServicePendingIntentClass();

    public abstract int getSyncTaskId();

    public abstract String getSyncTaskThreadId();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void scheduleBackgroundSyncTask(Context context, long l) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (OSBackgroundSync.useJob()) {
                this.scheduleSyncServiceAsJob(context, l);
            } else {
                this.scheduleSyncServiceAsAlarm(context, l);
            }
            return;
        }
    }

    public abstract void scheduleSyncTask(Context var1);

    public boolean stopSyncBgThread() {
        Thread thread = this.syncBgThread;
        if (thread == null) {
            return false;
        }
        if (!thread.isAlive()) {
            return false;
        }
        this.syncBgThread.interrupt();
        return true;
    }
}

