package d9;

import b.z;
import f;
import n9.o;
import r3.j;

public final class y
  implements Comparable<y>
{
  public final double a;
  public final double b;
  
  public y(double paramDouble1, double paramDouble2)
  {
    if ((!Double.isNaN(paramDouble1)) && (paramDouble1 >= -90.0D) && (paramDouble1 <= 90.0D))
    {
      if ((!Double.isNaN(paramDouble2)) && (paramDouble2 >= -180.0D) && (paramDouble2 <= 180.0D))
      {
        a = paramDouble1;
        b = paramDouble2;
        return;
      }
      throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
    }
    throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (y)paramObject;
    double d1 = a;
    double d2 = a;
    j localj = o.a;
    int i = z.j(d1, d2);
    int j = i;
    if (i == 0) {
      j = z.j(b, b);
    }
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof y;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (y)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (b == b) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    long l = Double.doubleToLongBits(a);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(b);
    return i * 31 + (int)(l >>> 32 ^ l);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("GeoPoint { latitude=");
    localStringBuilder.append(a);
    localStringBuilder.append(", longitude=");
    localStringBuilder.append(b);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d9.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */