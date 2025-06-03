package d0;

public final class e
{
  public final int a;
  public final float b;
  
  public e(int paramInt, float paramFloat)
  {
    a = paramInt;
    b = paramFloat;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((a != a) || (Float.compare(b, b) != 0)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (527 + a) * 31 + Float.floatToIntBits(b);
  }
}

/* Location:
 * Qualified Name:     d0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */