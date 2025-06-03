package androidx.mediarouter.media;

import android.media.MediaRouter2.ControllerCallback;
import android.media.MediaRouter2.RoutingController;
import androidx.annotation.NonNull;

class MediaRoute2Provider$ControllerCallback
  extends MediaRouter2.ControllerCallback
{
  public MediaRoute2Provider$ControllerCallback(MediaRoute2Provider paramMediaRoute2Provider) {}
  
  public void onControllerUpdated(@NonNull MediaRouter2.RoutingController paramRoutingController)
  {
    this$0.setDynamicRouteDescriptors(paramRoutingController);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.ControllerCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */