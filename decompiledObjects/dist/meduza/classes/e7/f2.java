package e7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;

public final class f2
{
  public static String a(Context paramContext)
  {
    try
    {
      String str = paramContext.getResources().getResourcePackageName(2131886131);
      paramContext = str;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      paramContext = paramContext.getPackageName();
    }
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     e7.f2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */