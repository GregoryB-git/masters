package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(26)
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26
  extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi23
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(MediaBrowserServiceCompat paramMediaBrowserServiceCompat)
  {
    super(paramMediaBrowserServiceCompat);
  }
  
  public Bundle getBrowserRootHints()
  {
    Object localObject = this$0;
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = mCurConnection;
    if (localConnectionRecord != null)
    {
      if (localConnectionRecord == mConnectionFromFwk) {
        return mServiceFwk.getBrowserRootHints();
      }
      if (rootHints == null) {
        localObject = null;
      } else {
        localObject = new Bundle(this$0.mCurConnection.rootHints);
      }
      return (Bundle)localObject;
    }
    throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
  }
  
  public void notifyChildrenChangedForFramework(String paramString, Bundle paramBundle)
  {
    if (paramBundle != null) {
      mServiceFwk.notifyChildrenChanged(paramString, paramBundle);
    } else {
      super.notifyChildrenChangedForFramework(paramString, paramBundle);
    }
  }
  
  public void onCreate()
  {
    MediaBrowserServiceApi26 localMediaBrowserServiceApi26 = new MediaBrowserServiceApi26(this$0);
    mServiceFwk = localMediaBrowserServiceApi26;
    localMediaBrowserServiceApi26.onCreate();
  }
  
  public void onLoadChildren(String paramString, final MediaBrowserServiceCompat.ResultWrapper<List<Parcel>> paramResultWrapper, final Bundle paramBundle)
  {
    MediaBrowserServiceCompat.Result local1 = new MediaBrowserServiceCompat.Result(paramString)
    {
      public void detach()
      {
        paramResultWrapper.detach();
      }
      
      public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramAnonymousList)
      {
        if (paramAnonymousList == null)
        {
          paramResultWrapper.sendResult(null);
          return;
        }
        Object localObject = paramAnonymousList;
        if ((getFlags() & 0x1) != 0) {
          localObject = this$0.applyOptions(paramAnonymousList, paramBundle);
        }
        paramAnonymousList = new ArrayList(((List)localObject).size());
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          MediaBrowserCompat.MediaItem localMediaItem = (MediaBrowserCompat.MediaItem)((Iterator)localObject).next();
          Parcel localParcel = Parcel.obtain();
          localMediaItem.writeToParcel(localParcel, 0);
          paramAnonymousList.add(localParcel);
        }
        paramResultWrapper.sendResult(paramAnonymousList);
      }
    };
    paramResultWrapper = this$0;
    mCurConnection = mConnectionFromFwk;
    paramResultWrapper.onLoadChildren(paramString, local1, paramBundle);
    this$0.mCurConnection = null;
  }
  
  public class MediaBrowserServiceApi26
    extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23
  {
    public MediaBrowserServiceApi26(Context paramContext)
    {
      super(paramContext);
    }
    
    public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult, Bundle paramBundle)
    {
      MediaSessionCompat.ensureClassLoader(paramBundle);
      MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 localMediaBrowserServiceImplApi26 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.this;
      MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$0;
      mCurConnection = mConnectionFromFwk;
      localMediaBrowserServiceImplApi26.onLoadChildren(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult), paramBundle);
      this$0.mCurConnection = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */