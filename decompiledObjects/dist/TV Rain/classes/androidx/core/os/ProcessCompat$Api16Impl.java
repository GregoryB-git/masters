package androidx.core.os;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi(16)
class ProcessCompat$Api16Impl
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

/* Location:
 * Qualified Name:     androidx.core.os.ProcessCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */