package okhttp3.internal.http1;

import xc.f;
import xc.g;
import xc.l;
import xc.w;
import xc.z;

final class Http1Codec$ChunkedSink
  implements w
{
  public final l a;
  public boolean b;
  
  public Http1Codec$ChunkedSink(Http1Codec paramHttp1Codec)
  {
    a = new l(d.c());
  }
  
  public final z c()
  {
    return a;
  }
  
  public final void close()
  {
    try
    {
      boolean bool = b;
      if (bool) {
        return;
      }
      b = true;
      c.d.O("0\r\n\r\n");
      Http1Codec localHttp1Codec = c;
      l locall = a;
      localHttp1Codec.getClass();
      Http1Codec.g(locall);
      c.e = 3;
      return;
    }
    finally {}
  }
  
  public final void flush()
  {
    try
    {
      boolean bool = b;
      if (bool) {
        return;
      }
      c.d.flush();
      return;
    }
    finally {}
  }
  
  public final void g0(f paramf, long paramLong)
  {
    if (!b)
    {
      if (paramLong == 0L) {
        return;
      }
      c.d.Y(paramLong);
      c.d.O("\r\n");
      c.d.g0(paramf, paramLong);
      c.d.O("\r\n");
      return;
    }
    throw new IllegalStateException("closed");
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec.ChunkedSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */