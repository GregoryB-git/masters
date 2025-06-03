package androidx.media;

import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.util.Collection;
import java.util.Iterator;
import z2;

class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1
  implements Runnable
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1(MediaBrowserServiceCompat.MediaBrowserServiceImplBase paramMediaBrowserServiceImplBase, MediaSessionCompat.Token paramToken) {}
  
  public void run()
  {
    Iterator localIterator = this$1.this$0.mConnections.values().iterator();
    while (localIterator.hasNext())
    {
      MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)localIterator.next();
      try
      {
        callbacks.onConnect(root.getRootId(), val$token, root.getExtras());
      }
      catch (RemoteException localRemoteException)
      {
        StringBuilder localStringBuilder = z2.t("Connection for ");
        localStringBuilder.append(pkg);
        localStringBuilder.append(" is no longer valid.");
        Log.w("MBServiceCompat", localStringBuilder.toString());
        localIterator.remove();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */