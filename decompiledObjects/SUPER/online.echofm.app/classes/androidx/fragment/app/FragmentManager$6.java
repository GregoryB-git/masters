package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.Map;

class FragmentManager$6
  implements f
{
  public void a(h paramh, d.b paramb)
  {
    if ((paramb == d.b.ON_START) && ((Bundle)n.a(q).get(o) != null)) {
      throw null;
    }
    if (paramb == d.b.ON_DESTROY)
    {
      p.c(this);
      n.b(q).remove(o);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */