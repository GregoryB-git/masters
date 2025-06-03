package F;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public class h$a
  implements ThreadFactory
{
  public String a;
  public int b;
  
  public h$a(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new a(paramRunnable, a, b);
  }
  
  public static class a
    extends Thread
  {
    public final int o;
    
    public a(Runnable paramRunnable, String paramString, int paramInt)
    {
      super(paramString);
      o = paramInt;
    }
    
    public void run()
    {
      Process.setThreadPriority(o);
      super.run();
    }
  }
}

/* Location:
 * Qualified Name:     F.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */