package okhttp3;

import java.io.IOException;
import java.io.Reader;
import okhttp3.internal.Util;

final class ResponseBody$BomAwareReader
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

/* Location:
 * Qualified Name:     okhttp3.ResponseBody.BomAwareReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */