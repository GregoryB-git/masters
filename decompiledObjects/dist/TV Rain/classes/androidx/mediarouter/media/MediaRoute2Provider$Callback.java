package androidx.mediarouter.media;

import androidx.annotation.NonNull;

abstract class MediaRoute2Provider$Callback
{
  public abstract void onReleaseController(@NonNull MediaRouteProvider.RouteController paramRouteController);
  
  public abstract void onSelectFallbackRoute(int paramInt);
  
  public abstract void onSelectRoute(@NonNull String paramString, int paramInt);
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */