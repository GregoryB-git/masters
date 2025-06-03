package m8;

import f;
import java.util.Arrays;

public final class g
  extends f0.d.a
{
  public final String a;
  public final byte[] b;
  
  public g(String paramString, byte[] paramArrayOfByte)
  {
    a = paramString;
    b = paramArrayOfByte;
  }
  
  public final byte[] a()
  {
    return b;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.d.a))
    {
      paramObject = (f0.d.a)paramObject;
      if (a.equals(((f0.d.a)paramObject).b()))
      {
        byte[] arrayOfByte = b;
        if ((paramObject instanceof g)) {
          paramObject = b;
        } else {
          paramObject = ((f0.d.a)paramObject).a();
        }
        if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("File{filename=");
    localStringBuilder.append(a);
    localStringBuilder.append(", contents=");
    localStringBuilder.append(Arrays.toString(b));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */