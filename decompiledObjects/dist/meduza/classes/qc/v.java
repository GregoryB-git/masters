package qc;

import rc.o;
import wb.c;

@wb.e(c="kotlinx.coroutines.flow.SubscribedFlowCollector", f="Share.kt", l={419, 423}, m="onSubscription")
public final class v
  extends c
{
  public w a;
  public o b;
  public int e;
  
  public v(w<Object> paramw, ub.e<? super v> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    c = paramObject;
    e |= 0x80000000;
    return d.a(this);
  }
}

/* Location:
 * Qualified Name:     qc.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */