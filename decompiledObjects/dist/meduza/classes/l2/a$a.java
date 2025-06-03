package l2;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ec.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import sb.s;

public final class a$a
{
  public static int a(SidecarDeviceState paramSidecarDeviceState)
  {
    i.e(paramSidecarDeviceState, "sidecarDeviceState");
    try
    {
      i = posture;
      return i;
    }
    catch (NoSuchFieldError localNoSuchFieldError)
    {
      try
      {
        paramSidecarDeviceState = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(paramSidecarDeviceState, new Object[0]);
        i.c(paramSidecarDeviceState, "null cannot be cast to non-null type kotlin.Int");
        int i = ((Integer)paramSidecarDeviceState).intValue();
        return i;
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarDeviceState) {}
    }
    return 0;
  }
  
  public static int b(SidecarDeviceState paramSidecarDeviceState)
  {
    i.e(paramSidecarDeviceState, "sidecarDeviceState");
    int i = a(paramSidecarDeviceState);
    int j;
    if (i >= 0)
    {
      j = i;
      if (i <= 4) {}
    }
    else
    {
      j = 0;
    }
    return j;
  }
  
  public static List c(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    i.e(paramSidecarWindowLayoutInfo, "info");
    try
    {
      List localList = displayFeatures;
      Object localObject = localList;
      if (localList == null) {
        localObject = s.a;
      }
      return (List)localObject;
    }
    catch (NoSuchFieldError localNoSuchFieldError)
    {
      try
      {
        paramSidecarWindowLayoutInfo = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(paramSidecarWindowLayoutInfo, new Object[0]);
        i.c(paramSidecarWindowLayoutInfo, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
        paramSidecarWindowLayoutInfo = (List)paramSidecarWindowLayoutInfo;
        return paramSidecarWindowLayoutInfo;
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarWindowLayoutInfo) {}
    }
    return s.a;
  }
  
  public static void d(SidecarDeviceState paramSidecarDeviceState, int paramInt)
  {
    try
    {
      posture = paramInt;
    }
    catch (NoSuchFieldError localNoSuchFieldError) {}
    try
    {
      SidecarDeviceState.class.getMethod("setPosture", new Class[] { Integer.TYPE }).invoke(paramSidecarDeviceState, new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarDeviceState)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     l2.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */