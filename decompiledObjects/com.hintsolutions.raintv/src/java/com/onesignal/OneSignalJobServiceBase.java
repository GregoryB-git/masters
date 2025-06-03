/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  androidx.annotation.RequiresApi
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 */
package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;

@RequiresApi(api=21)
abstract class OneSignalJobServiceBase
extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new Runnable(this, this, jobParameters){
            public final OneSignalJobServiceBase this$0;
            public final JobParameters val$finalJobParameters;
            public final JobService val$jobService;
            {
                this.this$0 = oneSignalJobServiceBase;
                this.val$jobService = jobService;
                this.val$finalJobParameters = jobParameters;
            }

            public void run() {
                this.this$0.startProcessing(this.val$jobService, this.val$finalJobParameters);
                this.this$0.jobFinished(this.val$finalJobParameters, false);
            }
        }, "OS_JOBSERVICE_BASE").start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public abstract void startProcessing(JobService var1, JobParameters var2);
}

