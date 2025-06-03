package g1;

import android.support.v4.os.a;
import android.util.Log;
import f;
import g;
import r.h;

public final class o
  implements Runnable
{
  public o(c.k paramk, c.m paramm, String paramString, a parama) {}
  
  public final void run()
  {
    Object localObject1 = ((c.m)a).a();
    if ((c.c)d.a.d.getOrDefault(localObject1, null) == null)
    {
      localObject1 = f.l("getMediaItem for callback that isn't registered id=");
      ((StringBuilder)localObject1).append(b);
      Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
      return;
    }
    c localc = d.a;
    localObject1 = b;
    Object localObject2 = c;
    localc.getClass();
    localObject2 = new d((String)localObject1, (a)localObject2);
    localc.e((String)localObject1, (c.i)localObject2);
    if (((c.i)localObject2).b()) {
      return;
    }
    throw new IllegalStateException(g.d("onLoadItem must call detach() or sendResult() before returning for id=", (String)localObject1));
  }
}

/* Location:
 * Qualified Name:     g1.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */