// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.os.BaseBundle;
import m2.e;
import android.util.Base64;
import q2.a;
import f2.p;
import f2.u;
import android.app.job.JobParameters;
import android.app.job.JobService;

public class JobInfoSchedulerService extends JobService
{
    public boolean onStartJob(final JobParameters jobParameters) {
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("backendName");
        final String string2 = ((BaseBundle)jobParameters.getExtras()).getString("extras");
        final int int1 = ((BaseBundle)jobParameters.getExtras()).getInt("priority");
        final int int2 = ((BaseBundle)jobParameters.getExtras()).getInt("attemptNumber");
        u.f(((Context)this).getApplicationContext());
        final p.a d = p.a().b(string).d(a.b(int1));
        if (string2 != null) {
            d.c(Base64.decode(string2, 0));
        }
        u.c().e().v(d.a(), int2, new e(this, jobParameters));
        return true;
    }
    
    public boolean onStopJob(final JobParameters jobParameters) {
        return true;
    }
}
