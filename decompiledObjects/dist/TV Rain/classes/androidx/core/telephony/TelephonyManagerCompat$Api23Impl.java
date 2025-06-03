package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

@RequiresApi(23)
class TelephonyManagerCompat$Api23Impl
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

/* Location:
 * Qualified Name:     androidx.core.telephony.TelephonyManagerCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */