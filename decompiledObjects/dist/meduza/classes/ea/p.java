package ea;

import ec.i;
import f;

public final class p
{
  public final String a;
  
  public p(String paramString)
  {
    a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof p)) {
      return false;
    }
    paramObject = (p)paramObject;
    return i.a(a, a);
  }
  
  public final int hashCode()
  {
    String str = a;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FirebaseSessionsData(sessionId=");
    localStringBuilder.append(a);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */