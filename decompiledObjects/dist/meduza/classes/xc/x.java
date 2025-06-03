package xc;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p2.m0;

public final class x
  extends c
{
  public final Socket m;
  
  public x(Socket paramSocket)
  {
    m = paramSocket;
  }
  
  public final IOException j(IOException paramIOException)
  {
    SocketTimeoutException localSocketTimeoutException = new SocketTimeoutException("timeout");
    if (paramIOException != null) {
      localSocketTimeoutException.initCause(paramIOException);
    }
    return localSocketTimeoutException;
  }
  
  public final void k()
  {
    try
    {
      m.close();
    }
    catch (AssertionError localAssertionError)
    {
      if (m0.Q(localAssertionError))
      {
        localLogger = p.a;
        localLevel = Level.WARNING;
        localStringBuilder = new StringBuilder();
      }
      else
      {
        throw localAssertionError;
      }
    }
    catch (Exception localException)
    {
      Logger localLogger = p.a;
      Level localLevel = Level.WARNING;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to close timed out socket ");
      localStringBuilder.append(m);
      localLogger.log(localLevel, localStringBuilder.toString(), localException);
    }
  }
}

/* Location:
 * Qualified Name:     xc.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */