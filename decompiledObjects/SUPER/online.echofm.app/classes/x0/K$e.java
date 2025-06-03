package x0;

public final class K$e
{
  public final int a;
  public final boolean b;
  
  public K$e(int paramInt, boolean paramBoolean)
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
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return a * 31 + b;
  }
}

/* Location:
 * Qualified Name:     x0.K.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */