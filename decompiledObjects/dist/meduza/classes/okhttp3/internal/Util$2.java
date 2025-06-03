package okhttp3.internal;

import java.util.concurrent.ThreadFactory;

class Util$2
  implements ThreadFactory
{
  public Util$2(String paramString, boolean paramBoolean) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable, a);
    paramRunnable.setDaemon(b);
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.Util.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */