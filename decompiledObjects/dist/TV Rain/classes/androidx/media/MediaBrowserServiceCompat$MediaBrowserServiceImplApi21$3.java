package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.Iterator;
import java.util.Set;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3
  implements Runnable
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3(MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 paramMediaBrowserServiceImplApi21, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    Iterator localIterator = this$1.this$0.mConnections.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (IBinder)localIterator.next();
      localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.get(localObject);
      this$1.notifyChildrenChangedForCompatOnHandler((MediaBrowserServiceCompat.ConnectionRecord)localObject, val$parentId, val$options);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */