package androidx.mediarouter.media;

import android.content.Context;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class SystemMediaRouteProvider$JellybeanMr2Impl
  extends SystemMediaRouteProvider.JellybeanMr1Impl
{
  public SystemMediaRouteProvider$JellybeanMr2Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    super(paramContext, paramSyncCallback);
  }
  
  public Object getDefaultRoute()
  {
    return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
  }
  
  public boolean isConnecting(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
  {
    return MediaRouterJellybeanMr2.RouteInfo.isConnecting(mRouteObj);
  }
  
  public void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
  {
    super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
    paramSystemRouteRecord = MediaRouterJellybeanMr2.RouteInfo.getDescription(mRouteObj);
    if (paramSystemRouteRecord != null) {
      paramBuilder.setDescription(paramSystemRouteRecord.toString());
    }
  }
  
  public void selectRoute(Object paramObject)
  {
    MediaRouterJellybean.selectRoute(mRouterObj, 8388611, paramObject);
  }
  
  public void updateCallback()
  {
    if (mCallbackRegistered) {
      MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
    }
    mCallbackRegistered = true;
    MediaRouterJellybeanMr2.addCallback(mRouterObj, mRouteTypes, mCallbackObj, mActiveScan | true);
  }
  
  public void updateUserRouteProperties(SystemMediaRouteProvider.JellybeanImpl.UserRouteRecord paramUserRouteRecord)
  {
    super.updateUserRouteProperties(paramUserRouteRecord);
    MediaRouterJellybeanMr2.UserRouteInfo.setDescription(mRouteObj, mRoute.getDescription());
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.SystemMediaRouteProvider.JellybeanMr2Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */