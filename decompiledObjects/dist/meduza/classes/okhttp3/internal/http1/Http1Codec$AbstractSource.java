package okhttp3.internal.http1;

import java.io.IOException;
import okhttp3.internal.connection.StreamAllocation;
import xc.l;
import xc.y;
import xc.z;

abstract class Http1Codec$AbstractSource
  implements y
{
  public final l a;
  public boolean b;
  public long c;
  
  public Http1Codec$AbstractSource(Http1Codec paramHttp1Codec)
  {
    a = new l(c.c());
    c = 0L;
  }
  
  public final z c()
  {
    return a;
  }
  
  public long e0(xc.f paramf, long paramLong)
  {
    try
    {
      paramLong = d.c.e0(paramf, paramLong);
      if (paramLong > 0L) {
        c += paramLong;
      }
      return paramLong;
    }
    catch (IOException paramf)
    {
      f(paramf, false);
      throw paramf;
    }
  }
  
  public final void f(IOException paramIOException, boolean paramBoolean)
  {
    int i = d.e;
    if (i == 6) {
      return;
    }
    if (i == 5)
    {
      Http1Codec.g(a);
      Http1Codec localHttp1Codec = d;
      e = 6;
      StreamAllocation localStreamAllocation = b;
      if (localStreamAllocation != null) {
        localStreamAllocation.i(paramBoolean ^ true, localHttp1Codec, paramIOException);
      }
      return;
    }
    paramIOException = f.l("state: ");
    paramIOException.append(d.e);
    throw new IllegalStateException(paramIOException.toString());
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http1.Http1Codec.AbstractSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */