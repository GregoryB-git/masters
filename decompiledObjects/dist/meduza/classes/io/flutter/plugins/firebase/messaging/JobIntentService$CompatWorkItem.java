package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.content.Intent;

final class JobIntentService$CompatWorkItem
  implements JobIntentService.GenericWorkItem
{
  public final Intent mIntent;
  public final int mStartId;
  
  public JobIntentService$CompatWorkItem(JobIntentService paramJobIntentService, Intent paramIntent, int paramInt)
  {
    mIntent = paramIntent;
    mStartId = paramInt;
  }
  
  public void complete()
  {
    this$0.stopSelf(mStartId);
  }
  
  public Intent getIntent()
  {
    return mIntent;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.CompatWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */