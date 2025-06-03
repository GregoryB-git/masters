package o0;

import java.io.Serializable;
import java.util.Iterator;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={322, 348, 505}, m="readAndInit")
public final class q$c
  extends c
{
  public q a;
  public Object b;
  public Serializable c;
  public Object d;
  public q.d e;
  public Iterator f;
  public int q;
  
  public q$c(q<T> paramq, ub.e<? super c> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    o = paramObject;
    q |= 0x80000000;
    q localq = p;
    paramObject = q.k;
    return localq.d(this);
  }
}

/* Location:
 * Qualified Name:     o0.q.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */