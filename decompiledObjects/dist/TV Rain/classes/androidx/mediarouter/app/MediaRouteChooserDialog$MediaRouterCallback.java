package androidx.mediarouter.app;

import androidx.appcompat.app.AppCompatDialog;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.RouteInfo;

final class MediaRouteChooserDialog$MediaRouterCallback
  extends MediaRouter.Callback
{
  public MediaRouteChooserDialog$MediaRouterCallback(MediaRouteChooserDialog paramMediaRouteChooserDialog) {}
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoutes();
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoutes();
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.refreshRoutes();
  }
  
  public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.dismiss();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteChooserDialog.MediaRouterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */