package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import l5;
import m5;

public final class ViewConfigurationCompat
{
  private static final String TAG = "ViewConfigCompat";
  private static Method sGetScaledScrollFactorMethod;
  
  static
  {
    if (Build.VERSION.SDK_INT == 25) {
      try
      {
        sGetScaledScrollFactorMethod = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
      }
      catch (Exception localException)
      {
        Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
      }
    }
  }
  
  private static float getLegacyScrollFactor(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      Method localMethod = sGetScaledScrollFactorMethod;
      if (localMethod != null) {
        try
        {
          int i = ((Integer)localMethod.invoke(paramViewConfiguration, new Object[0])).intValue();
          return i;
        }
        catch (Exception paramViewConfiguration)
        {
          Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
        }
      }
    }
    paramViewConfiguration = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(16842829, paramViewConfiguration, true)) {
      return paramViewConfiguration.getDimension(paramContext.getResources().getDisplayMetrics());
    }
    return 0.0F;
  }
  
  public static float getScaledHorizontalScrollFactor(@NonNull ViewConfiguration paramViewConfiguration, @NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getScaledHorizontalScrollFactor(paramViewConfiguration);
    }
    return getLegacyScrollFactor(paramViewConfiguration, paramContext);
  }
  
  public static int getScaledHoverSlop(@NonNull ViewConfiguration paramViewConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getScaledHoverSlop(paramViewConfiguration);
    }
    return paramViewConfiguration.getScaledTouchSlop() / 2;
  }
  
  @Deprecated
  public static int getScaledPagingTouchSlop(ViewConfiguration paramViewConfiguration)
  {
    return paramViewConfiguration.getScaledPagingTouchSlop();
  }
  
  public static float getScaledVerticalScrollFactor(@NonNull ViewConfiguration paramViewConfiguration, @NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getScaledVerticalScrollFactor(paramViewConfiguration);
    }
    return getLegacyScrollFactor(paramViewConfiguration, paramContext);
  }
  
  @Deprecated
  public static boolean hasPermanentMenuKey(ViewConfiguration paramViewConfiguration)
  {
    return paramViewConfiguration.hasPermanentMenuKey();
  }
  
  public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@NonNull ViewConfiguration paramViewConfiguration, @NonNull Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(paramViewConfiguration);
    }
    paramViewConfiguration = paramContext.getResources();
    int i = paramViewConfiguration.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
    boolean bool;
    if ((i != 0) && (paramViewConfiguration.getBoolean(i))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static float getScaledHorizontalScrollFactor(ViewConfiguration paramViewConfiguration)
    {
      return l5.j(paramViewConfiguration);
    }
    
    @DoNotInline
    public static float getScaledVerticalScrollFactor(ViewConfiguration paramViewConfiguration)
    {
      return l5.a(paramViewConfiguration);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static int getScaledHoverSlop(ViewConfiguration paramViewConfiguration)
    {
      return m5.c(paramViewConfiguration);
    }
    
    @DoNotInline
    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration paramViewConfiguration)
    {
      return m5.n(paramViewConfiguration);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewConfigurationCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */