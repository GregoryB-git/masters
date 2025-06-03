package io.flutter.plugins.firebase.messaging;

import a0.j;
import android.content.ComponentName;
import android.content.Intent;

abstract class JobIntentService$WorkEnqueuer
{
  public final ComponentName mComponentName;
  public boolean mHasJobId;
  public int mJobId;
  
  public JobIntentService$WorkEnqueuer(ComponentName paramComponentName)
  {
    mComponentName = paramComponentName;
  }
  
  public abstract void enqueueWork(Intent paramIntent);
  
  public void ensureJobId(int paramInt)
  {
    if (!mHasJobId)
    {
      mHasJobId = true;
      mJobId = paramInt;
    }
    else
    {
      if (mJobId != paramInt) {
        break label29;
      }
    }
    return;
    label29:
    StringBuilder localStringBuilder = j.n("Given job ID ", paramInt, " is different than previous ");
    localStringBuilder.append(mJobId);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void serviceProcessingFinished() {}
  
  public void serviceProcessingStarted() {}
  
  public void serviceStartReceived() {}
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.WorkEnqueuer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */