package androidx.mediarouter.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public abstract class MediaRouter$Callback
{
  public void onProviderAdded(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.ProviderInfo paramProviderInfo) {}
  
  public void onProviderChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.ProviderInfo paramProviderInfo) {}
  
  public void onProviderRemoved(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.ProviderInfo paramProviderInfo) {}
  
  public void onRouteAdded(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onRouteChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onRoutePresentationDisplayChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onRouteRemoved(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  @Deprecated
  public void onRouteSelected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onRouteSelected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    onRouteSelected(paramMediaRouter, paramRouteInfo);
  }
  
  public void onRouteSelected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo1, int paramInt, @NonNull MediaRouter.RouteInfo paramRouteInfo2)
  {
    onRouteSelected(paramMediaRouter, paramRouteInfo1, paramInt);
  }
  
  @Deprecated
  public void onRouteUnselected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onRouteUnselected(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    onRouteUnselected(paramMediaRouter, paramRouteInfo);
  }
  
  public void onRouteVolumeChanged(@NonNull MediaRouter paramMediaRouter, @NonNull MediaRouter.RouteInfo paramRouteInfo) {}
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void onRouterParamsChanged(@NonNull MediaRouter paramMediaRouter, @Nullable MediaRouterParams paramMediaRouterParams) {}
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */