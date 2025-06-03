package l8;

import ec.i;
import f;
import java.util.Map;

public final class c
{
  public final String a;
  public final long b;
  public final Map<String, String> c;
  
  public c(String paramString, long paramLong, Map<String, String> paramMap)
  {
    a = paramString;
    b = paramLong;
    c = paramMap;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (b != b) {
      return false;
    }
    return i.a(c, c);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    long l = b;
    int j = (int)(l ^ l >>> 32);
    return c.hashCode() + (i * 31 + j) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("EventMetadata(sessionId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", timestamp=");
    localStringBuilder.append(b);
    localStringBuilder.append(", additionalCustomKeys=");
    localStringBuilder.append(c);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     l8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */