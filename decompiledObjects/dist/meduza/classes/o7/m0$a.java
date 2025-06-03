package o7;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.Objects;
import x6.b;

public final class m0$a<K, V>
  extends x<Map.Entry<K, V>>
{
  public final transient u<K, V> d;
  public final transient Object[] e;
  public final transient int f;
  public final transient int o;
  
  public m0$a(u paramu, Object[] paramArrayOfObject, int paramInt)
  {
    d = paramu;
    e = paramArrayOfObject;
    f = 0;
    o = paramInt;
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      bool3 = bool2;
      if (localObject != null)
      {
        bool3 = bool2;
        if (localObject.equals(d.get(paramObject))) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public final int h(int paramInt, Object[] paramArrayOfObject)
  {
    return a().h(paramInt, paramArrayOfObject);
  }
  
  public final boolean m()
  {
    return true;
  }
  
  public final x0<Map.Entry<K, V>> n()
  {
    return a().r(0);
  }
  
  public final t<Map.Entry<K, V>> r()
  {
    return new a();
  }
  
  public final int size()
  {
    return o;
  }
  
  public final class a
    extends t<Map.Entry<K, V>>
  {
    public a() {}
    
    public final Object get(int paramInt)
    {
      b.v(paramInt, o);
      Object localObject1 = m0.a.this;
      Object localObject2 = e;
      paramInt *= 2;
      localObject2 = localObject2[(f + paramInt)];
      Objects.requireNonNull(localObject2);
      localObject1 = m0.a.this;
      localObject1 = e[(paramInt + (f ^ 0x1))];
      Objects.requireNonNull(localObject1);
      return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
    }
    
    public final boolean m()
    {
      return true;
    }
    
    public final int size()
    {
      return o;
    }
  }
}

/* Location:
 * Qualified Name:     o7.m0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */