package io.flutter.plugins.firebase.messaging;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c0.b;

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
      try
      {
        localObject2 = ((JobParameters)localObject2).dequeueWork();
        if (localObject2 != null)
        {
          ((JobWorkItem)localObject2).getIntent().setExtrasClassLoader(mService.getClassLoader());
          return new WrapperWorkItem((JobWorkItem)localObject2);
        }
        return null;
      }
      catch (SecurityException localSecurityException)
      {
        Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", localSecurityException);
        return null;
      }
    }
  }
  
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    mParams = paramJobParameters;
    mService.ensureProcessorRunningLocked(false);
    return true;
  }
  
  public boolean onStopJob(JobParameters arg1)
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
          try
          {
            b.s(localJobParameters, mJobWork);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            str = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
            Log.e("JobServiceEngineImpl", str, localIllegalArgumentException);
          }
          catch (SecurityException localSecurityException)
          {
            for (;;)
            {
              String str = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
            }
          }
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
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.JobServiceEngineImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */