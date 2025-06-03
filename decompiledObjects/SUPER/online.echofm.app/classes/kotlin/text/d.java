package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import l6.c;

public final class d
{
  public final String a;
  public final c b;
  
  public d(String paramString, c paramc)
  {
    a = paramString;
    b = paramc;
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
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    return Intrinsics.a(b, b);
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MatchGroup(value=");
    localStringBuilder.append(a);
    localStringBuilder.append(", range=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     kotlin.text.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */