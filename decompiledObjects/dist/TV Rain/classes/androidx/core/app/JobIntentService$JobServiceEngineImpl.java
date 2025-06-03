package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import f0;

@RequiresApi(26)
final class JobIntentService$JobServiceEngineImpl
  extends JobServiceEngine
  implements JobIntentService.CompatJobEngine
{
  public static final boolean DEBUG = false;
  public static final String TAG = "JobServiceEngineImpl";
  public final Object mLock = new Object();
  public JobParameters mParams;
  public final JobIntentService mService;
  
  public JobIntentService$JobServiceEngineImpl(JobIntentService paramJobIntentService)
  {
    super(paramJobIntentService);
    mService = paramJobIntentService;
  }
  
  public IBinder compatGetBinder()
  {
    return getBinder();
  }
  
  public JobIntentService.GenericWorkItem dequeueWork()
  {
    synchronized (mLock)
    {
      Object localObject2 = mParams;
      if (localObject2 == null) {
        return null;
      }
      localObject2 = ((JobParameters)localObject2).dequeueWork();
      if (localObject2 != null)
      {
        ((JobWorkItem)localObject2).getIntent().setExtrasClassLoader(mService.getClassLoader());
        return new WrapperWorkItem((JobWorkItem)localObject2);
      }
      return null;
    }
  }
  
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    mParams = paramJobParameters;
    mService.ensureProcessorRunningLocked(false);
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters)
  {
    boolean bool = mService.doStopCurrentWork();
    synchronized (mLock)
    {
      mParams = null;
      return bool;
    }
  }
  
  public final class WrapperWorkItem
    implements JobIntentService.GenericWorkItem
  {
    public final JobWorkItem mJobWork;
    
    public WrapperWorkItem(JobWorkItem paramJobWorkItem)
    {
      mJobWork = paramJobWorkItem;
    }
    
    public void complete()
    {
      synchronized (mLock)
      {
        JobParameters localJobParameters = mParams;
        if (localJobParameters != null) {
          f0.r(localJobParameters, mJobWork);
        }
        return;
      }
    }
    
    public Intent getIntent()
    {
      return mJobWork.getIntent();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.JobIntentService.JobServiceEngineImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */