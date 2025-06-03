package androidx.core.telephony;

import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import l4;

@RequiresApi(30)
class TelephonyManagerCompat$Api30Impl
{
  @DoNotInline
  public static int getSubscriptionId(TelephonyManager paramTelephonyManager)
  {
    return l4.a(paramTelephonyManager);
  }
}

/* Location:
 * Qualified Name:     androidx.core.telephony.TelephonyManagerCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */