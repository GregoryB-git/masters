package v5;

import x6.b;

public final class w
{
  public static final w c = new w(-1, -1);
  public final int a;
  public final int b;
  
  static
  {
    new w(0, 0);
  }
  
  public w(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (((paramInt1 != -1) && (paramInt1 < 0)) || ((paramInt2 != -1) && (paramInt2 < 0))) {
      bool = false;
    } else {
      bool = true;
    }
    b.q(bool);
    a = paramInt1;
    b = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    boolean bool2 = bool1;
    if ((paramObject instanceof w))
    {
      paramObject = (w)paramObject;
      bool2 = bool1;
      if (a == a)
      {
        bool2 = bool1;
        if (b == b) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = b;
    int j = a;
    return i ^ (j >>> 16 | j << 16);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("x");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     v5.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */