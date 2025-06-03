package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import l4;
import m5;

public final class WindowCompat
{
  public static final int FEATURE_ACTION_BAR = 8;
  public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
  public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
  
  @NonNull
  public static WindowInsetsControllerCompat getInsetsController(@NonNull Window paramWindow, @NonNull View paramView)
  {
    return new WindowInsetsControllerCompat(paramWindow, paramView);
  }
  
  @NonNull
  public static <T extends View> T requireViewById(@NonNull Window paramWindow, @IdRes int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return (View)Api28Impl.requireViewById(paramWindow, paramInt);
    }
    paramWindow = paramWindow.findViewById(paramInt);
    if (paramWindow != null) {
      return paramWindow;
    }
    throw new IllegalArgumentException("ID does not reference a View inside this Window");
  }
  
  public static void setDecorFitsSystemWindows(@NonNull Window paramWindow, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      Api30Impl.setDecorFitsSystemWindows(paramWindow, paramBoolean);
    } else {
      Api16Impl.setDecorFitsSystemWindows(paramWindow, paramBoolean);
    }
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static void setDecorFitsSystemWindows(@NonNull Window paramWindow, boolean paramBoolean)
    {
      paramWindow = paramWindow.getDecorView();
      int i = paramWindow.getSystemUiVisibility();
      if (paramBoolean) {
        i &= 0xF8FF;
      } else {
        i |= 0x700;
      }
      paramWindow.setSystemUiVisibility(i);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static <T> T requireViewById(Window paramWindow, int paramInt)
    {
      return m5.f(paramWindow, paramInt);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static void setDecorFitsSystemWindows(@NonNull Window paramWindow, boolean paramBoolean)
    {
      l4.l(paramWindow, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */