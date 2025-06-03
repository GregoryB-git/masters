package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import b1.k;

public abstract interface BroadcastReceiverControlSurface
{
  public abstract void attachToBroadcastReceiver(BroadcastReceiver paramBroadcastReceiver, k paramk);
  
  public abstract void detachFromBroadcastReceiver();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */