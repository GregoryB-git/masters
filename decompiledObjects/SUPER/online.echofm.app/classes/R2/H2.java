package R2;

import A2.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.text.TextUtils;
import x2.p;

public final class H2
{
  public final Resources a;
  public final String b;
  
  public H2(Context paramContext, String paramString)
  {
    n.i(paramContext);
    a = paramContext.getResources();
    if (!TextUtils.isEmpty(paramString))
    {
      b = paramString;
      return;
    }
    b = a(paramContext);
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      String str = paramContext.getResources().getResourcePackageName(p.a);
      paramContext = str;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      paramContext = paramContext.getPackageName();
    }
    return paramContext;
  }
  
  public final String b(String paramString)
  {
    int i = a.getIdentifier(paramString, "string", b);
    if (i == 0) {
      return null;
    }
    try
    {
      paramString = a.getString(i);
      return paramString;
    }
    catch (Resources.NotFoundException paramString) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     R2.H2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */