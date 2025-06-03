package m8;

import f;
import java.util.List;

public final class y
  extends f0.e.d.f
{
  public final List<f0.e.d.e> a;
  
  public y() {}
  
  public y(List paramList)
  {
    a = paramList;
  }
  
  public final List<f0.e.d.e> a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.f))
    {
      paramObject = (f0.e.d.f)paramObject;
      return a.equals(((f0.e.d.f)paramObject).a());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("RolloutsState{rolloutAssignments=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */