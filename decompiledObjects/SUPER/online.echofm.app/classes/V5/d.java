package V5;

import java.io.Serializable;

public final class d
  implements h, Serializable
{
  public final Object o;
  
  public d(Object paramObject)
  {
    o = paramObject;
  }
  
  public Object getValue()
  {
    return o;
  }
  
  public String toString()
  {
    return String.valueOf(getValue());
  }
}

/* Location:
 * Qualified Name:     V5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */