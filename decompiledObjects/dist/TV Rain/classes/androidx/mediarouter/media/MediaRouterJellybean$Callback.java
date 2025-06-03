package androidx.mediarouter.media;

import androidx.annotation.NonNull;

public abstract interface MediaRouterJellybean$Callback
{
  public abstract void onRouteAdded(@NonNull Object paramObject);
  
  public abstract void onRouteChanged(@NonNull Object paramObject);
  
  public abstract void onRouteGrouped(@NonNull Object paramObject1, @NonNull Object paramObject2, int paramInt);
  
  public abstract void onRouteRemoved(@NonNull Object paramObject);
  
  public abstract void onRouteSelected(int paramInt, @NonNull Object paramObject);
  
  public abstract void onRouteUngrouped(@NonNull Object paramObject1, @NonNull Object paramObject2);
  
  public abstract void onRouteUnselected(int paramInt, @NonNull Object paramObject);
  
  public abstract void onRouteVolumeChanged(@NonNull Object paramObject);
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */