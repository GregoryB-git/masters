package io.flutter.plugins.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

final class JobIntentService$CompatWorkEnqueuer
  extends JobIntentService.WorkEnqueuer
{
  private final Context mContext;
  private final PowerManager.WakeLock mLaunchWakeLock;
  public boolean mLaunchingService;
  private final PowerManager.WakeLock mRunWakeLock;
  public boolean mServiceProcessing;
  
  public JobIntentService$CompatWorkEnqueuer(Context paramContext, ComponentName paramComponentName)
  {
    super(paramComponentName);
    mContext = paramContext.getApplicationContext();
    paramContext = (PowerManager)paramContext.getSystemService("power");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramComponentName.getClassName());
    ((StringBuilder)localObject).append(":launch");
    localObject = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
    mLaunchWakeLock = ((PowerManager.WakeLock)localObject);
    ((PowerManager.WakeLock)localObject).setReferenceCounted(false);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramComponentName.getClassName());
    ((StringBuilder)localObject).append(":run");
    paramContext = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
    mRunWakeLock = paramContext;
    paramContext.setReferenceCounted(false);
  }
  
  public void enqueueWork(Intent paramIntent)
  {
    paramIntent = new Intent(paramIntent);
    paramIntent.setComponent(mComponentName);
    if (mContext.startService(paramIntent) != null) {
      try
      {
        if (!mLaunchingService)
        {
          mLaunchingService = true;
          if (!mServiceProcessing) {
            mLaunchWakeLock.acquire(60000L);
          }
        }
      }
      finally {}
    }
  }
  
  public void serviceProcessingFinished()
  {
    try
    {
      if (mServiceProcessing)
      {
        if (mLaunchingService) {
          mLaunchWakeLock.acquire(60000L);
        }
        mServiceProcessing = false;
        mRunWakeLock.release();
      }
      return;
    }
    finally {}
  }
  
  public void serviceProcessingStarted()
  {
    try
    {
      if (!mServiceProcessing)
      {
        mServiceProcessing = true;
        mRunWakeLock.acquire(600000L);
        mLaunchWakeLock.release();
      }
      return;
    }
    finally {}
  }
  
  public void serviceStartReceived()
  {
    try
    {
      mLaunchingService = false;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.CompatWorkEnqueuer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */