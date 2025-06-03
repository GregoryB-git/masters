package p6;

import X5.g;
import android.support.v4.media.a;

public final class M0
  extends F
{
  public static final M0 q = new M0();
  
  public void E(g paramg, Runnable paramRunnable)
  {
    a.a(paramg.b(Q0.p));
    throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
  }
  
  public boolean F(g paramg)
  {
    return false;
  }
  
  public String toString()
  {
    return "Dispatchers.Unconfined";
  }
}

/* Location:
 * Qualified Name:     p6.M0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */