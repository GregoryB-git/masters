/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.PersistableBundle
 *  android.util.Base64
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.Iterator
 *  java.util.List
 *  java.util.zip.Adler32
 */
package m2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f2.p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Adler32;
import m2.f;
import m2.x;
import q2.a;

public class d
implements x {
    public final Context a;
    public final n2.d b;
    public final f c;

    public d(Context context, n2.d d8, f f8) {
        this.a = context;
        this.b = d8;
        this.c = f8;
    }

    @Override
    public void a(p p8, int n8) {
        this.b(p8, n8, false);
    }

    @Override
    public void b(p p8, int n8, boolean bl) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
        int n9 = this.c(p8);
        if (!bl && this.d(jobScheduler, n9, n8)) {
            j2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", p8);
            return;
        }
        long l8 = this.b.p(p8);
        componentName = this.c.c(new JobInfo.Builder(n9, componentName), p8.d(), l8, n8);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", n8);
        persistableBundle.putString("backendName", p8.b());
        persistableBundle.putInt("priority", a.a(p8.d()));
        if (p8.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString((byte[])p8.c(), (int)0));
        }
        componentName.setExtras(persistableBundle);
        j2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", p8, n9, this.c.g(p8.d(), l8, n8), l8, n8);
        jobScheduler.schedule(componentName.build());
    }

    public int c(p p8) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName((String)"UTF-8")));
        adler32.update(p8.b().getBytes(Charset.forName((String)"UTF-8")));
        adler32.update(ByteBuffer.allocate((int)4).putInt(a.a(p8.d())).array());
        if (p8.c() != null) {
            adler32.update(p8.c());
        }
        return (int)adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int n8, int n9) {
        boolean bl;
        block2 : {
            int n10;
            boolean bl2;
            JobInfo jobInfo;
            jobScheduler = jobScheduler.getAllPendingJobs().iterator();
            do {
                boolean bl3 = jobScheduler.hasNext();
                bl = bl2 = false;
                if (!bl3) break block2;
                jobInfo = (JobInfo)jobScheduler.next();
                n10 = jobInfo.getExtras().getInt("attemptNumber");
            } while (jobInfo.getId() != n8);
            bl = bl2;
            if (n10 >= n9) {
                bl = true;
            }
        }
        return bl;
    }
}

