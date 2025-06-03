package e7;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import m6.j;

public final class i1
  implements Runnable
{
  public final f1 a;
  public final int b;
  public final Throwable c;
  public final byte[] d;
  public final String e;
  public final Map<String, List<String>> f;
  
  public i1(String paramString, f1 paramf1, int paramInt, IOException paramIOException, byte[] paramArrayOfByte, Map paramMap)
  {
    j.i(paramf1);
    a = paramf1;
    b = paramInt;
    c = paramIOException;
    d = paramArrayOfByte;
    e = paramString;
    f = paramMap;
  }
  
  public final void run()
  {
    a.c(e, b, c, d, f);
  }
}

/* Location:
 * Qualified Name:     e7.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */