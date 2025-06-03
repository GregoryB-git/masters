package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MediaBrowserCompat$MediaBrowserImplApi23
  extends MediaBrowserCompat.MediaBrowserImplApi21
{
  public MediaBrowserCompat$MediaBrowserImplApi23(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
  {
    super(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
  }
  
  public void getItem(@NonNull String paramString, @NonNull MediaBrowserCompat.ItemCallback paramItemCallback)
  {
    if (mServiceBinderWrapper == null) {
      mBrowserFwk.getItem(paramString, mItemCallbackFwk);
    } else {
      super.getItem(paramString, paramItemCallback);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */