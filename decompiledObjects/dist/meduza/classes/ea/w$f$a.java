package ea;

import r0.d;
import rb.h;
import vb.a;
import wb.c;

public final class w$f$a<T>
  implements qc.f
{
  public w$f$a(qc.f paramf, w paramw) {}
  
  public final Object emit(Object paramObject, ub.e parame)
  {
    if ((parame instanceof a))
    {
      localObject1 = (a)parame;
      i = b;
      if ((i & 0x80000000) != 0)
      {
        b = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label50;
      }
    }
    parame = new a(this, parame);
    label50:
    Object localObject2 = a;
    Object localObject1 = a.a;
    int i = b;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(localObject2);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject2);
      localObject2 = a;
      paramObject = (d)paramObject;
      w localw = b;
      w.c localc = w.e;
      localw.getClass();
      paramObject = new p((String)((d)paramObject).b(w.d.a));
      b = 1;
      if (((qc.f)localObject2).emit(paramObject, parame) == localObject1) {
        return localObject1;
      }
    }
    return h.a;
  }
  
  @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f="SessionDatastore.kt", l={223}, m="emit")
  public static final class a
    extends c
  {
    public int b;
    
    public a(w.f.a parama, ub.e parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a = paramObject;
      b |= 0x80000000;
      return c.emit(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     ea.w.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */