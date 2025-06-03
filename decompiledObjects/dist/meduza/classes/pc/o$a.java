package pc;

import dc.a;
import wb.c;

@wb.e(c="kotlinx.coroutines.channels.ProduceKt", f="Produce.kt", l={153}, m="awaitClose")
public final class o$a
  extends c
{
  public q a;
  public a b;
  public int d;
  
  public o$a(ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    c = paramObject;
    d |= 0x80000000;
    return o.a(null, null, this);
  }
}

/* Location:
 * Qualified Name:     pc.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */