package V2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class p
  implements q
{
  public final CountDownLatch a;
  
  public final void a(Object paramObject)
  {
    a.countDown();
  }
  
  public final void b()
  {
    a.countDown();
  }
  
  public final void c()
  {
    a.await();
  }
  
  public final void d(Exception paramException)
  {
    a.countDown();
  }
  
  public final boolean e(long paramLong, TimeUnit paramTimeUnit)
  {
    return a.await(paramLong, paramTimeUnit);
  }
}

/* Location:
 * Qualified Name:     V2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */