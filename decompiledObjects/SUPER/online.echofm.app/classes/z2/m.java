package z2;

import A2.n;
import x2.d;
import y2.a.b;

public abstract class m
{
  public final d[] a;
  public final boolean b;
  public final int c;
  
  public m(d[] paramArrayOfd, boolean paramBoolean, int paramInt)
  {
    a = paramArrayOfd;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramArrayOfd != null)
    {
      bool2 = bool1;
      if (paramBoolean) {
        bool2 = true;
      }
    }
    b = bool2;
    c = paramInt;
  }
  
  public static a a()
  {
    return new a(null);
  }
  
  public abstract void b(a.b paramb, V2.k paramk);
  
  public boolean c()
  {
    return b;
  }
  
  public final int d()
  {
    return c;
  }
  
  public final d[] e()
  {
    return a;
  }
  
  public static class a
  {
    public k a;
    public boolean b;
    public d[] c;
    public int d;
    
    public m a()
    {
      boolean bool;
      if (a != null) {
        bool = true;
      } else {
        bool = false;
      }
      n.b(bool, "execute parameter required");
      return new N(this, c, b, d);
    }
    
    public a b(k paramk)
    {
      a = paramk;
      return this;
    }
    
    public a c(boolean paramBoolean)
    {
      b = paramBoolean;
      return this;
    }
    
    public a d(d... paramVarArgs)
    {
      c = paramVarArgs;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     z2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */