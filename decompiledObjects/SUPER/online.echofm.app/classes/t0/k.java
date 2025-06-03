package t0;

import android.content.Context;
import android.content.pm.PackageManager;
import d0.q;
import d0.z;
import g0.M;
import g0.o;

public final class k
  implements m.b
{
  public final Context a;
  public int b;
  public boolean c;
  
  public k(Context paramContext)
  {
    a = paramContext;
    b = 0;
    c = true;
  }
  
  public m a(m.a parama)
  {
    if (M.a >= 23)
    {
      int i = b;
      if ((i == 1) || ((i == 0) && (b())))
      {
        i = z.k(c.n);
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Creating an asynchronous MediaCodec adapter for track type ");
        ((StringBuilder)localObject).append(M.p0(i));
        o.f("DMCodecAdapterFactory", ((StringBuilder)localObject).toString());
        localObject = new b.b(i);
        ((b.b)localObject).e(c);
        return ((b.b)localObject).d(parama);
      }
    }
    return new K.b().a(parama);
  }
  
  public final boolean b()
  {
    int i = M.a;
    if (i >= 31) {
      return true;
    }
    Context localContext = a;
    return (localContext != null) && (i >= 28) && (localContext.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"));
  }
}

/* Location:
 * Qualified Name:     t0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */