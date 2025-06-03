package u5;

import H.a;
import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import java.util.concurrent.Executor;

public class Q
{
  public final WindowInfoTrackerCallbackAdapter a;
  
  public Q(WindowInfoTrackerCallbackAdapter paramWindowInfoTrackerCallbackAdapter)
  {
    a = paramWindowInfoTrackerCallbackAdapter;
  }
  
  public void a(Activity paramActivity, Executor paramExecutor, a parama)
  {
    a.addWindowLayoutInfoListener(paramActivity, paramExecutor, parama);
  }
  
  public void b(a parama)
  {
    a.removeWindowLayoutInfoListener(parama);
  }
}

/* Location:
 * Qualified Name:     u5.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */