package androidx.mediarouter.media;

import android.media.MediaRouter.RouteInfo;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybeanMr1$IsConnectingWorkaround
{
  private Method mGetStatusCodeMethod;
  private int mStatusConnecting;
  
  public MediaRouterJellybeanMr1$IsConnectingWorkaround()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean isConnecting(@NonNull Object paramObject)
  {
    paramObject = (MediaRouter.RouteInfo)paramObject;
    Method localMethod = mGetStatusCodeMethod;
    bool1 = false;
    bool2 = bool1;
    if (localMethod != null) {}
    try
    {
      int i = ((Integer)localMethod.invoke(paramObject, new Object[0])).intValue();
      int j = mStatusConnecting;
      bool2 = bool1;
      if (i == j) {
        bool2 = true;
      }
    }
    catch (IllegalAccessException|InvocationTargetException paramObject)
    {
      for (;;)
      {
        bool2 = bool1;
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybeanMr1.IsConnectingWorkaround
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */