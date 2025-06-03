package x2;

import f;

public final class i
{
  public final String a;
  public final int b;
  public final int c;
  
  public i(String paramString, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof i)) {
      return false;
    }
    paramObject = (i)paramObject;
    if (!ec.i.a(a, a)) {
      return false;
    }
    if (b != b) {
      return false;
    }
    return c == c;
  }
  
  public final int hashCode()
  {
    return (a.hashCode() * 31 + b) * 31 + c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SystemIdInfo(workSpecId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", generation=");
    localStringBuilder.append(b);
    localStringBuilder.append(", systemId=");
    localStringBuilder.append(c);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */