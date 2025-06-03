package pc;

import vb.a;
import wb.c;

@wb.e(c="kotlinx.coroutines.channels.BufferedChannel", f="BufferedChannel.kt", l={739}, m="receiveCatching-JP2dKIU$suspendImpl")
public final class b$d<E>
  extends c
{
  public int c;
  
  public b$d(b<E> paramb, ub.e<? super d> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a = paramObject;
    c |= 0x80000000;
    paramObject = b.D(b, this);
    if (paramObject == a.a) {
      return paramObject;
    }
    return new j(paramObject);
  }
}

/* Location:
 * Qualified Name:     pc.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */