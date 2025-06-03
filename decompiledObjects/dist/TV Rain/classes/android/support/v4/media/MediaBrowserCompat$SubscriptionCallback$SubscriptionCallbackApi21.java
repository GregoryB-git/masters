package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

@RequiresApi(21)
class MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21
  extends MediaBrowser.SubscriptionCallback
{
  public MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21(MediaBrowserCompat.SubscriptionCallback paramSubscriptionCallback) {}
  
  public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
  {
    if (paramList == null) {
      return null;
    }
    int i = paramBundle.getInt("android.media.browse.extra.PAGE", -1);
    int j = paramBundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    if ((i == -1) && (j == -1)) {
      return paramList;
    }
    int k = j * i;
    int m = k + j;
    if ((i >= 0) && (j >= 1) && (k < paramList.size()))
    {
      i = m;
      if (m > paramList.size()) {
        i = paramList.size();
      }
      return paramList.subList(k, i);
    }
    return Collections.emptyList();
  }
  
  public void onChildrenLoaded(@NonNull String paramString, List<MediaBrowser.MediaItem> paramList)
  {
    Object localObject = this$0.mSubscriptionRef;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (MediaBrowserCompat.Subscription)((Reference)localObject).get();
    }
    if (localObject == null)
    {
      this$0.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList));
    }
    else
    {
      paramList = MediaBrowserCompat.MediaItem.fromMediaItemList(paramList);
      List localList1 = ((MediaBrowserCompat.Subscription)localObject).getCallbacks();
      List localList2 = ((MediaBrowserCompat.Subscription)localObject).getOptionsList();
      for (int i = 0; i < localList1.size(); i++)
      {
        localObject = (Bundle)localList2.get(i);
        if (localObject == null) {
          this$0.onChildrenLoaded(paramString, paramList);
        } else {
          this$0.onChildrenLoaded(paramString, applyOptions(paramList, (Bundle)localObject), (Bundle)localObject);
        }
      }
    }
  }
  
  public void onError(@NonNull String paramString)
  {
    this$0.onError(paramString);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */