package androidx.mediarouter.app;

import android.os.BaseBundle;
import android.view.View;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.ProviderInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouterParams;

final class MediaRouteButton$MediaRouterCallback
  extends MediaRouter.Callback
{
  public MediaRouteButton$MediaRouterCallback(MediaRouteButton paramMediaRouteButton) {}
  
  public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoute();
  }
  
  public void onRouterParamsChanged(MediaRouter paramMediaRouter, MediaRouterParams paramMediaRouterParams)
  {
    boolean bool;
    if (paramMediaRouterParams != null) {
      bool = paramMediaRouterParams.getExtras().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
    } else {
      bool = false;
    }
    paramMediaRouter = this$0;
    if (mIsFixedIcon != bool)
    {
      mIsFixedIcon = bool;
      paramMediaRouter.refreshDrawableState();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteButton.MediaRouterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */