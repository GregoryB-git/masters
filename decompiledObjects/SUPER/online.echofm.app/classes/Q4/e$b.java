package Q4;

import V2.d;
import V2.f;
import V2.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class e$b
  implements g, f, d
{
  public final CountDownLatch a = new CountDownLatch(1);
  
  public void a(Object paramObject)
  {
    a.countDown();
  }
  
  public void b()
  {
    a.countDown();
  }
  
  public boolean c(long paramLong, TimeUnit paramTimeUnit)
  {
    return a.await(paramLong, paramTimeUnit);
  }
  
  public void d(Exception paramException)
  {
    a.countDown();
  }
}

/* Location:
 * Qualified Name:     Q4.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */