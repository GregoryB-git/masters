/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  androidx.annotation.RequiresApi
 *  com.onesignal.OSSyncService
 *  com.onesignal.OSSyncService$LollipopSyncRunnable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import androidx.annotation.RequiresApi;
import com.onesignal.OSSyncService;
import com.onesignal.OneSignal;

@RequiresApi(api=21)
public class SyncJobService
extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        OSSyncService.getInstance().doBackgroundSync((Context)this, (Runnable)new OSSyncService.LollipopSyncRunnable((JobService)this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean bl = OSSyncService.getInstance().stopSyncBgThread();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        jobParameters = new StringBuilder();
        jobParameters.append("SyncJobService onStopJob called, system conditions not available reschedule: ");
        jobParameters.append(bl);
        OneSignal.Log(lOG_LEVEL, jobParameters.toString());
        return bl;
    }
}

