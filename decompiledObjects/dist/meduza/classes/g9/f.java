package g9;

import android.content.Context;
import com.google.firebase.firestore.g;
import i9.k1;
import i9.n;
import m9.c0;
import m9.h0;
import m9.z;
import x6.b;

public abstract class f
{
  public final g a;
  public c0 b = new c0();
  public e9.a c;
  public n d;
  public j0 e;
  public h0 f;
  public k g;
  public i9.e h;
  public k1 i;
  
  public f(g paramg)
  {
    a = paramg;
  }
  
  public abstract k a();
  
  public abstract k1 b(a parama);
  
  public abstract i9.e c(a parama);
  
  public abstract n d(a parama);
  
  public abstract e9.a e(a parama);
  
  public abstract h0 f(a parama);
  
  public abstract j0 g(a parama);
  
  public final n h()
  {
    n localn = d;
    b.a0(localn, "localStore not initialized yet", new Object[0]);
    return localn;
  }
  
  public final j0 i()
  {
    j0 localj0 = e;
    b.a0(localj0, "syncEngine not initialized yet", new Object[0]);
    return localj0;
  }
  
  public static final class a
  {
    public final Context a;
    public final n9.a b;
    public final h c;
    public final e9.e d;
    
    public a(Context paramContext, n9.a parama, h paramh, e9.e parame, e9.a parama1, e9.a parama2, z paramz)
    {
      a = paramContext;
      b = parama;
      c = paramh;
      d = parame;
    }
  }
}

/* Location:
 * Qualified Name:     g9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */