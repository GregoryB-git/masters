package ib;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLSocket;

public final class h
  implements PrivilegedExceptionAction<Method>
{
  public final Object run()
  {
    return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
  }
}

/* Location:
 * Qualified Name:     ib.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */