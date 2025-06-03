package o0;

import java.util.concurrent.atomic.AtomicInteger;
import nc.d0;
import p2.m0;
import pc.b;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.SimpleActor$offer$2", f="SimpleActor.kt", l={122, 122}, m="invokeSuspend")
public final class o
  extends i
  implements dc.p<d0, ub.e<? super h>, Object>
{
  public dc.p a;
  public int b;
  
  public o(p<Object> paramp, ub.e<? super o> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new o(c, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((o)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = b;
    Object localObject1;
    dc.p localp;
    Object localObject2;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          f.b(paramObject);
          localObject1 = this;
          break label186;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      localp = a;
      f.b(paramObject);
      localObject2 = paramObject;
      paramObject = this;
    }
    else
    {
      f.b(paramObject);
      if (c.d.get() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        break label207;
      }
      paramObject = this;
    }
    label186:
    do
    {
      m0.C(c.a.f());
      localObject1 = c;
      localp = b;
      localObject1 = c;
      a = localp;
      b = 1;
      localObject1 = ((b)localObject1).C((ub.e)paramObject);
      localObject2 = localObject1;
      if (localObject1 == locala) {
        return locala;
      }
      a = null;
      b = 2;
      localObject1 = paramObject;
      if (localp.invoke(localObject2, paramObject) == locala) {
        return locala;
      }
      paramObject = localObject1;
    } while (c.d.decrementAndGet() != 0);
    return h.a;
    label207:
    throw new IllegalStateException("Check failed.".toString());
  }
}

/* Location:
 * Qualified Name:     o0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */