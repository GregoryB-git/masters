package android.support.v4.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import b.b;

class MediaBrowserCompat$ItemReceiver
  extends b
{
  public void a(int paramInt, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle != null) {
      localBundle = MediaSessionCompat.u(paramBundle);
    }
    if ((paramInt == 0) && (localBundle != null) && (localBundle.containsKey("media_item")))
    {
      paramBundle = localBundle.getParcelable("media_item");
      if ((paramBundle != null) && (!(paramBundle instanceof MediaBrowserCompat.MediaItem))) {
        throw null;
      }
      paramBundle = (MediaBrowserCompat.MediaItem)paramBundle;
      throw null;
    }
    throw null;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ItemReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */