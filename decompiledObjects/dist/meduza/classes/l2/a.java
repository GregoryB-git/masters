package l2;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ec.i;
import f2.g;
import f2.g.a;
import f2.h;
import i2.b.b;
import i2.c.a;
import i2.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.s;

public final class a
{
  public final int a = 3;
  
  public a(int paramInt) {}
  
  public static boolean a(SidecarDeviceState paramSidecarDeviceState1, SidecarDeviceState paramSidecarDeviceState2)
  {
    boolean bool1 = i.a(paramSidecarDeviceState1, paramSidecarDeviceState2);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if (paramSidecarDeviceState1 == null) {
      return false;
    }
    if (paramSidecarDeviceState2 == null) {
      return false;
    }
    if (a.b(paramSidecarDeviceState1) != a.b(paramSidecarDeviceState2)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public static boolean b(SidecarDisplayFeature paramSidecarDisplayFeature1, SidecarDisplayFeature paramSidecarDisplayFeature2)
  {
    if (i.a(paramSidecarDisplayFeature1, paramSidecarDisplayFeature2)) {
      return true;
    }
    if (paramSidecarDisplayFeature1 == null) {
      return false;
    }
    if (paramSidecarDisplayFeature2 == null) {
      return false;
    }
    if (paramSidecarDisplayFeature1.getType() != paramSidecarDisplayFeature2.getType()) {
      return false;
    }
    return i.a(paramSidecarDisplayFeature1.getRect(), paramSidecarDisplayFeature2.getRect());
  }
  
  public static boolean c(List paramList1, List paramList2)
  {
    if (paramList1 == paramList2) {
      return true;
    }
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    int i = paramList1.size();
    for (int j = 0; j < i; j++) {
      if (!b((SidecarDisplayFeature)paramList1.get(j), (SidecarDisplayFeature)paramList2.get(j))) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean d(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo1, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo2)
  {
    if (i.a(paramSidecarWindowLayoutInfo1, paramSidecarWindowLayoutInfo2)) {
      return true;
    }
    if (paramSidecarWindowLayoutInfo1 == null) {
      return false;
    }
    if (paramSidecarWindowLayoutInfo2 == null) {
      return false;
    }
    return c(a.c(paramSidecarWindowLayoutInfo1), a.c(paramSidecarWindowLayoutInfo2));
  }
  
  public final k e(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo, SidecarDeviceState paramSidecarDeviceState)
  {
    i.e(paramSidecarDeviceState, "state");
    if (paramSidecarWindowLayoutInfo == null) {
      return new k(s.a);
    }
    SidecarDeviceState localSidecarDeviceState = new SidecarDeviceState();
    a.d(localSidecarDeviceState, a.b(paramSidecarDeviceState));
    return new k(f(a.c(paramSidecarWindowLayoutInfo), localSidecarDeviceState));
  }
  
  public final ArrayList f(List paramList, SidecarDeviceState paramSidecarDeviceState)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      i2.c localc = g((SidecarDisplayFeature)paramList.next(), paramSidecarDeviceState);
      if (localc != null) {
        localArrayList.add(localc);
      }
    }
    return localArrayList;
  }
  
  public final i2.c g(SidecarDisplayFeature paramSidecarDisplayFeature, SidecarDeviceState paramSidecarDeviceState)
  {
    i.e(paramSidecarDisplayFeature, "feature");
    Object localObject1 = (SidecarDisplayFeature)g.a.a(paramSidecarDisplayFeature, a).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.a).c("Feature bounds must not be 0", c.a).c("TYPE_FOLD must have 0 area", d.a).c("Feature be pinned to either left or top", e.a).a();
    Object localObject2 = null;
    if (localObject1 == null) {
      return null;
    }
    int i = ((SidecarDisplayFeature)localObject1).getType();
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      localObject1 = c.a.c;
    }
    else
    {
      localObject1 = c.a.b;
    }
    i = a.b(paramSidecarDeviceState);
    paramSidecarDeviceState = (SidecarDeviceState)localObject2;
    if (i != 0)
    {
      paramSidecarDeviceState = (SidecarDeviceState)localObject2;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            paramSidecarDeviceState = (SidecarDeviceState)localObject2;
            if (i == 4) {
              return paramSidecarDeviceState;
            }
          }
          paramSidecarDeviceState = b.b.b;
        }
        else
        {
          paramSidecarDeviceState = b.b.c;
        }
        paramSidecarDisplayFeature = paramSidecarDisplayFeature.getRect();
        i.d(paramSidecarDisplayFeature, "feature.rect");
        paramSidecarDeviceState = new i2.c(new f2.a(paramSidecarDisplayFeature), (c.a)localObject1, paramSidecarDeviceState);
      }
    }
    return paramSidecarDeviceState;
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     l2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */