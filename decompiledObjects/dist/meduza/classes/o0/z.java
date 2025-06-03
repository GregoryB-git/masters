package o0;

import java.util.LinkedHashSet;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={402, 410}, m="transformAndWrite")
public final class z
  extends c
{
  public q a;
  public Object b;
  public Object c;
  public int f;
  
  public z(q<Object> paramq, ub.e<? super z> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    d = paramObject;
    f |= 0x80000000;
    paramObject = e;
    LinkedHashSet localLinkedHashSet = q.k;
    return ((q)paramObject).i(this, null, null);
  }
}

/* Location:
 * Qualified Name:     o0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */