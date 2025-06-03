package q3;

import f;
import java.util.Map;
import t3.a;

public final class b
  extends e
{
  public final a a;
  public final Map<h3.e, e.a> b;
  
  public b(a parama, Map<h3.e, e.a> paramMap)
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
  
  public final a a()
  {
    return a;
  }
  
  public final Map<h3.e, e.a> c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof e))
    {
      paramObject = (e)paramObject;
      if ((!a.equals(((e)paramObject).a())) || (!b.equals(((e)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SchedulerConfig{clock=");
    localStringBuilder.append(a);
    localStringBuilder.append(", values=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     q3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */