// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import android.os.BaseBundle;
import java.util.Iterator;
import android.app.job.JobInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import android.util.Base64;
import android.os.PersistableBundle;
import android.app.job.JobInfo$Builder;
import j2.a;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f2.p;
import android.content.Context;

public class d implements x
{
    public final Context a;
    public final n2.d b;
    public final f c;
    
    public d(final Context a, final n2.d b, final f c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final p p2, final int n) {
        this.b(p2, n, false);
    }
    
    @Override
    public void b(final p p3, final int i, final boolean b) {
        final ComponentName componentName = new ComponentName(this.a, (Class)JobInfoSchedulerService.class);
        final JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
        final int c = this.c(p3);
        if (!b && this.d(jobScheduler, c, i)) {
            j2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", p3);
            return;
        }
        final long p4 = this.b.p(p3);
        final JobInfo$Builder c2 = this.c.c(new JobInfo$Builder(c, componentName), p3.d(), p4, i);
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putInt("attemptNumber", i);
        ((BaseBundle)extras).putString("backendName", p3.b());
        ((BaseBundle)extras).putInt("priority", q2.a.a(p3.d()));
        if (p3.c() != null) {
            ((BaseBundle)extras).putString("extras", Base64.encodeToString(p3.c(), 0));
        }
        c2.setExtras(extras);
        j2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", p3, c, this.c.g(p3.d(), p4, i), p4, i);
        jobScheduler.schedule(c2.build());
    }
    
    public int c(final p p) {
        final Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(p.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(q2.a.a(p.d())).array());
        if (p.c() != null) {
            adler32.update(p.c());
        }
        return (int)adler32.getValue();
    }
    
    public final boolean d(final JobScheduler jobScheduler, final int n, final int n2) {
        final Iterator iterator = jobScheduler.getAllPendingJobs().iterator();
        JobInfo jobInfo;
        boolean b;
        int int1;
        do {
            final boolean hasNext = iterator.hasNext();
            b = false;
            if (!hasNext) {
                return b;
            }
            jobInfo = iterator.next();
            int1 = ((BaseBundle)jobInfo.getExtras()).getInt("attemptNumber");
        } while (jobInfo.getId() != n);
        b = b;
        if (int1 >= n2) {
            b = true;
            return b;
        }
        return b;
    }
}
