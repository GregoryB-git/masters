package h9;

import f;
import j9.i;
import java.util.Arrays;

public final class a
  extends d
{
  public final int a;
  public final i b;
  public final byte[] c;
  public final byte[] d;
  
  public a(int paramInt, i parami, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramInt;
    if (parami != null)
    {
      b = parami;
      if (paramArrayOfByte1 != null)
      {
        c = paramArrayOfByte1;
        if (paramArrayOfByte2 != null)
        {
          d = paramArrayOfByte2;
          return;
        }
        throw new NullPointerException("Null directionalValue");
      }
      throw new NullPointerException("Null arrayValue");
    }
    throw new NullPointerException("Null documentKey");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof d))
    {
      d locald = (d)paramObject;
      if ((a == locald.i()) && (b.equals(locald.h())))
      {
        byte[] arrayOfByte = c;
        boolean bool2 = locald instanceof a;
        if (bool2) {
          paramObject = c;
        } else {
          paramObject = locald.f();
        }
        if (Arrays.equals(arrayOfByte, (byte[])paramObject))
        {
          arrayOfByte = d;
          if (bool2) {
            paramObject = d;
          } else {
            paramObject = locald.g();
          }
          if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {
            break label129;
          }
        }
      }
      bool1 = false;
      label129:
      return bool1;
    }
    return false;
  }
  
  public final byte[] f()
  {
    return c;
  }
  
  public final byte[] g()
  {
    return d;
  }
  
  public final i h()
  {
    return b;
  }
  
  public final int hashCode()
  {
    return (((a ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ Arrays.hashCode(c)) * 1000003 ^ Arrays.hashCode(d);
  }
  
  public final int i()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("IndexEntry{indexId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", documentKey=");
    localStringBuilder.append(b);
    localStringBuilder.append(", arrayValue=");
    localStringBuilder.append(Arrays.toString(c));
    localStringBuilder.append(", directionalValue=");
    localStringBuilder.append(Arrays.toString(d));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     h9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */