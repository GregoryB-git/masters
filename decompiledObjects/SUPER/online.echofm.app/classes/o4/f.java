package o4;

import B3.F;
import B3.c.b;
import V2.m;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import y3.a;

public class f
  implements i, j
{
  public final r4.b a;
  public final Context b;
  public final r4.b c;
  public final Set d;
  public final Executor e;
  
  public f(Context paramContext, String paramString, Set paramSet, r4.b paramb, Executor paramExecutor)
  {
    this(new c(paramContext, paramString), paramSet, paramExecutor, paramb, paramContext);
  }
  
  public f(r4.b paramb1, Set paramSet, Executor paramExecutor, r4.b paramb2, Context paramContext)
  {
    a = paramb1;
    d = paramSet;
    e = paramExecutor;
    c = paramb2;
    b = paramContext;
  }
  
  public static B3.c g()
  {
    F localF = F.a(a.class, Executor.class);
    return B3.c.f(f.class, new Class[] { i.class, j.class }).b(B3.r.k(Context.class)).b(B3.r.k(s3.e.class)).b(B3.r.n(g.class)).b(B3.r.m(O4.i.class)).b(B3.r.j(localF)).f(new b(localF)).d();
  }
  
  public V2.j a()
  {
    if ((E.r.a(b) ^ true)) {
      return m.e("");
    }
    return m.c(e, new d(this));
  }
  
  public j.a b(String paramString)
  {
    label51:
    try
    {
      long l = System.currentTimeMillis();
      paramString = (q)a.get();
      if (paramString.i(l))
      {
        paramString.g();
        paramString = j.a.r;
        return paramString;
      }
    }
    finally
    {
      break label51;
      paramString = j.a.p;
      return paramString;
    }
  }
  
  public V2.j l()
  {
    if (d.size() <= 0) {
      return m.e(null);
    }
    if ((E.r.a(b) ^ true)) {
      return m.e(null);
    }
    return m.c(e, new e(this));
  }
}

/* Location:
 * Qualified Name:     o4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */