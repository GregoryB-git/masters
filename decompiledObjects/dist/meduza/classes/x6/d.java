package x6;

import android.content.Context;

public final class d
{
  public static final d b = new d();
  public c a = null;
  
  public static c a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null)
      {
        Context localContext = paramContext;
        if (paramContext.getApplicationContext() != null) {
          localContext = paramContext.getApplicationContext();
        }
        paramContext = new x6/c;
        paramContext.<init>(localContext);
        a = paramContext;
      }
      paramContext = a;
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     x6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */