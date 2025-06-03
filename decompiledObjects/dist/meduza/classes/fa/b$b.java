package fa;

import ec.i;
import f;

public final class b$b
{
  public final String a;
  
  public b$b(String paramString)
  {
    a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return i.a(a, a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionDetails(sessionId=");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     fa.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */