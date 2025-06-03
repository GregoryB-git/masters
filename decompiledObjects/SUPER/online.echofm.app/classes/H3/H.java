package H3;

import java.util.concurrent.atomic.AtomicInteger;

public final class H
{
  public final AtomicInteger a = new AtomicInteger();
  public final AtomicInteger b = new AtomicInteger();
  
  public int a()
  {
    return b.get();
  }
  
  public int b()
  {
    return a.get();
  }
  
  public void c()
  {
    b.getAndIncrement();
  }
  
  public void d()
  {
    a.getAndIncrement();
  }
  
  public void e()
  {
    b.set(0);
  }
}

/* Location:
 * Qualified Name:     H3.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */