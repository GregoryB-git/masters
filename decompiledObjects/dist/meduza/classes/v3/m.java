package v3;

import v5.e0;

public final class m
  implements g
{
  public final int a;
  public final int b;
  public final int c;
  
  static
  {
    e0.E(0);
    e0.E(1);
    e0.E(2);
  }
  
  public m(int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof m)) {
      return false;
    }
    paramObject = (m)paramObject;
    if ((a != a) || (b != b) || (c != c)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return ((527 + a) * 31 + b) * 31 + c;
  }
}

/* Location:
 * Qualified Name:     v3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */