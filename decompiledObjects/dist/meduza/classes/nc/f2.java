package nc;

import ub.h;

public final class f2
  extends a0
{
  static
  {
    new f2();
  }
  
  public final String toString()
  {
    return "Dispatchers.Unconfined";
  }
  
  public final void z0(h paramh, Runnable paramRunnable)
  {
    paramh = (j2)paramh.get(j2.c);
    if (paramh != null)
    {
      b = true;
      return;
    }
    throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
  }
}

/* Location:
 * Qualified Name:     nc.f2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */