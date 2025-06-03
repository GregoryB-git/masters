package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class BroadcastReceiverConstraintTracker$1
  extends BroadcastReceiver
{
  public BroadcastReceiverConstraintTracker$1(BroadcastReceiverConstraintTracker paramBroadcastReceiverConstraintTracker) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent != null) {
      this$0.onBroadcastReceive(paramContext, paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */