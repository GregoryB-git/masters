package z4;

public final class y$d
{
  public final int a;
  public final boolean b;
  
  public y$d(int paramInt, boolean paramBoolean)
  {
    a = paramInt;
    b = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a * 31 + b;
  }
}

/* Location:
 * Qualified Name:     z4.y.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */