package butterknife.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import w0;

public abstract class DebouncingOnClickListener
  implements View.OnClickListener
{
  private static final Runnable ENABLE_AGAIN = new w0(0);
  private static final Handler MAIN = new Handler(Looper.getMainLooper());
  public static boolean enabled = true;
  
  public abstract void doClick(View paramView);
  
  public final void onClick(View paramView)
  {
    if (enabled)
    {
      enabled = false;
      MAIN.post(ENABLE_AGAIN);
      doClick(paramView);
    }
  }
}

/* Location:
 * Qualified Name:     butterknife.internal.DebouncingOnClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */