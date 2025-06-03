package j9;

public abstract class k$a
  implements Comparable<a>
{
  public static final b a = new b(q.b, i.g(), -1);
  public static final q5.i b = new q5.i(6);
  
  public static b g(g paramg)
  {
    return new b(paramg.f(), paramg.getKey(), -1);
  }
  
  public final int f(a parama)
  {
    int i = l().f(parama.l());
    if (i != 0) {
      return i;
    }
    i = h().f(parama.h());
    if (i != 0) {
      return i;
    }
    return Integer.compare(i(), parama.i());
  }
  
  public abstract i h();
  
  public abstract int i();
  
  public abstract q l();
}

/* Location:
 * Qualified Name:     j9.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */