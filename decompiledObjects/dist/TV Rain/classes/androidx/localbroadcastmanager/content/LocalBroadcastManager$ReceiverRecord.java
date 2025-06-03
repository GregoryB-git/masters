package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class LocalBroadcastManager$ReceiverRecord
{
  public boolean broadcasting;
  public boolean dead;
  public final IntentFilter filter;
  public final BroadcastReceiver receiver;
  
  public LocalBroadcastManager$ReceiverRecord(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
  {
    filter = paramIntentFilter;
    receiver = paramBroadcastReceiver;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("Receiver{");
    localStringBuilder.append(receiver);
    localStringBuilder.append(" filter=");
    localStringBuilder.append(filter);
    if (dead) {
      localStringBuilder.append(" DEAD");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */