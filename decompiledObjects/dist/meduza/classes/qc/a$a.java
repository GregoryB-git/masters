package qc;

import rc.o;
import wb.c;

@wb.e(c="kotlinx.coroutines.flow.AbstractFlow", f="Flow.kt", l={230}, m="collect")
public final class a$a
  extends c
{
  public o a;
  public int d;
  
  public a$a(a<T> parama, ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    d |= 0x80000000;
    return c.collect(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */