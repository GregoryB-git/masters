package android.support.v4.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import b.b;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$SearchResultReceiver
  extends b
{
  public void a(int paramInt, Bundle paramBundle)
  {
    Object localObject = paramBundle;
    if (paramBundle != null) {
      localObject = MediaSessionCompat.u(paramBundle);
    }
    if ((paramInt == 0) && (localObject != null) && (((BaseBundle)localObject).containsKey("search_results")))
    {
      paramBundle = ((Bundle)localObject).getParcelableArray("search_results");
      paramBundle.getClass();
      localObject = new ArrayList(paramBundle.length);
      int i = paramBundle.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        ((List)localObject).add((MediaBrowserCompat.MediaItem)paramBundle[paramInt]);
      }
      throw null;
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.SearchResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */