package w5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Display.HdrCapabilities;
import com.google.android.gms.internal.base.a;

public final class g$a
{
  public static boolean a(Context paramContext)
  {
    paramContext = (DisplayManager)paramContext.getSystemService("display");
    boolean bool1 = false;
    if (paramContext != null) {
      paramContext = paramContext.getDisplay(0);
    } else {
      paramContext = null;
    }
    boolean bool2 = bool1;
    if (paramContext != null)
    {
      bool2 = bool1;
      if (a.v(paramContext))
      {
        paramContext = paramContext.getHdrCapabilities().getSupportedHdrTypes();
        int i = paramContext.length;
        for (int j = 0;; j++)
        {
          bool2 = bool1;
          if (j >= i) {
            break;
          }
          if (paramContext[j] == 1)
          {
            bool2 = true;
            break;
          }
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     w5.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */