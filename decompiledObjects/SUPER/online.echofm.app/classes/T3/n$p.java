package T3;

import java.util.List;
import java.util.Map;

public class n$p
{
  public final List a;
  public final Map b;
  
  public n$p(List paramList, Map paramMap)
  {
    a = paramList;
    b = paramMap;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof p)) {
      return false;
    }
    paramObject = (p)paramObject;
    if (!a.equals(a)) {
      return false;
    }
    return b.equals(b);
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(e.d(a));
    localStringBuilder.append(" (params: ");
    localStringBuilder.append(b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     T3.n.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */