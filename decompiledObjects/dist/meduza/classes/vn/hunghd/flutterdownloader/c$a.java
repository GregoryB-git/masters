package vn.hunghd.flutterdownloader;

import android.content.Context;
import ec.i;

public final class c$a
{
  public static c a(Context paramContext)
  {
    if (c.a == null)
    {
      i.b(paramContext);
      paramContext = paramContext.getApplicationContext();
      i.d(paramContext, "getApplicationContext(...)");
      c.a = new c(paramContext);
    }
    paramContext = c.a;
    i.b(paramContext);
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     vn.hunghd.flutterdownloader.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */