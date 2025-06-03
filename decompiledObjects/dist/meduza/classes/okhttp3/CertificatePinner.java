package okhttp3;

import f;
import g;
import java.security.Key;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import xc.i;

public final class CertificatePinner
{
  public static final CertificatePinner c = new CertificatePinner(new LinkedHashSet(Buildera), null);
  public final Set<Pin> a;
  public final CertificateChainCleaner b;
  
  public CertificatePinner(Set<Pin> paramSet, CertificateChainCleaner paramCertificateChainCleaner)
  {
    a = paramSet;
    b = paramCertificateChainCleaner;
  }
  
  public static String b(X509Certificate paramX509Certificate)
  {
    if ((paramX509Certificate instanceof X509Certificate))
    {
      StringBuilder localStringBuilder = f.l("sha256/");
      localStringBuilder.append(i.o(paramX509Certificate.getPublicKey().getEncoded()).h("SHA-256").f());
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
  }
  
  public final void a(String paramString, List<Certificate> paramList)
  {
    List localList = Collections.emptyList();
    Object localObject1 = a.iterator();
    if (!((Iterator)localObject1).hasNext())
    {
      if (localList.isEmpty()) {
        return;
      }
      Object localObject2 = b;
      localObject1 = paramList;
      if (localObject2 != null) {
        localObject1 = ((CertificateChainCleaner)localObject2).a(paramString, paramList);
      }
      int i = ((List)localObject1).size();
      int j = 0;
      int k = 0;
      while (k < i)
      {
        paramList = (X509Certificate)((List)localObject1).get(k);
        if (localList.size() <= 0)
        {
          k++;
        }
        else
        {
          ((Pin)localList.get(0)).getClass();
          throw null;
        }
      }
      paramList = g.g("Certificate pinning failure!", "\n  Peer certificate chain:");
      i = ((List)localObject1).size();
      for (k = 0; k < i; k++)
      {
        localObject2 = (X509Certificate)((List)localObject1).get(k);
        paramList.append("\n    ");
        paramList.append(b((X509Certificate)localObject2));
        paramList.append(": ");
        paramList.append(((X509Certificate)localObject2).getSubjectDN().getName());
      }
      paramList.append("\n  Pinned certificates for ");
      paramList.append(paramString);
      paramList.append(":");
      i = localList.size();
      for (k = j; k < i; k++)
      {
        paramString = (Pin)localList.get(k);
        paramList.append("\n    ");
        paramList.append(paramString);
      }
      throw new SSLPeerUnverifiedException(paramList.toString());
    }
    ((Pin)((Iterator)localObject1).next()).getClass();
    throw null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof CertificatePinner))
    {
      CertificateChainCleaner localCertificateChainCleaner = b;
      paramObject = (CertificatePinner)paramObject;
      if ((Util.k(localCertificateChainCleaner, b)) && (a.equals(a))) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    CertificateChainCleaner localCertificateChainCleaner = b;
    int i;
    if (localCertificateChainCleaner != null) {
      i = localCertificateChainCleaner.hashCode();
    } else {
      i = 0;
    }
    return a.hashCode() + i * 31;
  }
  
  public static final class Builder
  {
    public final ArrayList a = new ArrayList();
  }
  
  public static final class Pin
  {
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof Pin)) {
        return false;
      }
      ((Pin)paramObject).getClass();
      throw null;
    }
    
    public final int hashCode()
    {
      throw null;
    }
    
    public final String toString()
    {
      new StringBuilder().append(null);
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.CertificatePinner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */