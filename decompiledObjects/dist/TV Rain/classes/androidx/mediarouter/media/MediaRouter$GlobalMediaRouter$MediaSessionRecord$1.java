package androidx.mediarouter.media;

import android.os.Handler;
import androidx.media.VolumeProviderCompat;

class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1
  extends VolumeProviderCompat
{
  public MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(MediaRouter.GlobalMediaRouter.MediaSessionRecord paramMediaSessionRecord, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    super(paramInt1, paramInt2, paramInt3, paramString);
  }
  
  public void onAdjustVolume(final int paramInt)
  {
    this$1.this$0.mCallbackHandler.post(new Runnable()
    {
      public void run()
      {
        MediaRouter.RouteInfo localRouteInfo = this$1.this$0.mSelectedRoute;
        if (localRouteInfo != null) {
          localRouteInfo.requestUpdateVolume(paramInt);
        }
      }
    });
  }
  
  public void onSetVolumeTo(final int paramInt)
  {
    this$1.this$0.mCallbackHandler.post(new Runnable()
    {
      public void run()
      {
        MediaRouter.RouteInfo localRouteInfo = this$1.this$0.mSelectedRoute;
        if (localRouteInfo != null) {
          localRouteInfo.requestSetVolume(paramInt);
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.MediaSessionRecord.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */