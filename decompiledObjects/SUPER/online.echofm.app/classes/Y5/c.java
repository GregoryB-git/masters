package Y5;

import V5.o;
import X5.g;
import Z5.a;
import Z5.j;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

public abstract class c
{
  public static X5.d a(final p paramp, final Object paramObject, X5.d paramd)
  {
    Intrinsics.checkNotNullParameter(paramp, "<this>");
    Intrinsics.checkNotNullParameter(paramd, "completion");
    X5.d locald = Z5.h.a(paramd);
    if ((paramp instanceof a))
    {
      paramp = ((a)paramp).create(paramObject, locald);
    }
    else
    {
      paramd = locald.getContext();
      if (paramd == X5.h.o) {
        paramp = new a(locald, paramp, paramObject);
      } else {
        paramp = new b(locald, paramd, paramp, paramObject);
      }
    }
    return paramp;
  }
  
  public static X5.d b(X5.d paramd)
  {
    Intrinsics.checkNotNullParameter(paramd, "<this>");
    Z5.d locald;
    if ((paramd instanceof Z5.d)) {
      locald = (Z5.d)paramd;
    } else {
      locald = null;
    }
    X5.d locald1 = paramd;
    if (locald != null)
    {
      locald1 = locald.intercepted();
      if (locald1 == null) {
        locald1 = paramd;
      }
    }
    return locald1;
  }
  
  public static final class a
    extends j
  {
    public int o;
    
    public a(X5.d paramd, p paramp, Object paramObject)
    {
      super();
    }
    
    public Object invokeSuspend(Object paramObject)
    {
      int i = o;
      if (i != 0)
      {
        if (i == 1)
        {
          o = 2;
          o.b(paramObject);
        }
        else
        {
          throw new IllegalStateException("This coroutine had already completed".toString());
        }
      }
      else
      {
        o = 1;
        o.b(paramObject);
        Intrinsics.c(paramp, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        paramObject = ((p)y.b(paramp, 2)).invoke(paramObject, this);
      }
      return paramObject;
    }
  }
  
  public static final class b
    extends Z5.d
  {
    public int o;
    
    public b(X5.d paramd, g paramg, p paramp, Object paramObject)
    {
      super(paramg);
    }
    
    public Object invokeSuspend(Object paramObject)
    {
      int i = o;
      if (i != 0)
      {
        if (i == 1)
        {
          o = 2;
          o.b(paramObject);
        }
        else
        {
          throw new IllegalStateException("This coroutine had already completed".toString());
        }
      }
      else
      {
        o = 1;
        o.b(paramObject);
        Intrinsics.c(paramp, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        paramObject = ((p)y.b(paramp, 2)).invoke(paramObject, this);
      }
      return paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     Y5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */