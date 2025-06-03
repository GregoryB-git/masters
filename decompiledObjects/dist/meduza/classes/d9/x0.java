package d9;

import f;

public final class x0
{
  public final int a;
  
  public x0(int paramInt)
  {
    a = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (x0.class == paramObject.getClass()))
    {
      paramObject = (x0)paramObject;
      if (a != a) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("TransactionOptions{maxAttempts=");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d9.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */