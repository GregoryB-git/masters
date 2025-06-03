package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class MediaBrowserCompat$MediaBrowserImplApi26
  extends MediaBrowserCompat.MediaBrowserImplApi23
{
  public MediaBrowserCompat$MediaBrowserImplApi26(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.ConnectionCallback paramConnectionCallback, Bundle paramBundle)
  {
    super(paramContext, paramComponentName, paramConnectionCallback, paramBundle);
  }
  
  public void subscribe(@NonNull String paramString, @Nullable Bundle paramBundle, @NonNull MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
  {
    if ((mServiceBinderWrapper != null) && (mServiceVersion >= 2)) {
      super.subscribe(paramString, paramBundle, paramSubscriptionCallback);
    } else if (paramBundle == null) {
      mBrowserFwk.subscribe(paramString, mSubscriptionCallbackFwk);
    } else {
      mBrowserFwk.subscribe(paramString, paramBundle, mSubscriptionCallbackFwk);
    }
  }
  
  public void unsubscribe(@NonNull String paramString, MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback)
  {
    if ((mServiceBinderWrapper != null) && (mServiceVersion >= 2)) {
      super.unsubscribe(paramString, paramSubscriptionCallback);
    } else if (paramSubscriptionCallback == null) {
      mBrowserFwk.unsubscribe(paramString);
    } else {
      mBrowserFwk.unsubscribe(paramString, mSubscriptionCallbackFwk);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */