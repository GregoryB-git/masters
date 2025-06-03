package g0;

public final class A
{
  public static final A c = new A(-1, -1);
  public static final A d = new A(0, 0);
  public final int a;
  public final int b;
  
  public A(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (((paramInt1 != -1) && (paramInt1 < 0)) || ((paramInt2 != -1) && (paramInt2 < 0))) {
      bool = false;
    } else {
      bool = true;
    }
    a.a(bool);
    a = paramInt1;
    b = paramInt2;
  }
  
  public int a()
  {
    return b;
  }
  
  public int b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    boolean bool2 = bool1;
    if ((paramObject instanceof A))
    {
      paramObject = (A)paramObject;
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
  
  public int hashCode()
  {
    int i = b;
    int j = a;
    return i ^ (j >>> 16 | j << 16);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("x");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     g0.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */