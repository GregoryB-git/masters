package p1;

import b3.e;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p6.P;
import p6.q0;
import u.c;
import u.c.a;

public abstract class b
{
  public static final e b(P paramP, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramP, "<this>");
    paramP = c.a(new a(paramP, paramObject));
    Intrinsics.checkNotNullExpressionValue(paramP, "getFuture { completer ->…        }\n    }\n    tag\n}");
    return paramP;
  }
  
  public static final Object d(final P paramP, Object paramObject, c.a parama)
  {
    Intrinsics.checkNotNullParameter(paramP, "$this_asListenableFuture");
    Intrinsics.checkNotNullParameter(parama, "completer");
    paramP.e(new a(parama, paramP));
    return paramObject;
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public a(c.a parama, P paramP)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      if (paramThrowable != null)
      {
        if ((paramThrowable instanceof CancellationException)) {
          o.c();
        } else {
          o.e(paramThrowable);
        }
      }
      else {
        o.b(paramP.c());
      }
    }
  }
}

/* Location:
 * Qualified Name:     p1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */