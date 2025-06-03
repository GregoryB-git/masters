package p1;

import t1.f;

public abstract class d
  extends p
{
  public d(j paramj, int paramInt)
  {
    super(paramj);
  }
  
  public abstract void e(f paramf, Object paramObject);
  
  public final void f(Object paramObject)
  {
    f localf = a();
    try
    {
      e(localf, paramObject);
      localf.w0();
      return;
    }
    finally
    {
      d(localf);
    }
  }
}

/* Location:
 * Qualified Name:     p1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */