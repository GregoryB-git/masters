package androidx.mediarouter.media;

import android.graphics.drawable.Drawable;
import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;
import android.media.RemoteControlClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaRouterJellybean$UserRouteInfo
{
  public static void setIconDrawable(@NonNull Object paramObject, @Nullable Drawable paramDrawable)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setIconDrawable(paramDrawable);
  }
  
  public static void setName(@NonNull Object paramObject, @NonNull CharSequence paramCharSequence)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setName(paramCharSequence);
  }
  
  public static void setPlaybackStream(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setPlaybackStream(paramInt);
  }
  
  public static void setPlaybackType(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setPlaybackType(paramInt);
  }
  
  public static void setRemoteControlClient(@NonNull Object paramObject1, @Nullable Object paramObject2)
  {
    ((MediaRouter.UserRouteInfo)paramObject1).setRemoteControlClient((RemoteControlClient)paramObject2);
  }
  
  public static void setStatus(@NonNull Object paramObject, @NonNull CharSequence paramCharSequence)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setStatus(paramCharSequence);
  }
  
  public static void setVolume(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setVolume(paramInt);
  }
  
  public static void setVolumeCallback(@NonNull Object paramObject1, @NonNull Object paramObject2)
  {
    ((MediaRouter.UserRouteInfo)paramObject1).setVolumeCallback((MediaRouter.VolumeCallback)paramObject2);
  }
  
  public static void setVolumeHandling(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setVolumeHandling(paramInt);
  }
  
  public static void setVolumeMax(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.UserRouteInfo)paramObject).setVolumeMax(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.UserRouteInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */