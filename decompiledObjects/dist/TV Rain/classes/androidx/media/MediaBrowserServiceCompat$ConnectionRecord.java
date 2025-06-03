package androidx.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pair;
import java.util.HashMap;
import java.util.List;

class MediaBrowserServiceCompat$ConnectionRecord
  implements IBinder.DeathRecipient
{
  public final MediaSessionManager.RemoteUserInfo browserInfo;
  public final MediaBrowserServiceCompat.ServiceCallbacks callbacks;
  public final int pid;
  public final String pkg;
  public MediaBrowserServiceCompat.BrowserRoot root;
  public final Bundle rootHints;
  public final HashMap<String, List<Pair<IBinder, Bundle>>> subscriptions = new HashMap();
  public final int uid;
  
  public MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat paramMediaBrowserServiceCompat, String paramString, int paramInt1, int paramInt2, Bundle paramBundle, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks)
  {
    pkg = paramString;
    pid = paramInt1;
    uid = paramInt2;
    browserInfo = new MediaSessionManager.RemoteUserInfo(paramString, paramInt1, paramInt2);
    rootHints = paramBundle;
    callbacks = paramServiceCallbacks;
  }
  
  public void binderDied()
  {
    this$0.mHandler.post(new Runnable()
    {
      public void run()
      {
        MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = MediaBrowserServiceCompat.ConnectionRecord.this;
        this$0.mConnections.remove(callbacks.asBinder());
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ConnectionRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */