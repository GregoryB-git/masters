package androidx.mediarouter.media;

import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$SelectRouteWorkaround
{
  private Method mSelectRouteIntMethod;
  
  public MediaRouterJellybean$SelectRouteWorkaround()
  {
    throw new UnsupportedOperationException();
  }
  
  public void selectRoute(@NonNull Object paramObject1, int paramInt, @NonNull Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.RouteInfo)paramObject2;
    if ((((MediaRouter.RouteInfo)paramObject2).getSupportedTypes() & 0x800000) == 0)
    {
      Method localMethod = mSelectRouteIntMethod;
      if (localMethod != null) {
        try
        {
          localMethod.invoke(paramObject1, new Object[] { Integer.valueOf(paramInt), paramObject2 });
          return;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", localInvocationTargetException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", localIllegalAccessException);
        }
      } else {
        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
      }
    }
    ((MediaRouter)paramObject1).selectRoute(paramInt, (MediaRouter.RouteInfo)paramObject2);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.SelectRouteWorkaround
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */