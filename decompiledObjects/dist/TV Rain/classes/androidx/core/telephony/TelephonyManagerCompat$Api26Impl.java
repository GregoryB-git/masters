package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import p3;

@RequiresApi(26)
class TelephonyManagerCompat$Api26Impl
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

/* Location:
 * Qualified Name:     androidx.core.telephony.TelephonyManagerCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */