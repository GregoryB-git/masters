package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3;

public final class ResourcesCompat$ThemeCompat
{
  public static void rebase(@NonNull Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Api29Impl.rebase(paramTheme);
    } else {
      Api23Impl.rebase(paramTheme);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    private static Method sRebaseMethod;
    private static boolean sRebaseMethodFetched;
    private static final Object sRebaseMethodLock = new Object();
    
    @SuppressLint({"BanUncheckedReflection"})
    public static void rebase(@NonNull Resources.Theme paramTheme)
    {
      synchronized (sRebaseMethodLock)
      {
        boolean bool = sRebaseMethodFetched;
        if (!bool)
        {
          try
          {
            Method localMethod1 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
            sRebaseMethod = localMethod1;
            localMethod1.setAccessible(true);
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", localNoSuchMethodException);
          }
          sRebaseMethodFetched = true;
        }
        Method localMethod2 = sRebaseMethod;
        if (localMethod2 != null)
        {
          try
          {
            localMethod2.invoke(paramTheme, new Object[0]);
          }
          catch (InvocationTargetException paramTheme) {}catch (IllegalAccessException paramTheme) {}
          Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", paramTheme);
          sRebaseMethod = null;
        }
        return;
      }
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void rebase(@NonNull Resources.Theme paramTheme)
    {
      o3.u(paramTheme);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ThemeCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */