package n2;

import U5.a;
import android.content.Context;
import h2.b;
import h2.d;

public final class h
  implements b
{
  public final a a;
  
  public h(a parama)
  {
    a = parama;
  }
  
  public static h a(a parama)
  {
    return new h(parama);
  }
  
  public static String c(Context paramContext)
  {
    return (String)d.c(f.b(paramContext), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public String b()
  {
    return c((Context)a.get());
  }
}

/* Location:
 * Qualified Name:     n2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */