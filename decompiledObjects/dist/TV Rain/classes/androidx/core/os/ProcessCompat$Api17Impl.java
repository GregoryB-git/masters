package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi(17)
class ProcessCompat$Api17Impl
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

/* Location:
 * Qualified Name:     androidx.core.os.ProcessCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */