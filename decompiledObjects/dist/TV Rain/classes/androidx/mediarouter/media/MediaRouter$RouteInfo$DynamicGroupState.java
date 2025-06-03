package androidx.mediarouter.media;

import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class MediaRouter$RouteInfo$DynamicGroupState
{
  public final MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor mDynamicDescriptor;
  
  public MediaRouter$RouteInfo$DynamicGroupState(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
  {
    mDynamicDescriptor = paramDynamicRouteDescriptor;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int getSelectionState()
  {
    MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
    int i;
    if (localDynamicRouteDescriptor != null) {
      i = localDynamicRouteDescriptor.getSelectionState();
    } else {
      i = 1;
    }
    return i;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean isGroupable()
  {
    MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
    boolean bool;
    if ((localDynamicRouteDescriptor != null) && (localDynamicRouteDescriptor.isGroupable())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean isTransferable()
  {
    MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
    boolean bool;
    if ((localDynamicRouteDescriptor != null) && (localDynamicRouteDescriptor.isTransferable())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean isUnselectable()
  {
    MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor localDynamicRouteDescriptor = mDynamicDescriptor;
    boolean bool;
    if ((localDynamicRouteDescriptor != null) && (!localDynamicRouteDescriptor.isUnselectable())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.RouteInfo.DynamicGroupState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */