package androidx.mediarouter.media;

import androidx.annotation.NonNull;

final class MediaRouter$GlobalMediaRouter$ProviderCallback
  extends MediaRouteProvider.Callback
{
  public MediaRouter$GlobalMediaRouter$ProviderCallback(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter) {}
  
  public void onDescriptorChanged(@NonNull MediaRouteProvider paramMediaRouteProvider, MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    this$0.updateProviderDescriptor(paramMediaRouteProvider, paramMediaRouteProviderDescriptor);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.ProviderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */