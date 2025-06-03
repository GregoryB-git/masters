package i2;

import a0.e;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import e0.s0.b;
import e0.s0.c;
import e0.s0.d;
import e0.s0.e;
import ec.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m2.b;
import sb.h;

public final class o
  implements n
{
  public static final o b = new o();
  public static final String c = o.class.getSimpleName();
  
  static
  {
    new ArrayList(new h(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(8), Integer.valueOf(16), Integer.valueOf(32), Integer.valueOf(64), Integer.valueOf(128) }, true));
  }
  
  public static l b(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    int i = Build.VERSION.SDK_INT;
    Object localObject1;
    Object localObject2;
    if (i >= 30)
    {
      localObject1 = m2.a.a(paramActivity);
    }
    else
    {
      j = 0;
      Object localObject3;
      Object localObject4;
      if (i >= 29)
      {
        localObject1 = paramActivity.getResources().getConfiguration();
        try
        {
          localObject3 = Configuration.class.getDeclaredField("windowConfiguration");
          ((AccessibleObject)localObject3).setAccessible(true);
          localObject3 = ((Field)localObject3).get(localObject1);
          localObject4 = localObject3.getClass().getDeclaredMethod("getBounds", new Class[0]);
          localObject1 = new android/graphics/Rect;
          localObject3 = ((Method)localObject4).invoke(localObject3, new Object[0]);
          i.c(localObject3, "null cannot be cast to non-null type android.graphics.Rect");
          ((Rect)localObject1).<init>((Rect)localObject3);
        }
        catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}catch (NoSuchFieldException localNoSuchFieldException) {}
        Log.w(c, localNoSuchFieldException);
        localObject2 = c(paramActivity);
      }
      else if (i >= 28)
      {
        localObject2 = c(paramActivity);
      }
      else if (i >= 24)
      {
        localObject3 = new Rect();
        Display localDisplay = paramActivity.getWindowManager().getDefaultDisplay();
        localDisplay.getRectSize((Rect)localObject3);
        localObject2 = localObject3;
        if (!e.j(paramActivity))
        {
          localObject4 = new Point();
          localDisplay.getRealSize((Point)localObject4);
          localObject2 = paramActivity.getResources();
          i = ((Resources)localObject2).getIdentifier("navigation_bar_height", "dimen", "android");
          if (i > 0) {
            j = ((Resources)localObject2).getDimensionPixelSize(i);
          }
          i = bottom + j;
          if (i == y)
          {
            bottom = i;
            localObject2 = localObject3;
          }
          else
          {
            j = right + j;
            localObject2 = localObject3;
            if (j == x)
            {
              right = j;
              localObject2 = localObject3;
            }
          }
        }
      }
      else
      {
        localObject3 = paramActivity.getWindowManager().getDefaultDisplay();
        i.d(localObject3, "defaultDisplay");
        localObject4 = new Point();
        ((Display)localObject3).getRealSize((Point)localObject4);
        localObject2 = new Rect();
        i = x;
        if (i != 0)
        {
          j = y;
          if (j != 0)
          {
            right = i;
            bottom = j;
            break label388;
          }
        }
        ((Display)localObject3).getRectSize((Rect)localObject2);
      }
    }
    label388:
    int j = Build.VERSION.SDK_INT;
    if (j >= 30)
    {
      if (j >= 30) {
        paramActivity = m2.a.a.b(paramActivity);
      } else {
        throw new Exception("Incompatible SDK version");
      }
    }
    else
    {
      if (j >= 30) {
        paramActivity = new s0.d();
      } else if (j >= 29) {
        paramActivity = new s0.c();
      } else {
        paramActivity = new s0.b();
      }
      paramActivity = paramActivity.b();
      i.d(paramActivity, "{\n            WindowInse…ilder().build()\n        }");
    }
    return new l(new f2.a((Rect)localObject2), paramActivity);
  }
  
  public static Rect c(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    Rect localRect = new Rect();
    Object localObject1 = paramActivity.getResources().getConfiguration();
    try
    {
      Object localObject2 = Configuration.class.getDeclaredField("windowConfiguration");
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject2 = ((Field)localObject2).get(localObject1);
      boolean bool = e.j(paramActivity);
      if (bool)
      {
        localObject2 = localObject2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(localObject2, new Object[0]);
        i.c(localObject2, "null cannot be cast to non-null type android.graphics.Rect");
      }
      for (;;)
      {
        localObject2 = (Rect)localObject2;
        break;
        localObject2 = localObject2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(localObject2, new Object[0]);
        i.c(localObject2, "null cannot be cast to non-null type android.graphics.Rect");
      }
      localRect.set((Rect)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}catch (NoSuchFieldException localNoSuchFieldException) {}
    Log.w(c, localNoSuchFieldException);
    d(paramActivity, localRect);
    localObject1 = paramActivity.getWindowManager().getDefaultDisplay();
    Point localPoint = new Point();
    i.d(localObject1, "currentDisplay");
    ((Display)localObject1).getRealSize(localPoint);
    Object localObject3;
    int i;
    if (!e.j(paramActivity))
    {
      localObject3 = paramActivity.getResources();
      i = ((Resources)localObject3).getIdentifier("navigation_bar_height", "dimen", "android");
      if (i > 0) {
        i = ((Resources)localObject3).getDimensionPixelSize(i);
      } else {
        i = 0;
      }
      int j = bottom + i;
      if (j == y)
      {
        bottom = j;
      }
      else
      {
        j = right + i;
        if (j == x) {
          right = j;
        } else if (left == i) {
          left = 0;
        }
      }
    }
    if (((localRect.width() < x) || (localRect.height() < y)) && (!e.j(paramActivity)))
    {
      try
      {
        paramActivity = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
        paramActivity.setAccessible(true);
        paramActivity = paramActivity.newInstance(new Object[0]);
        localObject3 = localObject1.getClass().getDeclaredMethod("getDisplayInfo", new Class[] { paramActivity.getClass() });
        ((AccessibleObject)localObject3).setAccessible(true);
        ((Method)localObject3).invoke(localObject1, new Object[] { paramActivity });
        localObject1 = paramActivity.getClass().getDeclaredField("displayCutout");
        ((AccessibleObject)localObject1).setAccessible(true);
        paramActivity = ((Field)localObject1).get(paramActivity);
        if (!(paramActivity instanceof DisplayCutout)) {
          break label463;
        }
        paramActivity = (DisplayCutout)paramActivity;
      }
      catch (InstantiationException paramActivity) {}catch (InvocationTargetException paramActivity) {}catch (IllegalAccessException paramActivity) {}catch (NoSuchFieldException paramActivity) {}catch (NoSuchMethodException paramActivity) {}catch (ClassNotFoundException paramActivity) {}
      Log.w(c, paramActivity);
      label463:
      paramActivity = null;
      if (paramActivity != null)
      {
        if (left == b.b(paramActivity)) {
          left = 0;
        }
        if (x - right == b.c(paramActivity))
        {
          i = right;
          right = (b.c(paramActivity) + i);
        }
        if (top == b.d(paramActivity)) {
          top = 0;
        }
        if (y - bottom == b.a(paramActivity))
        {
          i = bottom;
          bottom = (b.a(paramActivity) + i);
        }
      }
    }
    return localRect;
  }
  
  public static void d(Activity paramActivity, Rect paramRect)
  {
    paramActivity.getWindowManager().getDefaultDisplay().getRectSize(paramRect);
  }
  
  public final l a(Activity paramActivity)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 30)
    {
      localObject = m2.a.d(paramActivity);
    }
    else
    {
      localObject = paramActivity.getSystemService("window");
      i.c(localObject, "null cannot be cast to non-null type android.view.WindowManager");
      localObject = ((WindowManager)localObject).getDefaultDisplay();
      i.d(localObject, "display");
      Point localPoint = new Point();
      ((Display)localObject).getRealSize(localPoint);
      localObject = new Rect(0, 0, x, y);
    }
    if (i >= 30)
    {
      if (i >= 30) {
        paramActivity = m2.a.a.b(paramActivity);
      } else {
        throw new Exception("Incompatible SDK version");
      }
    }
    else
    {
      if (i >= 30) {
        paramActivity = new s0.d();
      } else if (i >= 29) {
        paramActivity = new s0.c();
      } else {
        paramActivity = new s0.b();
      }
      paramActivity = paramActivity.b();
      i.d(paramActivity, "{\n            WindowInse…ilder().build()\n        }");
    }
    return new l(new f2.a((Rect)localObject), paramActivity);
  }
}

/* Location:
 * Qualified Name:     i2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */