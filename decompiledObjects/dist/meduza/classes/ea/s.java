package ea;

import ec.i;
import f;

public final class s
{
  public final String a;
  public final int b;
  public final int c;
  public final boolean d;
  
  public s(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
    d = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s)) {
      return false;
    }
    paramObject = (s)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (b != b) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return d == d;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = c;
    int m = d;
    int n = m;
    if (m != 0) {
      n = 1;
    }
    return ((i * 31 + j) * 31 + k) * 31 + n;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ProcessDetails(processName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", pid=");
    localStringBuilder.append(b);
    localStringBuilder.append(", importance=");
    localStringBuilder.append(c);
    localStringBuilder.append(", isDefaultProcess=");
    localStringBuilder.append(d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */