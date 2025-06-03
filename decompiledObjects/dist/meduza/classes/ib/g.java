package ib;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;

public final class g
  implements PrivilegedExceptionAction<Method>
{
  public final Object run()
  {
    return SSLParameters.class.getMethod("setApplicationProtocols", new Class[] { String[].class });
  }
}

/* Location:
 * Qualified Name:     ib.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */