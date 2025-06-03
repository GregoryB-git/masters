package m2;

import java.util.Map;
import p2.a;

public final class b
  extends f
{
  public final a a;
  public final Map b;
  
  public b(a parama, Map paramMap)
  {
    if (parama != null)
    {
      a = parama;
      if (paramMap != null)
      {
        b = paramMap;
        return;
      }
      throw new NullPointerException("Null values");
    }
    throw new NullPointerException("Null clock");
  }
  
  public a e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      if ((!a.equals(((f)paramObject).e())) || (!b.equals(((f)paramObject).h()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Map h()
  {
    return b;
  }
  
  public int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SchedulerConfig{clock=");
    localStringBuilder.append(a);
    localStringBuilder.append(", values=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */