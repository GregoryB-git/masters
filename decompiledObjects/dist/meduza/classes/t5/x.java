package t5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import x6.b;

public class x
  extends l
{
  public final int c;
  
  public x()
  {
    super(2008);
    c = 1;
  }
  
  public x(IOException paramIOException, int paramInt1, int paramInt2)
  {
    super(i, paramIOException);
    c = paramInt2;
  }
  
  public x(String paramString, int paramInt)
  {
    super(paramString, i);
    c = 1;
  }
  
  public x(String paramString, IOException paramIOException, int paramInt)
  {
    super(i, paramString, paramIOException);
    c = 1;
  }
  
  public static x a(IOException paramIOException, int paramInt)
  {
    String str = paramIOException.getMessage();
    int i;
    if ((paramIOException instanceof SocketTimeoutException)) {
      i = 2002;
    } else if ((paramIOException instanceof InterruptedIOException)) {
      i = 1004;
    } else if ((str != null) && (b.x0(str).matches("cleartext.*not permitted.*"))) {
      i = 2007;
    } else {
      i = 2001;
    }
    if (i == 2007) {
      paramIOException = new w(paramIOException);
    } else {
      paramIOException = new x(paramIOException, i, paramInt);
    }
    return paramIOException;
  }
}

/* Location:
 * Qualified Name:     t5.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */