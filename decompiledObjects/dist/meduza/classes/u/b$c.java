package u;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import e0.h0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b$c
{
  public static boolean a(Activity paramActivity)
  {
    return h0.j(paramActivity);
  }
  
  public static boolean b(Activity paramActivity, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramActivity.getApplication().getPackageManager();
      boolean bool = ((Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[] { String.class }).invoke(localPackageManager, new Object[] { paramString })).booleanValue();
      return bool;
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException localNoSuchMethodException) {}
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}

/* Location:
 * Qualified Name:     u.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */