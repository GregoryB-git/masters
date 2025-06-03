package q9;

import f;
import java.util.ArrayList;
import java.util.List;

public final class a
  extends h
{
  public final String a;
  public final List<String> b;
  
  public a(String paramString, ArrayList paramArrayList)
  {
    if (paramString != null)
    {
      a = paramString;
      b = paramArrayList;
      return;
    }
    throw new NullPointerException("Null userAgent");
  }
  
  public final List<String> a()
  {
    return b;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof h))
    {
      paramObject = (h)paramObject;
      if ((!a.equals(((h)paramObject).b())) || (!b.equals(((h)paramObject).a()))) {
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
    StringBuilder localStringBuilder = f.l("HeartBeatResult{userAgent=");
    localStringBuilder.append(a);
    localStringBuilder.append(", usedDates=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     q9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */