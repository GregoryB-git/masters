package R;

import P.f;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import p6.I;

public final class c
  implements i6.a
{
  public final String a;
  public final g6.l b;
  public final I c;
  public final Object d;
  public volatile f e;
  
  public c(String paramString, Q.b paramb, g6.l paraml, I paramI)
  {
    a = paramString;
    b = paraml;
    c = paramI;
    d = new Object();
  }
  
  public f c(Context paramContext, h paramh)
  {
    Intrinsics.checkNotNullParameter(paramContext, "thisRef");
    Intrinsics.checkNotNullParameter(paramh, "property");
    ??? = e;
    paramh = (h)???;
    if (??? == null)
    {
      synchronized (d)
      {
        if (e == null)
        {
          paramContext = paramContext.getApplicationContext();
          paramh = S.c.a;
          Object localObject2 = b;
          Intrinsics.checkNotNullExpressionValue(paramContext, "applicationContext");
          localObject2 = (List)((g6.l)localObject2).invoke(paramContext);
          I localI = c;
          a locala = new R/c$a;
          locala.<init>(paramContext, this);
          e = paramh.a(null, (List)localObject2, localI, locala);
        }
      }
      paramh = e;
      Intrinsics.b(paramh);
      return paramh;
      throw paramContext;
    }
    return paramh;
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.a
  {
    public a(Context paramContext, c paramc)
    {
      super();
    }
    
    public final File a()
    {
      Context localContext = o;
      Intrinsics.checkNotNullExpressionValue(localContext, "applicationContext");
      return b.a(localContext, c.b(p));
    }
  }
}

/* Location:
 * Qualified Name:     R.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */