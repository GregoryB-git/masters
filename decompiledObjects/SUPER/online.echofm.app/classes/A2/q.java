package A2;

import android.content.Context;
import android.content.res.Resources;
import x2.p;

public class q
{
  public final Resources a;
  public final String b;
  
  public q(Context paramContext)
  {
    n.i(paramContext);
    paramContext = paramContext.getResources();
    a = paramContext;
    b = paramContext.getResourcePackageName(p.a);
  }
  
  public String a(String paramString)
  {
    int i = a.getIdentifier(paramString, "string", b);
    if (i == 0) {
      return null;
    }
    return a.getString(i);
  }
}

/* Location:
 * Qualified Name:     A2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */