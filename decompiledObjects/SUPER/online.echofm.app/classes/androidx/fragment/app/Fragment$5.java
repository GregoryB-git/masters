package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class Fragment$5
  implements f
{
  public Fragment$5(Fragment paramFragment) {}
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_STOP)
    {
      paramh = o.V;
      if (paramh != null) {
        paramh.cancelPendingInputEvents();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */