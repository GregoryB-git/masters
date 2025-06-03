package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public abstract class MediaBrowserCompat$SubscriptionCallback
{
  public final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
  public WeakReference<MediaBrowserCompat.Subscription> mSubscriptionRef;
  public final IBinder mToken = new Binder();
  
  public MediaBrowserCompat$SubscriptionCallback()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      mSubscriptionCallbackFwk = new SubscriptionCallbackApi26();
    } else {
      mSubscriptionCallbackFwk = new SubscriptionCallbackApi21();
    }
  }
  
  public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowserCompat.MediaItem> paramList) {}
  
  public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowserCompat.MediaItem> paramList, @NonNull Bundle paramBundle) {}
  
  public void onError(@NonNull String paramString) {}
  
  public void onError(@NonNull String paramString, @NonNull Bundle paramBundle) {}
  
  public void setSubscription(MediaBrowserCompat.Subscription paramSubscription)
  {
    mSubscriptionRef = new WeakReference(paramSubscription);
  }
  
  @RequiresApi(21)
  public class SubscriptionCallbackApi21
    extends MediaBrowser.SubscriptionCallback
  {
    public SubscriptionCallbackApi21() {}
    
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
      Object localObject = mSubscriptionRef;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = (MediaBrowserCompat.Subscription)((Reference)localObject).get();
      }
      if (localObject == null)
      {
        MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList));
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
            MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, paramList);
          } else {
            onChildrenLoaded(paramString, applyOptions(paramList, (Bundle)localObject), (Bundle)localObject);
          }
        }
      }
    }
    
    public void onError(@NonNull String paramString)
    {
      MediaBrowserCompat.SubscriptionCallback.this.onError(paramString);
    }
  }
  
  @RequiresApi(26)
  public class SubscriptionCallbackApi26
    extends MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi21
  {
    public SubscriptionCallbackApi26()
    {
      super();
    }
    
    public void onChildrenLoaded(@NonNull String paramString, @NonNull List<MediaBrowser.MediaItem> paramList, @NonNull Bundle paramBundle)
    {
      MediaSessionCompat.ensureClassLoader(paramBundle);
      MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(paramString, MediaBrowserCompat.MediaItem.fromMediaItemList(paramList), paramBundle);
    }
    
    public void onError(@NonNull String paramString, @NonNull Bundle paramBundle)
    {
      MediaSessionCompat.ensureClassLoader(paramBundle);
      MediaBrowserCompat.SubscriptionCallback.this.onError(paramString, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */