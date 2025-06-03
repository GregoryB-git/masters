/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  androidx.annotation.RequiresApi
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 */
package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import androidx.annotation.RequiresApi;
import com.onesignal.LocationController;
import com.onesignal.OSBackgroundSync;
import com.onesignal.OneSignal;
import com.onesignal.SyncJobService;
import com.onesignal.SyncService;
import java.lang.ref.WeakReference;

class OSSyncService
extends OSBackgroundSync {
    private static final Object INSTANCE_LOCK = new Object();
    private static final long SYNC_AFTER_BG_DELAY_MS = 30000L;
    private static final int SYNC_TASK_ID = 2071862118;
    private static final String SYNC_TASK_THREAD_ID = "OS_SYNCSRV_BG_SYNC";
    private static OSSyncService sInstance;
    private Long nextScheduledSyncTimeMs = 0L;

    public static /* synthetic */ Long access$002(OSSyncService oSSyncService, Long l) {
        oSSyncService.nextScheduledSyncTimeMs = l;
        return l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OSSyncService getInstance() {
        Object object;
        if (sInstance != null) return sInstance;
        Object object2 = object = INSTANCE_LOCK;
        synchronized (object2) {
            OSSyncService oSSyncService;
            if (sInstance != null) return sInstance;
            sInstance = oSSyncService = new OSSyncService();
            return sInstance;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cancelSyncTask(Context context) {
        Object object;
        Object object2 = object = OSBackgroundSync.LOCK;
        synchronized (object2) {
            this.nextScheduledSyncTimeMs = 0L;
            if (LocationController.scheduleUpdate(context)) {
                return;
            }
            this.cancelBackgroundSyncTask(context);
            return;
        }
    }

    @Override
    public Class getSyncServiceJobClass() {
        return SyncJobService.class;
    }

    @Override
    public Class getSyncServicePendingIntentClass() {
        return SyncService.class;
    }

    @Override
    public int getSyncTaskId() {
        return 2071862118;
    }

    @Override
    public String getSyncTaskThreadId() {
        return SYNC_TASK_THREAD_ID;
    }

    public void scheduleLocationUpdateTask(Context context, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSSyncService scheduleLocationUpdateTask:delayMs: ");
        stringBuilder.append(l);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        this.scheduleSyncTask(context, l);
    }

    @Override
    public void scheduleSyncTask(Context context) {
        OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        this.scheduleSyncTask(context, 30000L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void scheduleSyncTask(Context context, long l) {
        Object object;
        Object object2 = object = OSBackgroundSync.LOCK;
        synchronized (object2) {
            if (this.nextScheduledSyncTimeMs != 0L && OneSignal.getTime().getCurrentTimeMillis() + l > this.nextScheduledSyncTimeMs) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
                context = new StringBuilder();
                context.append("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: ");
                context.append((Object)this.nextScheduledSyncTimeMs);
                OneSignal.Log(lOG_LEVEL, context.toString());
                return;
            }
            long l2 = l;
            if (l < 5000L) {
                l2 = 5000L;
            }
            this.scheduleBackgroundSyncTask(context, l2);
            this.nextScheduledSyncTimeMs = OneSignal.getTime().getCurrentTimeMillis() + l2;
            return;
        }
    }

    public static class LegacySyncRunnable
    extends SyncRunnable {
        private WeakReference<Service> callerService;

        public LegacySyncRunnable(Service service) {
            this.callerService = new WeakReference((Object)service);
        }

        @Override
        public void stopSync() {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.callerService.get() != null) {
                ((Service)this.callerService.get()).stopSelf();
            }
        }
    }

    @RequiresApi(api=21)
    public static class LollipopSyncRunnable
    extends SyncRunnable {
        private JobParameters jobParameters;
        private WeakReference<JobService> jobService;

        public LollipopSyncRunnable(JobService jobService, JobParameters jobParameters) {
            this.jobService = new WeakReference((Object)jobService);
            this.jobParameters = jobParameters;
        }

        @Override
        public void stopSync() {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = z2.t("LollipopSyncRunnable:JobFinished needsJobReschedule: ");
            stringBuilder.append(OSSyncService.getInstance().needsJobReschedule);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            boolean bl = OSSyncService.getInstance().needsJobReschedule;
            OSSyncService.getInstance().needsJobReschedule = false;
            if (this.jobService.get() != null) {
                ((JobService)this.jobService.get()).jobFinished(this.jobParameters, bl);
            }
        }
    }
}

