package androidx.mediarouter.media;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

class MediaRoute2ProviderServiceAdapter$DynamicGroupRouteControllerProxy
  extends MediaRouteProvider.DynamicGroupRouteController
{
  public final MediaRouteProvider.RouteController mRouteController;
  private final String mRouteId;
  
  public MediaRoute2ProviderServiceAdapter$DynamicGroupRouteControllerProxy(String paramString, MediaRouteProvider.RouteController paramRouteController)
  {
    mRouteId = paramString;
    mRouteController = paramRouteController;
  }
  
  public String getRouteId()
  {
    return mRouteId;
  }
  
  public void onAddMemberRoute(@NonNull String paramString) {}
  
  public boolean onControlRequest(@NonNull Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    return mRouteController.onControlRequest(paramIntent, paramControlRequestCallback);
  }
  
  public void onRelease()
  {
    mRouteController.onRelease();
  }
  
  public void onRemoveMemberRoute(@NonNull String paramString) {}
  
  public void onSelect()
  {
    mRouteController.onSelect();
  }
  
  public void onSetVolume(int paramInt)
  {
    mRouteController.onSetVolume(paramInt);
  }
  
  public void onUnselect(int paramInt)
  {
    mRouteController.onUnselect(paramInt);
  }
  
  public void onUpdateMemberRoutes(@Nullable List<String> paramList) {}
  
  public void onUpdateVolume(int paramInt)
  {
    mRouteController.onUpdateVolume(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter.DynamicGroupRouteControllerProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */