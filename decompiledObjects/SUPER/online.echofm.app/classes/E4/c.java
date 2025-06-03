package E4;

import q5.b;
import s3.e;

public final class c
  implements U5.a
{
  public final a a;
  
  public c(a parama)
  {
    a = parama;
  }
  
  public static c a(a parama)
  {
    return new c(parama);
  }
  
  public static e c(a parama)
  {
    return (e)b.c(parama.b(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public e b()
  {
    return c(a);
  }
}

/* Location:
 * Qualified Name:     E4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */