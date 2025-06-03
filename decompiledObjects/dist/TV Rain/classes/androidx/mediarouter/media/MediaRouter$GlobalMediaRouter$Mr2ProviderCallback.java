package androidx.mediarouter.media;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import z2;

final class MediaRouter$GlobalMediaRouter$Mr2ProviderCallback
  extends MediaRoute2Provider.Callback
{
  public MediaRouter$GlobalMediaRouter$Mr2ProviderCallback(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter) {}
  
  public void onReleaseController(@NonNull MediaRouteProvider.RouteController paramRouteController)
  {
    if (paramRouteController == this$0.mSelectedRouteController)
    {
      selectRouteToFallbackRoute(2);
    }
    else if (MediaRouter.DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("A RouteController unrelated to the selected route is released. controller=");
      localStringBuilder.append(paramRouteController);
      Log.d("MediaRouter", localStringBuilder.toString());
    }
  }
  
  public void onSelectFallbackRoute(int paramInt)
  {
    selectRouteToFallbackRoute(paramInt);
  }
  
  public void onSelectRoute(@NonNull String paramString, int paramInt)
  {
    Iterator localIterator = this$0.getRoutes().iterator();
    while (localIterator.hasNext())
    {
      localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
      if ((localRouteInfo.getProviderInstance() == this$0.mMr2Provider) && (TextUtils.equals(paramString, localRouteInfo.getDescriptorId()))) {
        break label69;
      }
    }
    MediaRouter.RouteInfo localRouteInfo = null;
    label69:
    if (localRouteInfo == null)
    {
      z2.A("onSelectRoute: The target RouteInfo is not found for descriptorId=", paramString, "MediaRouter");
      return;
    }
    this$0.selectRouteInternal(localRouteInfo, paramInt);
  }
  
  public void selectRouteToFallbackRoute(int paramInt)
  {
    MediaRouter.RouteInfo localRouteInfo = this$0.chooseFallbackRoute();
    if (this$0.getSelectedRoute() != localRouteInfo) {
      this$0.selectRouteInternal(localRouteInfo, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.Mr2ProviderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */