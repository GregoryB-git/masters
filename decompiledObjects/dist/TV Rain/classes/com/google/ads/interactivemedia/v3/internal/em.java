package com.google.ads.interactivemedia.v3.internal;

public class em
{
  private final dl[] a;
  private final er b;
  private final et c;
  
  public em(dl... paramVarArgs)
  {
    dl[] arrayOfdl = new dl[paramVarArgs.length + 2];
    a = arrayOfdl;
    System.arraycopy(paramVarArgs, 0, arrayOfdl, 0, paramVarArgs.length);
    er localer = new er();
    b = localer;
    et localet = new et();
    c = localet;
    arrayOfdl[paramVarArgs.length] = localer;
    arrayOfdl[(paramVarArgs.length + 1)] = localet;
  }
  
  public long a(long paramLong)
  {
    return c.a(paramLong);
  }
  
  public cg a(cg paramcg)
  {
    b.a(d);
    return new cg(c.a(b), c.b(c), d);
  }
  
  public dl[] a()
  {
    return a;
  }
  
  public long b()
  {
    return b.n();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.em
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */