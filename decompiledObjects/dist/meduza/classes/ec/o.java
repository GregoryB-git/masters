package ec;

import jc.g;
import jc.g.a;

public abstract class o
  extends q
  implements g
{
  public o(Class paramClass)
  {
    super(b.NO_RECEIVER, paramClass, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
  }
  
  public final g.a a()
  {
    return ((g)e()).a();
  }
  
  public final jc.b computeReflected()
  {
    t.a.getClass();
    return this;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((p)this).a().call(new Object[] { paramObject1, paramObject2 });
  }
}

/* Location:
 * Qualified Name:     ec.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */