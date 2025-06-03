package androidx.mediarouter.app;

import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.ProviderInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class MediaRouteActionProvider$MediaRouterCallback
  extends MediaRouter.Callback
{
  private final WeakReference<MediaRouteActionProvider> mProviderWeak;
  
  public MediaRouteActionProvider$MediaRouterCallback(MediaRouteActionProvider paramMediaRouteActionProvider)
  {
    mProviderWeak = new WeakReference(paramMediaRouteActionProvider);
  }
  
  private void refreshRoute(MediaRouter paramMediaRouter)
  {
    MediaRouteActionProvider localMediaRouteActionProvider = (MediaRouteActionProvider)mProviderWeak.get();
    if (localMediaRouteActionProvider != null) {
      localMediaRouteActionProvider.refreshRoute();
    } else {
      paramMediaRouter.removeCallback(this);
    }
  }
  
  public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    refreshRoute(paramMediaRouter);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteActionProvider.MediaRouterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */