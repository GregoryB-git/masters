package o0;

import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={302}, m="readAndInitOrPropagateAndThrowFailure")
public final class q$e
  extends c
{
  public q a;
  public int d;
  
  public q$e(q<T> paramq, ub.e<? super e> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    d |= 0x80000000;
    q localq = c;
    paramObject = q.k;
    return localq.e(this);
  }
}

/* Location:
 * Qualified Name:     o0.q.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */