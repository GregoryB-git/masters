package androidx.work;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;
import z2.c;

@wb.e(c="androidx.work.CoroutineWorker$startWork$1", f="CoroutineWorker.kt", l={68}, m="invokeSuspend")
public final class b
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public b(CoroutineWorker paramCoroutineWorker, ub.e<? super b> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new b(b, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((b)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    if ((i == 0) || (i == 1)) {}
    try
    {
      f.b(paramObject);
      break label66;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      f.b(paramObject);
      paramObject = b;
      a = 1;
      Object localObject = ((CoroutineWorker)paramObject).j();
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
      label66:
      paramObject = (d.a)paramObject;
    }
    finally
    {
      b.f.j((Throwable)paramObject);
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     androidx.work.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */