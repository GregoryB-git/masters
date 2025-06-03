package r3;

import java.util.Arrays;
import q3.k;

public final class a
{
  public final byte[] a;
  
  public a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    a = arrayOfByte;
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
  }
  
  public static a a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      return b(paramArrayOfByte, 0, paramArrayOfByte.length);
    }
    throw new NullPointerException("data must be non-null");
  }
  
  public static a b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte != null) {
      return new a(paramArrayOfByte, paramInt1, paramInt2);
    }
    throw new NullPointerException("data must be non-null");
  }
  
  public int c()
  {
    return a.length;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    return Arrays.equals(a, a);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(a);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bytes(");
    localStringBuilder.append(k.b(a));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */