package B6;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c
{
  public static final char[] j = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final int e;
  public final List f;
  public final List g;
  public final String h;
  public final String i;
  
  public c(a parama)
  {
    a = a;
    b = q(b, false);
    c = q(c, false);
    d = d;
    e = parama.c();
    f = r(f, false);
    Object localObject1 = g;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = r((List)localObject1, true);
    } else {
      localObject1 = null;
    }
    g = ((List)localObject1);
    String str = h;
    localObject1 = localObject2;
    if (str != null) {
      localObject1 = q(str, false);
    }
    h = ((String)localObject1);
    i = parama.toString();
  }
  
  public static String a(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Charset paramCharset)
  {
    int k = paramInt1;
    while (k < paramInt2)
    {
      int m = paramString1.codePointAt(k);
      if ((m < 32) || (m == 127) || ((m < 128) || (paramBoolean4))) {
        break label115;
      }
      if ((paramString2.indexOf(m) == -1) && ((m != 37) || ((paramBoolean1) && ((!paramBoolean2) || (t(paramString1, k, paramInt2))))) && ((m != 43) || (!paramBoolean3)))
      {
        k += Character.charCount(m);
      }
      else
      {
        label115:
        D6.a locala = new D6.a();
        locala.H(paramString1, paramInt1, k);
        c(locala, paramString1, k, paramInt2, paramString2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramCharset);
        return locala.u();
      }
    }
    return paramString1.substring(paramInt1, paramInt2);
  }
  
  public static String b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    return a(paramString1, 0, paramString1.length(), paramString2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, null);
  }
  
  public static void c(D6.a parama, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Charset paramCharset)
  {
    Object localObject2;
    for (Object localObject1 = null; paramInt1 < paramInt2; localObject1 = localObject2)
    {
      int k = paramString1.codePointAt(paramInt1);
      if (paramBoolean1)
      {
        localObject2 = localObject1;
        if (k == 9) {
          break label321;
        }
        localObject2 = localObject1;
        if (k == 10) {
          break label321;
        }
        localObject2 = localObject1;
        if (k == 12) {
          break label321;
        }
        if (k == 13)
        {
          localObject2 = localObject1;
          break label321;
        }
      }
      Object localObject3;
      if ((k == 43) && (paramBoolean3))
      {
        if (paramBoolean1) {
          localObject3 = "+";
        } else {
          localObject3 = "%2B";
        }
        parama.G((String)localObject3);
        localObject2 = localObject1;
      }
      else if ((k >= 32) && (k != 127) && ((k < 128) || (!paramBoolean4)) && (paramString2.indexOf(k) == -1) && ((k != 37) || ((paramBoolean1) && ((!paramBoolean2) || (t(paramString1, paramInt1, paramInt2))))))
      {
        parama.I(k);
        localObject2 = localObject1;
      }
      else
      {
        localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = new D6.a();
        }
        if ((paramCharset != null) && (!paramCharset.equals(C6.a.j))) {
          ((D6.a)localObject3).F(paramString1, paramInt1, Character.charCount(k) + paramInt1, paramCharset);
        } else {
          ((D6.a)localObject3).I(k);
        }
        for (;;)
        {
          localObject2 = localObject3;
          if (((D6.a)localObject3).b()) {
            break;
          }
          int m = ((D6.a)localObject3).l();
          parama.D(37);
          localObject1 = j;
          parama.D(localObject1[((m & 0xFF) >> 4 & 0xF)]);
          parama.D(localObject1[(m & 0xF)]);
        }
      }
      label321:
      paramInt1 += Character.charCount(k);
    }
  }
  
  public static int d(String paramString)
  {
    if (paramString.equals("http")) {
      return 80;
    }
    if (paramString.equals("https")) {
      return 443;
    }
    return -1;
  }
  
  public static c k(String paramString)
  {
    return new a().h(null, paramString).a();
  }
  
  public static void l(StringBuilder paramStringBuilder, List paramList)
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
  
  public static c n(String paramString)
  {
    try
    {
      paramString = k(paramString);
      return paramString;
    }
    catch (IllegalArgumentException paramString) {}
    return null;
  }
  
  public static void o(StringBuilder paramStringBuilder, List paramList)
  {
    int k = paramList.size();
    for (int m = 0; m < k; m++)
    {
      paramStringBuilder.append('/');
      paramStringBuilder.append((String)paramList.get(m));
    }
  }
  
  public static String p(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
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
        D6.a locala = new D6.a();
        locala.H(paramString, paramInt1, k);
        s(locala, paramString, k, paramInt2, paramBoolean);
        return locala.u();
      }
    }
    return paramString.substring(paramInt1, paramInt2);
  }
  
  public static String q(String paramString, boolean paramBoolean)
  {
    return p(paramString, 0, paramString.length(), paramBoolean);
  }
  
  public static void s(D6.a parama, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    while (paramInt1 < paramInt2)
    {
      int k = paramString.codePointAt(paramInt1);
      if (k == 37)
      {
        int m = paramInt1 + 2;
        if (m < paramInt2)
        {
          int n = C6.a.e(paramString.charAt(paramInt1 + 1));
          int i1 = C6.a.e(paramString.charAt(m));
          if ((n == -1) || (i1 == -1)) {
            break label105;
          }
          parama.D((n << 4) + i1);
          paramInt1 = m;
          break label112;
        }
      }
      if ((k == 43) && (paramBoolean)) {
        parama.D(32);
      } else {
        label105:
        parama.I(k);
      }
      label112:
      paramInt1 += Character.charCount(k);
    }
  }
  
  public static boolean t(String paramString, int paramInt1, int paramInt2)
  {
    int k = paramInt1 + 2;
    boolean bool;
    if ((k < paramInt2) && (paramString.charAt(paramInt1) == '%'))
    {
      bool = true;
      if ((C6.a.e(paramString.charAt(paramInt1 + 1)) != -1) && (C6.a.e(paramString.charAt(k)) != -1)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public static List u(String paramString)
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
      if ((m != -1) && (m <= n)) {
        localArrayList.add(paramString.substring(k, m));
      }
      for (String str = paramString.substring(m + 1, n);; str = null)
      {
        localArrayList.add(str);
        break;
        localArrayList.add(paramString.substring(k, n));
      }
    }
    return localArrayList;
  }
  
  public String e()
  {
    if (h == null) {
      return null;
    }
    int k = i.indexOf('#');
    return i.substring(k + 1);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof c)) && (i.equals(i))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String f()
  {
    if (c.isEmpty()) {
      return "";
    }
    int k = i.indexOf(':', a.length() + 3);
    int m = i.indexOf('@');
    return i.substring(k + 1, m);
  }
  
  public String g()
  {
    int k = i.indexOf('/', a.length() + 3);
    String str = i;
    int m = C6.a.i(str, k, str.length(), "?#");
    return i.substring(k, m);
  }
  
  public List h()
  {
    int k = i.indexOf('/', a.length() + 3);
    Object localObject = i;
    int m = C6.a.i((String)localObject, k, ((String)localObject).length(), "?#");
    localObject = new ArrayList();
    while (k < m)
    {
      int n = k + 1;
      k = C6.a.h(i, n, m, '/');
      ((List)localObject).add(i.substring(n, k));
    }
    return (List)localObject;
  }
  
  public int hashCode()
  {
    return i.hashCode();
  }
  
  public String i()
  {
    if (g == null) {
      return null;
    }
    int k = i.indexOf('?') + 1;
    String str = i;
    int m = C6.a.h(str, k, str.length(), '#');
    return i.substring(k, m);
  }
  
  public String j()
  {
    if (b.isEmpty()) {
      return "";
    }
    int k = a.length() + 3;
    String str = i;
    int m = C6.a.i(str, k, str.length(), ":@");
    return i.substring(k, m);
  }
  
  public a m()
  {
    a locala = new a();
    a = a;
    b = j();
    c = f();
    d = d;
    int k;
    if (e != d(a)) {
      k = e;
    } else {
      k = -1;
    }
    e = k;
    f.clear();
    f.addAll(h());
    locala.d(i());
    h = e();
    return locala;
  }
  
  public final List r(List paramList, boolean paramBoolean)
  {
    int k = paramList.size();
    ArrayList localArrayList = new ArrayList(k);
    for (int m = 0; m < k; m++)
    {
      String str = (String)paramList.get(m);
      if (str != null) {
        str = q(str, paramBoolean);
      } else {
        str = null;
      }
      localArrayList.add(str);
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public String toString()
  {
    return i;
  }
  
  public static final class a
  {
    public String a;
    public String b = "";
    public String c = "";
    public String d;
    public int e = -1;
    public final List f;
    public List g;
    public String h;
    
    public a()
    {
      ArrayList localArrayList = new ArrayList();
      f = localArrayList;
      localArrayList.add("");
    }
    
    public static String b(String paramString, int paramInt1, int paramInt2)
    {
      return C6.a.a(c.p(paramString, paramInt1, paramInt2, false));
    }
    
    public static int i(String paramString, int paramInt1, int paramInt2)
    {
      try
      {
        paramInt1 = Integer.parseInt(c.a(paramString, paramInt1, paramInt2, "", false, false, false, true, null));
        if ((paramInt1 > 0) && (paramInt1 <= 65535)) {
          return paramInt1;
        }
      }
      catch (NumberFormatException paramString)
      {
        for (;;) {}
      }
      return -1;
    }
    
    public static int l(String paramString, int paramInt1, int paramInt2)
    {
      while (paramInt1 < paramInt2)
      {
        int i = paramString.charAt(paramInt1);
        if (i != 58)
        {
          int j = paramInt1;
          if (i != 91)
          {
            j = paramInt1;
          }
          else
          {
            do
            {
              paramInt1 = j + 1;
              j = paramInt1;
              if (paramInt1 >= paramInt2) {
                break;
              }
              j = paramInt1;
            } while (paramString.charAt(paramInt1) != ']');
            j = paramInt1;
          }
          paramInt1 = j + 1;
        }
        else
        {
          return paramInt1;
        }
      }
      return paramInt2;
    }
    
    public static int p(String paramString, int paramInt1, int paramInt2)
    {
      if (paramInt2 - paramInt1 < 2) {
        return -1;
      }
      int i = paramString.charAt(paramInt1);
      int j;
      if (i >= 97)
      {
        j = paramInt1;
        if (i <= 122) {}
      }
      else
      {
        if (i < 65) {
          break label147;
        }
        j = paramInt1;
        if (i > 90) {
          break label147;
        }
      }
      for (;;)
      {
        paramInt1 = j + 1;
        if (paramInt1 >= paramInt2) {
          break label147;
        }
        i = paramString.charAt(paramInt1);
        if (i >= 97)
        {
          j = paramInt1;
          if (i <= 122) {}
        }
        else if (i >= 65)
        {
          j = paramInt1;
          if (i <= 90) {}
        }
        else if (i >= 48)
        {
          j = paramInt1;
          if (i <= 57) {}
        }
        else
        {
          j = paramInt1;
          if (i != 43)
          {
            j = paramInt1;
            if (i != 45)
            {
              if (i != 46) {
                break;
              }
              j = paramInt1;
            }
          }
        }
      }
      if (i == 58) {
        return paramInt1;
      }
      label147:
      return -1;
    }
    
    public static int q(String paramString, int paramInt1, int paramInt2)
    {
      int i = 0;
      while (paramInt1 < paramInt2)
      {
        int j = paramString.charAt(paramInt1);
        if ((j != 92) && (j != 47)) {
          break;
        }
        i++;
        paramInt1++;
      }
      return i;
    }
    
    public c a()
    {
      if (a != null)
      {
        if (d != null) {
          return new c(this);
        }
        throw new IllegalStateException("host == null");
      }
      throw new IllegalStateException("scheme == null");
    }
    
    public int c()
    {
      int i = e;
      if (i == -1) {
        i = c.d(a);
      }
      return i;
    }
    
    public a d(String paramString)
    {
      if (paramString != null) {
        paramString = c.u(c.b(paramString, " \"'<>#", true, false, true, true));
      } else {
        paramString = null;
      }
      g = paramString;
      return this;
    }
    
    public a e(String paramString)
    {
      if (paramString != null) {
        paramString = c.b(paramString, "", false, false, false, false);
      } else {
        paramString = null;
      }
      h = paramString;
      return this;
    }
    
    public final boolean f(String paramString)
    {
      boolean bool;
      if ((!paramString.equals(".")) && (!paramString.equalsIgnoreCase("%2e"))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final boolean g(String paramString)
    {
      boolean bool;
      if ((!paramString.equals("..")) && (!paramString.equalsIgnoreCase("%2e.")) && (!paramString.equalsIgnoreCase(".%2e")) && (!paramString.equalsIgnoreCase("%2e%2e"))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public a h(c paramc, String paramString)
    {
      int i = C6.a.k(paramString, 0, paramString.length());
      int j = C6.a.l(paramString, i, paramString.length());
      int k = p(paramString, i, j);
      if (k != -1)
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
          paramc = new StringBuilder();
          paramc.append("Expected URL scheme 'http' or 'https' but was '");
          paramc.append(paramString.substring(0, k));
          paramc.append("'");
          throw new IllegalArgumentException(paramc.toString());
        }
      }
      else
      {
        if (paramc == null) {
          break label848;
        }
        a = a;
      }
      int m = q(paramString, i, j);
      if ((m < 2) && (paramc != null) && (a.equals(a)))
      {
        b = paramc.j();
        c = paramc.f();
        d = d;
        e = e;
        f.clear();
        f.addAll(paramc.h());
        if (i != j)
        {
          k = i;
          if (paramString.charAt(i) != '#') {}
        }
        else
        {
          d(paramc.i());
          k = i;
        }
      }
      else
      {
        n = 0;
        k = n;
        m = i + m;
        i = n;
        for (;;)
        {
          n = C6.a.i(paramString, m, j, "@/\\?#");
          if (n != j) {
            i1 = paramString.charAt(n);
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
              int i2 = C6.a.h(paramString, m, n, ':');
              i1 = n;
              String str = c.a(paramString, m, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
              paramc = str;
              if (k != 0)
              {
                paramc = new StringBuilder();
                paramc.append(b);
                paramc.append("%40");
                paramc.append(str);
                paramc = paramc.toString();
              }
              b = paramc;
              if (i2 != i1)
              {
                c = c.a(paramString, i2 + 1, i1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                i = 1;
              }
              k = 1;
            }
            else
            {
              paramc = new StringBuilder();
              paramc.append(c);
              paramc.append("%40");
              paramc.append(c.a(paramString, m, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
              c = paramc.toString();
            }
            m = n + 1;
          }
        }
        k = l(paramString, m, n);
        int i1 = k + 1;
        if (i1 < n)
        {
          d = b(paramString, m, k);
          i = i(paramString, i1, n);
          e = i;
          if (i == -1)
          {
            paramc = new StringBuilder();
            paramc.append("Invalid URL port: \"");
            paramc.append(paramString.substring(i1, n));
            paramc.append('"');
            throw new IllegalArgumentException(paramc.toString());
          }
        }
        else
        {
          d = b(paramString, m, k);
          e = c.d(a);
        }
        if (d == null) {
          break label801;
        }
        k = n;
      }
      int n = C6.a.i(paramString, k, j, "?#");
      o(paramString, k, n);
      i = n;
      if (n < j)
      {
        i = n;
        if (paramString.charAt(n) == '?')
        {
          i = C6.a.h(paramString, n, j, '#');
          g = c.u(c.a(paramString, n + 1, i, " \"'<>#", true, false, true, true, null));
        }
      }
      if ((i < j) && (paramString.charAt(i) == '#')) {
        h = c.a(paramString, 1 + i, j, "", true, false, false, false, null);
      }
      return this;
      label801:
      paramc = new StringBuilder();
      paramc.append("Invalid URL host: \"");
      paramc.append(paramString.substring(m, k));
      paramc.append('"');
      throw new IllegalArgumentException(paramc.toString());
      label848:
      throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
    }
    
    public a j(String paramString)
    {
      if (paramString != null)
      {
        c = c.b(paramString, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return this;
      }
      throw new NullPointerException("password == null");
    }
    
    public final void k()
    {
      List localList = f;
      if ((((String)localList.remove(localList.size() - 1)).isEmpty()) && (!f.isEmpty()))
      {
        localList = f;
        localList.set(localList.size() - 1, "");
      }
      else
      {
        f.add("");
      }
    }
    
    public final void m(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      paramString = c.a(paramString, paramInt1, paramInt2, " \"<>^`{}|/\\?#", paramBoolean2, false, false, true, null);
      if (f(paramString)) {
        return;
      }
      if (g(paramString))
      {
        k();
        return;
      }
      List localList = f;
      if (((String)localList.get(localList.size() - 1)).isEmpty())
      {
        localList = f;
        localList.set(localList.size() - 1, paramString);
      }
      else
      {
        f.add(paramString);
      }
      if (paramBoolean1) {
        f.add("");
      }
    }
    
    public a n(String paramString)
    {
      if (paramString != null) {
        paramString = c.u(c.b(paramString, " \"'<>#", false, false, true, true));
      } else {
        paramString = null;
      }
      g = paramString;
      return this;
    }
    
    public final void o(String paramString, int paramInt1, int paramInt2)
    {
      if (paramInt1 == paramInt2) {
        return;
      }
      int i = paramString.charAt(paramInt1);
      if ((i != 47) && (i != 92))
      {
        List localList = f;
        localList.set(localList.size() - 1, "");
      }
      else
      {
        f.clear();
        f.add("");
        break label135;
      }
      while (paramInt1 < paramInt2)
      {
        i = C6.a.i(paramString, paramInt1, paramInt2, "/\\");
        boolean bool;
        if (i < paramInt2) {
          bool = true;
        } else {
          bool = false;
        }
        m(paramString, paramInt1, i, bool, true);
        paramInt1 = i;
        if (bool)
        {
          paramInt1 = i;
          label135:
          paramInt1++;
        }
      }
    }
    
    public a r(String paramString)
    {
      if (paramString != null)
      {
        b = c.b(paramString, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return this;
      }
      throw new NullPointerException("username == null");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      String str = a;
      if (str != null) {
        localStringBuilder.append(str);
      }
      for (str = "://";; str = "//")
      {
        localStringBuilder.append(str);
        break;
      }
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
      str = d;
      if (str != null) {
        if (str.indexOf(':') != -1)
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
      if ((e != -1) || (a != null))
      {
        int i = c();
        str = a;
        if ((str == null) || (i != c.d(str)))
        {
          localStringBuilder.append(':');
          localStringBuilder.append(i);
        }
      }
      c.o(localStringBuilder, f);
      if (g != null)
      {
        localStringBuilder.append('?');
        c.l(localStringBuilder, g);
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
 * Qualified Name:     B6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */