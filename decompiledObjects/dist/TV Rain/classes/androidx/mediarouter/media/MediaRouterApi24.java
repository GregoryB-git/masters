package androidx.mediarouter.media;

import android.media.MediaRouter.RouteInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
final class MediaRouterApi24
{
  public static final class RouteInfo
  {
    public static int getDeviceType(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getDeviceType();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterApi24
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */