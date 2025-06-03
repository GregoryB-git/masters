package androidx.window.layout;

import android.annotation.SuppressLint;
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
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowMetricsCalculatorCompat
  implements WindowMetricsCalculator
{
  @NotNull
  public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
  @NotNull
  private static final String TAG;
  
  static
  {
    String str = WindowMetricsCalculatorCompat.class.getSimpleName();
    Intrinsics.checkNotNullExpressionValue(str, "WindowMetricsCalculatorC…at::class.java.simpleName");
    TAG = str;
  }
  
  @SuppressLint({"BanUncheckedReflection"})
  private final DisplayCutout getCutoutForDisplay(Display paramDisplay)
  {
    try
    {
      Object localObject = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = ((Constructor)localObject).newInstance(new Object[0]);
      Method localMethod = paramDisplay.getClass().getDeclaredMethod("getDisplayInfo", new Class[] { localObject.getClass() });
      localMethod.setAccessible(true);
      localMethod.invoke(paramDisplay, new Object[] { localObject });
      paramDisplay = localObject.getClass().getDeclaredField("displayCutout");
      paramDisplay.setAccessible(true);
      paramDisplay = paramDisplay.get(localObject);
      if (!m.a(paramDisplay)) {
        break label132;
      }
      paramDisplay = n.a(paramDisplay);
    }
    catch (InstantiationException paramDisplay) {}catch (InvocationTargetException paramDisplay) {}catch (IllegalAccessException paramDisplay) {}catch (NoSuchFieldException paramDisplay) {}catch (NoSuchMethodException paramDisplay) {}catch (ClassNotFoundException paramDisplay) {}
    Log.w(TAG, paramDisplay);
    label132:
    paramDisplay = null;
    return paramDisplay;
  }
  
  private final int getNavigationBarHeight(Context paramContext)
  {
    paramContext = paramContext.getResources();
    int i = paramContext.getIdentifier("navigation_bar_height", "dimen", "android");
    if (i > 0) {
      i = paramContext.getDimensionPixelSize(i);
    } else {
      i = 0;
    }
    return i;
  }
  
  private final void getRectSizeFromDisplay(Activity paramActivity, Rect paramRect)
  {
    paramActivity.getWindowManager().getDefaultDisplay().getRectSize(paramRect);
  }
  
  @NotNull
  public WindowMetrics computeCurrentWindowMetrics(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      paramActivity = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(paramActivity);
    } else if (i >= 29) {
      paramActivity = computeWindowBoundsQ$window_release(paramActivity);
    } else if (i >= 28) {
      paramActivity = computeWindowBoundsP$window_release(paramActivity);
    } else if (i >= 24) {
      paramActivity = computeWindowBoundsN$window_release(paramActivity);
    } else {
      paramActivity = computeWindowBoundsIceCreamSandwich$window_release(paramActivity);
    }
    return new WindowMetrics(paramActivity);
  }
  
  @NotNull
  public WindowMetrics computeMaximumWindowMetrics(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    if (Build.VERSION.SDK_INT >= 30)
    {
      paramActivity = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(paramActivity);
    }
    else
    {
      paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
      Intrinsics.checkNotNullExpressionValue(paramActivity, "display");
      paramActivity = getRealSizeForDisplay$window_release(paramActivity);
      paramActivity = new Rect(0, 0, x, y);
    }
    return new WindowMetrics(paramActivity);
  }
  
  @NotNull
  public final Rect computeWindowBoundsIceCreamSandwich$window_release(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Display localDisplay = paramActivity.getWindowManager().getDefaultDisplay();
    Intrinsics.checkNotNullExpressionValue(localDisplay, "defaultDisplay");
    paramActivity = getRealSizeForDisplay$window_release(localDisplay);
    Rect localRect = new Rect();
    int i = x;
    if (i != 0)
    {
      int j = y;
      if (j != 0)
      {
        right = i;
        bottom = j;
        return localRect;
      }
    }
    localDisplay.getRectSize(localRect);
    return localRect;
  }
  
  @NotNull
  public final Rect computeWindowBoundsN$window_release(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Rect localRect = new Rect();
    Object localObject = paramActivity.getWindowManager().getDefaultDisplay();
    ((Display)localObject).getRectSize(localRect);
    if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(paramActivity))
    {
      Intrinsics.checkNotNullExpressionValue(localObject, "defaultDisplay");
      localObject = getRealSizeForDisplay$window_release((Display)localObject);
      int i = getNavigationBarHeight(paramActivity);
      int j = bottom;
      if (j + i == y)
      {
        bottom = (j + i);
      }
      else
      {
        j = right;
        if (j + i == x) {
          right = (j + i);
        }
      }
    }
    return localRect;
  }
  
  @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
  @NotNull
  public final Rect computeWindowBoundsP$window_release(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Rect localRect = new Rect();
    Object localObject1 = paramActivity.getResources().getConfiguration();
    for (;;)
    {
      try
      {
        Object localObject2 = Configuration.class.getDeclaredField("windowConfiguration");
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject2 = ((Field)localObject2).get(localObject1);
        boolean bool = ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(paramActivity);
        if (!bool) {
          break label143;
        }
        localObject2 = localObject2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(localObject2, new Object[0]);
        if (localObject2 != null)
        {
          localObject2 = (Rect)localObject2;
          localRect.set((Rect)localObject2);
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label200;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label200;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label200;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        break label200;
      }
      localObject3 = new java/lang/NullPointerException;
      ((NullPointerException)localObject3).<init>("null cannot be cast to non-null type android.graphics.Rect");
      throw ((Throwable)localObject3);
      label143:
      localObject3 = localObject3.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(localObject3, new Object[0]);
      if (localObject3 == null) {
        break;
      }
      localObject3 = (Rect)localObject3;
    }
    Object localObject3 = new java/lang/NullPointerException;
    ((NullPointerException)localObject3).<init>("null cannot be cast to non-null type android.graphics.Rect");
    throw ((Throwable)localObject3);
    label200:
    Log.w(TAG, (Throwable)localObject3);
    getRectSizeFromDisplay(paramActivity, localRect);
    localObject1 = paramActivity.getWindowManager().getDefaultDisplay();
    localObject3 = new Point();
    Object localObject4 = DisplayCompatHelperApi17.INSTANCE;
    Intrinsics.checkNotNullExpressionValue(localObject1, "currentDisplay");
    ((DisplayCompatHelperApi17)localObject4).getRealSize((Display)localObject1, (Point)localObject3);
    localObject4 = ActivityCompatHelperApi24.INSTANCE;
    int i;
    if (!((ActivityCompatHelperApi24)localObject4).isInMultiWindowMode(paramActivity))
    {
      i = getNavigationBarHeight(paramActivity);
      int j = bottom;
      if (j + i == y)
      {
        bottom = (j + i);
      }
      else
      {
        j = right;
        if (j + i == x) {
          right = (j + i);
        } else if (left == i) {
          left = 0;
        }
      }
    }
    if (((localRect.width() < x) || (localRect.height() < y)) && (!((ActivityCompatHelperApi24)localObject4).isInMultiWindowMode(paramActivity)))
    {
      localObject1 = getCutoutForDisplay((Display)localObject1);
      if (localObject1 != null)
      {
        i = left;
        paramActivity = DisplayCompatHelperApi28.INSTANCE;
        if (i == paramActivity.safeInsetLeft((DisplayCutout)localObject1)) {
          left = 0;
        }
        if (x - right == paramActivity.safeInsetRight((DisplayCutout)localObject1)) {
          right += paramActivity.safeInsetRight((DisplayCutout)localObject1);
        }
        if (top == paramActivity.safeInsetTop((DisplayCutout)localObject1)) {
          top = 0;
        }
        if (y - bottom == paramActivity.safeInsetBottom((DisplayCutout)localObject1)) {
          bottom += paramActivity.safeInsetBottom((DisplayCutout)localObject1);
        }
      }
    }
    return localRect;
  }
  
  @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
  @NotNull
  public final Rect computeWindowBoundsQ$window_release(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Object localObject1 = paramActivity.getResources().getConfiguration();
    try
    {
      Object localObject2 = Configuration.class.getDeclaredField("windowConfiguration");
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject1 = ((Field)localObject2).get(localObject1);
      Method localMethod = localObject1.getClass().getDeclaredMethod("getBounds", new Class[0]);
      localObject2 = new android/graphics/Rect;
      localObject1 = localMethod.invoke(localObject1, new Object[0]);
      if (localObject1 != null)
      {
        ((Rect)localObject2).<init>((Rect)localObject1);
        paramActivity = (Activity)localObject2;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label111;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label111;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label111;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label111;
    }
    NullPointerException localNullPointerException = new java/lang/NullPointerException;
    localNullPointerException.<init>("null cannot be cast to non-null type android.graphics.Rect");
    throw localNullPointerException;
    label111:
    Log.w(TAG, localNullPointerException);
    paramActivity = computeWindowBoundsP$window_release(paramActivity);
    return paramActivity;
  }
  
  @NotNull
  public final Point getRealSizeForDisplay$window_release(@NotNull Display paramDisplay)
  {
    Intrinsics.checkNotNullParameter(paramDisplay, "display");
    Point localPoint = new Point();
    DisplayCompatHelperApi17.INSTANCE.getRealSize(paramDisplay, localPoint);
    return localPoint;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowMetricsCalculatorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */