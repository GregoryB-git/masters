package androidx.mediarouter.media;

import android.media.MediaRouter;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$GetDefaultRouteWorkaround
{
  private Method mGetSystemAudioRouteMethod;
  
  public MediaRouterJellybean$GetDefaultRouteWorkaround()
  {
    throw new UnsupportedOperationException();
  }
  
  @NonNull
  public Object getDefaultRoute(@NonNull Object paramObject)
  {
    paramObject = (MediaRouter)paramObject;
    Object localObject = mGetSystemAudioRouteMethod;
    if (localObject != null) {}
    try
    {
      localObject = ((Method)localObject).invoke(paramObject, new Object[0]);
      return localObject;
    }
    catch (IllegalAccessException|InvocationTargetException localIllegalAccessException)
    {
      for (;;) {}
    }
    return ((MediaRouter)paramObject).getRouteAt(0);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean.GetDefaultRouteWorkaround
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */