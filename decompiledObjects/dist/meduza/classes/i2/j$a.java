package i2;

import android.app.Activity;
import dc.p;
import m1.b;
import pc.o;
import pc.q;
import rb.f;
import rb.h;
import wb.i;

@wb.e(c="androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f="WindowInfoTrackerImpl.kt", l={63}, m="invokeSuspend")
public final class j$a
  extends i
  implements p<q<? super k>, ub.e<? super h>, Object>
{
  public int a;
  
  public j$a(j paramj, Activity paramActivity, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new a(c, d, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((q)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
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
      paramObject = (q)b;
      final Object localObject = new x0.k(paramObject, 2);
      c.c.a(d, new b(4), (x0.k)localObject);
      localObject = new a(c, (x0.k)localObject);
      a = 1;
      if (o.a((q)paramObject, (dc.a)localObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
  
  public static final class a
    extends ec.j
    implements dc.a<h>
  {
    public a(j paramj, x0.k paramk)
    {
      super();
    }
    
    public final Object invoke()
    {
      a.c.b(localObject);
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     i2.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */