package w6;

import i6.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a
  implements ThreadFactory
{
  public final String a;
  public final ThreadFactory b = Executors.defaultThreadFactory();
  
  public a(String paramString)
  {
    a = paramString;
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new q(paramRunnable);
    paramRunnable = b.newThread(paramRunnable);
    paramRunnable.setName(a);
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     w6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */