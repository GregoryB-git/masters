package e8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum k
  implements Executor
{
  public static final Handler b = new Handler(Looper.getMainLooper());
  
  static
  {
    k localk = new k();
    a = localk;
    c = new k[] { localk };
  }
  
  public k() {}
  
  public final void execute(Runnable paramRunnable)
  {
    b.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     e8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */