package w;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a$c
{
  public static boolean a(@NonNull Activity paramActivity)
  {
    return paramActivity.isLaunchedFromBubble();
  }
  
  @SuppressLint({"BanUncheckedReflection"})
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
 * Qualified Name:     w.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */