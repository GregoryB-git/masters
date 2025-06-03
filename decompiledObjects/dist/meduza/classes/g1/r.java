package g1;

import android.os.Bundle;
import android.support.v4.os.a;
import android.util.Log;
import f;
import g;
import r.h;

public final class r
  implements Runnable
{
  public r(c.k paramk, c.m paramm, String paramString, Bundle paramBundle, a parama) {}
  
  public final void run()
  {
    Object localObject1 = ((c.m)a).a();
    if ((c.c)e.a.d.getOrDefault(localObject1, null) == null)
    {
      localObject1 = f.l("search for callback that isn't registered query=");
      ((StringBuilder)localObject1).append(b);
      Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
      return;
    }
    localObject1 = e.a;
    String str = b;
    Bundle localBundle = c;
    Object localObject2 = d;
    localObject1.getClass();
    localObject2 = new e(str, (a)localObject2);
    ((c)localObject1).f(localBundle, (e)localObject2, str);
    if (((c.i)localObject2).b()) {
      return;
    }
    throw new IllegalStateException(g.d("onSearch must call detach() or sendResult() before returning for query=", str));
  }
}

/* Location:
 * Qualified Name:     g1.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */