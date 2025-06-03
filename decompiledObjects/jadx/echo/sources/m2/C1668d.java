package m2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j2.AbstractC1370a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import n2.InterfaceC1707d;
import q2.AbstractC1884a;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1668d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17677a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1707d f17678b;

    /* renamed from: c, reason: collision with root package name */
    public final f f17679c;

    public C1668d(Context context, InterfaceC1707d interfaceC1707d, f fVar) {
        this.f17677a = context;
        this.f17678b = interfaceC1707d;
        this.f17679c = fVar;
    }

    @Override // m2.x
    public void a(f2.p pVar, int i7) {
        b(pVar, i7, false);
    }

    @Override // m2.x
    public void b(f2.p pVar, int i7, boolean z7) {
        ComponentName componentName = new ComponentName(this.f17677a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f17677a.getSystemService("jobscheduler");
        int c7 = c(pVar);
        if (!z7 && d(jobScheduler, c7, i7)) {
            AbstractC1370a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long p7 = this.f17678b.p(pVar);
        JobInfo.Builder c8 = this.f17679c.c(new JobInfo.Builder(c7, componentName), pVar.d(), p7, i7);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i7);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", AbstractC1884a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        c8.setExtras(persistableBundle);
        AbstractC1370a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c7), Long.valueOf(this.f17679c.g(pVar.d(), p7, i7)), Long.valueOf(p7), Integer.valueOf(i7));
        jobScheduler.schedule(c8.build());
    }

    public int c(f2.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f17677a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC1884a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i7, int i8) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i9 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i7) {
                return i9 >= i8;
            }
        }
        return false;
    }
}
