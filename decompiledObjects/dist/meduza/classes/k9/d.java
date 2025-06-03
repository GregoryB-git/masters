package k9;

import f;
import j9.l;
import java.util.HashSet;
import java.util.Set;

public final class d
{
  public static d b = new d(new HashSet());
  public final Set<l> a;
  
  public d(Set<l> paramSet)
  {
    a = paramSet;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FieldMask{mask=");
    localStringBuilder.append(a.toString());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */