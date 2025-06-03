package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3;
import o5;

class ViewGroupUtils
{
  private static Method sGetChildDrawingOrderMethod;
  private static boolean sGetChildDrawingOrderMethodFetched = false;
  private static boolean sTryHiddenSuppressLayout = true;
  
  public static int getChildDrawingOrder(@NonNull ViewGroup paramViewGroup, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return o3.c(paramViewGroup, paramInt);
    }
    if (!sGetChildDrawingOrderMethodFetched) {}
    try
    {
      Object localObject = Integer.TYPE;
      localObject = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", new Class[] { localObject, localObject });
      sGetChildDrawingOrderMethod = (Method)localObject;
      ((AccessibleObject)localObject).setAccessible(true);
      sGetChildDrawingOrderMethodFetched = true;
      localObject = sGetChildDrawingOrderMethod;
      if (localObject != null) {}
      try
      {
        int i = ((Integer)((Method)localObject).invoke(paramViewGroup, new Object[] { Integer.valueOf(paramViewGroup.getChildCount()), Integer.valueOf(paramInt) })).intValue();
        return i;
      }
      catch (IllegalAccessException|InvocationTargetException paramViewGroup)
      {
        for (;;) {}
      }
      return paramInt;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public static ViewGroupOverlayImpl getOverlay(@NonNull ViewGroup paramViewGroup)
  {
    return new ViewGroupOverlayApi18(paramViewGroup);
  }
  
  @SuppressLint({"NewApi"})
  @RequiresApi(18)
  private static void hiddenSuppressLayout(@NonNull ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (sTryHiddenSuppressLayout) {
      try
      {
        o5.i(paramViewGroup, paramBoolean);
      }
      catch (NoSuchMethodError paramViewGroup)
      {
        sTryHiddenSuppressLayout = false;
      }
    }
  }
  
  public static void suppressLayout(@NonNull ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      o5.i(paramViewGroup, paramBoolean);
    } else {
      hiddenSuppressLayout(paramViewGroup, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewGroupUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */