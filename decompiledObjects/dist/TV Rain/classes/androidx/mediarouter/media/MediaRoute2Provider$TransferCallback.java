package androidx.mediarouter.media;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2.RoutingController;
import android.media.MediaRouter2.TransferCallback;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

class MediaRoute2Provider$TransferCallback
  extends MediaRouter2.TransferCallback
{
  public MediaRoute2Provider$TransferCallback(MediaRoute2Provider paramMediaRoute2Provider) {}
  
  public void onStop(@NonNull MediaRouter2.RoutingController paramRoutingController)
  {
    Object localObject = (MediaRouteProvider.RouteController)this$0.mControllerMap.remove(paramRoutingController);
    if (localObject != null)
    {
      this$0.mCallback.onReleaseController((MediaRouteProvider.RouteController)localObject);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("onStop: No matching routeController found. routingController=");
      ((StringBuilder)localObject).append(paramRoutingController);
      Log.w("MR2Provider", ((StringBuilder)localObject).toString());
    }
  }
  
  public void onTransfer(@NonNull MediaRouter2.RoutingController paramRoutingController1, @NonNull MediaRouter2.RoutingController paramRoutingController2)
  {
    this$0.mControllerMap.remove(paramRoutingController1);
    if (paramRoutingController2 == this$0.mMediaRouter2.getSystemController())
    {
      this$0.mCallback.onSelectFallbackRoute(3);
    }
    else
    {
      paramRoutingController1 = paramRoutingController2.getSelectedRoutes();
      if (paramRoutingController1.isEmpty())
      {
        Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
        return;
      }
      paramRoutingController1 = ((MediaRoute2Info)paramRoutingController1.get(0)).getId();
      MediaRoute2Provider.GroupRouteController localGroupRouteController = new MediaRoute2Provider.GroupRouteController(this$0, paramRoutingController2, paramRoutingController1);
      this$0.mControllerMap.put(paramRoutingController2, localGroupRouteController);
      this$0.mCallback.onSelectRoute(paramRoutingController1, 3);
      this$0.setDynamicRouteDescriptors(paramRoutingController2);
    }
  }
  
  public void onTransferFailure(@NonNull MediaRoute2Info paramMediaRoute2Info)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Transfer failed. requestedRoute=");
    localStringBuilder.append(paramMediaRoute2Info);
    Log.w("MR2Provider", localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.TransferCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */