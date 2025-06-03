package androidx.fragment.app;

import E.c;

public abstract class c$l
{
  public final B.e a;
  public final c b;
  
  public c$l(B.e parame, c paramc)
  {
    a = parame;
    b = paramc;
  }
  
  public void a()
  {
    a.d(b);
  }
  
  public B.e b()
  {
    return a;
  }
  
  public c c()
  {
    return b;
  }
  
  public boolean d()
  {
    B.e.c localc1 = B.e.c.h(a.f().V);
    B.e.c localc2 = a.e();
    if (localc1 != localc2)
    {
      B.e.c localc3 = B.e.c.p;
      if ((localc1 == localc3) || (localc2 == localc3))
      {
        bool = false;
        break label53;
      }
    }
    boolean bool = true;
    label53:
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.c.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */