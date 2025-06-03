package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import xc.h;
import xc.i;
import xc.s;
import xc.y;
import xc.z;

final class Http2Reader
  implements Closeable
{
  public static final Logger e = Logger.getLogger(Http2.class.getName());
  public final h a;
  public final ContinuationSource b;
  public final boolean c;
  public final Hpack.Reader d;
  
  public Http2Reader(h paramh, boolean paramBoolean)
  {
    a = paramh;
    c = paramBoolean;
    paramh = new ContinuationSource(paramh);
    b = paramh;
    d = new Hpack.Reader(paramh);
  }
  
  public static int f(int paramInt, byte paramByte, short paramShort)
  {
    short s = paramInt;
    if ((paramByte & 0x8) != 0) {
      s = paramInt - 1;
    }
    if (paramShort <= s) {
      return (short)(s - paramShort);
    }
    Http2.b("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] { Short.valueOf(paramShort), Integer.valueOf(s) });
    throw null;
  }
  
  public final void C(Handler paramHandler)
  {
    i locali;
    if (c)
    {
      if (!g(true, paramHandler))
      {
        Http2.b("Required SETTINGS preface not received", new Object[0]);
        throw null;
      }
    }
    else
    {
      Object localObject = a;
      paramHandler = Http2.a;
      locali = ((h)localObject).l(a.length);
      localObject = e;
      if (((Logger)localObject).isLoggable(Level.FINE)) {
        ((Logger)localObject).fine(Util.l("<< CONNECTION %s", new Object[] { locali.l() }));
      }
      if (!paramHandler.equals(locali)) {
        break label95;
      }
    }
    return;
    label95:
    Http2.b("Expected a connection header but was %s", new Object[] { locali.t() });
    throw null;
  }
  
  public final ArrayList H(int paramInt1, short paramShort, byte paramByte, int paramInt2)
  {
    Object localObject1 = b;
    e = paramInt1;
    b = paramInt1;
    f = ((short)paramShort);
    c = ((byte)paramByte);
    d = paramInt2;
    localObject1 = d;
    while (!b.v())
    {
      paramInt1 = b.readByte() & 0xFF;
      if (paramInt1 != 128)
      {
        paramShort = 0;
        if ((paramInt1 & 0x80) == 128)
        {
          paramByte = ((Hpack.Reader)localObject1).e(paramInt1, 127) - 1;
          paramInt1 = paramShort;
          if (paramByte >= 0)
          {
            paramInt1 = paramShort;
            if (paramByte <= Hpack.a.length - 1) {
              paramInt1 = 1;
            }
          }
          if (paramInt1 != 0)
          {
            localObject2 = Hpack.a[paramByte];
            a.add(localObject2);
          }
          else
          {
            paramInt1 = Hpack.a.length;
            paramInt1 = f + 1 + (paramByte - paramInt1);
            if (paramInt1 >= 0)
            {
              localObject2 = e;
              if (paramInt1 < localObject2.length)
              {
                a.add(localObject2[paramInt1]);
                continue;
              }
            }
            localObject1 = f.l("Header index too large ");
            ((StringBuilder)localObject1).append(paramByte + 1);
            throw new IOException(((StringBuilder)localObject1).toString());
          }
        }
        else if (paramInt1 == 64)
        {
          localObject2 = ((Hpack.Reader)localObject1).d();
          Hpack.a((i)localObject2);
          ((Hpack.Reader)localObject1).c(new Header((i)localObject2, ((Hpack.Reader)localObject1).d()));
        }
        else if ((paramInt1 & 0x40) == 64)
        {
          ((Hpack.Reader)localObject1).c(new Header(((Hpack.Reader)localObject1).b(((Hpack.Reader)localObject1).e(paramInt1, 63) - 1), ((Hpack.Reader)localObject1).d()));
        }
        else if ((paramInt1 & 0x20) == 32)
        {
          paramShort = ((Hpack.Reader)localObject1).e(paramInt1, 31);
          d = paramShort;
          if ((paramShort >= 0) && (paramShort <= c))
          {
            paramInt1 = h;
            if (paramShort < paramInt1) {
              if (paramShort == 0)
              {
                Arrays.fill(e, null);
                f = (e.length - 1);
                g = 0;
                h = 0;
              }
              else
              {
                ((Hpack.Reader)localObject1).a(paramInt1 - paramShort);
              }
            }
          }
          else
          {
            localObject2 = f.l("Invalid dynamic table size update ");
            ((StringBuilder)localObject2).append(d);
            throw new IOException(((StringBuilder)localObject2).toString());
          }
        }
        else
        {
          i locali;
          if ((paramInt1 != 16) && (paramInt1 != 0))
          {
            localObject2 = ((Hpack.Reader)localObject1).b(((Hpack.Reader)localObject1).e(paramInt1, 15) - 1);
            locali = ((Hpack.Reader)localObject1).d();
            a.add(new Header((i)localObject2, locali));
          }
          else
          {
            locali = ((Hpack.Reader)localObject1).d();
            Hpack.a(locali);
            localObject2 = ((Hpack.Reader)localObject1).d();
            a.add(new Header(locali, (i)localObject2));
          }
        }
      }
      else
      {
        throw new IOException("index == 0");
      }
    }
    Object localObject2 = d;
    localObject2.getClass();
    localObject1 = new ArrayList(a);
    a.clear();
    return (ArrayList)localObject1;
  }
  
  public final void I(Handler paramHandler, int paramInt)
  {
    a.readInt();
    a.readByte();
    paramHandler.c();
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final boolean g(boolean paramBoolean, Handler paramHandler)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    boolean bool = false;
    try
    {
      a.u0(9L);
      Object localObject = a;
      int m = ((h)localObject).readByte();
      int n = ((h)localObject).readByte();
      m = ((h)localObject).readByte() & 0xFF | (m & 0xFF) << 16 | (n & 0xFF) << 8;
      if ((m >= 0) && (m <= 16384))
      {
        byte b1 = (byte)(a.readByte() & 0xFF);
        if ((paramBoolean) && (b1 != 4))
        {
          Http2.b("Expected a SETTINGS frame but was %s", new Object[] { Byte.valueOf(b1) });
          throw null;
        }
        byte b2 = (byte)(a.readByte() & 0xFF);
        n = a.readInt() & 0x7FFFFFFF;
        localObject = e;
        if (((Logger)localObject).isLoggable(Level.FINE)) {
          ((Logger)localObject).fine(Http2.a(true, n, m, b1, b2));
        }
        label440:
        int i1;
        switch (b1)
        {
        default: 
          a.skip(m);
          break;
        case 8: 
          if (m == 4)
          {
            long l = a.readInt() & 0x7FFFFFFF;
            if (l != 0L)
            {
              paramHandler.d(n, l);
            }
            else
            {
              Http2.b("windowSizeIncrement was 0", new Object[] { Long.valueOf(l) });
              throw null;
            }
          }
          else
          {
            Http2.b("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] { Integer.valueOf(m) });
            throw null;
          }
          break;
        case 7: 
          if (m >= 8)
          {
            if (n == 0)
            {
              n = a.readInt();
              k = a.readInt();
              m -= 8;
              for (localObject : ErrorCode.values()) {
                if (a == k) {
                  break label440;
                }
              }
              localObject = null;
              if (localObject != null)
              {
                localObject = i.d;
                if (m > 0) {
                  localObject = a.l(m);
                }
                paramHandler.i(n, (i)localObject);
              }
              else
              {
                Http2.b("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(k) });
                throw null;
              }
            }
            else
            {
              Http2.b("TYPE_GOAWAY streamId != 0", new Object[0]);
              throw null;
            }
          }
          else
          {
            Http2.b("TYPE_GOAWAY length < 8: %s", new Object[] { Integer.valueOf(m) });
            throw null;
          }
          break;
        case 6: 
          if (m == 8)
          {
            if (n == 0)
            {
              i = a.readInt();
              n = a.readInt();
              paramBoolean = bool;
              if ((b2 & 0x1) != 0) {
                paramBoolean = true;
              }
              paramHandler.e(i, n, paramBoolean);
            }
            else
            {
              Http2.b("TYPE_PING streamId != 0", new Object[0]);
              throw null;
            }
          }
          else
          {
            Http2.b("TYPE_PING length != 8: %s", new Object[] { Integer.valueOf(m) });
            throw null;
          }
          break;
        case 5: 
          if (n != 0)
          {
            i1 = i;
            if ((b2 & 0x8) != 0)
            {
              i = (short)(a.readByte() & 0xFF);
              i1 = i;
            }
            paramHandler.h(a.readInt() & 0x7FFFFFFF, H(f(m - 4, b2, i1), i1, b2, n));
          }
          else
          {
            Http2.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
          }
          break;
        case 4: 
          if (n == 0)
          {
            if ((b2 & 0x1) != 0)
            {
              if (m == 0)
              {
                paramHandler.a();
              }
              else
              {
                Http2.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
              }
            }
            else if (m % 6 == 0)
            {
              localObject = new Settings();
              for (n = 0; n < m; n += 6)
              {
                k = a.readShort() & 0xFFFF;
                j = a.readInt();
                if (k != 2)
                {
                  if (k != 3)
                  {
                    if (k != 4)
                    {
                      if (k != 5)
                      {
                        i = k;
                      }
                      else if ((j >= 16384) && (j <= 16777215))
                      {
                        i = k;
                      }
                      else
                      {
                        Http2.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] { Integer.valueOf(j) });
                        throw null;
                      }
                    }
                    else
                    {
                      i = 7;
                      if (j < 0)
                      {
                        Http2.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                      }
                    }
                  }
                  else {
                    i = 4;
                  }
                }
                else
                {
                  i = k;
                  if (j != 0) {
                    if (j == 1)
                    {
                      i = k;
                    }
                    else
                    {
                      Http2.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                      throw null;
                    }
                  }
                }
                ((Settings)localObject).b(i, j);
              }
              paramHandler.f((Settings)localObject);
            }
            else
            {
              Http2.b("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] { Integer.valueOf(m) });
              throw null;
            }
          }
          else
          {
            Http2.b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
          }
          break;
        case 3: 
          if (m == 4)
          {
            if (n != 0)
            {
              m = a.readInt();
              for (localObject : ErrorCode.values()) {
                if (a == m) {
                  break label1061;
                }
              }
              localObject = null;
              if (localObject != null)
              {
                paramHandler.g(n, (ErrorCode)localObject);
              }
              else
              {
                Http2.b("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(m) });
                throw null;
              }
            }
            else
            {
              Http2.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
              throw null;
            }
          }
          else
          {
            Http2.b("TYPE_RST_STREAM length: %d != 4", new Object[] { Integer.valueOf(m) });
            throw null;
          }
          break;
        case 2: 
          if (m == 5)
          {
            if (n != 0)
            {
              I(paramHandler, n);
            }
            else
            {
              Http2.b("TYPE_PRIORITY streamId == 0", new Object[0]);
              throw null;
            }
          }
          else
          {
            Http2.b("TYPE_PRIORITY length: %d != 5", new Object[] { Integer.valueOf(m) });
            throw null;
          }
          break;
        case 1: 
          if (n != 0)
          {
            if ((b2 & 0x1) != 0) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            }
            i1 = j;
            if ((b2 & 0x8) != 0)
            {
              i = (short)(a.readByte() & 0xFF);
              i1 = i;
            }
            i = m;
            if ((b2 & 0x20) != 0)
            {
              I(paramHandler, n);
              i = m - 5;
            }
            paramHandler.j(n, H(f(i, b2, i1), i1, b2, n), paramBoolean);
          }
          else
          {
            Http2.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
          }
          break;
        case 0: 
          label1061:
          if (n != 0)
          {
            if ((b2 & 0x1) != 0) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            }
            if ((b2 & 0x20) != 0) {
              i = 1;
            } else {
              i = 0;
            }
            if (i == 0)
            {
              i1 = k;
              if ((b2 & 0x8) != 0)
              {
                i = (short)(a.readByte() & 0xFF);
                i1 = i;
              }
              paramHandler.b(n, f(m, b2, i1), a, paramBoolean);
              a.skip(i1);
            }
            else
            {
              Http2.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
              throw null;
            }
          }
          else
          {
            Http2.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
          }
          break;
        }
        return true;
      }
      Http2.b("FRAME_SIZE_ERROR: %s", new Object[] { Integer.valueOf(m) });
      throw null;
    }
    catch (IOException paramHandler) {}
    return false;
  }
  
  public static final class ContinuationSource
    implements y
  {
    public final h a;
    public int b;
    public byte c;
    public int d;
    public int e;
    public short f;
    
    public ContinuationSource(h paramh)
    {
      a = paramh;
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
        Logger localLogger = Http2Reader.e;
        int j = ((h)localObject).readByte();
        k = ((h)localObject).readByte();
        k = ((h)localObject).readByte() & 0xFF | (j & 0xFF) << 16 | (k & 0xFF) << 8;
        e = k;
        b = k;
        b1 = (byte)(a.readByte() & 0xFF);
        c = ((byte)(byte)(a.readByte() & 0xFF));
        localObject = Http2Reader.e;
        if (((Logger)localObject).isLoggable(Level.FINE)) {
          ((Logger)localObject).fine(Http2.a(true, d, b, b1, c));
        }
        k = a.readInt() & 0x7FFFFFFF;
        d = k;
        if (b1 != 9) {
          break;
        }
      } while (k == i);
      Http2.b("TYPE_CONTINUATION streamId changed", new Object[0]);
      throw null;
      Http2.b("%s != TYPE_CONTINUATION", new Object[] { Byte.valueOf(b1) });
      throw null;
      label265:
      paramLong = a.e0(paramf, Math.min(paramLong, i));
      if (paramLong == -1L) {
        return -1L;
      }
      e = ((int)(e - paramLong));
      return paramLong;
    }
  }
  
  public static abstract interface Handler
  {
    public abstract void a();
    
    public abstract void b(int paramInt1, int paramInt2, h paramh, boolean paramBoolean);
    
    public abstract void c();
    
    public abstract void d(int paramInt, long paramLong);
    
    public abstract void e(int paramInt1, int paramInt2, boolean paramBoolean);
    
    public abstract void f(Settings paramSettings);
    
    public abstract void g(int paramInt, ErrorCode paramErrorCode);
    
    public abstract void h(int paramInt, ArrayList paramArrayList);
    
    public abstract void i(int paramInt, i parami);
    
    public abstract void j(int paramInt, ArrayList paramArrayList, boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Reader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */