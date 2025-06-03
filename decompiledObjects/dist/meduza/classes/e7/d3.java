package e7;

import d2.q;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d3
  extends q
{
  public boolean c;
  
  public d3(j2 paramj2)
  {
    super(paramj2);
    paramj2 = (j2)b;
    N += 1;
  }
  
  public final void m()
  {
    if (c) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void n()
  {
    if (!c)
    {
      if (!o())
      {
        b).P.incrementAndGet();
        c = true;
      }
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public abstract boolean o();
}

/* Location:
 * Qualified Name:     e7.d3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */