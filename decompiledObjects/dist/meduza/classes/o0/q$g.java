package o0;

import java.io.FileInputStream;
import java.util.LinkedHashSet;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={381}, m="readData")
public final class q$g
  extends c
{
  public q a;
  public FileInputStream b;
  public int e;
  
  public q$g(q<T> paramq, ub.e<? super g> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    c = paramObject;
    e |= 0x80000000;
    paramObject = d;
    LinkedHashSet localLinkedHashSet = q.k;
    return ((q)paramObject).g(this);
  }
}

/* Location:
 * Qualified Name:     o0.q.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */