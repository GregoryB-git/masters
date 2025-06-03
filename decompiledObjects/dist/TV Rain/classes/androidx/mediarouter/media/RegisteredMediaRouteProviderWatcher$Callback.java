package androidx.mediarouter.media;

import androidx.annotation.NonNull;

public abstract interface RegisteredMediaRouteProviderWatcher$Callback
{
  public abstract void addProvider(@NonNull MediaRouteProvider paramMediaRouteProvider);
  
  public abstract void releaseProviderController(@NonNull RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, @NonNull MediaRouteProvider.RouteController paramRouteController);
  
  public abstract void removeProvider(@NonNull MediaRouteProvider paramMediaRouteProvider);
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */