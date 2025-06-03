package android.support.v4.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.a;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver
  extends a
{
  public final void a(int paramInt, Bundle paramBundle)
  {
    Object localObject = paramBundle;
    if (paramBundle != null) {
      localObject = MediaSessionCompat.l(paramBundle);
    }
    if ((paramInt == 0) && (localObject != null) && (((BaseBundle)localObject).containsKey("search_results")))
    {
      paramBundle = ((Bundle)localObject).getParcelableArray("search_results");
      paramBundle.getClass();
      localObject = new ArrayList(paramBundle.length);
      int i = paramBundle.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        ((ArrayList)localObject).add((MediaBrowserCompat.MediaItem)paramBundle[paramInt]);
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