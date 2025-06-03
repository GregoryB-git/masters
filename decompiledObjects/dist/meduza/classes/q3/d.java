package q3;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.BaseBundle;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;
import k3.s;

public final class d
  implements n
{
  public final Context a;
  public final r3.d b;
  public final e c;
  
  public d(Context paramContext, r3.d paramd, e parame)
  {
    a = paramContext;
    b = paramd;
    c = parame;
  }
  
  public final void a(s params, int paramInt, boolean paramBoolean)
  {
    Object localObject1 = new ComponentName(a, JobInfoSchedulerService.class);
    JobScheduler localJobScheduler = (JobScheduler)a.getSystemService("jobscheduler");
    Object localObject2 = new Adler32();
    ((Adler32)localObject2).update(a.getPackageName().getBytes(Charset.forName("UTF-8")));
    ((Adler32)localObject2).update(params.b().getBytes(Charset.forName("UTF-8")));
    ((Adler32)localObject2).update(ByteBuffer.allocate(4).putInt(u3.a.a(params.d())).array());
    if (params.c() != null) {
      ((Adler32)localObject2).update(params.c());
    }
    int i = (int)((Adler32)localObject2).getValue();
    if (!paramBoolean)
    {
      localObject2 = localJobScheduler.getAllPendingJobs().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (JobInfo)((Iterator)localObject2).next();
        j = ((JobInfo)localObject3).getExtras().getInt("attemptNumber");
        if (((JobInfo)localObject3).getId() == i) {
          if (j >= paramInt)
          {
            j = 1;
            break label196;
          }
        }
      }
      int j = 0;
      label196:
      if (j != 0)
      {
        o3.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", params);
        return;
      }
    }
    long l1 = b.N(params);
    localObject2 = c;
    localObject1 = new JobInfo.Builder(i, (ComponentName)localObject1);
    Object localObject3 = params.d();
    ((JobInfo.Builder)localObject1).setMinimumLatency(((e)localObject2).b((h3.e)localObject3, l1, paramInt));
    localObject2 = ((e.a)((e)localObject2).c().get(localObject3)).b();
    if (((Set)localObject2).contains(e.b.a)) {
      ((JobInfo.Builder)localObject1).setRequiredNetworkType(2);
    } else {
      ((JobInfo.Builder)localObject1).setRequiredNetworkType(1);
    }
    if (((Set)localObject2).contains(e.b.c)) {
      ((JobInfo.Builder)localObject1).setRequiresCharging(true);
    }
    if (((Set)localObject2).contains(e.b.b)) {
      ((JobInfo.Builder)localObject1).setRequiresDeviceIdle(true);
    }
    localObject2 = new PersistableBundle();
    ((BaseBundle)localObject2).putInt("attemptNumber", paramInt);
    ((BaseBundle)localObject2).putString("backendName", params.b());
    ((BaseBundle)localObject2).putInt("priority", u3.a.a(params.d()));
    if (params.c() != null) {
      ((BaseBundle)localObject2).putString("extras", Base64.encodeToString(params.c(), 0));
    }
    ((JobInfo.Builder)localObject1).setExtras((PersistableBundle)localObject2);
    long l2 = c.b(params.d(), l1, paramInt);
    localObject2 = o3.a.c("JobInfoScheduler");
    if (Log.isLoggable((String)localObject2, 3)) {
      Log.d((String)localObject2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { params, Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(paramInt) }));
    }
    localJobScheduler.schedule(((JobInfo.Builder)localObject1).build());
  }
  
  public final void b(s params, int paramInt)
  {
    a(params, paramInt, false);
  }
}

/* Location:
 * Qualified Name:     q3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */