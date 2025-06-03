package D0;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Display;
import g0.M;

public final class s$b
  implements DisplayManager.DisplayListener
{
  public final DisplayManager a;
  
  public s$b(s params, DisplayManager paramDisplayManager)
  {
    a = paramDisplayManager;
  }
  
  public final Display a()
  {
    return a.getDisplay(0);
  }
  
  public void b()
  {
    a.registerDisplayListener(this, M.A());
    s.a(b, a());
  }
  
  public void c()
  {
    a.unregisterDisplayListener(this);
  }
  
  public void onDisplayAdded(int paramInt) {}
  
  public void onDisplayChanged(int paramInt)
  {
    if (paramInt == 0) {
      s.a(b, a());
    }
  }
  
  public void onDisplayRemoved(int paramInt) {}
}

/* Location:
 * Qualified Name:     D0.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */