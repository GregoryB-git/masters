package okhttp3.internal.http1;

import java.net.ProtocolException;
import okhttp3.internal.Util;
import xc.g;
import xc.l;
import xc.w;
import xc.z;

final class Http1Codec$FixedLengthSink
  implements w
{
  public final l a;
  public boolean b;
  public long c;
  
  public Http1Codec$FixedLengthSink(Http1Codec paramHttp1Codec, long paramLong)
  {
    a = new l(d.c());
    c = paramLong;
  }
  
  public final z c()
  {
    return a;
  }
  
  public final void close()
  {
    if (b) {
      return;
    }
    b = true;
    if (c <= 0L)
    {
      Http1Codec localHttp1Codec = d;
      l locall = a;
      localHttp1Codec.getClass();
      Http1Codec.g(locall);
      d.e = 3;
      return;
    }
    throw new ProtocolException("unexpected end of stream");
  }
  
  public final void flush()
  {
    if (b) {
      return;
    }
    d.d.flush();
  }
  
  public final void g0(xc.f paramf, long paramLong)
  {
    if (!b)
    {
      long l = b;
      byte[] arrayOfByte = Util.a;
      if (((paramLong | 0L) >= 0L) && (0L <= l) && (l - 0L >= paramLong))
      {
        if (paramLong <= c)
        {
          d.d.g0(paramf, paramLong);
          c -= paramLong;
          return;
        }
        paramf = f.l("expected ");
        paramf.append(c);
        paramf.append(" bytes but received ");
        paramf.append(paramLong);
        throw new ProtocolException(paramf.toString());
      }
      throw new ArrayIndexOutOfBoundsException();
    }
    throw new IllegalStateException("closed");
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec.FixedLengthSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */