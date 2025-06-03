package o0;

import java.io.File;
import java.io.FileOutputStream;
import wb.c;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={426}, m="writeData$datastore_core")
public final class q$i
  extends c
{
  public q a;
  public File b;
  public FileOutputStream c;
  public FileOutputStream d;
  public int o;
  
  public q$i(q<T> paramq, ub.e<? super i> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    e = paramObject;
    o |= 0x80000000;
    return f.j(null, this);
  }
}

/* Location:
 * Qualified Name:     o0.q.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */