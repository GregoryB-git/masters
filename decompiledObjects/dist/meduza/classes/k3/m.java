package k3;

import f;
import h3.c;
import java.util.Arrays;

public final class m
{
  public final c a;
  public final byte[] b;
  
  public m(c paramc, byte[] paramArrayOfByte)
  {
    if (paramc != null)
    {
      if (paramArrayOfByte != null)
      {
        a = paramc;
        b = paramArrayOfByte;
        return;
      }
      throw new NullPointerException("bytes is null");
    }
    throw new NullPointerException("encoding is null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof m)) {
      return false;
    }
    paramObject = (m)paramObject;
    if (!a.equals(a)) {
      return false;
    }
    return Arrays.equals(b, b);
  }
  
  public final int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("EncodedPayload{encoding=");
    localStringBuilder.append(a);
    localStringBuilder.append(", bytes=[...]}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */