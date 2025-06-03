package o0;

import dc.p;
import rb.f;
import rb.h;
import vb.a;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore$actor$3", f="SingleProcessDataStore.kt", l={239, 242}, m="invokeSuspend")
public final class t
  extends wb.i
  implements p<q.a<Object>, ub.e<? super h>, Object>
{
  public int a;
  
  public t(q<Object> paramq, ub.e<? super t> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new t(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((t)create((q.a)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    if (i != 0)
    {
      if ((i != 1) && (i != 2)) {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      f.b(paramObject);
    }
    else
    {
      f.b(paramObject);
      Object localObject = (q.a)b;
      if ((localObject instanceof q.a.a))
      {
        paramObject = c;
        q.a.a locala1 = (q.a.a)localObject;
        a = 1;
        localObject = (b0)h.b();
        if (!(localObject instanceof c)) {
          if ((localObject instanceof l))
          {
            if (localObject == a)
            {
              paramObject = ((q)paramObject).f(this);
              if (paramObject == locala) {
                break label173;
              }
            }
          }
          else if (ec.i.a(localObject, c0.a))
          {
            paramObject = ((q)paramObject).f(this);
            if (paramObject == locala) {
              break label173;
            }
          }
          else
          {
            if ((localObject instanceof j)) {
              break label180;
            }
          }
        }
        paramObject = h.a;
        label173:
        if (paramObject == locala)
        {
          return locala;
          label180:
          throw new IllegalStateException("Can't read in final state.".toString());
        }
      }
      else if ((localObject instanceof q.a.b))
      {
        paramObject = c;
        localObject = (q.a.b)localObject;
        a = 2;
        if (q.b((q)paramObject, (q.a.b)localObject, this) == locala) {
          return locala;
        }
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     o0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */