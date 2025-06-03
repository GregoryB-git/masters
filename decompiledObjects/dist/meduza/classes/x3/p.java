package x3;

public final class p
{
  public final int a = 0;
  public final float b = 0.0F;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (p.class == paramObject.getClass()))
    {
      paramObject = (p)paramObject;
      if ((a != a) || (Float.compare(b, b) != 0)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    return Float.floatToIntBits(b) + (527 + i) * 31;
  }
}

/* Location:
 * Qualified Name:     x3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */