package jb;

import java.util.logging.Level;
import java.util.logging.Logger;
import xc.h;
import xc.s;
import xc.y;
import xc.z;

public final class f$a
  implements y
{
  public final h a;
  public int b;
  public byte c;
  public int d;
  public int e;
  public short f;
  
  public f$a(s params)
  {
    a = params;
  }
  
  public final z c()
  {
    return a.c();
  }
  
  public final void close() {}
  
  public final long e0(xc.f paramf, long paramLong)
  {
    int i;
    int k;
    byte b1;
    do
    {
      i = e;
      if (i != 0) {
        break label265;
      }
      a.skip(f);
      f = ((short)0);
      if ((c & 0x4) != 0) {
        return -1L;
      }
      i = d;
      Object localObject = a;
      Logger localLogger = f.a;
      int j = ((h)localObject).readByte();
      k = ((h)localObject).readByte();
      k = ((h)localObject).readByte() & 0xFF | (j & 0xFF) << 16 | (k & 0xFF) << 8;
      e = k;
      b = k;
      b1 = (byte)(a.readByte() & 0xFF);
      c = ((byte)(byte)(a.readByte() & 0xFF));
      localObject = f.a;
      if (((Logger)localObject).isLoggable(Level.FINE)) {
        ((Logger)localObject).fine(f.b.a(true, d, b, b1, c));
      }
      k = a.readInt() & 0x7FFFFFFF;
      d = k;
      if (b1 != 9) {
        break;
      }
    } while (k == i);
    f.d("TYPE_CONTINUATION streamId changed", new Object[0]);
    throw null;
    f.d("%s != TYPE_CONTINUATION", new Object[] { Byte.valueOf(b1) });
    throw null;
    label265:
    paramLong = a.e0(paramf, Math.min(paramLong, i));
    if (paramLong == -1L) {
      return -1L;
    }
    e -= (int)paramLong;
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     jb.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */