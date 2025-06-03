package e0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v4.media.session.b;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import d2.e;
import java.lang.reflect.Method;

public final class j0
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
  
  public static float a(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      Method localMethod = a;
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
  
  public static final class a
  {
    public static float a(ViewConfiguration paramViewConfiguration)
    {
      return com.google.android.gms.internal.base.a.a(paramViewConfiguration);
    }
    
    public static float b(ViewConfiguration paramViewConfiguration)
    {
      return e.a(paramViewConfiguration);
    }
  }
  
  public static final class b
  {
    public static int a(ViewConfiguration paramViewConfiguration)
    {
      return com.google.android.recaptcha.internal.a.d(paramViewConfiguration);
    }
    
    public static boolean b(ViewConfiguration paramViewConfiguration)
    {
      return b.q(paramViewConfiguration);
    }
  }
  
  public static final class c
  {
    public static int a(ViewConfiguration paramViewConfiguration, int paramInt1, int paramInt2, int paramInt3)
    {
      return paramViewConfiguration.getScaledMaximumFlingVelocity(paramInt1, paramInt2, paramInt3);
    }
    
    public static int b(ViewConfiguration paramViewConfiguration, int paramInt1, int paramInt2, int paramInt3)
    {
      return paramViewConfiguration.getScaledMinimumFlingVelocity(paramInt1, paramInt2, paramInt3);
    }
  }
}

/* Location:
 * Qualified Name:     e0.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */