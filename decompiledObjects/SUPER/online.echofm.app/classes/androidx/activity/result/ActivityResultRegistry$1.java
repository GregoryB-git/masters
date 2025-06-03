package androidx.activity.result;

import android.os.Bundle;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.Map;

class ActivityResultRegistry$1
  implements f
{
  public ActivityResultRegistry$1(ActivityResultRegistry paramActivityResultRegistry, String paramString, b paramb, d.a parama) {}
  
  public void a(h paramh, d.b paramb)
  {
    if (d.b.ON_START.equals(paramb))
    {
      r.e.put(o, new ActivityResultRegistry.c(p, q));
      if (r.f.containsKey(o))
      {
        paramh = r.f.get(o);
        r.f.remove(o);
        p.a(paramh);
      }
      paramh = (a)r.g.getParcelable(o);
      if (paramh != null)
      {
        r.g.remove(o);
        p.a(q.c(paramh.b(), paramh.a()));
      }
    }
    else if (d.b.ON_STOP.equals(paramb))
    {
      r.e.remove(o);
    }
    else if (d.b.ON_DESTROY.equals(paramb))
    {
      r.l(o);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */