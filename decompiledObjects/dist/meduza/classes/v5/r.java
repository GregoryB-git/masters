package v5;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;

public final class r
  extends TelephonyCallback
  implements TelephonyCallback.DisplayInfoListener
{
  public final s a;
  
  public r(s params)
  {
    a = params;
  }
  
  public final void onDisplayInfoChanged(TelephonyDisplayInfo paramTelephonyDisplayInfo)
  {
    int i = paramTelephonyDisplayInfo.getOverrideNetworkType();
    int j = 5;
    if ((i != 3) && (i != 4) && (i != 5)) {
      i = 0;
    } else {
      i = 1;
    }
    paramTelephonyDisplayInfo = a;
    if (i != 0) {
      j = 10;
    }
    s.a(paramTelephonyDisplayInfo, j);
  }
}

/* Location:
 * Qualified Name:     v5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */