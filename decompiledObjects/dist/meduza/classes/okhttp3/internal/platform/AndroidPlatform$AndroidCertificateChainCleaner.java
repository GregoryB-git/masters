package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.CertificateChainCleaner;

final class AndroidPlatform$AndroidCertificateChainCleaner
  extends CertificateChainCleaner
{
  public final Object a;
  public final Method b;
  
  public AndroidPlatform$AndroidCertificateChainCleaner(Object paramObject, Method paramMethod)
  {
    a = paramObject;
    b = paramMethod;
  }
  
  public final List a(String paramString, List paramList)
  {
    try
    {
      paramList = (X509Certificate[])paramList.toArray(new X509Certificate[paramList.size()]);
      paramString = (List)b.invoke(a, new Object[] { paramList, "RSA", paramString });
      return paramString;
    }
    catch (IllegalAccessException paramString)
    {
      throw new AssertionError(paramString);
    }
    catch (InvocationTargetException paramString)
    {
      paramList = new SSLPeerUnverifiedException(paramString.getMessage());
      paramList.initCause(paramString);
      throw paramList;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return paramObject instanceof AndroidCertificateChainCleaner;
  }
  
  public final int hashCode()
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.AndroidPlatform.AndroidCertificateChainCleaner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */