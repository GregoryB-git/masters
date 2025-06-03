package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23
  extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat paramMediaBrowserServiceCompat)
  {
    super(paramMediaBrowserServiceCompat);
  }
  
  public void onCreate()
  {
    MediaBrowserServiceApi23 localMediaBrowserServiceApi23 = new MediaBrowserServiceApi23(this$0);
    mServiceFwk = localMediaBrowserServiceApi23;
    localMediaBrowserServiceApi23.onCreate();
  }
  
  public void onLoadItem(String paramString, final MediaBrowserServiceCompat.ResultWrapper<Parcel> paramResultWrapper)
  {
    MediaBrowserServiceCompat.Result local1 = new MediaBrowserServiceCompat.Result(paramString)
    {
      public void detach()
      {
        paramResultWrapper.detach();
      }
      
      public void onResultSent(@Nullable MediaBrowserCompat.MediaItem paramAnonymousMediaItem)
      {
        if (paramAnonymousMediaItem == null)
        {
          paramResultWrapper.sendResult(null);
        }
        else
        {
          Parcel localParcel = Parcel.obtain();
          paramAnonymousMediaItem.writeToParcel(localParcel, 0);
          paramResultWrapper.sendResult(localParcel);
        }
      }
    };
    paramResultWrapper = this$0;
    mCurConnection = mConnectionFromFwk;
    paramResultWrapper.onLoadItem(paramString, local1);
    this$0.mCurConnection = null;
  }
  
  public class MediaBrowserServiceApi23
    extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21
  {
    public MediaBrowserServiceApi23(Context paramContext)
    {
      super(paramContext);
    }
    
    public void onLoadItem(String paramString, MediaBrowserService.Result<MediaBrowser.MediaItem> paramResult)
    {
      onLoadItem(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */