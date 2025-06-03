package f5;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import t5.c0.a;
import t5.c0.b;
import t5.c0.c;
import t5.u;
import v5.e0;

public final class b$a
  implements j.a
{
  public b$a(b paramb) {}
  
  public final boolean a(Uri paramUri, c0.c paramc, boolean paramBoolean)
  {
    if (a.t == null)
    {
      long l = SystemClock.elapsedRealtime();
      Object localObject = a.r;
      int i = e0.a;
      List localList = e;
      i = 0;
      int k;
      for (int j = i; i < localList.size(); j = k)
      {
        localObject = (b.b)a.d.get(geta);
        k = j;
        if (localObject != null)
        {
          k = j;
          if (l < p) {
            k = j + 1;
          }
        }
        i++;
      }
      localObject = new c0.a(1, 0, a.r.e.size(), j);
      paramc = ((u)a.c).a((c0.a)localObject, paramc);
      if ((paramc != null) && (a == 2))
      {
        paramUri = (b.b)a.d.get(paramUri);
        if (paramUri != null) {
          b.b.a(paramUri, b);
        }
      }
    }
    return false;
  }
  
  public final void f()
  {
    a.e.remove(this);
  }
}

/* Location:
 * Qualified Name:     f5.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */