package ea;

import java.util.concurrent.atomic.AtomicReference;
import nc.d0;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$1", f="SessionDatastore.kt", l={82}, m="invokeSuspend")
public final class w$a
  extends i
  implements dc.p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public w$a(w paramw, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(b, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
      Object localObject = b;
      paramObject = d;
      localObject = new a((w)localObject);
      a = 1;
      if (((w.f)paramObject).collect((qc.f)localObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
  
  public static final class a<T>
    implements qc.f
  {
    public a(w paramw) {}
    
    public final Object emit(Object paramObject, ub.e parame)
    {
      paramObject = (p)paramObject;
      a.c.set(paramObject);
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     ea.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */