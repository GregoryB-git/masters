package o0;

import dc.l;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f="DataMigrationInitializer.kt", l={45}, m="invokeSuspend")
public final class g$a
  extends i
  implements l<ub.e<? super h>, Object>
{
  public int a;
  
  public g$a(d<Object> paramd, ub.e<? super a> parame)
  {
    super(1, parame);
  }
  
  public final ub.e<h> create(ub.e<?> parame)
  {
    return new a(b, parame);
  }
  
  public final Object invoke(Object paramObject)
  {
    return ((a)create((ub.e)paramObject)).invokeSuspend(h.a);
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
      paramObject = b;
      a = 1;
      if (((d)paramObject).a() == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     o0.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */