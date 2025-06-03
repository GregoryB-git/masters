package c3;

import java.util.Arrays;
import p3.I;
import p3.z;

public final class v$c
{
  public final Object a;
  public final Object b;
  public final byte[] c;
  public final z d;
  public final I e;
  public final int f;
  public final String g;
  public final g h;
  
  public v$c(Object paramObject1, Object paramObject2, byte[] paramArrayOfByte, z paramz, I paramI, int paramInt, String paramString, g paramg)
  {
    a = paramObject1;
    b = paramObject2;
    c = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    d = paramz;
    e = paramI;
    f = paramInt;
    g = paramString;
    h = paramg;
  }
  
  public Object a()
  {
    return a;
  }
  
  public final byte[] b()
  {
    byte[] arrayOfByte = c;
    if (arrayOfByte == null) {
      return null;
    }
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  public g c()
  {
    return h;
  }
  
  public int d()
  {
    return f;
  }
  
  public String e()
  {
    return g;
  }
  
  public I f()
  {
    return e;
  }
  
  public Object g()
  {
    return b;
  }
  
  public z h()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     c3.v.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */