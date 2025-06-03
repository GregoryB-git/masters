package s7;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class g
  implements ThreadFactory
{
  public g(ThreadFactory paramThreadFactory, String paramString, AtomicLong paramAtomicLong, Boolean paramBoolean) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = a.newThread(paramRunnable);
    Objects.requireNonNull(paramRunnable);
    Object localObject = b;
    if (localObject != null)
    {
      AtomicLong localAtomicLong = c;
      Objects.requireNonNull(localAtomicLong);
      long l = localAtomicLong.getAndIncrement();
      paramRunnable.setName(String.format(Locale.ROOT, (String)localObject, new Object[] { Long.valueOf(l) }));
    }
    localObject = d;
    if (localObject != null) {
      paramRunnable.setDaemon(((Boolean)localObject).booleanValue());
    }
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     s7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */