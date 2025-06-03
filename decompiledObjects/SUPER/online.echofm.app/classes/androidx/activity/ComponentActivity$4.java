package androidx.activity;

import android.app.Activity;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.t;
import c.a;

class ComponentActivity$4
  implements f
{
  public ComponentActivity$4(ComponentActivity paramComponentActivity) {}
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_DESTROY)
    {
      o.q.b();
      if (!o.isChangingConfigurations()) {
        o.d().a();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */