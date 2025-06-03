package okhttp3.internal.connection;

import java.io.IOException;

public final class RouteException
  extends RuntimeException
{
  public IOException a;
  public IOException b;
  
  public RouteException(IOException paramIOException)
  {
    super(paramIOException);
    a = paramIOException;
    b = paramIOException;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.connection.RouteException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */