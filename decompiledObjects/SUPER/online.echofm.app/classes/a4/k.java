package a4;

import d4.i;
import d4.n;

public class k
{
  public final a a;
  public final a b;
  
  public k(a parama1, a parama2)
  {
    a = parama1;
    b = parama2;
  }
  
  public n a()
  {
    n localn;
    if (a.f()) {
      localn = a.b();
    } else {
      localn = null;
    }
    return localn;
  }
  
  public n b()
  {
    n localn;
    if (b.f()) {
      localn = b.b();
    } else {
      localn = null;
    }
    return localn;
  }
  
  public a c()
  {
    return a;
  }
  
  public a d()
  {
    return b;
  }
  
  public k e(i parami, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new k(new a(parami, paramBoolean1, paramBoolean2), b);
  }
  
  public k f(i parami, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new k(a, new a(parami, paramBoolean1, paramBoolean2));
  }
}

/* Location:
 * Qualified Name:     a4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */