package I;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public abstract class u
{
  public static Method a;
  
  static
  {
    if (Build.VERSION.SDK_INT == 25) {
      try
      {
        a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
      }
      catch (Exception localException)
      {
        Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
      }
    }
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a.a(paramViewConfiguration);
    }
    return paramViewConfiguration.getScaledTouchSlop() / 2;
  }
  
  public static boolean b(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a.b(paramViewConfiguration);
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
  
  public static abstract class a
  {
    public static int a(ViewConfiguration paramViewConfiguration)
    {
      return paramViewConfiguration.getScaledHoverSlop();
    }
    
    public static boolean b(ViewConfiguration paramViewConfiguration)
    {
      return paramViewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
  }
}

/* Location:
 * Qualified Name:     I.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */