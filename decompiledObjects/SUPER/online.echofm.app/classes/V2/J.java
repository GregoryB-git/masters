package V2;

import O2.a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class J
  implements Executor
{
  public final Handler o = new a(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable)
  {
    o.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     V2.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */