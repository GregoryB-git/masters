package androidx.media;

import android.os.Bundle;
import androidx.collection.SimpleArrayMap;

class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3
  implements Runnable
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3(MediaBrowserServiceCompat.MediaBrowserServiceImplBase paramMediaBrowserServiceImplBase, MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    for (int i = 0; i < this$1.this$0.mConnections.size(); i++)
    {
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.valueAt(i);
      if (browserInfo.equals(val$remoteUserInfo))
      {
        this$1.notifyChildrenChangedOnHandler(localConnectionRecord, val$parentId, val$options);
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */