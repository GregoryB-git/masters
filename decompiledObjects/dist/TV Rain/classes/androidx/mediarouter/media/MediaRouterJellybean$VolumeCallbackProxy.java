package androidx.mediarouter.media;

import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.VolumeCallback;

class MediaRouterJellybean$VolumeCallbackProxy<T extends MediaRouterJellybean.VolumeCallback>
  extends MediaRouter.VolumeCallback
{
  public final T mCallback;
  
  public MediaRouterJellybean$VolumeCallbackProxy(T paramT)
  {
    mCallback = paramT;
  }
  
  public void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    mCallback.onVolumeSetRequest(paramRouteInfo, paramInt);
  }
  
  public void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    mCallback.onVolumeUpdateRequest(paramRouteInfo, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.VolumeCallbackProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */