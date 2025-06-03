package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.Util;
import okhttp3.internal.tls.TrustRootIndex;

final class AndroidPlatform$AndroidTrustRootIndex
  implements TrustRootIndex
{
  public final X509TrustManager a;
  public final Method b;
  
  public AndroidPlatform$AndroidTrustRootIndex(X509TrustManager paramX509TrustManager, Method paramMethod)
  {
    b = paramMethod;
    a = paramX509TrustManager;
  }
  
  public final X509Certificate a(X509Certificate paramX509Certificate)
  {
    try
    {
      paramX509Certificate = (TrustAnchor)b.invoke(a, new Object[] { paramX509Certificate });
      if (paramX509Certificate != null) {
        paramX509Certificate = paramX509Certificate.getTrustedCert();
      }
    }
    catch (IllegalAccessException paramX509Certificate)
    {
      throw Util.a("unable to get issues and signature", paramX509Certificate);
    }
    catch (InvocationTargetException paramX509Certificate)
    {
      for (;;) {}
    }
    paramX509Certificate = null;
    return paramX509Certificate;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof AndroidTrustRootIndex)) {
      return false;
    }
    paramObject = (AndroidTrustRootIndex)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() * 31 + i;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.AndroidPlatform.AndroidTrustRootIndex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */