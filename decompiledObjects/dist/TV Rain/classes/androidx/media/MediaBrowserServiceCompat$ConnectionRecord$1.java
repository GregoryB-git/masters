package androidx.media;

import androidx.collection.SimpleArrayMap;

class MediaBrowserServiceCompat$ConnectionRecord$1
  implements Runnable
{
  public MediaBrowserServiceCompat$ConnectionRecord$1(MediaBrowserServiceCompat.ConnectionRecord paramConnectionRecord) {}
  
  public void run()
  {
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = this$1;
    this$0.mConnections.remove(callbacks.asBinder());
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */