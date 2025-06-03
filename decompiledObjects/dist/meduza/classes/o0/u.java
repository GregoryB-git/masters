package o0;

import ec.r;
import qc.l;
import qc.t;
import qc.x;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore$data$1", f="SingleProcessDataStore.kt", l={117}, m="invokeSuspend")
public final class u
  extends i
  implements dc.p<qc.f<Object>, ub.e<? super h>, Object>
{
  public int a;
  
  public u(q<Object> paramq, ub.e<? super u> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new u(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((u)create((qc.f)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    Object localObject1;
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
      localObject1 = (qc.f)b;
      Object localObject2 = (b0)c.h.b();
      if (!(localObject2 instanceof c)) {
        c.j.a(new q.a.a((b0)localObject2));
      }
      paramObject = c.h;
      localObject2 = new a((b0)localObject2, null);
      a = 1;
      if ((localObject1 instanceof x)) {
        break label205;
      }
      localObject1 = new v((qc.f)localObject1);
      paramObject = ((t)paramObject).collect(new l(new r(), (qc.f)localObject1, (dc.p)localObject2), this);
      if (paramObject != locala) {
        paramObject = h.a;
      }
      if (paramObject != locala) {
        paramObject = h.a;
      }
      if (paramObject != locala) {
        paramObject = h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
    }
    return h.a;
    label205:
    ((x)localObject1).getClass();
    throw null;
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore$data$1$1", f="SingleProcessDataStore.kt", l={}, m="invokeSuspend")
  public static final class a
    extends i
    implements dc.p<b0<Object>, ub.e<? super Boolean>, Object>
  {
    public a(b0<Object> paramb0, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new a(b, parame);
      a = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((b0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject = a.a;
      rb.f.b(paramObject);
      localObject = (b0)a;
      paramObject = b;
      boolean bool1 = paramObject instanceof c;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (!bool1) {
        if ((paramObject instanceof j))
        {
          bool3 = bool2;
        }
        else
        {
          bool3 = bool2;
          if (localObject == paramObject) {
            bool3 = true;
          }
        }
      }
      return Boolean.valueOf(bool3);
    }
  }
}

/* Location:
 * Qualified Name:     o0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */