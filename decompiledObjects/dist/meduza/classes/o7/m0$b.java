package o7;

import java.util.Map;

public final class m0$b<K>
  extends x<K>
{
  public final transient u<K, ?> d;
  public final transient t<K> e;
  
  public m0$b(u paramu, m0.c paramc)
  {
    d = paramu;
    e = paramc;
  }
  
  public final t<K> a()
  {
    return e;
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if (d.get(paramObject) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int h(int paramInt, Object[] paramArrayOfObject)
  {
    return e.h(paramInt, paramArrayOfObject);
  }
  
  public final boolean m()
  {
    return true;
  }
  
  public final x0<K> n()
  {
    return e.r(0);
  }
  
  public final int size()
  {
    return d.size();
  }
}

/* Location:
 * Qualified Name:     o7.m0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */