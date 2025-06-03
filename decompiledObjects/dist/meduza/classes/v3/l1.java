package v3;

public final class l1
{
  public static final l1 b = new l1(false);
  public final boolean a;
  
  public l1(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (l1.class == paramObject.getClass()))
    {
      paramObject = (l1)paramObject;
      if (a != a) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a ^ true;
  }
}

/* Location:
 * Qualified Name:     v3.l1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */