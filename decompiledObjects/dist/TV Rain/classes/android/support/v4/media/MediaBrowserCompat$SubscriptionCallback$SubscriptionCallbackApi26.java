package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(26)
class MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26
  extends MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi21
{
  public MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26(MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
  {
    super(paramSubscriptionCallback);
  }
  
  public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowser.MediaItem> paramList, @NonNull Bundle paramBundle)
  {
    MediaSessionCompat.ensureClassLoader(paramBundle);
    this$0.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList), paramBundle);
  }
  
  public void onError(@NonNull String paramString, @NonNull Bundle paramBundle)
  {
    MediaSessionCompat.ensureClassLoader(paramBundle);
    this$0.onError(paramString, paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */