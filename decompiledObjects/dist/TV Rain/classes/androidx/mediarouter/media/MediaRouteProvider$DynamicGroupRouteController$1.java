package androidx.mediarouter.media;

import java.util.Collection;

class MediaRouteProvider$DynamicGroupRouteController$1
  implements Runnable
{
  public MediaRouteProvider$DynamicGroupRouteController$1(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener paramOnDynamicRoutesChangedListener, MediaRouteDescriptor paramMediaRouteDescriptor, Collection paramCollection) {}
  
  public void run()
  {
    val$listener.onRoutesChanged(this$0, val$groupRoute, val$routes);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */