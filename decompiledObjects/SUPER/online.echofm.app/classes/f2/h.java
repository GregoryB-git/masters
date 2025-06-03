package f2;

import c2.b;
import java.util.Arrays;

public final class h
{
  public final b a;
  public final byte[] b;
  
  public h(b paramb, byte[] paramArrayOfByte)
  {
    if (paramb != null)
    {
      if (paramArrayOfByte != null)
      {
        a = paramb;
        b = paramArrayOfByte;
        return;
      }
      throw new NullPointerException("bytes is null");
    }
    throw new NullPointerException("encoding is null");
  }
  
  public byte[] a()
  {
    return b;
  }
  
  public b b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if (!a.equals(a)) {
      return false;
    }
    return Arrays.equals(b, b);
  }
  
  public int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EncodedPayload{encoding=");
    localStringBuilder.append(a);
    localStringBuilder.append(", bytes=[...]}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     f2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */