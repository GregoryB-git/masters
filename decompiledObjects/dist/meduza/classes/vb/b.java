package vb;

import dc.p;
import ec.i;
import ec.v;
import rb.f;
import ub.e;
import wb.g;

public final class b
  extends g
{
  public int a;
  
  public b(Object paramObject, e parame, p paramp)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    int i = a;
    if (i != 0)
    {
      if (i == 1)
      {
        a = 2;
        f.b(paramObject);
      }
      else
      {
        throw new IllegalStateException("This coroutine had already completed".toString());
      }
    }
    else
    {
      a = 1;
      f.b(paramObject);
      i.c(b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
      paramObject = b;
      v.a(2, paramObject);
      paramObject = ((p)paramObject).invoke(c, this);
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     vb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */