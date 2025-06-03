package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.List;
import z2;

class MediaBrowserServiceCompat$1
  extends MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>>
{
  public MediaBrowserServiceCompat$1(MediaBrowserServiceCompat paramMediaBrowserServiceCompat, Object paramObject, MediaBrowserServiceCompat.ConnectionRecord paramConnectionRecord, String paramString, Bundle paramBundle1, Bundle paramBundle2)
  {
    super(paramObject);
  }
  
  public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramList)
  {
    if (this$0.mConnections.get(val$connection.callbacks.asBinder()) != val$connection)
    {
      if (MediaBrowserServiceCompat.DEBUG)
      {
        paramList = z2.t("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
        paramList.append(val$connection.pkg);
        paramList.append(" id=");
        paramList.append(val$parentId);
        Log.d("MBServiceCompat", paramList.toString());
      }
      return;
    }
    Object localObject = paramList;
    if ((getFlags() & 0x1) != 0) {
      localObject = this$0.applyOptions(paramList, val$subscribeOptions);
    }
    try
    {
      val$connection.callbacks.onLoadChildren(val$parentId, (List)localObject, val$subscribeOptions, val$notifyChildrenChangedOptions);
    }
    catch (RemoteException paramList)
    {
      paramList = z2.t("Calling onLoadChildren() failed for id=");
      paramList.append(val$parentId);
      paramList.append(" package=");
      paramList.append(val$connection.pkg);
      Log.w("MBServiceCompat", paramList.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */