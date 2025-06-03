package t2;

import f;

public final class c
{
  public final boolean a;
  public final boolean b;
  public final boolean c;
  public final boolean d;
  
  public c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    a = paramBoolean1;
    b = paramBoolean2;
    c = paramBoolean3;
    d = paramBoolean4;
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
    if (a != a) {
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
    int i = a;
    int j = 1;
    int k = i;
    int m;
    if (i != 0) {
      m = 1;
    }
    int n = b;
    i = n;
    if (n != 0) {
      i = 1;
    }
    int i1 = c;
    n = i1;
    if (i1 != 0) {
      n = 1;
    }
    i1 = d;
    if (i1 == 0) {
      j = i1;
    }
    return ((m * 31 + i) * 31 + n) * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("NetworkState(isConnected=");
    localStringBuilder.append(a);
    localStringBuilder.append(", isValidated=");
    localStringBuilder.append(b);
    localStringBuilder.append(", isMetered=");
    localStringBuilder.append(c);
    localStringBuilder.append(", isNotRoaming=");
    localStringBuilder.append(d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     t2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */