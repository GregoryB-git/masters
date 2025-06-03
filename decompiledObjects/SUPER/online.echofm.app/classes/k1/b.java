package k1;

import android.text.TextUtils;
import g0.M;
import g0.a;
import g0.e;
import g0.o;
import g0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
  public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
  public final z a = new z();
  public final StringBuilder b = new StringBuilder();
  
  public static boolean b(z paramz)
  {
    int i = paramz.f();
    int j = paramz.g();
    byte[] arrayOfByte = paramz.e();
    if ((i + 2 <= j) && (arrayOfByte[i] == 47))
    {
      int k = i + 2;
      if (arrayOfByte[(i + 1)] == 42)
      {
        for (;;)
        {
          i = k + 1;
          if (i >= j) {
            break;
          }
          if (((char)arrayOfByte[k] == '*') && ((char)arrayOfByte[i] == '/'))
          {
            k += 2;
            j = k;
          }
          else
          {
            k = i;
          }
        }
        paramz.U(j - paramz.f());
        return true;
      }
    }
    return false;
  }
  
  public static boolean c(z paramz)
  {
    int i = k(paramz, paramz.f());
    if ((i != 9) && (i != 10) && (i != 12) && (i != 13) && (i != 32)) {
      return false;
    }
    paramz.U(1);
    return true;
  }
  
  public static void e(String paramString, c paramc)
  {
    Matcher localMatcher = d.matcher(W2.c.e(paramString));
    if (!localMatcher.matches())
    {
      paramc = new StringBuilder();
      paramc.append("Invalid font-size: '");
      paramc.append(paramString);
      paramc.append("'.");
      o.h("WebvttCssParser", paramc.toString());
      return;
    }
    int i = 2;
    paramString = (String)a.e(localMatcher.group(2));
    paramString.hashCode();
    int j = paramString.hashCode();
    int k = -1;
    switch (j)
    {
    default: 
      break;
    case 3592: 
      if (paramString.equals("px")) {
        k = 2;
      }
      break;
    case 3240: 
      if (paramString.equals("em")) {
        k = 1;
      }
      break;
    case 37: 
      if (paramString.equals("%")) {
        k = 0;
      }
      break;
    }
    switch (k)
    {
    default: 
      throw new IllegalStateException();
    case 2: 
      paramc.t(1);
      break;
    case 1: 
    case 0: 
      for (;;)
      {
        paramc.t(i);
        break;
        i = 3;
      }
    }
    paramc.s(Float.parseFloat((String)a.e(localMatcher.group(1))));
  }
  
  public static String f(z paramz, StringBuilder paramStringBuilder)
  {
    int i = 0;
    paramStringBuilder.setLength(0);
    int j = paramz.f();
    int k = paramz.g();
    while ((j < k) && (i == 0))
    {
      char c1 = (char)paramz.e()[j];
      if (((c1 < 'A') || (c1 > 'Z')) && ((c1 < 'a') || (c1 > 'z')) && ((c1 < '0') || (c1 > '9')) && (c1 != '#') && (c1 != '-') && (c1 != '.') && (c1 != '_'))
      {
        i = 1;
      }
      else
      {
        j++;
        paramStringBuilder.append(c1);
      }
    }
    paramz.U(j - paramz.f());
    return paramStringBuilder.toString();
  }
  
  public static String g(z paramz, StringBuilder paramStringBuilder)
  {
    n(paramz);
    if (paramz.a() == 0) {
      return null;
    }
    paramStringBuilder = f(paramz, paramStringBuilder);
    if (!"".equals(paramStringBuilder)) {
      return paramStringBuilder;
    }
    paramStringBuilder = new StringBuilder();
    paramStringBuilder.append("");
    paramStringBuilder.append((char)paramz.G());
    return paramStringBuilder.toString();
  }
  
  public static String h(z paramz, StringBuilder paramStringBuilder)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i == 0)
    {
      int j = paramz.f();
      String str = g(paramz, paramStringBuilder);
      if (str == null) {
        return null;
      }
      if ((!"}".equals(str)) && (!";".equals(str)))
      {
        localStringBuilder.append(str);
      }
      else
      {
        paramz.T(j);
        i = 1;
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String i(z paramz, StringBuilder paramStringBuilder)
  {
    n(paramz);
    if (paramz.a() < 5) {
      return null;
    }
    if (!"::cue".equals(paramz.D(5))) {
      return null;
    }
    int i = paramz.f();
    String str = g(paramz, paramStringBuilder);
    if (str == null) {
      return null;
    }
    if ("{".equals(str))
    {
      paramz.T(i);
      return "";
    }
    if ("(".equals(str)) {
      str = l(paramz);
    } else {
      str = null;
    }
    if (!")".equals(g(paramz, paramStringBuilder))) {
      return null;
    }
    return str;
  }
  
  public static void j(z paramz, c paramc, StringBuilder paramStringBuilder)
  {
    n(paramz);
    String str1 = f(paramz, paramStringBuilder);
    if ("".equals(str1)) {
      return;
    }
    if (!":".equals(g(paramz, paramStringBuilder))) {
      return;
    }
    n(paramz);
    String str2 = h(paramz, paramStringBuilder);
    if ((str2 != null) && (!"".equals(str2)))
    {
      int i = paramz.f();
      paramStringBuilder = g(paramz, paramStringBuilder);
      if (!";".equals(paramStringBuilder))
      {
        if ("}".equals(paramStringBuilder)) {
          paramz.T(i);
        }
      }
      else if ("color".equals(str1))
      {
        paramc.q(e.b(str2));
      }
      else if ("background-color".equals(str1))
      {
        paramc.n(e.b(str2));
      }
      else
      {
        boolean bool1 = "ruby-position".equals(str1);
        boolean bool2 = true;
        if (bool1)
        {
          if ("over".equals(str2)) {
            paramc.v(1);
          } else if ("under".equals(str2)) {
            paramc.v(2);
          }
        }
        else if ("text-combine-upright".equals(str1))
        {
          bool1 = bool2;
          if (!"all".equals(str2)) {
            if (str2.startsWith("digits")) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
          }
          paramc.p(bool1);
        }
        else if ("text-decoration".equals(str1))
        {
          if ("underline".equals(str2)) {
            paramc.A(true);
          }
        }
        else if ("font-family".equals(str1))
        {
          paramc.r(str2);
        }
        else if ("font-weight".equals(str1))
        {
          if ("bold".equals(str2)) {
            paramc.o(true);
          }
        }
        else if ("font-style".equals(str1))
        {
          if ("italic".equals(str2)) {
            paramc.u(true);
          }
        }
        else if ("font-size".equals(str1))
        {
          e(str2, paramc);
        }
      }
    }
  }
  
  public static char k(z paramz, int paramInt)
  {
    return (char)paramz.e()[paramInt];
  }
  
  public static String l(z paramz)
  {
    int i = paramz.f();
    int j = paramz.g();
    int k = 0;
    while ((i < j) && (k == 0))
    {
      if ((char)paramz.e()[i] == ')') {
        k = 1;
      } else {
        k = 0;
      }
      i++;
    }
    return paramz.D(i - 1 - paramz.f()).trim();
  }
  
  public static void m(z paramz)
  {
    while (!TextUtils.isEmpty(paramz.r())) {}
  }
  
  public static void n(z paramz)
  {
    for (int i = 1;; i = 0)
    {
      if ((paramz.a() <= 0) || (i == 0)) {
        return;
      }
      if ((c(paramz)) || (b(paramz))) {
        break;
      }
    }
  }
  
  public final void a(c paramc, String paramString)
  {
    if ("".equals(paramString)) {
      return;
    }
    int i = paramString.indexOf('[');
    Object localObject = paramString;
    if (i != -1)
    {
      localObject = c.matcher(paramString.substring(i));
      if (((Matcher)localObject).matches()) {
        paramc.z((String)a.e(((Matcher)localObject).group(1)));
      }
      localObject = paramString.substring(0, i);
    }
    localObject = M.b1((String)localObject, "\\.");
    paramString = localObject[0];
    i = paramString.indexOf('#');
    if (i != -1)
    {
      paramc.y(paramString.substring(0, i));
      paramc.x(paramString.substring(i + 1));
    }
    else
    {
      paramc.y(paramString);
    }
    if (localObject.length > 1) {
      paramc.w((String[])M.P0((Object[])localObject, 1, localObject.length));
    }
  }
  
  public List d(z paramz)
  {
    b.setLength(0);
    int i = paramz.f();
    m(paramz);
    a.R(paramz.e(), paramz.f());
    a.T(i);
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      paramz = i(a, b);
      if (paramz == null) {
        break;
      }
      if (!"{".equals(g(a, b))) {
        return localArrayList;
      }
      c localc = new c();
      a(localc, paramz);
      paramz = null;
      i = 0;
      while (i == 0)
      {
        int j = a.f();
        paramz = g(a, b);
        if ((paramz != null) && (!"}".equals(paramz))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i == 0)
        {
          a.T(j);
          j(a, localc, b);
        }
      }
      if ("}".equals(paramz)) {
        localArrayList.add(localc);
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     k1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */