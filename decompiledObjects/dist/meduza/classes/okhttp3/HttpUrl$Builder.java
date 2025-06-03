package okhttp3;

import f;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;

public final class HttpUrl$Builder
{
  public String a;
  public String b = "";
  public String c = "";
  public String d;
  public int e = -1;
  public final ArrayList f;
  public ArrayList g;
  public String h;
  
  public HttpUrl$Builder()
  {
    ArrayList localArrayList = new ArrayList();
    f = localArrayList;
    localArrayList.add("");
  }
  
  public final HttpUrl a()
  {
    if (a != null)
    {
      if (d != null) {
        return new HttpUrl(this);
      }
      throw new IllegalStateException("host == null");
    }
    throw new IllegalStateException("scheme == null");
  }
  
  public final void b(HttpUrl paramHttpUrl, String paramString)
  {
    Object localObject1 = paramString;
    int i = paramString.length();
    int j = 0;
    i = Util.t(0, i, (String)localObject1);
    int k = Util.u(i, paramString.length(), (String)localObject1);
    if (k - i >= 2)
    {
      m = ((String)localObject1).charAt(i);
      if (((m >= 97) && (m <= 122)) || ((m >= 65) && (m <= 90)))
      {
        m = i;
        for (;;)
        {
          m++;
          if (m >= k) {
            break;
          }
          n = ((String)localObject1).charAt(m);
          if (((n < 97) || (n > 122)) && ((n < 65) || (n > 90)) && ((n < 48) || (n > 57)) && (n != 43) && (n != 45) && (n != 46))
          {
            if (n != 58) {
              break;
            }
            break label187;
          }
        }
      }
    }
    int m = -1;
    label187:
    if (m != -1)
    {
      if (paramString.regionMatches(true, i, "https:", 0, 6))
      {
        a = "https";
        i += 6;
      }
      else if (paramString.regionMatches(true, i, "http:", 0, 5))
      {
        a = "http";
        i += 5;
      }
      else
      {
        paramHttpUrl = f.l("Expected URL scheme 'http' or 'https' but was '");
        paramHttpUrl.append(((String)localObject1).substring(0, m));
        paramHttpUrl.append("'");
        throw new IllegalArgumentException(paramHttpUrl.toString());
      }
    }
    else
    {
      if (paramHttpUrl == null) {
        break label1745;
      }
      a = a;
    }
    int n = i;
    m = 0;
    int i1;
    while (n < k)
    {
      i1 = ((String)localObject1).charAt(n);
      if ((i1 != 92) && (i1 != 47)) {
        break;
      }
      m++;
      n++;
    }
    int i2;
    Object localObject2;
    if ((m < 2) && (paramHttpUrl != null) && (a.equals(a)))
    {
      b = paramHttpUrl.h();
      c = paramHttpUrl.d();
      d = d;
      e = e;
      f.clear();
      f.addAll(paramHttpUrl.f());
      if (i != k)
      {
        m = i;
        n = j;
        if (((String)localObject1).charAt(i) != '#') {}
      }
      else
      {
        paramHttpUrl = paramHttpUrl.g();
        if (paramHttpUrl != null) {
          paramHttpUrl = HttpUrl.m(HttpUrl.b(paramHttpUrl, " \"'<>#", true, false, true, true));
        } else {
          paramHttpUrl = null;
        }
        g = paramHttpUrl;
        m = i;
        n = j;
      }
    }
    else
    {
      n = 0;
      j = n;
      m = i + m;
      i = n;
      n = m;
      for (;;)
      {
        m = Util.j((String)localObject1, n, k, "@/\\?#");
        if (m != k) {
          i1 = ((String)localObject1).charAt(m);
        } else {
          i1 = -1;
        }
        if ((i1 == -1) || (i1 == 35) || (i1 == 47) || (i1 == 92) || (i1 == 63)) {
          break;
        }
        if (i1 == 64)
        {
          if (i == 0)
          {
            i2 = Util.i((String)localObject1, n, m, ':');
            i1 = m;
            localObject2 = HttpUrl.a(paramString, n, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            paramHttpUrl = (HttpUrl)localObject2;
            if (j != 0)
            {
              paramHttpUrl = new StringBuilder();
              paramHttpUrl.append(b);
              paramHttpUrl.append("%40");
              paramHttpUrl.append((String)localObject2);
              paramHttpUrl = paramHttpUrl.toString();
            }
            b = paramHttpUrl;
            if (i2 != i1)
            {
              c = HttpUrl.a(paramString, i2 + 1, i1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
              i = 1;
            }
            j = 1;
          }
          else
          {
            paramHttpUrl = new StringBuilder();
            paramHttpUrl.append(c);
            paramHttpUrl.append("%40");
            paramHttpUrl.append(HttpUrl.a(paramString, n, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
            c = paramHttpUrl.toString();
          }
          n = m + 1;
        }
      }
      i = n;
      while (i < m)
      {
        j = ((String)localObject1).charAt(i);
        if (j != 58)
        {
          if (j != 91)
          {
            j = i;
          }
          else
          {
            j = i;
            do
            {
              i = j + 1;
              j = i;
              if (i >= m) {
                break;
              }
              j = i;
            } while (((String)localObject1).charAt(i) != ']');
            j = i;
          }
          i = j + 1;
        }
        else
        {
          break label865;
        }
      }
      i = m;
      label865:
      i1 = i + 1;
      if (i1 < m) {
        d = Util.c(HttpUrl.j(n, i, (String)localObject1, false));
      }
    }
    try
    {
      j = Integer.parseInt(HttpUrl.a(paramString, i1, m, "", false, false, false, true));
      if ((j <= 0) || (j > 65535)) {}
    }
    catch (NumberFormatException paramHttpUrl)
    {
      Object localObject3;
      Object localObject4;
      String str;
      Object localObject5;
      Object localObject6;
      for (;;) {}
    }
    j = -1;
    e = j;
    if (j == -1)
    {
      paramHttpUrl = f.l("Invalid URL port: \"");
      paramHttpUrl.append(((String)localObject1).substring(i1, m));
      paramHttpUrl.append('"');
      throw new IllegalArgumentException(paramHttpUrl.toString());
      d = Util.c(HttpUrl.j(n, i, (String)localObject1, false));
      e = HttpUrl.c(a);
    }
    if (d != null)
    {
      n = 0;
      i = Util.j((String)localObject1, m, k, "?#");
      if (m == i)
      {
        paramHttpUrl = this;
        paramString = (String)localObject1;
      }
      else
      {
        j = ((String)localObject1).charAt(m);
        if ((j != 47) && (j != 92))
        {
          paramHttpUrl = f;
          paramHttpUrl.set(paramHttpUrl.size() - 1, "");
          localObject3 = this;
          localObject4 = localObject3;
          j = i;
          str = "";
          paramHttpUrl = (HttpUrl)localObject1;
          paramString = paramHttpUrl;
          localObject1 = paramString;
          localObject2 = localObject1;
          i1 = n;
          i2 = k;
          localObject5 = paramHttpUrl;
          n = i;
          k = m;
          i = i1;
          m = i2;
          paramHttpUrl = (HttpUrl)localObject4;
        }
        else
        {
          f.clear();
          f.add("");
          paramString = this;
          paramHttpUrl = paramString;
          j = i;
          str = "";
          localObject2 = localObject1;
          localObject3 = localObject2;
          localObject4 = localObject3;
          i2 = m;
          i1 = i;
          localObject5 = localObject3;
          localObject6 = localObject2;
          i2++;
          i = n;
          m = k;
          localObject3 = paramHttpUrl;
          paramHttpUrl = paramString;
          k = i2;
          localObject2 = localObject1;
          n = i1;
          localObject1 = localObject4;
          paramString = (String)localObject5;
          localObject5 = localObject6;
        }
        for (i2 = k;; i2 = k)
        {
          if (i2 >= j) {
            break label1600;
          }
          k = Util.j((String)localObject5, i2, j, "/\\");
          if (k < j) {
            i1 = 1;
          } else {
            i1 = i;
          }
          localObject4 = HttpUrl.a((String)localObject2, i2, k, " \"<>^`{}|/\\?#", true, false, false, true);
          if ((!((String)localObject4).equals(".")) && (!((String)localObject4).equalsIgnoreCase("%2e"))) {
            i2 = i;
          } else {
            i2 = 1;
          }
          if (i2 == 0)
          {
            if ((((String)localObject4).equals("..")) || (((String)localObject4).equalsIgnoreCase("%2e.")) || (((String)localObject4).equalsIgnoreCase(".%2e")) || (((String)localObject4).equalsIgnoreCase("%2e%2e"))) {
              i = 1;
            }
            if (i != 0)
            {
              localObject4 = f;
              if ((((String)((ArrayList)localObject4).remove(((ArrayList)localObject4).size() - 1)).isEmpty()) && (!f.isEmpty()))
              {
                localObject4 = f;
                ((ArrayList)localObject4).set(((ArrayList)localObject4).size() - 1, str);
              }
              else
              {
                f.add(str);
              }
            }
            else
            {
              localObject6 = f;
              if (((String)((ArrayList)localObject6).get(((ArrayList)localObject6).size() - 1)).isEmpty())
              {
                localObject6 = f;
                ((ArrayList)localObject6).set(((ArrayList)localObject6).size() - 1, localObject4);
              }
              else
              {
                f.add(localObject4);
              }
              if (i1 != 0) {
                f.add(str);
              }
            }
          }
          i = 0;
          if (i1 != 0)
          {
            i = 0;
            localObject6 = localObject5;
            localObject5 = paramString;
            localObject4 = localObject1;
            i1 = n;
            i2 = k;
            localObject1 = localObject2;
            n = i;
            k = m;
            paramString = paramHttpUrl;
            paramHttpUrl = (HttpUrl)localObject3;
            break;
          }
        }
        label1600:
        i = n;
        k = m;
      }
      if ((i < k) && (paramString.charAt(i) == '?'))
      {
        m = Util.i(paramString, i, k, '#');
        g = HttpUrl.m(HttpUrl.a((String)localObject1, i + 1, m, " \"'<>#", true, false, true, true));
        i = m;
      }
      if ((i < k) && (paramString.charAt(i) == '#')) {
        h = HttpUrl.a((String)localObject1, i + 1, k, "", true, false, false, false);
      }
      return;
    }
    paramHttpUrl = f.l("Invalid URL host: \"");
    paramHttpUrl.append(((String)localObject1).substring(n, i));
    paramHttpUrl.append('"');
    throw new IllegalArgumentException(paramHttpUrl.toString());
    label1745:
    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = a;
    if (localObject != null)
    {
      localStringBuilder.append((String)localObject);
      localObject = "://";
    }
    else
    {
      localObject = "//";
    }
    localStringBuilder.append((String)localObject);
    if ((!b.isEmpty()) || (!c.isEmpty()))
    {
      localStringBuilder.append(b);
      if (!c.isEmpty())
      {
        localStringBuilder.append(':');
        localStringBuilder.append(c);
      }
      localStringBuilder.append('@');
    }
    localObject = d;
    if (localObject != null) {
      if (((String)localObject).indexOf(':') != -1)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(d);
        localStringBuilder.append(']');
      }
      else
      {
        localStringBuilder.append(d);
      }
    }
    int i = e;
    if ((i != -1) || (a != null))
    {
      if (i == -1) {
        i = HttpUrl.c(a);
      }
      localObject = a;
      if ((localObject == null) || (i != HttpUrl.c((String)localObject)))
      {
        localStringBuilder.append(':');
        localStringBuilder.append(i);
      }
    }
    localObject = f;
    int j = ((ArrayList)localObject).size();
    for (i = 0; i < j; i++)
    {
      localStringBuilder.append('/');
      localStringBuilder.append((String)((List)localObject).get(i));
    }
    if (g != null)
    {
      localStringBuilder.append('?');
      HttpUrl.i(localStringBuilder, g);
    }
    if (h != null)
    {
      localStringBuilder.append('#');
      localStringBuilder.append(h);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     okhttp3.HttpUrl.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */