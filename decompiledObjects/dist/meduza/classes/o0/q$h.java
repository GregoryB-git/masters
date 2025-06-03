package o0;

import java.util.LinkedHashSet;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={359, 362, 365}, m="readDataOrHandleCorruption")
public final class q$h
  extends c
{
  public Object a;
  public Object b;
  public int e;
  
  public q$h(q<T> paramq, ub.e<? super h> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    c = paramObject;
    e |= 0x80000000;
    paramObject = d;
    LinkedHashSet localLinkedHashSet = q.k;
    return ((q)paramObject).h(this);
  }
}

/* Location:
 * Qualified Name:     o0.q.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */