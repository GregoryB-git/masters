package qc;

import dc.q;
import ea.w.e;
import rb.h;
import vb.a;
import wb.c;
import x6.b;

public final class i
  implements e<Object>
{
  public i(e parame, w.e parame1) {}
  
  public final Object collect(f<Object> paramf, ub.e<? super h> parame)
  {
    Object localObject1;
    if ((parame instanceof a))
    {
      localObject1 = (a)parame;
      i = b;
      if ((i & 0x80000000) != 0)
      {
        b = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super h>)localObject1;
        break label50;
      }
    }
    parame = new a(this, parame);
    label50:
    Object localObject2 = a;
    a locala = a.a;
    int i = b;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          rb.f.b(localObject2);
          break label215;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramf = e;
      localObject1 = d;
      rb.f.b(localObject2);
    }
    else
    {
      rb.f.b(localObject2);
      localObject1 = a;
      d = this;
      e = paramf;
      b = 1;
      localObject2 = b.k(parame, (e)localObject1, paramf);
      if (localObject2 == locala) {
        return locala;
      }
      localObject1 = this;
    }
    localObject2 = (Throwable)localObject2;
    if (localObject2 != null)
    {
      localObject1 = b;
      d = null;
      e = null;
      b = 2;
      if (((q)localObject1).f(paramf, localObject2, parame) == locala) {
        return locala;
      }
    }
    label215:
    return h.a;
  }
  
  @wb.e(c="kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f="Errors.kt", l={114, 115}, m="collect")
  public static final class a
    extends c
  {
    public int b;
    public i d;
    public f e;
    
    public a(i parami, ub.e parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a = paramObject;
      b |= 0x80000000;
      return c.collect(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     qc.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */