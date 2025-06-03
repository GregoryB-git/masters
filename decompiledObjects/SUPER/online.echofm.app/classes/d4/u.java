package d4;

public class u
  extends h
{
  public static final u o = new u();
  
  public static u j()
  {
    return o;
  }
  
  public String c()
  {
    return ".value";
  }
  
  public boolean e(n paramn)
  {
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    return paramObject instanceof u;
  }
  
  public m f(b paramb, n paramn)
  {
    return new m(paramb, paramn);
  }
  
  public m g()
  {
    return new m(b.m(), n.l);
  }
  
  public int hashCode()
  {
    return 4;
  }
  
  public int i(m paramm1, m paramm2)
  {
    int i = paramm1.d().compareTo(paramm2.d());
    if (i == 0) {
      return paramm1.c().h(paramm2.c());
    }
    return i;
  }
  
  public String toString()
  {
    return "ValueIndex";
  }
}

/* Location:
 * Qualified Name:     d4.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */