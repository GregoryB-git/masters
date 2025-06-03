package androidx.localbroadcastmanager.content;

import android.content.Intent;
import java.util.ArrayList;

final class LocalBroadcastManager$BroadcastRecord
{
  public final Intent intent;
  public final ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
  
  public LocalBroadcastManager$BroadcastRecord(Intent paramIntent, ArrayList<LocalBroadcastManager.ReceiverRecord> paramArrayList)
  {
    intent = paramIntent;
    receivers = paramArrayList;
  }
}

/* Location:
 * Qualified Name:     androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */