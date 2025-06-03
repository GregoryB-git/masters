package q3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import k3.s;
import q3.e;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13230a;

    /* renamed from: b, reason: collision with root package name */
    public final r3.d f13231b;

    /* renamed from: c, reason: collision with root package name */
    public final e f13232c;

    public d(Context context, r3.d dVar, e eVar) {
        this.f13230a = context;
        this.f13231b = dVar;
        this.f13232c = eVar;
    }

    @Override // q3.n
    public final void a(s sVar, int i10, boolean z10) {
        boolean z11;
        ComponentName componentName = new ComponentName(this.f13230a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f13230a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f13230a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(u3.a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                o3.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sVar);
                return;
            }
        }
        long N = this.f13231b.N(sVar);
        e eVar = this.f13232c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        h3.e d10 = sVar.d();
        builder.setMinimumLatency(eVar.b(d10, N, i10));
        Set<e.b> b10 = eVar.c().get(d10).b();
        if (b10.contains(e.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b10.contains(e.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b10.contains(e.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", sVar.b());
        persistableBundle.putInt("priority", u3.a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar, Integer.valueOf(value), Long.valueOf(this.f13232c.b(sVar.d(), N, i10)), Long.valueOf(N), Integer.valueOf(i10)};
        String c10 = o3.a.c("JobInfoScheduler");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }

    @Override // q3.n
    public final void b(s sVar, int i10) {
        a(sVar, i10, false);
    }
}
