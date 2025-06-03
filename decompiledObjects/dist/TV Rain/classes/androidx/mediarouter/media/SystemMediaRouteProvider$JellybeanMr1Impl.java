package androidx.mediarouter.media;

import android.content.Context;
import android.view.Display;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(17)
class SystemMediaRouteProvider$JellybeanMr1Impl
  extends SystemMediaRouteProvider.JellybeanImpl
  implements MediaRouterJellybeanMr1.Callback
{
  private MediaRouterJellybeanMr1.ActiveScanWorkaround mActiveScanWorkaround;
  private MediaRouterJellybeanMr1.IsConnectingWorkaround mIsConnectingWorkaround;
  
  public SystemMediaRouteProvider$JellybeanMr1Impl(Context paramContext, SystemMediaRouteProvider.SyncCallback paramSyncCallback)
  {
    super(paramContext, paramSyncCallback);
  }
  
  public Object createCallbackObj()
  {
    return MediaRouterJellybeanMr1.createCallback(this);
  }
  
  public boolean isConnecting(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord)
  {
    if (mIsConnectingWorkaround == null) {
      mIsConnectingWorkaround = new MediaRouterJellybeanMr1.IsConnectingWorkaround();
    }
    return mIsConnectingWorkaround.isConnecting(mRouteObj);
  }
  
  public void onBuildSystemRouteDescriptor(SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord paramSystemRouteRecord, MediaRouteDescriptor.Builder paramBuilder)
  {
    super.onBuildSystemRouteDescriptor(paramSystemRouteRecord, paramBuilder);
    if (!MediaRouterJellybeanMr1.RouteInfo.isEnabled(mRouteObj)) {
      paramBuilder.setEnabled(false);
    }
    if (isConnecting(paramSystemRouteRecord)) {
      paramBuilder.setConnectionState(1);
    }
    paramSystemRouteRecord = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(mRouteObj);
    if (paramSystemRouteRecord != null) {
      paramBuilder.setPresentationDisplayId(paramSystemRouteRecord.getDisplayId());
    }
  }
  
  public void onRoutePresentationDisplayChanged(Object paramObject)
  {
    int i = findSystemRouteRecord(paramObject);
    if (i >= 0)
    {
      SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord localSystemRouteRecord = (SystemMediaRouteProvider.JellybeanImpl.SystemRouteRecord)mSystemRouteRecords.get(i);
      paramObject = MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(paramObject);
      if (paramObject != null) {
        i = ((Display)paramObject).getDisplayId();
      } else {
        i = -1;
      }
      if (i != mRouteDescriptor.getPresentationDisplayId())
      {
        mRouteDescriptor = new MediaRouteDescriptor.Builder(mRouteDescriptor).setPresentationDisplayId(i).build();
        publishRoutes();
      }
    }
  }
  
  public void updateCallback()
  {
    super.updateCallback();
    if (mActiveScanWorkaround == null) {
      mActiveScanWorkaround = new MediaRouterJellybeanMr1.ActiveScanWorkaround(getContext(), getHandler());
    }
    MediaRouterJellybeanMr1.ActiveScanWorkaround localActiveScanWorkaround = mActiveScanWorkaround;
    int i;
    if (mActiveScan) {
      i = mRouteTypes;
    } else {
      i = 0;
    }
    localActiveScanWorkaround.setActiveScanRouteTypes(i);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.SystemMediaRouteProvider.JellybeanMr1Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */