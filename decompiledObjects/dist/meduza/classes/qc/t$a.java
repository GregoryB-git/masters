package qc;

import nc.j1;
import wb.c;

@wb.e(c="kotlinx.coroutines.flow.StateFlowImpl", f="StateFlow.kt", l={384, 396, 401}, m="collect")
public final class t$a
  extends c
{
  public t a;
  public f b;
  public u c;
  public j1 d;
  public Object e;
  public int p;
  
  public t$a(t<T> paramt, ub.e<? super a> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    f = paramObject;
    p |= 0x80000000;
    return o.collect(null, this);
  }
}

/* Location:
 * Qualified Name:     qc.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */