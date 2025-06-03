package j3;

import f;
import java.util.Arrays;

public final class g
  extends q
{
  public final byte[] a;
  public final byte[] b;
  
  public g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramArrayOfByte1;
    b = paramArrayOfByte2;
  }
  
  public final byte[] a()
  {
    return a;
  }
  
  public final byte[] b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof q))
    {
      q localq = (q)paramObject;
      byte[] arrayOfByte = a;
      boolean bool2 = localq instanceof g;
      if (bool2) {
        paramObject = a;
      } else {
        paramObject = localq.a();
      }
      if (Arrays.equals(arrayOfByte, (byte[])paramObject))
      {
        arrayOfByte = b;
        if (bool2) {
          paramObject = b;
        } else {
          paramObject = localq.b();
        }
        if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (Arrays.hashCode(a) ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ExperimentIds{clearBlob=");
    localStringBuilder.append(Arrays.toString(a));
    localStringBuilder.append(", encryptedBlob=");
    localStringBuilder.append(Arrays.toString(b));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */