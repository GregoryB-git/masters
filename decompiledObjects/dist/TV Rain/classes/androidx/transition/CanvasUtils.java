package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CanvasUtils
{
  private static Method sInorderBarrierMethod;
  private static boolean sOrderMethodsFetched;
  private static Method sReorderBarrierMethod;
  
  @SuppressLint({"SoonBlockedPrivateApi"})
  public static void enableZ(@NonNull Canvas paramCanvas, boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29)
    {
      if (paramBoolean) {
        e.m(paramCanvas);
      } else {
        e.C(paramCanvas);
      }
    }
    else if ((i != 28) && (sOrderMethodsFetched)) {}
    try
    {
      Method localMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
      sReorderBarrierMethod = localMethod;
      localMethod.setAccessible(true);
      localMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
      sInorderBarrierMethod = localMethod;
      localMethod.setAccessible(true);
      sOrderMethodsFetched = true;
      if (paramBoolean) {}
      try
      {
        try
        {
          localMethod = sReorderBarrierMethod;
          if (localMethod != null) {
            localMethod.invoke(paramCanvas, new Object[0]);
          }
        }
        catch (InvocationTargetException paramCanvas)
        {
          break label140;
        }
        if (paramBoolean) {
          break label152;
        }
        localMethod = sInorderBarrierMethod;
        if (localMethod == null) {
          break label152;
        }
        localMethod.invoke(paramCanvas, new Object[0]);
      }
      catch (IllegalAccessException paramCanvas)
      {
        label140:
        label152:
        for (;;) {}
      }
      throw new RuntimeException(paramCanvas.getCause());
      return;
      throw new IllegalStateException("This method doesn't work on Pie!");
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.CanvasUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */