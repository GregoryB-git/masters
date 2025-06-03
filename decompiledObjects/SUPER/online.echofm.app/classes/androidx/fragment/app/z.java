package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.d.c;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;

public class z
  implements c
{
  public i o = null;
  public b p = null;
  
  public void a(d.b paramb)
  {
    o.h(paramb);
  }
  
  public void b()
  {
    if (o == null)
    {
      o = new i(this);
      p = b.a(this);
    }
  }
  
  public boolean c()
  {
    boolean bool;
    if (o != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d(Bundle paramBundle)
  {
    p.c(paramBundle);
  }
  
  public void e(Bundle paramBundle)
  {
    p.d(paramBundle);
  }
  
  public void f(d.c paramc)
  {
    o.o(paramc);
  }
  
  public d g()
  {
    b();
    return o;
  }
  
  public SavedStateRegistry k()
  {
    return p.b();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */