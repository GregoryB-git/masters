package j3;

import f;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends n
{
  public final List<u> a;
  
  public d(ArrayList paramArrayList)
  {
    a = paramArrayList;
  }
  
  public final List<u> a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof n))
    {
      paramObject = (n)paramObject;
      return a.equals(((n)paramObject).a());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("BatchedLogRequest{logRequests=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */