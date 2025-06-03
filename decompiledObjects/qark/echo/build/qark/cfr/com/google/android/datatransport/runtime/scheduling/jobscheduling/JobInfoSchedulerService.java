/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  android.os.PersistableBundle
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import c2.d;
import f2.p;
import f2.u;
import m2.e;
import m2.r;
import q2.a;

public class JobInfoSchedulerService
extends JobService {
    public static /* synthetic */ void a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        jobInfoSchedulerService.b(jobParameters);
    }

    public final /* synthetic */ void b(JobParameters jobParameters) {
        this.jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Object object = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int n8 = jobParameters.getExtras().getInt("priority");
        int n9 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(this.getApplicationContext());
        object = p.a().b((String)object).d(a.b(n8));
        if (string2 != null) {
            object.c(Base64.decode((String)string2, (int)0));
        }
        u.c().e().v(object.a(), n9, new e(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

