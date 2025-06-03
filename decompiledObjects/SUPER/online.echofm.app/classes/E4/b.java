package E4;

public final class b
  implements U5.a
{
  public final a a;
  
  public b(a parama)
  {
    a = parama;
  }
  
  public static b a(a parama)
  {
    return new b(parama);
  }
  
  public static C4.a c(a parama)
  {
    return (C4.a)q5.b.c(parama.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public C4.a b()
  {
    return c(a);
  }
}

/* Location:
 * Qualified Name:     E4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */