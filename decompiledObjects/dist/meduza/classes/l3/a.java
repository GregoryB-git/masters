package l3;

import java.util.Arrays;
import k3.n;

public final class a
  extends f
{
  public final Iterable<n> a;
  public final byte[] b;
  
  public a() {}
  
  public a(Iterable paramIterable, byte[] paramArrayOfByte)
  {
    a = paramIterable;
    b = paramArrayOfByte;
  }
  
  public final Iterable<n> a()
  {
    return a;
  }
  
  public final byte[] b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      if (a.equals(((f)paramObject).a()))
      {
        byte[] arrayOfByte = b;
        if ((paramObject instanceof a)) {
          paramObject = b;
        } else {
          paramObject = ((f)paramObject).b();
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
    StringBuilder localStringBuilder = f.l("BackendRequest{events=");
    localStringBuilder.append(a);
    localStringBuilder.append(", extras=");
    localStringBuilder.append(Arrays.toString(b));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     l3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */