package i2;

import android.app.Activity;
import dc.p;
import nc.a0;
import nc.j1.b;
import nc.r0;
import pc.q;
import rb.f;
import rc.m;

public final class j
  implements i
{
  public final n b;
  public final j2.a c;
  
  public j(o paramo, j2.a parama)
  {
    b = paramo;
    c = parama;
  }
  
  public final qc.e<k> a(final Activity paramActivity)
  {
    ec.i.e(paramActivity, "activity");
    paramActivity = new a(this, paramActivity, null);
    ub.i locali = ub.i.a;
    pc.a locala = pc.a.a;
    paramActivity = new qc.b(paramActivity, locali, -2, locala);
    Object localObject = r0.a;
    localObject = sc.n.a;
    int i;
    if (((a0)localObject).get(j1.b.a) == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (!ec.i.a(localObject, locali)) {
        paramActivity = paramActivity.a((ub.h)localObject, -3, locala);
      }
      return paramActivity;
    }
    paramActivity = new StringBuilder();
    paramActivity.append("Flow context cannot contain job in it. Had ");
    paramActivity.append(localObject);
    throw new IllegalArgumentException(paramActivity.toString().toString());
  }
  
  @wb.e(c="androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f="WindowInfoTrackerImpl.kt", l={63}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<q<? super k>, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public a(j paramj, Activity paramActivity, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new a(c, paramActivity, parame);
      b = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((q)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
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
        c.c.a(paramActivity, new m1.b(4), (x0.k)localObject);
        localObject = new a(c, (x0.k)localObject);
        a = 1;
        if (pc.o.a((q)paramObject, (dc.a)localObject, this) == locala) {
          return locala;
        }
      }
      return rb.h.a;
    }
    
    public static final class a
      extends ec.j
      implements dc.a<rb.h>
    {
      public a(j paramj, x0.k paramk)
      {
        super();
      }
      
      public final Object invoke()
      {
        a.c.b(localObject);
        return rb.h.a;
      }
    }
  }
}

/* Location:
 * Qualified Name:     i2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */