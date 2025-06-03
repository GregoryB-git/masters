package n2;

import h2.b;
import h2.d;

public final class j
  implements b
{
  public static j a()
  {
    return a.a();
  }
  
  public static e c()
  {
    return (e)d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public e b()
  {
    return c();
  }
  
  public static final abstract class a
  {
    public static final j a = new j();
  }
}

/* Location:
 * Qualified Name:     n2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */