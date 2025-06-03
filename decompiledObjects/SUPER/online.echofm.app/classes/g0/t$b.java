package g0;

import android.content.Context;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;

public abstract class t$b
{
  public static void a(Context paramContext, t paramt)
  {
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)a.e((TelephonyManager)paramContext.getSystemService("phone"));
      a locala = new g0/t$b$a;
      locala.<init>(paramt);
      v.a(localTelephonyManager, u.a(paramContext), locala);
      w.a(localTelephonyManager, locala);
    }
    catch (RuntimeException paramContext)
    {
      t.c(paramt, 5);
    }
  }
  
  public static final class a
    extends TelephonyCallback
    implements TelephonyCallback.DisplayInfoListener
  {
    public final t a;
    
    public a(t paramt)
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
}

/* Location:
 * Qualified Name:     g0.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */