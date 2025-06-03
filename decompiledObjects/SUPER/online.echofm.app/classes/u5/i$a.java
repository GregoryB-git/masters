package u5;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public class i$a
  implements OnBackAnimationCallback
{
  public i$a(i parami) {}
  
  public void onBackCancelled()
  {
    a.F();
  }
  
  public void onBackInvoked()
  {
    a.G();
  }
  
  public void onBackProgressed(BackEvent paramBackEvent)
  {
    a.V(paramBackEvent);
  }
  
  public void onBackStarted(BackEvent paramBackEvent)
  {
    a.R(paramBackEvent);
  }
}

/* Location:
 * Qualified Name:     u5.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */