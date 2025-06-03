package E4;

import q5.b;
import s4.i;

public final class d
  implements U5.a
{
  public final a a;
  
  public d(a parama)
  {
    a = parama;
  }
  
  public static d a(a parama)
  {
    return new d(parama);
  }
  
  public static i c(a parama)
  {
    return (i)b.c(parama.c(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public i b()
  {
    return c(a);
  }
}

/* Location:
 * Qualified Name:     E4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */