package androidx.mediarouter.app;

import android.util.Log;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.ProviderInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo.DynamicGroupState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class MediaRouteDynamicControllerDialog$MediaRouterCallback
  extends MediaRouter.Callback
{
  public MediaRouteDynamicControllerDialog$MediaRouterCallback(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog) {}
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.updateRoutesView();
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    if ((paramRouteInfo == this$0.mSelectedRoute) && (paramRouteInfo.getDynamicGroupController() != null))
    {
      paramRouteInfo = paramRouteInfo.getProvider().getRoutes().iterator();
      while (paramRouteInfo.hasNext())
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramRouteInfo.next();
        if (!this$0.mSelectedRoute.getMemberRoutes().contains(localRouteInfo))
        {
          paramMediaRouter = this$0.mSelectedRoute.getDynamicGroupState(localRouteInfo);
          if ((paramMediaRouter != null) && (paramMediaRouter.isGroupable()) && (!this$0.mGroupableRoutes.contains(localRouteInfo)))
          {
            i = 1;
            break label120;
          }
        }
      }
    }
    int i = 0;
    label120:
    if (i != 0)
    {
      this$0.updateViewsIfNeeded();
      this$0.updateRoutes();
    }
    else
    {
      this$0.updateRoutesView();
    }
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.updateRoutesView();
  }
  
  public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    paramMediaRouter = this$0;
    mSelectedRoute = paramRouteInfo;
    mIsSelectingRoute = false;
    paramMediaRouter.updateViewsIfNeeded();
    this$0.updateRoutes();
  }
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this$0.updateRoutesView();
  }
  
  public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    int i = paramRouteInfo.getVolume();
    if (MediaRouteDynamicControllerDialog.DEBUG)
    {
      paramMediaRouter = new StringBuilder();
      paramMediaRouter.append("onRouteVolumeChanged(), route.getVolume:");
      paramMediaRouter.append(i);
      Log.d("MediaRouteCtrlDialog", paramMediaRouter.toString());
    }
    paramMediaRouter = this$0;
    if (mRouteForVolumeUpdatingByUser != paramRouteInfo)
    {
      paramMediaRouter = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)mVolumeSliderHolderMap.get(paramRouteInfo.getId());
      if (paramMediaRouter != null) {
        paramMediaRouter.updateVolume();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.MediaRouterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */