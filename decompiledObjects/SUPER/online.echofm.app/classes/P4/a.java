package P4;

import java.util.Set;

public final class a
  extends b
{
  public final Set a;
  
  public a(Set paramSet)
  {
    if (paramSet != null)
    {
      a = paramSet;
      return;
    }
    throw new NullPointerException("Null updatedKeys");
  }
  
  public Set b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      return a.equals(((b)paramObject).b());
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ConfigUpdate{updatedKeys=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     P4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */