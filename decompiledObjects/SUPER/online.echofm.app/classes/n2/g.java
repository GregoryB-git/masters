package n2;

import h2.b;
import h2.d;

public final class g
  implements b
{
  public static g a()
  {
    return a.a();
  }
  
  public static String b()
  {
    return (String)d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public String c()
  {
    return b();
  }
  
  public static final abstract class a
  {
    public static final g a = new g();
  }
}

/* Location:
 * Qualified Name:     n2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */