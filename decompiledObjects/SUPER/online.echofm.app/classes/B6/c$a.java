package B6;

import C6.a;
import java.util.ArrayList;
import java.util.List;

public final class c$a
{
  public String a;
  public String b = "";
  public String c = "";
  public String d;
  public int e = -1;
  public final List f;
  public List g;
  public String h;
  
  public c$a()
  {
    ArrayList localArrayList = new ArrayList();
    f = localArrayList;
    localArrayList.add("");
  }
  
  public static String b(String paramString, int paramInt1, int paramInt2)
  {
    return a.a(c.p(paramString, paramInt1, paramInt2, false));
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
    int i = a.k(paramString, 0, paramString.length());
    int j = a.l(paramString, i, paramString.length());
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
        n = a.i(paramString, m, j, "@/\\?#");
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
            int i2 = a.h(paramString, m, n, ':');
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
    int n = a.i(paramString, k, j, "?#");
    o(paramString, k, n);
    i = n;
    if (n < j)
    {
      i = n;
      if (paramString.charAt(n) == '?')
      {
        i = a.h(paramString, n, j, '#');
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
      i = a.i(paramString, paramInt1, paramInt2, "/\\");
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

/* Location:
 * Qualified Name:     B6.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */