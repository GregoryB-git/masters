package o2;

import ec.i;
import f;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
  implements ThreadFactory
{
  public final AtomicInteger a = new AtomicInteger(0);
  
  public b(boolean paramBoolean) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    i.e(paramRunnable, "runnable");
    if (b) {
      localObject = "WM.task-";
    } else {
      localObject = "androidx.work-";
    }
    Object localObject = f.l((String)localObject);
    ((StringBuilder)localObject).append(a.incrementAndGet());
    return new Thread(paramRunnable, ((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     o2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */