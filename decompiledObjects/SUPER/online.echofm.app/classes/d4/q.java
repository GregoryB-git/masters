package d4;

public class q
  extends h
{
  public static final q o = new q();
  
  public static q j()
  {
    return o;
  }
  
  public String c()
  {
    throw new IllegalArgumentException("Can't get query definition on priority index!");
  }
  
  public boolean e(n paramn)
  {
    return paramn.t().isEmpty() ^ true;
  }
  
  public boolean equals(Object paramObject)
  {
    return paramObject instanceof q;
  }
  
  public m f(b paramb, n paramn)
  {
    return new m(paramb, new t("[PRIORITY-POST]", paramn));
  }
  
  public m g()
  {
    return f(b.m(), n.l);
  }
  
  public int hashCode()
  {
    return 3155577;
  }
  
  public int i(m paramm1, m paramm2)
  {
    n localn1 = paramm1.d().t();
    n localn2 = paramm2.d().t();
    return o.c(paramm1.c(), localn1, paramm2.c(), localn2);
  }
  
  public String toString()
  {
    return "PriorityIndex";
  }
}

/* Location:
 * Qualified Name:     d4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */