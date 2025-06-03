package okhttp3.internal.http2;

import java.io.IOException;
import java.util.Arrays;
import okhttp3.internal.NamedRunnable;

class Http2Connection$ReaderRunnable$2
  extends NamedRunnable
{
  public Http2Connection$ReaderRunnable$2(Http2Connection.ReaderRunnable paramReaderRunnable, Object[] paramArrayOfObject, Settings paramVarArgs)
  {
    super("OkHttp %s ACK Settings", paramArrayOfObject);
  }
  
  public final void k()
  {
    Http2Connection.ReaderRunnable localReaderRunnable = d;
    boolean bool = b;
    Settings localSettings1 = c;
    synchronized (c.C)
    {
      int i;
      int j;
      int k;
      Http2Stream[] arrayOfHttp2Stream;
      long l1;
      long l2;
      synchronized (c)
      {
        i = c.A.a();
        if (bool)
        {
          localSettings2 = c.A;
          a = 0;
          Arrays.fill(b, 0);
        }
        Settings localSettings2 = c.A;
        localSettings2.getClass();
        j = 0;
        k = 1;
        if (j < 10)
        {
          if ((1 << j & a) == 0) {
            k = 0;
          }
          if (k != 0) {
            localSettings2.b(j, b[j]);
          }
          j++;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Connection.ReaderRunnable.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */