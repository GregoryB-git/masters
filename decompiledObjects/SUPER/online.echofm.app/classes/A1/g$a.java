package A1;

import kotlin.jvm.internal.Intrinsics;

public final class g$a
{
  public final String a;
  public final String b;
  public final String c;
  
  public g$a(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public final String a()
  {
    return c;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final String c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    return Intrinsics.a(c, c);
  }
  
  public int hashCode()
  {
    return (a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CloudBridgeCredentials(datasetID=");
    localStringBuilder.append(a);
    localStringBuilder.append(", cloudBridgeURL=");
    localStringBuilder.append(b);
    localStringBuilder.append(", accessKey=");
    localStringBuilder.append(c);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     A1.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */