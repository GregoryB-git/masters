package qc;

import pc.q;
import wb.c;

@wb.e(c="kotlinx.coroutines.flow.CallbackFlowBuilder", f="Builders.kt", l={334}, m="collectTo")
public final class b$a
  extends c
{
  public q a;
  public int d;
  
  public b$a(b<T> paramb, ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    d |= 0x80000000;
    return c.b(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */