package p2;

import h2.d;

public final class c
  implements h2.b
{
  public static c a()
  {
    return a.a();
  }
  
  public static a b()
  {
    return (a)d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public a c()
  {
    return b();
  }
  
  public static final abstract class a
  {
    public static final c a = new c();
  }
}

/* Location:
 * Qualified Name:     p2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */