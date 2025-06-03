package qc;

import rb.h;
import rc.o;
import ub.e;
import vb.a;

public final class w<T>
  implements f<T>
{
  public final h a(e parame)
  {
    if ((parame instanceof v))
    {
      localObject1 = (v)parame;
      i = e;
      if ((i & 0x80000000) != 0)
      {
        e = (i + Integer.MIN_VALUE);
        break label45;
      }
    }
    Object localObject1 = new v(this, parame);
    label45:
    Object localObject3 = c;
    parame = a.a;
    int i = e;
    if (i != 0) {
      if (i != 1) {
        if (i == 2) {
          rb.f.b(localObject3);
        }
      }
    }
    for (;;)
    {
      return h.a;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      o localo = b;
      localObject1 = a;
      parame = localo;
      try
      {
        rb.f.b(localObject3);
        localo.releaseIntercepted();
        localObject1.getClass();
      }
      finally
      {
        parame.releaseIntercepted();
      }
    }
    rb.f.b(localObject3);
    localo = new o(null, ((e)localObject1).getContext());
    parame = localo;
    a = this;
    parame = localo;
    b = localo;
    parame = localo;
    e = 1;
    parame = localo;
    throw null;
  }
  
  public final Object emit(T paramT, e<? super h> parame)
  {
    throw null;
  }
}

/* Location:
 * Qualified Name:     qc.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */