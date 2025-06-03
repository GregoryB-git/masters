package e7;

import d2.q;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class j0
  extends o0
{
  public boolean c;
  
  public j0(j2 paramj2)
  {
    super(paramj2);
    paramj2 = (j2)b;
    N += 1;
  }
  
  public abstract boolean s();
  
  public final void t()
  {
    if (c) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void u()
  {
    if (!c)
    {
      if (!s())
      {
        b).P.incrementAndGet();
        c = true;
      }
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
}

/* Location:
 * Qualified Name:     e7.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */