package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.BaseBundle;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Adler32;

@RequiresApi(api=21)
public class JobInfoScheduler
  implements WorkScheduler
{
  public static final String ATTEMPT_NUMBER = "attemptNumber";
  public static final String BACKEND_NAME = "backendName";
  public static final String EVENT_PRIORITY = "priority";
  public static final String EXTRAS = "extras";
  private static final String LOG_TAG = "JobInfoScheduler";
  private final SchedulerConfig config;
  private final Context context;
  private final EventStore eventStore;
  
  public JobInfoScheduler(Context paramContext, EventStore paramEventStore, SchedulerConfig paramSchedulerConfig)
  {
    context = paramContext;
    eventStore = paramEventStore;
    config = paramSchedulerConfig;
  }
  
  private boolean isJobServiceOn(JobScheduler paramJobScheduler, int paramInt1, int paramInt2)
  {
    Iterator localIterator = paramJobScheduler.getAllPendingJobs().iterator();
    boolean bool2;
    int i;
    do
    {
      boolean bool1 = localIterator.hasNext();
      bool2 = false;
      bool3 = bool2;
      if (!bool1) {
        break;
      }
      paramJobScheduler = (JobInfo)localIterator.next();
      i = paramJobScheduler.getExtras().getInt("attemptNumber");
    } while (paramJobScheduler.getId() != paramInt1);
    boolean bool3 = bool2;
    if (i >= paramInt2) {
      bool3 = true;
    }
    return bool3;
  }
  
  @VisibleForTesting
  public int getJobId(TransportContext paramTransportContext)
  {
    Adler32 localAdler32 = new Adler32();
    localAdler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
    localAdler32.update(paramTransportContext.getBackendName().getBytes(Charset.forName("UTF-8")));
    localAdler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(paramTransportContext.getPriority())).array());
    if (paramTransportContext.getExtras() != null) {
      localAdler32.update(paramTransportContext.getExtras());
    }
    return (int)localAdler32.getValue();
  }
  
  public void schedule(TransportContext paramTransportContext, int paramInt)
  {
    schedule(paramTransportContext, paramInt, false);
  }
  
  public void schedule(TransportContext paramTransportContext, int paramInt, boolean paramBoolean)
  {
    Object localObject = new ComponentName(context, JobInfoSchedulerService.class);
    JobScheduler localJobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
    int i = getJobId(paramTransportContext);
    if ((!paramBoolean) && (isJobServiceOn(localJobScheduler, i, paramInt)))
    {
      Logging.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", paramTransportContext);
      return;
    }
    long l = eventStore.getNextCallTime(paramTransportContext);
    localObject = config.configureJob(new JobInfo.Builder(i, (ComponentName)localObject), paramTransportContext.getPriority(), l, paramInt);
    PersistableBundle localPersistableBundle = new PersistableBundle();
    localPersistableBundle.putInt("attemptNumber", paramInt);
    localPersistableBundle.putString("backendName", paramTransportContext.getBackendName());
    localPersistableBundle.putInt("priority", PriorityMapping.toInt(paramTransportContext.getPriority()));
    if (paramTransportContext.getExtras() != null) {
      localPersistableBundle.putString("extras", Base64.encodeToString(paramTransportContext.getExtras(), 0));
    }
    ((JobInfo.Builder)localObject).setExtras(localPersistableBundle);
    Logging.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramTransportContext, Integer.valueOf(i), Long.valueOf(config.getScheduleDelay(paramTransportContext.getPriority(), l, paramInt)), Long.valueOf(l), Integer.valueOf(paramInt) });
    localJobScheduler.schedule(((JobInfo.Builder)localObject).build());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */