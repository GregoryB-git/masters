package C3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum B
  implements Executor
{
  public static final Handler p = new Handler(Looper.getMainLooper());
  
  static
  {
    B localB = new B("INSTANCE", 0);
    o = localB;
    q = new B[] { localB };
  }
  
  public void execute(Runnable paramRunnable)
  {
    p.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     C3.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */