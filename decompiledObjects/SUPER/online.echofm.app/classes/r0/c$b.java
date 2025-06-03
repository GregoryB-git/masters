package r0;

import B0.m;
import B0.m.a;
import B0.m.b;
import B0.m.c;
import android.net.Uri;
import android.os.SystemClock;
import g0.M;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class c$b
  implements k.b
{
  public c$b(c paramc) {}
  
  public void a()
  {
    c.z(o).remove(this);
  }
  
  public boolean e(Uri paramUri, m.c paramc, boolean paramBoolean)
  {
    if (c.A(o) == null)
    {
      long l = SystemClock.elapsedRealtime();
      Object localObject = iqo))).e;
      int i = 0;
      int k;
      for (int j = i; i < ((List)localObject).size(); j = k)
      {
        c.c localc = (c.c)c.B(o).get(geta);
        k = j;
        if (localc != null)
        {
          k = j;
          if (l < c.c.d(localc)) {
            k = j + 1;
          }
        }
        i++;
      }
      localObject = new m.a(1, 0, qo).e.size(), j);
      paramc = c.E(o).b((m.a)localObject, paramc);
      if ((paramc != null) && (a == 2))
      {
        paramUri = (c.c)c.B(o).get(paramUri);
        if (paramUri != null) {
          c.c.b(paramUri, b);
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     r0.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */