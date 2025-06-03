package i0;

import W2.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class r
  extends h
{
  public final k p;
  public final int q;
  
  public r(k paramk, int paramInt1, int paramInt2)
  {
    super(b(paramInt1, paramInt2));
    p = paramk;
    q = paramInt2;
  }
  
  public r(IOException paramIOException, k paramk, int paramInt1, int paramInt2)
  {
    super(paramIOException, b(paramInt1, paramInt2));
    p = paramk;
    q = paramInt2;
  }
  
  public r(String paramString, k paramk, int paramInt1, int paramInt2)
  {
    super(paramString, b(paramInt1, paramInt2));
    p = paramk;
    q = paramInt2;
  }
  
  public r(String paramString, IOException paramIOException, k paramk, int paramInt1, int paramInt2)
  {
    super(paramString, paramIOException, b(paramInt1, paramInt2));
    p = paramk;
    q = paramInt2;
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 == 2000)
    {
      i = paramInt1;
      if (paramInt2 == 1) {
        i = 2001;
      }
    }
    return i;
  }
  
  public static r c(IOException paramIOException, k paramk, int paramInt)
  {
    String str = paramIOException.getMessage();
    int i;
    if ((paramIOException instanceof SocketTimeoutException)) {
      i = 2002;
    } else if ((paramIOException instanceof InterruptedIOException)) {
      i = 1004;
    } else if ((str != null) && (c.e(str).matches("cleartext.*not permitted.*"))) {
      i = 2007;
    } else {
      i = 2001;
    }
    if (i == 2007) {
      paramIOException = new q(paramIOException, paramk);
    } else {
      paramIOException = new r(paramIOException, paramk, i, paramInt);
    }
    return paramIOException;
  }
}

/* Location:
 * Qualified Name:     i0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */