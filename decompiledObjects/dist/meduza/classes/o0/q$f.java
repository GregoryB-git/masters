package o0;

import java.util.LinkedHashSet;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={311}, m="readAndInitOrPropagateFailure")
public final class q$f
  extends c
{
  public q a;
  public int d;
  
  public q$f(q<T> paramq, ub.e<? super f> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b = paramObject;
    d |= 0x80000000;
    paramObject = c;
    LinkedHashSet localLinkedHashSet = q.k;
    return ((q)paramObject).f(this);
  }
}

/* Location:
 * Qualified Name:     o0.q.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */