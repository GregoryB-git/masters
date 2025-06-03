package e8;

import android.os.StrictMode.ThreadPolicy;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import x0.q0;

public final class a
  implements ThreadFactory
{
  public static final ThreadFactory e = ;
  public final AtomicLong a = new AtomicLong();
  public final String b;
  public final int c;
  public final StrictMode.ThreadPolicy d;
  
  public a(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy)
  {
    b = paramString;
    c = paramInt;
    d = paramThreadPolicy;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = e.newThread(new q0(7, this, paramRunnable));
    paramRunnable.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[] { b, Long.valueOf(a.getAndIncrement()) }));
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     e8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */