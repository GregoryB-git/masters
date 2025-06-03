package D0;

import android.content.Context;
import android.hardware.display.DisplayManager;

public abstract class k$b
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
      if (l.a(paramContext))
      {
        paramContext = n.a(m.a(paramContext));
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
 * Qualified Name:     D0.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */