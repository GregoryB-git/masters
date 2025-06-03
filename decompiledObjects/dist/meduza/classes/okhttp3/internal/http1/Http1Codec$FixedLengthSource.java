package okhttp3.internal.http1;

import a0.j;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import xc.f;

class Http1Codec$FixedLengthSource
  extends Http1Codec.AbstractSource
{
  public long e;
  
  public Http1Codec$FixedLengthSource(Http1Codec paramHttp1Codec, long paramLong)
  {
    super(paramHttp1Codec);
    e = paramLong;
    if (paramLong == 0L) {
      f(null, true);
    }
  }
  
  public final void close()
  {
    if (b) {
      return;
    }
    if (e != 0L)
    {
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      boolean bool;
      try
      {
        bool = Util.s(this, 100, localTimeUnit);
      }
      catch (IOException localIOException)
      {
        bool = false;
      }
      if (!bool) {
        f(null, false);
      }
    }
    b = true;
  }
  
  public final long e0(f paramf, long paramLong)
  {
    if (paramLong >= 0L)
    {
      if (!b)
      {
        long l = e;
        if (l == 0L) {
          return -1L;
        }
        paramLong = super.e0(paramf, Math.min(l, paramLong));
        if (paramLong != -1L)
        {
          l = e - paramLong;
          e = l;
          if (l == 0L) {
            f(null, true);
          }
          return paramLong;
        }
        paramf = new ProtocolException("unexpected end of stream");
        f(paramf, false);
        throw paramf;
      }
      throw new IllegalStateException("closed");
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec.FixedLengthSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */