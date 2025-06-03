package yc;

import ec.i;
import xc.f;

public final class a
{
  public static final byte[] a;
  
  static
  {
    byte[] arrayOfByte = "0123456789abcdef".getBytes(lc.a.a);
    i.d(arrayOfByte, "this as java.lang.String).getBytes(charset)");
    a = arrayOfByte;
  }
  
  public static final String a(f paramf, long paramLong)
  {
    i.e(paramf, "<this>");
    if (paramLong > 0L)
    {
      long l = paramLong - 1L;
      if (paramf.I(l) == 13)
      {
        str = paramf.i0(l, lc.a.a);
        paramf.skip(2L);
        return str;
      }
    }
    String str = paramf.i0(paramLong, lc.a.a);
    paramf.skip(1L);
    paramf = str;
    return paramf;
  }
}

/* Location:
 * Qualified Name:     yc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */