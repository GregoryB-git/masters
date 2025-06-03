package okhttp3;

import okhttp3.internal.Util;
import xc.r;

public abstract class RequestBody
{
  public static RequestBody c(MediaType paramMediaType, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    long l1 = paramArrayOfByte.length;
    long l2 = 0;
    long l3 = i;
    byte[] arrayOfByte = Util.a;
    if (((l2 | l3) >= 0L) && (l2 <= l1) && (l1 - l2 >= l3)) {
      return new RequestBody.2(i, paramMediaType, paramArrayOfByte);
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public long a()
  {
    return -1L;
  }
  
  public abstract MediaType b();
  
  public abstract void d(r paramr);
}

/* Location:
 * Qualified Name:     okhttp3.RequestBody
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */