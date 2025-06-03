package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class ComponentActivity$3
  implements f
{
  public ComponentActivity$3(ComponentActivity paramComponentActivity) {}
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_STOP)
    {
      paramh = o.getWindow();
      if (paramh != null) {
        paramh = paramh.peekDecorView();
      } else {
        paramh = null;
      }
      if (paramh != null) {
        paramh.cancelPendingInputEvents();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */