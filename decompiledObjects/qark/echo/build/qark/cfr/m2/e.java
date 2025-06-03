/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  java.lang.Object
 *  java.lang.Runnable
 */
package m2;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final class e
implements Runnable {
    public final /* synthetic */ JobInfoSchedulerService o;
    public final /* synthetic */ JobParameters p;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.o = jobInfoSchedulerService;
        this.p = jobParameters;
    }

    public final void run() {
        JobInfoSchedulerService.a(this.o, this.p);
    }
}

