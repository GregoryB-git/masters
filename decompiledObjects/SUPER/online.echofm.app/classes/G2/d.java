package G2;

import android.content.Context;

public class d
{
  public static d b = new d();
  public c a = null;
  
  public static c a(Context paramContext)
  {
    return b.b(paramContext);
  }
  
  public final c b(Context paramContext)
  {
    Context localContext;
    try
    {
      if (a != null) {
        break label44;
      }
      localContext = paramContext;
      if (paramContext.getApplicationContext() != null) {
        localContext = paramContext.getApplicationContext();
      }
    }
    finally
    {
      break label53;
    }
    paramContext = new G2/c;
    paramContext.<init>(localContext);
    a = paramContext;
    label44:
    paramContext = a;
    return paramContext;
    label53:
    throw paramContext;
  }
}

/* Location:
 * Qualified Name:     G2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */