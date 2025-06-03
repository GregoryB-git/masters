package android.support.v4.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$SearchResultReceiver
  extends ResultReceiver
{
  private final MediaBrowserCompat.SearchCallback mCallback;
  private final Bundle mExtras;
  private final String mQuery;
  
  public MediaBrowserCompat$SearchResultReceiver(String paramString, Bundle paramBundle, MediaBrowserCompat.SearchCallback paramSearchCallback, Handler paramHandler)
  {
    super(paramHandler);
    mQuery = paramString;
    mExtras = paramBundle;
    mCallback = paramSearchCallback;
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    Object localObject = paramBundle;
    if (paramBundle != null) {
      localObject = MediaSessionCompat.unparcelWithClassLoader(paramBundle);
    }
    if ((paramInt == 0) && (localObject != null) && (((BaseBundle)localObject).containsKey("search_results")))
    {
      paramBundle = ((Bundle)localObject).getParcelableArray("search_results");
      if (paramBundle != null)
      {
        localObject = new ArrayList(paramBundle.length);
        int i = paramBundle.length;
        for (paramInt = 0; paramInt < i; paramInt++) {
          ((ArrayList)localObject).add((MediaBrowserCompat.MediaItem)paramBundle[paramInt]);
        }
        mCallback.onSearchResult(mQuery, mExtras, (List)localObject);
      }
      else
      {
        mCallback.onError(mQuery, mExtras);
      }
      return;
    }
    mCallback.onError(mQuery, mExtras);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.SearchResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */