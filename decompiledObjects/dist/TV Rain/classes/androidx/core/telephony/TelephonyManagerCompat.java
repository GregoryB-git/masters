package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l4;
import p3;

public class TelephonyManagerCompat
{
  private static Method sGetDeviceIdMethod;
  private static Method sGetSubIdMethod;
  
  @SuppressLint({"MissingPermission"})
  @Nullable
  @RequiresPermission("android.permission.READ_PHONE_STATE")
  public static String getImei(@NonNull TelephonyManager paramTelephonyManager)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getImei(paramTelephonyManager);
    }
    int i = getSubscriptionId(paramTelephonyManager);
    if ((i != Integer.MAX_VALUE) && (i != -1)) {
      return Api23Impl.getDeviceId(paramTelephonyManager, SubscriptionManagerCompat.getSlotIndex(i));
    }
    return paramTelephonyManager.getDeviceId();
  }
  
  @SuppressLint({"SoonBlockedPrivateApi"})
  public static int getSubscriptionId(@NonNull TelephonyManager paramTelephonyManager)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getSubscriptionId(paramTelephonyManager);
    }
    try
    {
      if (sGetSubIdMethod == null)
      {
        Method localMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
        sGetSubIdMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramTelephonyManager = (Integer)sGetSubIdMethod.invoke(paramTelephonyManager, new Object[0]);
      if ((paramTelephonyManager != null) && (paramTelephonyManager.intValue() != -1))
      {
        int i = paramTelephonyManager.intValue();
        return i;
      }
    }
    catch (InvocationTargetException|IllegalAccessException|NoSuchMethodException paramTelephonyManager)
    {
      for (;;) {}
    }
    return Integer.MAX_VALUE;
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @SuppressLint({"MissingPermission"})
    @DoNotInline
    @Nullable
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getDeviceId(TelephonyManager paramTelephonyManager, int paramInt)
    {
      return paramTelephonyManager.getDeviceId(paramInt);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @SuppressLint({"MissingPermission"})
    @DoNotInline
    @Nullable
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getImei(TelephonyManager paramTelephonyManager)
    {
      return p3.g(paramTelephonyManager);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static int getSubscriptionId(TelephonyManager paramTelephonyManager)
    {
      return l4.a(paramTelephonyManager);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.telephony.TelephonyManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */