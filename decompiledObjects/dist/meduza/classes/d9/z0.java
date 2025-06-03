package d9;

import java.util.Arrays;

public final class z0
{
  public final double[] a;
  
  public z0(double[] paramArrayOfDouble)
  {
    a = ((double[])paramArrayOfDouble.clone());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (z0.class == paramObject.getClass()))
    {
      paramObject = (z0)paramObject;
      return Arrays.equals(a, a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(a);
  }
}

/* Location:
 * Qualified Name:     d9.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */