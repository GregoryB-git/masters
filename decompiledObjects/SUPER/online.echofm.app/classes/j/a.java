package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class a
{
  public Context a;
  
  public a(Context paramContext)
  {
    a = paramContext;
  }
  
  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public int b()
  {
    return a.getResources().getDisplayMetrics().widthPixels / 2;
  }
  
  public int c()
  {
    Configuration localConfiguration = a.getResources().getConfiguration();
    int i = screenWidthDp;
    int j = screenHeightDp;
    if ((smallestScreenWidthDp <= 600) && (i <= 600) && ((i <= 960) || (j <= 720)) && ((i <= 720) || (j <= 960)))
    {
      if ((i < 500) && ((i <= 640) || (j <= 480)) && ((i <= 480) || (j <= 640)))
      {
        if (i >= 360) {
          return 3;
        }
        return 2;
      }
      return 4;
    }
    return 5;
  }
  
  public boolean d()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */