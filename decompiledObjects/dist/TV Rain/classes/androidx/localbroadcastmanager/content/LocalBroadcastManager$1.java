package androidx.localbroadcastmanager.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class LocalBroadcastManager$1
  extends Handler
{
  public LocalBroadcastManager$1(LocalBroadcastManager paramLocalBroadcastManager, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (what != 1) {
      super.handleMessage(paramMessage);
    } else {
      this$0.executePendingBroadcasts();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.localbroadcastmanager.content.LocalBroadcastManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */