package g2;

import dc.p;
import nc.d0;
import rb.h;
import wb.i;

@wb.e(c="androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", f="CallbackToFlowAdapter.kt", l={46}, m="invokeSuspend")
public final class a
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public a(qc.e<Object> parame, d0.a<Object> parama, ub.e<? super a> parame1)
  {
    super(2, parame1);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(b, c, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
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
      paramObject = b;
      a locala1 = new a(c);
      a = 1;
      if (((qc.e)paramObject).collect(locala1, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
  
  public static final class a<T>
    implements qc.f
  {
    public a(d0.a<T> parama) {}
    
    public final Object emit(T paramT, ub.e<? super h> parame)
    {
      a.accept(paramT);
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     g2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */