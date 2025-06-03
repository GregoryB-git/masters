package androidx.mediarouter.media;

import android.content.Context;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class SystemMediaRouteProvider$Api24Impl
  extends SystemMediaRouteProvider.JellybeanMr2Impl
{
  public SystemMediaRouteProvider$Api24Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    super(paramContext, paramSyncCallback);
  }
  
  public void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
  {
    super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
    paramBuilder.setDeviceType(MediaRouterApi24.RouteInfo.getDeviceType(mRouteObj));
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.SystemMediaRouteProvider.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */