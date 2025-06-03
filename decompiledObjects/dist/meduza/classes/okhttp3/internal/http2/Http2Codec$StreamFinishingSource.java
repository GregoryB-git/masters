package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.connection.StreamAllocation;
import xc.f;
import xc.k;
import xc.y;

class Http2Codec$StreamFinishingSource
  extends k
{
  public boolean b = false;
  public long c = 0L;
  
  public Http2Codec$StreamFinishingSource(Http2Codec paramHttp2Codec, y paramy)
  {
    super(paramy);
  }
  
  public final void close()
  {
    super.close();
    if (!b)
    {
      b = true;
      Http2Codec localHttp2Codec = d;
      b.i(false, localHttp2Codec, null);
    }
  }
  
  public final long e0(f paramf, long paramLong)
  {
    try
    {
      paramLong = a.e0(paramf, paramLong);
      if (paramLong > 0L) {
        c += paramLong;
      }
      return paramLong;
    }
    catch (IOException localIOException)
    {
      if (!b)
      {
        b = true;
        paramf = d;
        b.i(false, paramf, localIOException);
      }
      throw localIOException;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Codec.StreamFinishingSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */