package S4;

import kotlin.jvm.internal.Intrinsics;

public final class b$b
{
  public final String a;
  
  public b$b(String paramString)
  {
    a = paramString;
  }
  
  public final String a()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return Intrinsics.a(a, a);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SessionDetails(sessionId=");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     S4.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */