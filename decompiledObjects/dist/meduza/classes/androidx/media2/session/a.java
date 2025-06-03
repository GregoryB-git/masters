package androidx.media2.session;

import androidx.media2.common.MediaItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  public static final HashMap a;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = new HashMap();
    localHashMap.put("android.media.metadata.ADVERTISEMENT", "androidx.media2.metadata.ADVERTISEMENT");
    localHashMap.put("android.media.metadata.BT_FOLDER_TYPE", "androidx.media2.metadata.BROWSABLE");
    localHashMap.put("android.media.metadata.DOWNLOAD_STATUS", "androidx.media2.metadata.DOWNLOAD_STATUS");
    Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap = a;
      if (!localHashMap.containsKey(localEntry.getValue())) {
        localHashMap.put((String)localEntry.getValue(), (String)localEntry.getKey());
      } else {
        throw new RuntimeException("Shouldn't map to the same value");
      }
    }
  }
  
  public static MediaItem a(MediaItem paramMediaItem)
  {
    if ((paramMediaItem != null) && (paramMediaItem.getClass() != MediaItem.class))
    {
      long l1 = c;
      if (l1 < 0L) {
        l1 = 0L;
      }
      long l2 = d;
      long l3 = l2;
      if (l2 < 0L) {
        l3 = 576460752303423487L;
      }
      synchronized (a)
      {
        paramMediaItem = b;
        return new MediaItem(paramMediaItem, l1, l3);
      }
    }
    return paramMediaItem;
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */