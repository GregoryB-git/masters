package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class BundleCompat
{
  @Nullable
  public static IBinder getBinder(@NonNull Bundle paramBundle, @Nullable String paramString)
  {
    return Api18Impl.getBinder(paramBundle, paramString);
  }
  
  public static void putBinder(@NonNull Bundle paramBundle, @Nullable String paramString, @Nullable IBinder paramIBinder)
  {
    Api18Impl.putBinder(paramBundle, paramString, paramIBinder);
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static IBinder getBinder(Bundle paramBundle, String paramString)
    {
      return paramBundle.getBinder(paramString);
    }
    
    @DoNotInline
    public static void putBinder(Bundle paramBundle, String paramString, IBinder paramIBinder)
    {
      paramBundle.putBinder(paramString, paramIBinder);
    }
  }
  
  @SuppressLint({"BanUncheckedReflection"})
  public static class BeforeApi18Impl
  {
    private static final String TAG = "BundleCompatBaseImpl";
    private static Method sGetIBinderMethod;
    private static boolean sGetIBinderMethodFetched;
    private static Method sPutIBinderMethod;
    private static boolean sPutIBinderMethodFetched;
    
    public static IBinder getBinder(Bundle paramBundle, String paramString)
    {
      if (!sGetIBinderMethodFetched)
      {
        try
        {
          Method localMethod1 = Bundle.class.getMethod("getIBinder", new Class[] { String.class });
          sGetIBinderMethod = localMethod1;
          localMethod1.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", localNoSuchMethodException);
        }
        sGetIBinderMethodFetched = true;
      }
      Method localMethod2 = sGetIBinderMethod;
      if (localMethod2 != null)
      {
        try
        {
          paramBundle = (IBinder)localMethod2.invoke(paramBundle, new Object[] { paramString });
          return paramBundle;
        }
        catch (IllegalArgumentException paramBundle) {}catch (IllegalAccessException paramBundle) {}catch (InvocationTargetException paramBundle) {}
        Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", paramBundle);
        sGetIBinderMethod = null;
      }
      return null;
    }
    
    public static void putBinder(Bundle paramBundle, String paramString, IBinder paramIBinder)
    {
      if (!sPutIBinderMethodFetched)
      {
        try
        {
          Method localMethod1 = Bundle.class.getMethod("putIBinder", new Class[] { String.class, IBinder.class });
          sPutIBinderMethod = localMethod1;
          localMethod1.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", localNoSuchMethodException);
        }
        sPutIBinderMethodFetched = true;
      }
      Method localMethod2 = sPutIBinderMethod;
      if (localMethod2 != null)
      {
        try
        {
          localMethod2.invoke(paramBundle, new Object[] { paramString, paramIBinder });
        }
        catch (IllegalArgumentException paramBundle) {}catch (IllegalAccessException paramBundle) {}catch (InvocationTargetException paramBundle) {}
        Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", paramBundle);
        sPutIBinderMethod = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.BundleCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */