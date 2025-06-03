package ib;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;

public final class f
  implements PrivilegedExceptionAction<Method>
{
  public final Object run()
  {
    return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
  }
}

/* Location:
 * Qualified Name:     ib.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */