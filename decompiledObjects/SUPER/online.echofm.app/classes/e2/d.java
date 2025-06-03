package e2;

import java.util.List;

public final class d
  extends j
{
  public final List a;
  
  public d(List paramList)
  {
    if (paramList != null)
    {
      a = paramList;
      return;
    }
    throw new NullPointerException("Null logRequests");
  }
  
  public List c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      return a.equals(((j)paramObject).c());
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
    localStringBuilder.append("BatchedLogRequest{logRequests=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     e2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */