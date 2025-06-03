package o4;

import java.util.List;

public final class a
  extends r
{
  public final String a;
  public final List b;
  
  public a(String paramString, List paramList)
  {
    if (paramString != null)
    {
      a = paramString;
      if (paramList != null)
      {
        b = paramList;
        return;
      }
      throw new NullPointerException("Null usedDates");
    }
    throw new NullPointerException("Null userAgent");
  }
  
  public List b()
  {
    return b;
  }
  
  public String c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof r))
    {
      paramObject = (r)paramObject;
      if ((!a.equals(((r)paramObject).c())) || (!b.equals(((r)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HeartBeatResult{userAgent=");
    localStringBuilder.append(a);
    localStringBuilder.append(", usedDates=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */