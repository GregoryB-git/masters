package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import okhttp3.internal.Util;
import xc.f;
import xc.h;

public abstract class ResponseBody
  implements Closeable
{
  public static ResponseBody C(byte[] paramArrayOfByte)
  {
    f localf = new f();
    localf.write(paramArrayOfByte);
    return new ResponseBody.1(paramArrayOfByte.length, localf);
  }
  
  public abstract h H();
  
  public final void close()
  {
    Util.e(H());
  }
  
  public abstract long f();
  
  public abstract MediaType g();
  
  public static final class BomAwareReader
    extends Reader
  {
    public boolean a;
    
    public final void close()
    {
      a = true;
      throw null;
    }
    
    public final int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    {
      if (!a)
      {
        Util.b(null, null);
        throw null;
      }
      throw new IOException("Stream closed");
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.ResponseBody
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */