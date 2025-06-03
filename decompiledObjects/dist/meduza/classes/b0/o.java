package b0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class o
  implements ThreadFactory
{
  public String a = "fonts-androidx";
  public int b = 10;
  
  public final Thread newThread(Runnable paramRunnable)
  {
    return new a(paramRunnable, a, b);
  }
  
  public static final class a
    extends Thread
  {
    public final int a;
    
    public a(Runnable paramRunnable, String paramString, int paramInt)
    {
      super(paramString);
      a = paramInt;
    }
    
    public final void run()
    {
      Process.setThreadPriority(a);
      super.run();
    }
  }
}

/* Location:
 * Qualified Name:     b0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */