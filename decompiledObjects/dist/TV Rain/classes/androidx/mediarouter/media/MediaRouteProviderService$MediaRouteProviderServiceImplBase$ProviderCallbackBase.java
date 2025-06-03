package androidx.mediarouter.media;

import androidx.annotation.NonNull;

class MediaRouteProviderService$MediaRouteProviderServiceImplBase$ProviderCallbackBase
  extends MediaRouteProvider.Callback
{
  public MediaRouteProviderService$MediaRouteProviderServiceImplBase$ProviderCallbackBase(MediaRouteProviderService.MediaRouteProviderServiceImplBase paramMediaRouteProviderServiceImplBase) {}
  
  public void onDescriptorChanged(@NonNull MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    this$0.sendDescriptorChanged(paramMediaRouteProviderDescriptor);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImplBase.ProviderCallbackBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */