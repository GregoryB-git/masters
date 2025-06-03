package l2;

import h2.b;
import h2.d;

public final class g
  implements b
{
  public final U5.a a;
  
  public g(U5.a parama)
  {
    a = parama;
  }
  
  public static m2.f a(p2.a parama)
  {
    return (m2.f)d.c(f.a(parama), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static g b(U5.a parama)
  {
    return new g(parama);
  }
  
  public m2.f c()
  {
    return a((p2.a)a.get());
  }
}

/* Location:
 * Qualified Name:     l2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */