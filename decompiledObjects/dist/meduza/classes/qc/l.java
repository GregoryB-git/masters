package qc;

import dc.p;
import ec.r;
import rb.h;
import vb.a;
import wb.c;

public final class l<T>
  implements f
{
  public l(r paramr, f<? super T> paramf, p<? super T, ? super ub.e<? super Boolean>, ? extends Object> paramp) {}
  
  public final Object emit(T paramT, ub.e<? super h> parame)
  {
    if ((parame instanceof a))
    {
      localObject = (a)parame;
      i = e;
      if ((i & 0x80000000) != 0)
      {
        e = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super h>)localObject;
        break label50;
      }
    }
    parame = new a(this, parame);
    label50:
    Object localObject = c;
    a locala = a.a;
    int i = e;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            rb.f.b(localObject);
            break label272;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paramT = b;
        locall = a;
        rb.f.b(localObject);
        break label216;
      }
      rb.f.b(localObject);
    }
    else
    {
      rb.f.b(localObject);
      if (!a.a) {
        break label175;
      }
      localObject = b;
      e = 1;
      if (((f)localObject).emit(paramT, parame) == locala) {
        return locala;
      }
    }
    return h.a;
    label175:
    localObject = c;
    a = this;
    b = paramT;
    e = 2;
    localObject = ((p)localObject).invoke(paramT, parame);
    if (localObject == locala) {
      return locala;
    }
    l locall = this;
    label216:
    if (!((Boolean)localObject).booleanValue())
    {
      a.a = true;
      localObject = b;
      a = null;
      b = null;
      e = 3;
      if (((f)localObject).emit(paramT, parame) == locala) {
        return locala;
      }
      label272:
      return h.a;
    }
    return h.a;
  }
  
  @wb.e(c="kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f="Limit.kt", l={37, 38, 40}, m="emit")
  public static final class a
    extends c
  {
    public l a;
    public Object b;
    public int e;
    
    public a(l<? super T> paraml, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      c = paramObject;
      e |= 0x80000000;
      return d.emit(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     qc.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */