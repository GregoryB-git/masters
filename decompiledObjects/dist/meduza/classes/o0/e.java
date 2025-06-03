package o0;

import dc.p;
import java.util.List;
import rb.f;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f="DataMigrationInitializer.kt", l={33}, m="invokeSuspend")
public final class e
  extends i
  implements p<k<Object>, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public e(List<? extends d<Object>> paramList, ub.e<? super e> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new e(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((e)create((k)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1) {
        f.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(paramObject);
      k localk = (k)b;
      paramObject = h.a;
      List localList = c;
      a = 1;
      if (h.a.a((h.a)paramObject, localList, localk, this) == locala) {
        return locala;
      }
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     o0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */