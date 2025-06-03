package androidx.mediarouter.media;

import androidx.annotation.NonNull;
import java.util.Collection;

class MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord$1
  implements MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener
{
  public MediaRouteProviderService$MediaRouteProviderServiceImplBase$ClientRecord$1(MediaRouteProviderService.MediaRouteProviderServiceImplBase.ClientRecord paramClientRecord) {}
  
  public void onRoutesChanged(@NonNull MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, @NonNull MediaRouteDescriptor paramMediaRouteDescriptor, @NonNull Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
  {
    this$1.sendDynamicRouteDescriptors(paramDynamicGroupRouteController, paramMediaRouteDescriptor, paramCollection);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImplBase.ClientRecord.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */