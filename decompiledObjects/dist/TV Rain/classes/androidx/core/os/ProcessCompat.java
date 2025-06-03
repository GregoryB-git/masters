package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

public final class ProcessCompat
{
  public static boolean isApplicationUid(int paramInt)
  {
    return Api24Impl.isApplicationUid(paramInt);
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    private static Method sMethodUserIdIsAppMethod;
    private static boolean sResolved;
    private static final Object sResolvedLock = new Object();
    
    @SuppressLint({"PrivateApi"})
    public static boolean isApplicationUid(int paramInt)
    {
      try
      {
        synchronized (sResolvedLock)
        {
          if (!sResolved)
          {
            sResolved = true;
            sMethodUserIdIsAppMethod = Class.forName("android.os.UserId").getDeclaredMethod("isApp", new Class[] { Integer.TYPE });
          }
          ??? = sMethodUserIdIsAppMethod;
          if (??? != null)
          {
            ??? = (Boolean)((Method)???).invoke(null, new Object[] { Integer.valueOf(paramInt) });
            if (??? != null) {
              return ((Boolean)???).booleanValue();
            }
            ??? = new java/lang/NullPointerException;
            ((NullPointerException)???).<init>();
            throw ((Throwable)???);
          }
        }
        return true;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    private static Method sMethodUserHandleIsAppMethod;
    private static boolean sResolved;
    private static final Object sResolvedLock = new Object();
    
    @SuppressLint({"DiscouragedPrivateApi"})
    public static boolean isApplicationUid(int paramInt)
    {
      try
      {
        synchronized (sResolvedLock)
        {
          if (!sResolved)
          {
            sResolved = true;
            sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", new Class[] { Integer.TYPE });
          }
          Object localObject2 = sMethodUserHandleIsAppMethod;
          if (localObject2 != null)
          {
            localObject2 = (Boolean)((Method)localObject2).invoke(null, new Object[] { Integer.valueOf(paramInt) });
            if (localObject2 != null) {
              return ((Boolean)localObject2).booleanValue();
            }
            localObject2 = new java/lang/NullPointerException;
            ((NullPointerException)localObject2).<init>();
            throw ((Throwable)localObject2);
          }
        }
        return true;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    public static boolean isApplicationUid(int paramInt)
    {
      return Process.isApplicationUid(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ProcessCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */