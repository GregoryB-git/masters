package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import xc.f;
import xc.g;
import xc.w;

final class Http2Writer
  implements Closeable
{
  public static final Logger o = Logger.getLogger(Http2.class.getName());
  public final g a;
  public final boolean b;
  public final f c;
  public int d;
  public boolean e;
  public final Hpack.Writer f;
  
  public Http2Writer(g paramg, boolean paramBoolean)
  {
    a = paramg;
    b = paramBoolean;
    paramg = new f();
    c = paramg;
    f = new Hpack.Writer(paramg);
    d = 16384;
  }
  
  public final void C(int paramInt, ErrorCode paramErrorCode, byte[] paramArrayOfByte)
  {
    try
    {
      if (!e)
      {
        if (a != -1)
        {
          g(0, paramArrayOfByte.length + 8, (byte)7, (byte)0);
          a.writeInt(paramInt);
          a.writeInt(a);
          if (paramArrayOfByte.length > 0) {
            a.write(paramArrayOfByte);
          }
          a.flush();
          return;
        }
        paramErrorCode = Http2.a;
        paramErrorCode = new java/lang/IllegalArgumentException;
        paramErrorCode.<init>(Util.l("errorCode.httpCode == -1", new Object[0]));
        throw paramErrorCode;
      }
      paramErrorCode = new java/io/IOException;
      paramErrorCode.<init>("closed");
      throw paramErrorCode;
    }
    finally {}
  }
  
  public final void H(int paramInt, ArrayList paramArrayList, boolean paramBoolean)
  {
    if (!e)
    {
      f.d(paramArrayList);
      long l1 = c.b;
      int i = (int)Math.min(d, l1);
      long l2 = i;
      boolean bool = l1 < l2;
      byte b1;
      if (!bool) {
        b1 = 4;
      } else {
        b1 = 0;
      }
      byte b2 = b1;
      if (paramBoolean)
      {
        b1 = (byte)(b1 | 0x1);
        b2 = b1;
      }
      g(paramInt, i, (byte)1, b2);
      a.g0(c, l2);
      if (bool) {
        M(paramInt, l1 - l2);
      }
      return;
    }
    throw new IOException("closed");
  }
  
  public final void I(int paramInt, ErrorCode paramErrorCode)
  {
    try
    {
      if (!e)
      {
        if (a != -1)
        {
          g(paramInt, 4, (byte)3, (byte)0);
          a.writeInt(a);
          a.flush();
          return;
        }
        paramErrorCode = new java/lang/IllegalArgumentException;
        paramErrorCode.<init>();
        throw paramErrorCode;
      }
      paramErrorCode = new java/io/IOException;
      paramErrorCode.<init>("closed");
      throw paramErrorCode;
    }
    finally {}
  }
  
  public final void M(int paramInt, long paramLong)
  {
    while (paramLong > 0L)
    {
      int i = (int)Math.min(d, paramLong);
      long l = i;
      paramLong -= l;
      byte b1;
      byte b2;
      if (paramLong == 0L)
      {
        b1 = 4;
        b2 = b1;
      }
      else
      {
        b1 = 0;
        b2 = b1;
      }
      g(paramInt, i, (byte)9, b2);
      a.g0(c, l);
    }
  }
  
  public final void close()
  {
    try
    {
      e = true;
      a.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d(int paramInt, long paramLong)
  {
    try
    {
      if (!e)
      {
        if ((paramLong != 0L) && (paramLong <= 2147483647L))
        {
          g(paramInt, 4, (byte)8, (byte)0);
          a.writeInt((int)paramLong);
          a.flush();
          return;
        }
        localObject1 = Http2.a;
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>(Util.l("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { Long.valueOf(paramLong) }));
        throw ((Throwable)localObject1);
      }
      Object localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("closed");
      throw ((Throwable)localObject1);
    }
    finally {}
  }
  
  public final void e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      if (!e)
      {
        byte b1;
        byte b2;
        if (paramBoolean)
        {
          b1 = 1;
          b2 = b1;
        }
        else
        {
          b1 = 0;
          b2 = b1;
        }
        g(0, 8, (byte)6, b2);
        a.writeInt(paramInt1);
        a.writeInt(paramInt2);
        a.flush();
        return;
      }
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("closed");
      throw localIOException;
    }
    finally {}
  }
  
  public final void f(Settings paramSettings)
  {
    try
    {
      if (!e)
      {
        int i = d;
        int j = a;
        if ((j & 0x20) != 0) {
          i = b[5];
        }
        d = i;
        if ((j & 0x2) != 0) {
          i = b[1];
        } else {
          i = -1;
        }
        if (i != -1)
        {
          Hpack.Writer localWriter = f;
          if ((j & 0x2) != 0) {
            i = b[1];
          } else {
            i = -1;
          }
          localWriter.getClass();
          i = Math.min(i, 16384);
          j = e;
          if (j != i)
          {
            if (i < j) {
              c = Math.min(c, i);
            }
            d = true;
            e = i;
            j = i;
            if (i < j) {
              if (i == 0)
              {
                Arrays.fill(f, null);
                g = (f.length - 1);
                h = 0;
                i = 0;
              }
              else
              {
                localWriter.a(j - i);
              }
            }
          }
        }
        g(0, 0, (byte)4, (byte)1);
        a.flush();
        return;
      }
      paramSettings = new java/io/IOException;
      paramSettings.<init>("closed");
      throw paramSettings;
    }
    finally {}
  }
  
  public final void g(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    Object localObject = o;
    if (((Logger)localObject).isLoggable(Level.FINE)) {
      ((Logger)localObject).fine(Http2.a(false, paramInt1, paramInt2, paramByte1, paramByte2));
    }
    int i = d;
    if (paramInt2 <= i)
    {
      if ((0x80000000 & paramInt1) == 0)
      {
        localObject = a;
        ((g)localObject).writeByte(paramInt2 >>> 16 & 0xFF);
        ((g)localObject).writeByte(paramInt2 >>> 8 & 0xFF);
        ((g)localObject).writeByte(paramInt2 & 0xFF);
        a.writeByte(paramByte1 & 0xFF);
        a.writeByte(paramByte2 & 0xFF);
        a.writeInt(paramInt1 & 0x7FFFFFFF);
        return;
      }
      localObject = Http2.a;
      throw new IllegalArgumentException(Util.l("reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) }));
    }
    localObject = Http2.a;
    throw new IllegalArgumentException(Util.l("FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) }));
  }
  
  public final void u(boolean paramBoolean, int paramInt1, f paramf, int paramInt2)
  {
    try
    {
      if (!e)
      {
        byte b1;
        byte b2;
        if (paramBoolean)
        {
          b1 = (byte)1;
          b2 = b1;
        }
        else
        {
          b1 = 0;
          b2 = b1;
        }
        g(paramInt1, paramInt2, (byte)0, b2);
        if (paramInt2 > 0) {
          a.g0(paramf, paramInt2);
        }
        return;
      }
      paramf = new java/io/IOException;
      paramf.<init>("closed");
      throw paramf;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Writer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */