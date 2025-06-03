package pc;

import vb.a;
import wb.c;

@wb.e(c="kotlinx.coroutines.channels.BufferedChannel", f="BufferedChannel.kt", l={3056}, m="receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class b$e
  extends c
{
  public int c;
  
  public b$e(b<E> paramb, ub.e<? super e> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a = paramObject;
    c |= 0x80000000;
    b localb = b;
    paramObject = b.c;
    paramObject = localb.E(null, 0, 0L, this);
    if (paramObject == a.a) {
      return paramObject;
    }
    return new j(paramObject);
  }
}

/* Location:
 * Qualified Name:     pc.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */