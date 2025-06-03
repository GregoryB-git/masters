package androidx.media;

import android.os.Bundle;
import androidx.collection.SimpleArrayMap;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4
  implements Runnable
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4(MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 paramMediaBrowserServiceImplApi21, MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    for (int i = 0; i < this$1.this$0.mConnections.size(); i++)
    {
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.valueAt(i);
      if (browserInfo.equals(val$remoteUserInfo)) {
        this$1.notifyChildrenChangedForCompatOnHandler(localConnectionRecord, val$parentId, val$options);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */