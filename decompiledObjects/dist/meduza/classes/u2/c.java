package u2;

import dc.p;
import java.util.AbstractCollection;
import pc.o;
import pc.q;
import rb.f;
import t2.b;
import t2.b.a;
import t2.b.b;

@wb.e(c="androidx.work.impl.constraints.controllers.ConstraintController$track$1", f="ContraintControllers.kt", l={55}, m="invokeSuspend")
public final class c
  extends wb.i
  implements p<q<? super b>, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public c(d<Object> paramd, ub.e<? super c> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new c(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((c)create((q)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(final Object paramObject)
  {
    vb.a locala = vb.a.a;
    int i = a;
    final b localb;
    Object localObject2;
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
      ??? = c;
      localb = new b((d)???, (q)paramObject);
      localObject2 = a;
      localObject2.getClass();
    }
    synchronized (c)
    {
      if (d.add(localb))
      {
        if (d.size() == 1)
        {
          e = ((v2.g)localObject2).a();
          o2.j localj = o2.j.d();
          String str = v2.h.a;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(localObject2.getClass().getSimpleName());
          localStringBuilder.append(": initial state = ");
          localStringBuilder.append(e);
          localj.a(str, localStringBuilder.toString());
          ((v2.g)localObject2).c();
        }
        localb.a(e);
      }
      localObject2 = rb.h.a;
      ??? = new a(c, localb);
      a = 1;
      if (o.a((q)paramObject, (dc.a)???, this) == locala) {
        return locala;
      }
      return rb.h.a;
    }
  }
  
  public static final class a
    extends ec.j
    implements dc.a<rb.h>
  {
    public a(d paramd, c.b paramb)
    {
      super();
    }
    
    public final Object invoke()
    {
      v2.g localg = a.a;
      c.b localb = localb;
      localg.getClass();
      ec.i.e(localb, "listener");
      synchronized (c)
      {
        if ((d.remove(localb)) && (d.isEmpty())) {
          localg.d();
        }
        return rb.h.a;
      }
    }
  }
  
  public static final class b
    implements t2.a<Object>
  {
    public b(d<Object> paramd, q<? super b> paramq) {}
    
    public final void a(Object paramObject)
    {
      if (a.c(paramObject)) {
        paramObject = new b.b(a.a());
      } else {
        paramObject = b.a.a;
      }
      paramObject.getChannel().l(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     u2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */