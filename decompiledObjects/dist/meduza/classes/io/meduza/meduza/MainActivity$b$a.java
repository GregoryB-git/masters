package io.meduza.meduza;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="io.meduza.meduza.MainActivity$networkHandler$1$onCapabilitiesChanged$1", f="MainActivity.kt", l={}, m="invokeSuspend")
public final class MainActivity$b$a
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public MainActivity$b$a(MainActivity paramMainActivity, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(a, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    f.b(paramObject);
    paramObject = a;
    ((MainActivity)paramObject).b(d);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     io.meduza.meduza.MainActivity.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */