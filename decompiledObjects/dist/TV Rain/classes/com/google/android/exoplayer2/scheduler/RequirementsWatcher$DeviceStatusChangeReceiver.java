package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class RequirementsWatcher$DeviceStatusChangeReceiver
  extends BroadcastReceiver
{
  private RequirementsWatcher$DeviceStatusChangeReceiver(RequirementsWatcher paramRequirementsWatcher) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!isInitialStickyBroadcast())
    {
      paramContext = new StringBuilder();
      paramContext.append(this$0);
      paramContext.append(" received ");
      paramContext.append(paramIntent.getAction());
      RequirementsWatcher.access$200(paramContext.toString());
      RequirementsWatcher.access$300(this$0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.scheduler.RequirementsWatcher.DeviceStatusChangeReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */