package g0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;

public final class t$b$a
  extends TelephonyCallback
  implements TelephonyCallback.DisplayInfoListener
{
  public final t a;
  
  public t$b$a(t paramt)
  {
    a = paramt;
  }
  
  public void onDisplayInfoChanged(TelephonyDisplayInfo paramTelephonyDisplayInfo)
  {
    int i = x.a(paramTelephonyDisplayInfo);
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
    t.c(paramTelephonyDisplayInfo, j);
  }
}

/* Location:
 * Qualified Name:     g0.t.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */