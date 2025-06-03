package okhttp3.internal.http1;

import a0.j;
import xc.f;

class Http1Codec$UnknownLengthSource
  extends Http1Codec.AbstractSource
{
  public boolean e;
  
  public Http1Codec$UnknownLengthSource(Http1Codec paramHttp1Codec)
  {
    super(paramHttp1Codec);
  }
  
  public final void close()
  {
    if (b) {
      return;
    }
    if (!e) {
      f(null, false);
    }
    b = true;
  }
  
  public final long e0(f paramf, long paramLong)
  {
    if (paramLong >= 0L)
    {
      if (!b)
      {
        if (e) {
          return -1L;
        }
        paramLong = super.e0(paramf, paramLong);
        if (paramLong == -1L)
        {
          e = true;
          f(null, true);
          return -1L;
        }
        return paramLong;
      }
      throw new IllegalStateException("closed");
    }
    throw new IllegalArgumentException(j.i("byteCount < 0: ", paramLong));
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec.UnknownLengthSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */