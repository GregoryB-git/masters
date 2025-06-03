package o0;

import nc.r;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={276, 281, 284}, m="handleUpdate")
public final class x
  extends c
{
  public Object a;
  public q b;
  public r c;
  public int f;
  
  public x(q<Object> paramq, ub.e<? super x> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    d = paramObject;
    f |= 0x80000000;
    return q.b(e, null, this);
  }
}

/* Location:
 * Qualified Name:     o0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */