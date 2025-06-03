package H3;

import E3.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class A$b
  extends d
{
  public A$b(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit) {}
  
  public void a()
  {
    try
    {
      Object localObject1 = f.f();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Executing shutdown hook for ");
      ((StringBuilder)localObject2).append(o);
      ((f)localObject1).b(((StringBuilder)localObject2).toString());
      p.shutdown();
      if (!p.awaitTermination(q, r))
      {
        localObject2 = f.f();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(o);
        ((StringBuilder)localObject1).append(" did not shut down in the allocated time. Requesting immediate shutdown.");
        ((f)localObject2).b(((StringBuilder)localObject1).toString());
        p.shutdownNow();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] { o }));
      p.shutdownNow();
    }
  }
}

/* Location:
 * Qualified Name:     H3.A.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */