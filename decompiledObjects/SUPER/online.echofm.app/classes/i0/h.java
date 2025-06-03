package i0;

import java.io.IOException;

public class h
  extends IOException
{
  public final int o;
  
  public h(int paramInt)
  {
    o = paramInt;
  }
  
  public h(String paramString, int paramInt)
  {
    super(paramString);
    o = paramInt;
  }
  
  public h(String paramString, Throwable paramThrowable, int paramInt)
  {
    super(paramString, paramThrowable);
    o = paramInt;
  }
  
  public h(Throwable paramThrowable, int paramInt)
  {
    super(paramThrowable);
    o = paramInt;
  }
  
  public static boolean a(IOException paramIOException)
  {
    while (paramIOException != null)
    {
      if (((paramIOException instanceof h)) && (o == 2008)) {
        return true;
      }
      paramIOException = paramIOException.getCause();
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     i0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */