package P1;

import kotlin.jvm.internal.Intrinsics;

public final class a
{
  public final String a;
  public final boolean b;
  
  public a(String paramString, boolean paramBoolean)
  {
    a = paramString;
    b = paramBoolean;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final boolean b()
  {
    return b;
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
    return b == b;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("GateKeeper(name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", value=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     P1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */