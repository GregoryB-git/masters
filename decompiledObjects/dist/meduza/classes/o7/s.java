package o7;

import java.io.Serializable;
import java.util.List;

public final class s<K, V>
  extends e<K, V>
  implements Serializable
{
  public final K a;
  public final V b;
  
  public s(Object paramObject, List paramList)
  {
    a = paramObject;
    b = paramList;
  }
  
  public final K getKey()
  {
    return (K)a;
  }
  
  public final V getValue()
  {
    return (V)b;
  }
  
  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     o7.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */