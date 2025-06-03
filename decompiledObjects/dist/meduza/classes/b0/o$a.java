package b0;

import android.os.Process;

public final class o$a
  extends Thread
{
  public final int a;
  
  public o$a(Runnable paramRunnable, String paramString, int paramInt)
  {
    super(paramRunnable, paramString);
    a = paramInt;
  }
  
  public final void run()
  {
    Process.setThreadPriority(a);
    super.run();
  }
}

/* Location:
 * Qualified Name:     b0.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */