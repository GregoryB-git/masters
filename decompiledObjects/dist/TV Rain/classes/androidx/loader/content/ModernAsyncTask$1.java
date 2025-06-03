package androidx.loader.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

final class ModernAsyncTask$1
  implements ThreadFactory
{
  private final AtomicInteger mCount = new AtomicInteger(1);
  
  public Thread newThread(Runnable paramRunnable)
  {
    StringBuilder localStringBuilder = z2.t("ModernAsyncTask #");
    localStringBuilder.append(mCount.getAndIncrement());
    return new Thread(paramRunnable, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */