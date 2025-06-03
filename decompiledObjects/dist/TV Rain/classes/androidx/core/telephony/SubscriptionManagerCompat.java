package androidx.core.telephony;

import android.os.Build.VERSION;
import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3;

@RequiresApi(22)
public class SubscriptionManagerCompat
{
  private static Method sGetSlotIndexMethod;
  
  public static int getSlotIndex(int paramInt)
  {
    if (paramInt == -1) {
      return -1;
    }
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      return Api29Impl.getSlotIndex(paramInt);
    }
    try
    {
      if (sGetSlotIndexMethod == null)
      {
        if (i >= 26) {
          sGetSlotIndexMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", new Class[] { Integer.TYPE });
        } else {
          sGetSlotIndexMethod = SubscriptionManager.class.getDeclaredMethod("getSlotId", new Class[] { Integer.TYPE });
        }
        sGetSlotIndexMethod.setAccessible(true);
      }
      Integer localInteger = (Integer)sGetSlotIndexMethod.invoke(null, new Object[] { Integer.valueOf(paramInt) });
      if (localInteger != null)
      {
        paramInt = localInteger.intValue();
        return paramInt;
      }
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException)
    {
      for (;;) {}
    }
    return -1;
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static int getSlotIndex(int paramInt)
    {
      return o3.b(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.telephony.SubscriptionManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */