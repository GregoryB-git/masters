package androidx.mediarouter.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaRouterJellybean$RouteInfo
{
  @Nullable
  public static Object getCategory(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getCategory();
  }
  
  @Nullable
  public static Object getGroup(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getGroup();
  }
  
  @Nullable
  public static Drawable getIconDrawable(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getIconDrawable();
  }
  
  @NonNull
  public static CharSequence getName(@NonNull Object paramObject, @NonNull Context paramContext)
  {
    return ((MediaRouter.RouteInfo)paramObject).getName(paramContext);
  }
  
  public static int getPlaybackStream(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getPlaybackStream();
  }
  
  public static int getPlaybackType(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getPlaybackType();
  }
  
  @NonNull
  public static CharSequence getStatus(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getStatus();
  }
  
  public static int getSupportedTypes(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getSupportedTypes();
  }
  
  @Nullable
  public static Object getTag(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getTag();
  }
  
  public static int getVolume(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getVolume();
  }
  
  public static int getVolumeHandling(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getVolumeHandling();
  }
  
  public static int getVolumeMax(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).getVolumeMax();
  }
  
  public static boolean isGroup(@NonNull Object paramObject)
  {
    return paramObject instanceof MediaRouter.RouteGroup;
  }
  
  public static void requestSetVolume(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.RouteInfo)paramObject).requestSetVolume(paramInt);
  }
  
  public static void requestUpdateVolume(@NonNull Object paramObject, int paramInt)
  {
    ((MediaRouter.RouteInfo)paramObject).requestUpdateVolume(paramInt);
  }
  
  public static void setTag(@NonNull Object paramObject1, @Nullable Object paramObject2)
  {
    ((MediaRouter.RouteInfo)paramObject1).setTag(paramObject2);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.RouteInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */