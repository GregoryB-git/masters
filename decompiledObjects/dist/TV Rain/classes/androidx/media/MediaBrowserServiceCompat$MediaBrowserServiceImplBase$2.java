package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.Iterator;
import java.util.Set;

class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2
  implements Runnable
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2(MediaBrowserServiceCompat.MediaBrowserServiceImplBase paramMediaBrowserServiceImplBase, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    Iterator localIterator = this$1.this$0.mConnections.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (IBinder)localIterator.next();
      localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.get(localObject);
      this$1.notifyChildrenChangedOnHandler((MediaBrowserServiceCompat.ConnectionRecord)localObject, val$parentId, val$options);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */