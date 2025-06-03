package c3;

import java.util.Arrays;
import q3.k;

public class v$d
  implements Comparable
{
  public final byte[] o;
  
  public v$d(byte[] paramArrayOfByte)
  {
    o = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public int c(d paramd)
  {
    byte[] arrayOfByte1 = o;
    int i = arrayOfByte1.length;
    byte[] arrayOfByte2 = o;
    if (i != arrayOfByte2.length) {
      return arrayOfByte1.length - arrayOfByte2.length;
    }
    for (i = 0;; i++)
    {
      arrayOfByte1 = o;
      if (i >= arrayOfByte1.length) {
        break;
      }
      int j = arrayOfByte1[i];
      int k = o[i];
      if (j != k) {
        return j - k;
      }
    }
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    return Arrays.equals(o, o);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(o);
  }
  
  public String toString()
  {
    return k.b(o);
  }
}

/* Location:
 * Qualified Name:     c3.v.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */