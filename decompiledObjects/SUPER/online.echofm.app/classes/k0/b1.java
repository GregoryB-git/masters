package k0;

public final class b1
{
  public static final b1 c = new b1(0, false);
  public final int a;
  public final boolean b;
  
  public b1(int paramInt, boolean paramBoolean)
  {
    a = paramInt;
    b = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b1.class == paramObject.getClass()))
    {
      paramObject = (b1)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (a << 1) + b;
  }
}

/* Location:
 * Qualified Name:     k0.b1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */