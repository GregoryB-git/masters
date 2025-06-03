package Q3;

import d4.n;

public abstract class r
{
  public static c a()
  {
    return new c(false, null, null);
  }
  
  public static c b(m paramm)
  {
    return new c(true, paramm.b(), null);
  }
  
  public static abstract interface b
  {
    public abstract r.c a(m paramm);
    
    public abstract void b(c paramc, boolean paramBoolean, b paramb);
  }
  
  public static class c
  {
    public boolean a;
    public n b;
    
    public c(boolean paramBoolean, n paramn)
    {
      a = paramBoolean;
      b = paramn;
    }
    
    public n a()
    {
      return b;
    }
    
    public boolean b()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     Q3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */