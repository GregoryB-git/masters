package t2;

import dc.q;
import rb.h;
import vb.a;

@wb.e(c="androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f="WorkConstraintsTracker.kt", l={292}, m="invokeSuspend")
public final class f$b
  extends wb.i
  implements q<qc.f<? super b>, b[], ub.e<? super h>, Object>
{
  public int a;
  
  public f$b(ub.e parame)
  {
    super(3, parame);
  }
  
  public final Object f(qc.f paramf, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (Object[])paramObject1;
    paramObject2 = new b((ub.e)paramObject2);
    b = paramf;
    c = ((Object[])paramObject1);
    return ((b)paramObject2).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(paramObject);
      qc.f localf = b;
      Object localObject = (b[])c;
      i = 0;
      int j = localObject.length;
      while (i < j)
      {
        paramObject = localObject[i];
        if ((ec.i.a(paramObject, b.a.a) ^ true)) {
          break label95;
        }
        i++;
      }
      paramObject = null;
      label95:
      localObject = paramObject;
      if (paramObject == null) {
        localObject = b.a.a;
      }
      a = 1;
      if (localf.emit(localObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     t2.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */