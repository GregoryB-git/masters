package m2;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.BaseBundle;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f2.p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Adler32;

public class d
  implements x
{
  public final Context a;
  public final n2.d b;
  public final f c;
  
  public d(Context paramContext, n2.d paramd, f paramf)
  {
    a = paramContext;
    b = paramd;
    c = paramf;
  }
  
  public void a(p paramp, int paramInt)
  {
    b(paramp, paramInt, false);
  }
  
  public void b(p paramp, int paramInt, boolean paramBoolean)
  {
    Object localObject = new ComponentName(a, JobInfoSchedulerService.class);
    JobScheduler localJobScheduler = (JobScheduler)a.getSystemService("jobscheduler");
    int i = c(paramp);
    if ((!paramBoolean) && (d(localJobScheduler, i, paramInt)))
    {
      j2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", paramp);
      return;
    }
    long l = b.p(paramp);
    localObject = c.c(new JobInfo.Builder(i, (ComponentName)localObject), paramp.d(), l, paramInt);
    PersistableBundle localPersistableBundle = new PersistableBundle();
    localPersistableBundle.putInt("attemptNumber", paramInt);
    localPersistableBundle.putString("backendName", paramp.b());
    localPersistableBundle.putInt("priority", q2.a.a(paramp.d()));
    if (paramp.c() != null) {
      localPersistableBundle.putString("extras", Base64.encodeToString(paramp.c(), 0));
    }
    ((JobInfo.Builder)localObject).setExtras(localPersistableBundle);
    j2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramp, Integer.valueOf(i), Long.valueOf(c.g(paramp.d(), l, paramInt)), Long.valueOf(l), Integer.valueOf(paramInt) });
    localJobScheduler.schedule(((JobInfo.Builder)localObject).build());
  }
  
  public int c(p paramp)
  {
    Adler32 localAdler32 = new Adler32();
    localAdler32.update(a.getPackageName().getBytes(Charset.forName("UTF-8")));
    localAdler32.update(paramp.b().getBytes(Charset.forName("UTF-8")));
    localAdler32.update(ByteBuffer.allocate(4).putInt(q2.a.a(paramp.d())).array());
    if (paramp.c() != null) {
      localAdler32.update(paramp.c());
    }
    return (int)localAdler32.getValue();
  }
  
  public final boolean d(JobScheduler paramJobScheduler, int paramInt1, int paramInt2)
  {
    paramJobScheduler = paramJobScheduler.getAllPendingJobs().iterator();
    boolean bool2;
    JobInfo localJobInfo;
    int i;
    do
    {
      boolean bool1 = paramJobScheduler.hasNext();
      bool2 = false;
      bool3 = bool2;
      if (!bool1) {
        break;
      }
      localJobInfo = (JobInfo)paramJobScheduler.next();
      i = localJobInfo.getExtras().getInt("attemptNumber");
    } while (localJobInfo.getId() != paramInt1);
    boolean bool3 = bool2;
    if (i >= paramInt2) {
      bool3 = true;
    }
    return bool3;
  }
}

/* Location:
 * Qualified Name:     m2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */