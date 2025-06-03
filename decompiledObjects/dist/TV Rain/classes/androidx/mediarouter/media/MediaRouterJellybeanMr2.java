package androidx.mediarouter.media;

import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
final class MediaRouterJellybeanMr2
{
  public static void addCallback(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2)
  {
    ((MediaRouter)paramObject1).addCallback(paramInt1, (MediaRouter.Callback)paramObject2, paramInt2);
  }
  
  public static Object getDefaultRoute(Object paramObject)
  {
    return ((MediaRouter)paramObject).getDefaultRoute();
  }
  
  public static final class RouteInfo
  {
    @Nullable
    public static CharSequence getDescription(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getDescription();
    }
    
    public static boolean isConnecting(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).isConnecting();
    }
  }
  
  public static final class UserRouteInfo
  {
    public static void setDescription(@NonNull Object paramObject, @Nullable CharSequence paramCharSequence)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setDescription(paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybeanMr2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */