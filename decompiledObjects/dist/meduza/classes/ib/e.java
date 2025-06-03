package ib;

import f;
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

public final class e
  implements HostnameVerifier
{
  public static final e a = new e();
  public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  
  public static List<String> a(X509Certificate paramX509Certificate, int paramInt)
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
  
  public static boolean b(String paramString, X509Certificate paramX509Certificate)
  {
    boolean bool1 = b.matcher(paramString).matches();
    boolean bool2 = false;
    if (bool1)
    {
      paramX509Certificate = a(paramX509Certificate, 7);
      i = paramX509Certificate.size();
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
    String str = paramString.toLowerCase(Locale.US);
    paramString = a(paramX509Certificate, 2);
    int k = paramString.size();
    int j = 0;
    for (int i = j; j < k; i = 1)
    {
      if (c(str, (String)paramString.get(j))) {
        return true;
      }
      j++;
    }
    bool1 = bool2;
    if (i == 0)
    {
      c localc = new c(paramX509Certificate.getSubjectX500Principal());
      c = 0;
      d = 0;
      e = 0;
      f = 0;
      g = a.toCharArray();
      paramString = localc.c();
      paramX509Certificate = paramString;
      if (paramString != null)
      {
        i = c;
        j = b;
        if (i != j)
        {
          k = g[i];
          if (k != 34)
          {
            if (k != 35)
            {
              if ((k != 43) && (k != 44) && (k != 59))
              {
                d = i;
                e = i;
                label494:
                do
                {
                  for (;;)
                  {
                    j = c;
                    if (j >= b)
                    {
                      paramString = g;
                      j = d;
                      paramString = new String(paramString, j, e - j);
                      break label1152;
                    }
                    paramString = g;
                    i = paramString[j];
                    if (i == 32) {
                      break label494;
                    }
                    if (i == 59) {
                      break;
                    }
                    if (i != 92)
                    {
                      if ((i == 43) || (i == 44)) {
                        break;
                      }
                      k = e;
                      e = (k + 1);
                      paramString[k] = ((char)i);
                    }
                    else
                    {
                      j = e;
                      e = (j + 1);
                      paramString[j] = localc.b();
                      j = c;
                    }
                    c = (j + 1);
                  }
                  j = d;
                  paramString = new String(paramString, j, e - j);
                  break label1152;
                  i = e;
                  f = i;
                  c = (j + 1);
                  e = (i + 1);
                  paramString[i] = ((char)32);
                  for (;;)
                  {
                    j = c;
                    i = b;
                    if (j >= i) {
                      break;
                    }
                    paramString = g;
                    if (paramString[j] != ' ') {
                      break;
                    }
                    i = e;
                    e = (i + 1);
                    paramString[i] = ((char)32);
                    c = (j + 1);
                  }
                  if (j == i) {
                    break;
                  }
                  j = g[j];
                } while ((j != 44) && (j != 43) && (j != 59));
                paramString = g;
                j = d;
                paramString = new String(paramString, j, f - j);
              }
              else
              {
                paramString = "";
              }
            }
            else if (i + 4 < j)
            {
              d = i;
              for (;;)
              {
                j = i + 1;
                c = j;
                if (j == b) {
                  break;
                }
                paramString = g;
                k = paramString[j];
                if ((k == 43) || (k == 44) || (k == 59)) {
                  break;
                }
                if (k == 32)
                {
                  e = j;
                  for (;;)
                  {
                    j++;
                    c = j;
                    if ((j >= b) || (g[j] != ' ')) {
                      break;
                    }
                  }
                }
                i = j;
                if (k >= 65)
                {
                  i = j;
                  if (k <= 70)
                  {
                    paramString[j] = ((char)(char)(k + 32));
                    i = j;
                  }
                }
              }
              e = j;
              i = e;
              j = d;
              int m = i - j;
              if ((m >= 5) && ((m & 0x1) != 0))
              {
                k = m / 2;
                paramString = new byte[k];
                i = j + 1;
                for (j = 0; j < k; j++)
                {
                  paramString[j] = ((byte)(byte)localc.a(i));
                  i += 2;
                }
                paramString = new String(g, d, m);
              }
              else
              {
                paramString = f.l("Unexpected end of DN: ");
                paramString.append(a);
                throw new IllegalStateException(paramString.toString());
              }
            }
            else
            {
              paramString = f.l("Unexpected end of DN: ");
              paramString.append(a);
              throw new IllegalStateException(paramString.toString());
            }
          }
          else
          {
            j = i + 1;
            c = j;
            d = j;
          }
        }
      }
      for (;;)
      {
        e = j;
        i = c;
        if (i == b) {
          break label1364;
        }
        paramString = g;
        k = paramString[i];
        if (k == 34)
        {
          j = i;
          do
          {
            j++;
            c = j;
          } while ((j < b) && (g[j] == ' '));
          paramString = g;
          j = d;
          paramString = new String(paramString, j, e - j);
          label1152:
          if (!"cn".equalsIgnoreCase(paramX509Certificate))
          {
            j = c;
            if (j >= b) {
              paramString = null;
            }
          }
          else
          {
            bool1 = bool2;
            if (paramString == null) {
              return bool1;
            }
            return c(str, paramString);
          }
          i = g[j];
          if ((i != 44) && (i != 59) && (i != 43))
          {
            paramString = f.l("Malformed DN: ");
            paramString.append(a);
            throw new IllegalStateException(paramString.toString());
          }
          c = (j + 1);
          paramX509Certificate = localc.c();
          if (paramX509Certificate != null) {
            break;
          }
          paramString = f.l("Malformed DN: ");
          paramString.append(a);
          throw new IllegalStateException(paramString.toString());
        }
        if (k == 92) {
          paramString[j] = localc.b();
        } else {
          paramString[j] = ((char)k);
        }
        c += 1;
        j = e + 1;
      }
      label1364:
      paramString = f.l("Unexpected end of DN: ");
      paramString.append(a);
      throw new IllegalStateException(paramString.toString());
    }
    return bool1;
  }
  
  public static boolean c(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString1.length() != 0) && (!paramString1.startsWith(".")) && (!paramString1.endsWith("..")) && (paramString2 != null) && (paramString2.length() != 0) && (!paramString2.startsWith(".")) && (!paramString2.endsWith("..")))
    {
      Object localObject = paramString1;
      if (!paramString1.endsWith("."))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString1);
        ((StringBuilder)localObject).append('.');
        localObject = ((StringBuilder)localObject).toString();
      }
      paramString1 = paramString2;
      if (!paramString2.endsWith("."))
      {
        paramString1 = new StringBuilder();
        paramString1.append(paramString2);
        paramString1.append('.');
        paramString1 = paramString1.toString();
      }
      paramString1 = paramString1.toLowerCase(Locale.US);
      if (!paramString1.contains("*")) {
        return ((String)localObject).equals(paramString1);
      }
      if ((paramString1.startsWith("*.")) && (paramString1.indexOf('*', 1) == -1))
      {
        if (((String)localObject).length() < paramString1.length()) {
          return false;
        }
        if ("*.".equals(paramString1)) {
          return false;
        }
        paramString1 = paramString1.substring(1);
        if (!((String)localObject).endsWith(paramString1)) {
          return false;
        }
        int i = ((String)localObject).length() - paramString1.length();
        return (i <= 0) || (((String)localObject).lastIndexOf('.', i - 1) == -1);
      }
    }
    return false;
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    try
    {
      boolean bool = b(paramString, (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
      return bool;
    }
    catch (SSLException paramString) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     ib.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */