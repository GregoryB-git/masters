package pc;

import ec.j;
import nc.j1.b;
import p2.m0;
import rb.f;
import wb.c;

public final class o
{
  public static final Object a(q<?> paramq, dc.a<rb.h> parama, ub.e<? super rb.h> parame)
  {
    if ((parame instanceof a))
    {
      localObject1 = (a)parame;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        break label47;
      }
    }
    Object localObject1 = new a(parame);
    label47:
    Object localObject2 = c;
    vb.a locala = vb.a.a;
    int i = d;
    if (i != 0) {
      if (i == 1)
      {
        parama = b;
        parame = parama;
      }
    }
    try
    {
      f.b(localObject2);
      break label224;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      f.b(localObject2);
      if (((ub.e)localObject1).getContext().get(j1.b.a) == paramq) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        parame = parama;
        a = paramq;
        parame = parama;
        b = parama;
        parame = parama;
        d = 1;
        parame = parama;
        localObject2 = new nc/l;
        parame = parama;
        ((nc.l)localObject2).<init>(1, m0.P((ub.e)localObject1));
        parame = parama;
        ((nc.l)localObject2).t();
        parame = parama;
        localObject1 = new pc/o$b;
        parame = parama;
        ((b)localObject1).<init>((nc.l)localObject2);
        parame = parama;
        paramq.a((b)localObject1);
        parame = parama;
        paramq = ((nc.l)localObject2).s();
        if (paramq == locala) {
          return locala;
        }
        label224:
        return rb.h.a;
      }
    }
    finally
    {
      parame.invoke();
    }
    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
  }
  
  @wb.e(c="kotlinx.coroutines.channels.ProduceKt", f="Produce.kt", l={153}, m="awaitClose")
  public static final class a
    extends c
  {
    public q a;
    public dc.a b;
    public int d;
    
    public a(ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      c = paramObject;
      d |= 0x80000000;
      return o.a(null, null, this);
    }
  }
  
  public static final class b
    extends j
    implements dc.l<Throwable, rb.h>
  {
    public b(nc.l paraml)
    {
      super();
    }
    
    public final Object invoke(Object paramObject)
    {
      paramObject = (Throwable)paramObject;
      paramObject = a;
      rb.h localh = rb.h.a;
      ((ub.e)paramObject).resumeWith(localh);
      return localh;
    }
  }
}

/* Location:
 * Qualified Name:     pc.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */