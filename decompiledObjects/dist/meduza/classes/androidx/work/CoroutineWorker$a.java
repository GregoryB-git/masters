package androidx.work;

import dc.p;
import nc.d0;
import o2.d;
import rb.f;
import rb.h;
import vb.a;
import z2.c;

@wb.e(c="androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f="CoroutineWorker.kt", l={134}, m="invokeSuspend")
public final class CoroutineWorker$a
  extends wb.i
  implements p<d0, ub.e<? super h>, Object>
{
  public o2.i a;
  public int b;
  
  public CoroutineWorker$a(o2.i<d> parami, CoroutineWorker paramCoroutineWorker, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(c, d, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = a.a;
    int i = b;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject = a;
        f.b(paramObject);
        b.i(paramObject);
        return h.a;
      }
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
    f.b(paramObject);
    paramObject = c;
    localObject = d;
    a = ((o2.i)paramObject);
    b = 1;
    localObject.getClass();
    throw new IllegalStateException("Not implemented");
  }
}

/* Location:
 * Qualified Name:     androidx.work.CoroutineWorker.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */