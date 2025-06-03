package o0;

import ec.s;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f="SingleProcessDataStore.kt", l={503, 337, 339}, m="updateData")
public final class y
  extends c
{
  public Object a;
  public Object b;
  public Object c;
  public s d;
  public q e;
  public int p;
  
  public y(q.d paramd, ub.e<? super y> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    f = paramObject;
    p |= 0x80000000;
    return o.a(null, this);
  }
}

/* Location:
 * Qualified Name:     o0.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */