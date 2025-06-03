package androidx.mediarouter.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

class MediaRouter$GlobalMediaRouter$3
  implements MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener
{
  public MediaRouter$GlobalMediaRouter$3(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter) {}
  
  public void onRoutesChanged(@NonNull MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, @Nullable MediaRouteDescriptor paramMediaRouteDescriptor, @NonNull Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
  {
    Object localObject = this$0;
    if ((paramDynamicGroupRouteController == mRequestedRouteController) && (paramMediaRouteDescriptor != null))
    {
      paramDynamicGroupRouteController = mRequestedRoute.getProvider();
      localObject = paramMediaRouteDescriptor.getId();
      paramDynamicGroupRouteController = new MediaRouter.RouteInfo(paramDynamicGroupRouteController, (String)localObject, this$0.assignRouteUniqueId(paramDynamicGroupRouteController, (String)localObject));
      paramDynamicGroupRouteController.maybeUpdateDescriptor(paramMediaRouteDescriptor);
      paramMediaRouteDescriptor = this$0;
      if (mSelectedRoute == paramDynamicGroupRouteController) {
        return;
      }
      paramMediaRouteDescriptor.notifyTransfer(paramMediaRouteDescriptor, paramDynamicGroupRouteController, mRequestedRouteController, 3, mRequestedRoute, paramCollection);
      paramDynamicGroupRouteController = this$0;
      mRequestedRoute = null;
      mRequestedRouteController = null;
    }
    else if (paramDynamicGroupRouteController == mSelectedRouteController)
    {
      if (paramMediaRouteDescriptor != null) {
        ((MediaRouter.GlobalMediaRouter)localObject).updateRouteDescriptorAndNotify(mSelectedRoute, paramMediaRouteDescriptor);
      }
      this$0.mSelectedRoute.updateDynamicDescriptors(paramCollection);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */