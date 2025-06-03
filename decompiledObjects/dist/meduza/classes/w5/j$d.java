package w5;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Display;
import io.flutter.plugins.firebase.auth.g;
import v5.e0;

public final class j$d
  implements j.b, DisplayManager.DisplayListener
{
  public final DisplayManager a;
  public j.b.a b;
  
  public j$d(DisplayManager paramDisplayManager)
  {
    a = paramDisplayManager;
  }
  
  public final void a()
  {
    a.unregisterDisplayListener(this);
    b = null;
  }
  
  public final void b(g paramg)
  {
    b = paramg;
    a.registerDisplayListener(this, e0.l(null));
    paramg.b(a.getDisplay(0));
  }
  
  public final void onDisplayAdded(int paramInt) {}
  
  public final void onDisplayChanged(int paramInt)
  {
    j.b.a locala = b;
    if ((locala != null) && (paramInt == 0))
    {
      Display localDisplay = a.getDisplay(0);
      ((g)locala).b(localDisplay);
    }
  }
  
  public final void onDisplayRemoved(int paramInt) {}
}

/* Location:
 * Qualified Name:     w5.j.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */