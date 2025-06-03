package androidx.mediarouter.media;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(16)
class RemoteControlClientCompat$JellybeanImpl
  extends RemoteControlClientCompat
{
  private boolean mRegistered;
  private final Object mRouterObj;
  private final Object mUserRouteCategoryObj;
  private final Object mUserRouteObj;
  
  public RemoteControlClientCompat$JellybeanImpl(Context paramContext, Object paramObject)
  {
    super(paramContext, paramObject);
    paramObject = MediaRouterJellybean.getMediaRouter(paramContext);
    mRouterObj = paramObject;
    paramContext = MediaRouterJellybean.createRouteCategory(paramObject, "", false);
    mUserRouteCategoryObj = paramContext;
    mUserRouteObj = MediaRouterJellybean.createUserRoute(paramObject, paramContext);
  }
  
  public void setPlaybackInfo(RemoteControlClientCompat.PlaybackInfo paramPlaybackInfo)
  {
    MediaRouterJellybean.UserRouteInfo.setVolume(mUserRouteObj, volume);
    MediaRouterJellybean.UserRouteInfo.setVolumeMax(mUserRouteObj, volumeMax);
    MediaRouterJellybean.UserRouteInfo.setVolumeHandling(mUserRouteObj, volumeHandling);
    MediaRouterJellybean.UserRouteInfo.setPlaybackStream(mUserRouteObj, playbackStream);
    MediaRouterJellybean.UserRouteInfo.setPlaybackType(mUserRouteObj, playbackType);
    if (!mRegistered)
    {
      mRegistered = true;
      MediaRouterJellybean.UserRouteInfo.setVolumeCallback(mUserRouteObj, MediaRouterJellybean.createVolumeCallback(new VolumeCallbackWrapper(this)));
      MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(mUserRouteObj, mRcc);
    }
  }
  
  public static final class VolumeCallbackWrapper
    implements MediaRouterJellybean.VolumeCallback
  {
    private final WeakReference<RemoteControlClientCompat.JellybeanImpl> mImplWeak;
    
    public VolumeCallbackWrapper(RemoteControlClientCompat.JellybeanImpl paramJellybeanImpl)
    {
      mImplWeak = new WeakReference(paramJellybeanImpl);
    }
    
    public void onVolumeSetRequest(Object paramObject, int paramInt)
    {
      paramObject = (RemoteControlClientCompat.JellybeanImpl)mImplWeak.get();
      if (paramObject != null)
      {
        paramObject = mVolumeCallback;
        if (paramObject != null) {
          ((RemoteControlClientCompat.VolumeCallback)paramObject).onVolumeSetRequest(paramInt);
        }
      }
    }
    
    public void onVolumeUpdateRequest(Object paramObject, int paramInt)
    {
      paramObject = (RemoteControlClientCompat.JellybeanImpl)mImplWeak.get();
      if (paramObject != null)
      {
        paramObject = mVolumeCallback;
        if (paramObject != null) {
          ((RemoteControlClientCompat.VolumeCallback)paramObject).onVolumeUpdateRequest(paramInt);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemoteControlClientCompat.JellybeanImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */