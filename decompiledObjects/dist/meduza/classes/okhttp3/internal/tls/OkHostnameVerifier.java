package okhttp3.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

public final class OkHostnameVerifier
  implements HostnameVerifier
{
  public static final OkHostnameVerifier a = new OkHostnameVerifier();
  
  public static ArrayList a(X509Certificate paramX509Certificate)
  {
    List localList1 = b(paramX509Certificate, 7);
    List localList2 = b(paramX509Certificate, 2);
    int i = localList1.size();
    paramX509Certificate = new ArrayList(localList2.size() + i);
    paramX509Certificate.addAll(localList1);
    paramX509Certificate.addAll(localList2);
    return paramX509Certificate;
  }
  
  public static List<String> b(X509Certificate paramX509Certificate, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      paramX509Certificate = paramX509Certificate.getSubjectAlternativeNames();
      if (paramX509Certificate == null) {
        return Collections.emptyList();
      }
      paramX509Certificate = paramX509Certificate.iterator();
      while (paramX509Certificate.hasNext())
      {
        List localList = (List)paramX509Certificate.next();
        if ((localList != null) && (localList.size() >= 2))
        {
          Object localObject = (Integer)localList.get(0);
          if ((localObject != null) && (((Integer)localObject).intValue() == paramInt))
          {
            localObject = (String)localList.get(1);
            if (localObject != null) {
              localArrayList.add(localObject);
            }
          }
        }
      }
      return localArrayList;
    }
    catch (CertificateParsingException paramX509Certificate) {}
    return Collections.emptyList();
  }
  
  public static boolean c(String paramString, X509Certificate paramX509Certificate)
  {
    boolean bool1 = Util.q.matcher(paramString).matches();
    boolean bool2 = false;
    int j;
    if (bool1)
    {
      paramX509Certificate = b(paramX509Certificate, 7);
      int i = paramX509Certificate.size();
      for (j = 0;; j++)
      {
        bool1 = bool2;
        if (j >= i) {
          return bool1;
        }
        if (paramString.equalsIgnoreCase((String)paramX509Certificate.get(j))) {
          break;
        }
      }
    }
    String str1 = paramString.toLowerCase(Locale.US);
    Iterator localIterator = b(paramX509Certificate, 2).iterator();
    do
    {
      bool1 = bool2;
      if (!localIterator.hasNext()) {
        break;
      }
      String str2 = (String)localIterator.next();
      if ((str1 != null) && (str1.length() != 0) && (!str1.startsWith(".")) && (!str1.endsWith("..")) && (str2 != null) && (str2.length() != 0) && (!str2.startsWith(".")) && (!str2.endsWith("..")))
      {
        if (!str1.endsWith("."))
        {
          paramString = new StringBuilder();
          paramString.append(str1);
          paramString.append('.');
          paramString = paramString.toString();
        }
        else
        {
          paramString = str1;
        }
        paramX509Certificate = str2;
        if (!str2.endsWith("."))
        {
          paramX509Certificate = new StringBuilder();
          paramX509Certificate.append(str2);
          paramX509Certificate.append('.');
          paramX509Certificate = paramX509Certificate.toString();
        }
        paramX509Certificate = paramX509Certificate.toLowerCase(Locale.US);
        if (!paramX509Certificate.contains("*"))
        {
          bool1 = paramString.equals(paramX509Certificate);
          continue;
        }
        if ((paramX509Certificate.startsWith("*.")) && (paramX509Certificate.indexOf('*', 1) == -1) && (paramString.length() >= paramX509Certificate.length()) && (!"*.".equals(paramX509Certificate)))
        {
          paramX509Certificate = paramX509Certificate.substring(1);
          if (paramString.endsWith(paramX509Certificate))
          {
            j = paramString.length() - paramX509Certificate.length();
            if ((j <= 0) || (paramString.lastIndexOf('.', j - 1) == -1))
            {
              bool1 = true;
              continue;
            }
          }
        }
      }
      bool1 = false;
    } while (!bool1);
    bool1 = true;
    return bool1;
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    try
    {
      boolean bool = c(paramString, (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
      return bool;
    }
    catch (SSLException paramString) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.tls.OkHostnameVerifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */