package F;

import android.os.Process;

public class h$a$a
  extends Thread
{
  public final int o;
  
  public h$a$a(Runnable paramRunnable, String paramString, int paramInt)
  {
    super(paramRunnable, paramString);
    o = paramInt;
  }
  
  public void run()
  {
    Process.setThreadPriority(o);
    super.run();
  }
}

/* Location:
 * Qualified Name:     F.h.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */