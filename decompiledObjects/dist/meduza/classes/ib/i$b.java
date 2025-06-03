package ib;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class i$b
  extends i
{
  public final Method e;
  public final Method f;
  
  public i$b(Provider paramProvider, Method paramMethod1, Method paramMethod2)
  {
    super(paramProvider);
    e = paramMethod1;
    f = paramMethod2;
  }
  
  public final void c(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
  {
    paramString = paramSSLSocket.getSSLParameters();
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      j localj = (j)paramList.next();
      if (localj != j.b) {
        localArrayList.add(a);
      }
    }
    try
    {
      e.invoke(paramString, new Object[] { localArrayList.toArray(new String[localArrayList.size()]) });
      paramSSLSocket.setSSLParameters(paramString);
      return;
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
  }
  
  public final String d(SSLSocket paramSSLSocket)
  {
    try
    {
      paramSSLSocket = (String)f.invoke(paramSSLSocket, new Object[0]);
      return paramSSLSocket;
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new RuntimeException(paramSSLSocket);
    }
  }
  
  public final int e()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     ib.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */