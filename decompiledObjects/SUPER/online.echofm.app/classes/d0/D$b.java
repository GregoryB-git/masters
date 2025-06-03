package d0;

import g0.M;

public final class D$b
{
  public static final b b = new a().e();
  public static final String c = M.w0(0);
  public final p a;
  
  public D$b(p paramp)
  {
    a = paramp;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return a.equals(a);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public static final class a
  {
    public static final int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32 };
    public final p.b a = new p.b();
    
    public a a(int paramInt)
    {
      a.a(paramInt);
      return this;
    }
    
    public a b(D.b paramb)
    {
      a.b(D.b.a(paramb));
      return this;
    }
    
    public a c(int... paramVarArgs)
    {
      a.c(paramVarArgs);
      return this;
    }
    
    public a d(int paramInt, boolean paramBoolean)
    {
      a.d(paramInt, paramBoolean);
      return this;
    }
    
    public D.b e()
    {
      return new D.b(a.e(), null);
    }
  }
}

/* Location:
 * Qualified Name:     d0.D.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */