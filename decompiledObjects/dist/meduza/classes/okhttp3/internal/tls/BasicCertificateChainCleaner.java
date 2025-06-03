package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class BasicCertificateChainCleaner
  extends CertificateChainCleaner
{
  public final TrustRootIndex a;
  
  public BasicCertificateChainCleaner(TrustRootIndex paramTrustRootIndex)
  {
    a = paramTrustRootIndex;
  }
  
  public final List a(String paramString, List paramList)
  {
    ArrayDeque localArrayDeque = new ArrayDeque(paramList);
    paramString = new ArrayList();
    paramString.add(localArrayDeque.removeFirst());
    int i = 0;
    int j = i;
    X509Certificate localX509Certificate1;
    if (i < 9)
    {
      paramList = (X509Certificate)paramString.get(paramString.size() - 1);
      localX509Certificate1 = a.a(paramList);
      if (localX509Certificate1 != null)
      {
        if ((paramString.size() > 1) || (!paramList.equals(localX509Certificate1))) {
          paramString.add(localX509Certificate1);
        }
        if (!localX509Certificate1.getIssuerDN().equals(localX509Certificate1.getSubjectDN())) {
          label113:
          j = 0;
        }
      }
    }
    for (;;)
    {
      Iterator localIterator;
      X509Certificate localX509Certificate2;
      int k;
      try
      {
        localX509Certificate1.verify(localX509Certificate1.getPublicKey());
        j = 1;
        if (j != 0) {
          return paramString;
        }
        j = 1;
        continue;
        localIterator = localArrayDeque.iterator();
        if (localIterator.hasNext())
        {
          localX509Certificate2 = (X509Certificate)localIterator.next();
          if (!paramList.getIssuerDN().equals(localX509Certificate2.getSubjectDN())) {
            k = 0;
          }
        }
      }
      catch (GeneralSecurityException paramList) {}
      try
      {
        paramList.verify(localX509Certificate2.getPublicKey());
        k = 1;
        if (k == 0) {
          continue;
        }
        localIterator.remove();
        paramString.add(localX509Certificate2);
        i++;
      }
      catch (GeneralSecurityException localGeneralSecurityException) {}
      if (j != 0) {
        return paramString;
      }
      paramString = new StringBuilder();
      paramString.append("Failed to find a trusted cert that signed ");
      paramString.append(paramList);
      throw new SSLPeerUnverifiedException(paramString.toString());
      paramList = new StringBuilder();
      paramList.append("Certificate chain too long: ");
      paramList.append(paramString);
      throw new SSLPeerUnverifiedException(paramList.toString());
      break label113;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((!(paramObject instanceof BasicCertificateChainCleaner)) || (!a.equals(a))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.tls.BasicCertificateChainCleaner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */