package T;

import android.media.MediaDataSource;
import java.io.IOException;

public class a$a
  extends MediaDataSource
{
  public long o;
  
  public a$a(a parama, a.f paramf) {}
  
  public void close() {}
  
  public long getSize()
  {
    return -1L;
  }
  
  public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (paramLong < 0L) {
      return -1;
    }
    try
    {
      long l = o;
      if (l != paramLong)
      {
        if ((l >= 0L) && (paramLong >= l + p.available())) {
          return -1;
        }
        p.h(paramLong);
        o = paramLong;
      }
      int i = paramInt2;
      if (paramInt2 > p.available()) {
        i = p.available();
      }
      paramInt1 = p.read(paramArrayOfByte, paramInt1, i);
      if (paramInt1 >= 0)
      {
        o += paramInt1;
        return paramInt1;
      }
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;) {}
    }
    o = -1L;
    return -1;
  }
}

/* Location:
 * Qualified Name:     T.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */