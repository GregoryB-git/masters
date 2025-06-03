package j8;

import android.os.Process;

public abstract class d
  implements Runnable
{
  public abstract void a();
  
  public final void run()
  {
    Process.setThreadPriority(10);
    a();
  }
}

/* Location:
 * Qualified Name:     j8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */