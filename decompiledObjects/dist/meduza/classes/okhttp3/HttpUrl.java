package okhttp3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.Util;

public final class HttpUrl
{
  public static final char[] j = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final int e;
  public final List<String> f;
  public final List<String> g;
  public final String h;
  public final String i;
  
  public HttpUrl(Builder paramBuilder)
  {
    a = a;
    Object localObject1 = b;
    b = j(0, ((String)localObject1).length(), (String)localObject1, false);
    localObject1 = c;
    c = j(0, ((String)localObject1).length(), (String)localObject1, false);
    d = d;
    int k = e;
    if (k == -1) {
      k = c(a);
    }
    e = k;
    f = k(f, false);
    localObject1 = g;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = k((List)localObject1, true);
    } else {
      localObject1 = null;
    }
    g = ((List)localObject1);
    String str = h;
    localObject1 = localObject2;
    if (str != null) {
      localObject1 = j(0, str.length(), str, false);
    }
    h = ((String)localObject1);
    i = paramBuilder.toString();
  }
  
  public static String a(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    int k = paramInt1;
    while (k < paramInt2)
    {
      int m = paramString1.codePointAt(k);
      if ((m >= 32) && (m != 127) && ((m < 128) || (!paramBoolean4)) && (paramString2.indexOf(m) == -1) && ((m != 37) || ((paramBoolean1) && ((!paramBoolean2) || (l(k, paramInt2, paramString1))))) && ((m != 43) || (!paramBoolean3)))
      {
        k += Character.charCount(m);
      }
      else
      {
        xc.f localf = new xc.f();
        localf.G0(paramInt1, k, paramString1);
        Object localObject2;
        for (Object localObject1 = null; k < paramInt2; localObject1 = localObject2)
        {
          paramInt1 = paramString1.codePointAt(k);
          if (paramBoolean1)
          {
            localObject2 = localObject1;
            if (paramInt1 == 9) {
              break label397;
            }
            localObject2 = localObject1;
            if (paramInt1 == 10) {
              break label397;
            }
            localObject2 = localObject1;
            if (paramInt1 == 12) {
              break label397;
            }
            if (paramInt1 == 13)
            {
              localObject2 = localObject1;
              break label397;
            }
          }
          Object localObject3;
          if ((paramInt1 == 43) && (paramBoolean3))
          {
            if (paramBoolean1) {
              localObject3 = "+";
            } else {
              localObject3 = "%2B";
            }
            localf.H0((String)localObject3);
            localObject2 = localObject1;
          }
          else if ((paramInt1 >= 32) && (paramInt1 != 127) && ((paramInt1 < 128) || (!paramBoolean4)) && (paramString2.indexOf(paramInt1) == -1) && ((paramInt1 != 37) || ((paramBoolean1) && ((!paramBoolean2) || (l(k, paramInt2, paramString1))))))
          {
            localf.I0(paramInt1);
            localObject2 = localObject1;
          }
          else
          {
            localObject3 = localObject1;
            if (localObject1 == null) {
              localObject3 = new xc.f();
            }
            ((xc.f)localObject3).I0(paramInt1);
            for (;;)
            {
              localObject2 = localObject3;
              if (((xc.f)localObject3).v()) {
                break;
              }
              m = ((xc.f)localObject3).readByte() & 0xFF;
              localf.B0(37);
              localObject1 = j;
              localf.B0(localObject1[(m >> 4 & 0xF)]);
              localf.B0(localObject1[(m & 0xF)]);
            }
          }
          label397:
          k += Character.charCount(paramInt1);
        }
        return localf.k0();
      }
    }
    return paramString1.substring(paramInt1, paramInt2);
  }
  
  public static String b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    return a(paramString1, 0, paramString1.length(), paramString2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  public static int c(String paramString)
  {
    if (paramString.equals("http")) {
      return 80;
    }
    if (paramString.equals("https")) {
      return 443;
    }
    return -1;
  }
  
  public static void i(StringBuilder paramStringBuilder, List<String> paramList)
  {
    int k = paramList.size();
    for (int m = 0; m < k; m += 2)
    {
      String str1 = (String)paramList.get(m);
      String str2 = (String)paramList.get(m + 1);
      if (m > 0) {
        paramStringBuilder.append('&');
      }
      paramStringBuilder.append(str1);
      if (str2 != null)
      {
        paramStringBuilder.append('=');
        paramStringBuilder.append(str2);
      }
    }
  }
  
  public static String j(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    int k = paramInt1;
    while (k < paramInt2)
    {
      int m = paramString.charAt(k);
      if ((m != 37) && ((m != 43) || (!paramBoolean)))
      {
        k++;
      }
      else
      {
        xc.f localf = new xc.f();
        localf.G0(paramInt1, k, paramString);
        paramInt1 = k;
        while (paramInt1 < paramInt2)
        {
          m = paramString.codePointAt(paramInt1);
          if (m == 37)
          {
            k = paramInt1 + 2;
            if (k < paramInt2)
            {
              int n = Util.g(paramString.charAt(paramInt1 + 1));
              int i1 = Util.g(paramString.charAt(k));
              if ((n == -1) || (i1 == -1)) {
                break label169;
              }
              localf.B0((n << 4) + i1);
              paramInt1 = k;
              break label176;
            }
          }
          if ((m == 43) && (paramBoolean)) {
            localf.B0(32);
          } else {
            label169:
            localf.I0(m);
          }
          label176:
          paramInt1 += Character.charCount(m);
        }
        return localf.k0();
      }
    }
    return paramString.substring(paramInt1, paramInt2);
  }
  
  public static List k(List paramList, boolean paramBoolean)
  {
    int k = paramList.size();
    ArrayList localArrayList = new ArrayList(k);
    for (int m = 0; m < k; m++)
    {
      String str = (String)paramList.get(m);
      if (str != null) {
        str = j(0, str.length(), str, paramBoolean);
      } else {
        str = null;
      }
      localArrayList.add(str);
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static boolean l(int paramInt1, int paramInt2, String paramString)
  {
    int k = paramInt1 + 2;
    boolean bool = true;
    if ((k >= paramInt2) || (paramString.charAt(paramInt1) != '%') || (Util.g(paramString.charAt(paramInt1 + 1)) == -1) || (Util.g(paramString.charAt(k)) == -1)) {
      bool = false;
    }
    return bool;
  }
  
  public static ArrayList m(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int n;
    for (int k = 0; k <= paramString.length(); k = n + 1)
    {
      int m = paramString.indexOf('&', k);
      n = m;
      if (m == -1) {
        n = paramString.length();
      }
      m = paramString.indexOf('=', k);
      String str;
      if ((m != -1) && (m <= n))
      {
        localArrayList.add(paramString.substring(k, m));
        str = paramString.substring(m + 1, n);
      }
      else
      {
        localArrayList.add(paramString.substring(k, n));
        str = null;
      }
      localArrayList.add(str);
    }
    return localArrayList;
  }
  
  public final String d()
  {
    if (c.isEmpty()) {
      return "";
    }
    int k = i.indexOf(':', a.length() + 3);
    int m = i.indexOf('@');
    return i.substring(k + 1, m);
  }
  
  public final String e()
  {
    int k = i.indexOf('/', a.length() + 3);
    String str = i;
    int m = Util.j(str, k, str.length(), "?#");
    return i.substring(k, m);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof HttpUrl)) && (i.equals(i))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final ArrayList f()
  {
    int k = i.indexOf('/', a.length() + 3);
    Object localObject = i;
    int m = Util.j((String)localObject, k, ((String)localObject).length(), "?#");
    localObject = new ArrayList();
    while (k < m)
    {
      int n = k + 1;
      k = Util.i(i, n, m, '/');
      ((ArrayList)localObject).add(i.substring(n, k));
    }
    return (ArrayList)localObject;
  }
  
  public final String g()
  {
    if (g == null) {
      return null;
    }
    int k = i.indexOf('?') + 1;
    String str = i;
    int m = Util.i(str, k, str.length(), '#');
    return i.substring(k, m);
  }
  
  public final String h()
  {
    if (b.isEmpty()) {
      return "";
    }
    int k = a.length() + 3;
    String str = i;
    int m = Util.j(str, k, str.length(), ":@");
    return i.substring(k, m);
  }
  
  public final int hashCode()
  {
    return i.hashCode();
  }
  
  public final URI n()
  {
    Builder localBuilder = new Builder();
    a = a;
    b = h();
    c = d();
    d = d;
    if (e != c(a)) {
      k = e;
    } else {
      k = -1;
    }
    e = k;
    f.clear();
    f.addAll(f());
    Object localObject1 = g();
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = m(b((String)localObject1, " \"'<>#", true, false, true, true));
    } else {
      localObject1 = null;
    }
    g = ((ArrayList)localObject1);
    if (h == null)
    {
      localObject1 = localObject2;
    }
    else
    {
      k = i.indexOf('#');
      localObject1 = i.substring(k + 1);
    }
    h = ((String)localObject1);
    int m = f.size();
    int n = 0;
    for (int k = 0; k < m; k++)
    {
      localObject1 = (String)f.get(k);
      f.set(k, b((String)localObject1, "[]", true, true, false, true));
    }
    localObject1 = g;
    if (localObject1 != null)
    {
      m = ((List)localObject1).size();
      for (k = n; k < m; k++)
      {
        localObject1 = (String)g.get(k);
        if (localObject1 != null) {
          g.set(k, b((String)localObject1, "\\^`{|}", true, true, true, true));
        }
      }
    }
    localObject1 = h;
    if (localObject1 != null) {
      h = b((String)localObject1, " \"#<>\\^`{|}", true, true, false, false);
    }
    localObject2 = localBuilder.toString();
    try
    {
      localObject1 = new URI((String)localObject2);
      return (URI)localObject1;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      try
      {
        localObject2 = URI.create(((String)localObject2).replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
        return (URI)localObject2;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localURISyntaxException);
      }
    }
  }
  
  public final String toString()
  {
    return i;
  }
  
  public static final class Builder
  {
    public String a;
    public String b = "";
    public String c = "";
    public String d;
    public int e = -1;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    
    public Builder()
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
}

/* Location:
 * Qualified Name:     okhttp3.HttpUrl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */