package F0;

import java.util.Arrays;

public final class T$a
{
  public final int a;
  public final byte[] b;
  public final int c;
  public final int d;
  
  public T$a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramArrayOfByte;
    c = paramInt2;
    d = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((a != a) || (c != c) || (d != d) || (!Arrays.equals(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((a * 31 + Arrays.hashCode(b)) * 31 + c) * 31 + d;
  }
}

/* Location:
 * Qualified Name:     F0.T.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */