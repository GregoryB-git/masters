package o0;

import java.io.Serializable;
import java.util.Iterator;
import wb.c;

@wb.e(c="androidx.datastore.core.DataMigrationInitializer$Companion", f="DataMigrationInitializer.kt", l={42, 57}, m="runMigrations")
public final class f<T>
  extends c
{
  public Serializable a;
  public Iterator b;
  public int e;
  
  public f(h.a parama, ub.e<? super f> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    c = paramObject;
    e |= 0x80000000;
    return h.a.a(d, null, null, this);
  }
}

/* Location:
 * Qualified Name:     o0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */