package androidx.mediarouter.media;

import android.media.MediaRouter.RouteInfo;
import android.util.Log;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaRouterJellybeanMr1$RouteInfo
{
  @Nullable
  public static Display getPresentationDisplay(@NonNull Object paramObject)
  {
    try
    {
      paramObject = ((MediaRouter.RouteInfo)paramObject).getPresentationDisplay();
      return (Display)paramObject;
    }
    catch (NoSuchMethodError paramObject)
    {
      Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", (Throwable)paramObject);
    }
    return null;
  }
  
  public static boolean isEnabled(@NonNull Object paramObject)
  {
    return ((MediaRouter.RouteInfo)paramObject).isEnabled();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybeanMr1.RouteInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */