package d0;

import g0.M;

public final class K$b
{
  public static final b d = new a().d();
  public static final String e = M.w0(1);
  public static final String f = M.w0(2);
  public static final String g = M.w0(3);
  public final int a;
  public final boolean b;
  public final boolean c;
  
  public K$b(a parama)
  {
    a = a.a(parama);
    b = a.b(parama);
    c = a.c(parama);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((a != a) || (b != b) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((a + 31) * 31 + b) * 31 + c;
  }
  
  public static final class a
  {
    public int a = 0;
    public boolean b = false;
    public boolean c = false;
    
    public K.b d()
    {
      return new K.b(this, null);
    }
    
    public a e(int paramInt)
    {
      a = paramInt;
      return this;
    }
    
    public a f(boolean paramBoolean)
    {
      b = paramBoolean;
      return this;
    }
    
    public a g(boolean paramBoolean)
    {
      c = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.K.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */