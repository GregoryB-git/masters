package V5;

import g6.a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class p
  implements h, Serializable
{
  public a o;
  public volatile Object p;
  public final Object q;
  
  public p(a parama, Object paramObject)
  {
    o = parama;
    p = r.a;
    parama = (a)paramObject;
    if (paramObject == null) {
      parama = this;
    }
    q = parama;
  }
  
  private final Object writeReplace()
  {
    return new d(getValue());
  }
  
  public boolean a()
  {
    boolean bool;
    if (p != r.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object getValue()
  {
    Object localObject1 = p;
    r localr = r.a;
    if (localObject1 != localr) {
      return localObject1;
    }
    synchronized (q)
    {
      localObject1 = p;
      if (localObject1 == localr)
      {
        localObject1 = o;
        Intrinsics.b(localObject1);
        localObject1 = ((a)localObject1).invoke();
        p = localObject1;
        o = null;
      }
      return localObject1;
    }
  }
  
  public String toString()
  {
    String str;
    if (a()) {
      str = String.valueOf(getValue());
    } else {
      str = "Lazy value not initialized yet.";
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     V5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */