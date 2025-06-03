package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class u
  implements s, Iterable
{
  public final String o;
  
  public u(String paramString)
  {
    if (paramString != null)
    {
      o = paramString;
      return;
    }
    throw new IllegalArgumentException("StringValue cannot be null.");
  }
  
  public final s c()
  {
    return new u(o);
  }
  
  public final Boolean d()
  {
    return Boolean.valueOf(o.isEmpty() ^ true);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof u)) {
      return false;
    }
    paramObject = (u)paramObject;
    return o.equals(o);
  }
  
  public final Double f()
  {
    double d;
    if (o.isEmpty()) {
      d = 0.0D;
    }
    for (;;)
    {
      return Double.valueOf(d);
      try
      {
        Double localDouble = Double.valueOf(o);
        return localDouble;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        d = NaN.0D;
      }
    }
  }
  
  public final String g()
  {
    return o;
  }
  
  public final int hashCode()
  {
    return o.hashCode();
  }
  
  public final Iterator iterator()
  {
    return new w(this);
  }
  
  public final Iterator k()
  {
    return new x(this);
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    if ((!"charAt".equals(paramString)) && (!"concat".equals(paramString)) && (!"hasOwnProperty".equals(paramString)) && (!"indexOf".equals(paramString)) && (!"lastIndexOf".equals(paramString)) && (!"match".equals(paramString)) && (!"replace".equals(paramString)) && (!"search".equals(paramString)) && (!"slice".equals(paramString)) && (!"split".equals(paramString)) && (!"substring".equals(paramString)) && (!"toLowerCase".equals(paramString)) && (!"toLocaleLowerCase".equals(paramString)) && (!"toString".equals(paramString)) && (!"toUpperCase".equals(paramString))) {
      if (!"toLocaleUpperCase".equals(paramString))
      {
        if ("trim".equals(paramString)) {
          break label183;
        }
        throw new IllegalArgumentException(String.format("%s is not a String function", new Object[] { paramString }));
      }
    }
    for (;;)
    {
      break;
    }
    label183:
    paramString.hashCode();
    switch (paramString.hashCode())
    {
    default: 
    case 1943291465: 
      do
      {
        i = -1;
        break;
      } while (!paramString.equals("indexOf"));
      i = 16;
    case 1094496948: 
    case 530542161: 
    case 109648666: 
    case 109526418: 
    case 103668165: 
    case 3568674: 
    case -399551817: 
    case -467511597: 
    case -726908483: 
    case -906336856: 
    case -1137582698: 
    case -1354795244: 
      for (;;)
      {
        break label343;
        if (!paramString.equals("replace")) {
          break;
        }
        i = 15;
        continue;
        if (!paramString.equals("substring")) {
          break;
        }
        i = 14;
        continue;
        if (!paramString.equals("split")) {
          break;
        }
        i = 13;
        continue;
        if (!paramString.equals("slice")) {
          break;
        }
        i = 12;
        continue;
        if (!paramString.equals("match")) {
          break;
        }
        i = 11;
        continue;
        if (!paramString.equals("trim")) {
          break;
        }
        i = 10;
        continue;
        if (!paramString.equals("toUpperCase")) {
          break;
        }
        i = 9;
        continue;
        if (!paramString.equals("lastIndexOf")) {
          break;
        }
        i = 8;
        continue;
        if (!paramString.equals("toLocaleUpperCase")) {
          break;
        }
        i = 7;
        continue;
        if (!paramString.equals("search")) {
          break;
        }
        i = 6;
        continue;
        if (!paramString.equals("toLowerCase")) {
          break;
        }
        i = 5;
        continue;
        if (!paramString.equals("concat")) {
          break;
        }
        i = 4;
      }
    case -1361633751: 
      label343:
      if (paramString.equals("charAt")) {
        break;
      }
    }
    do
    {
      do
      {
        do
        {
          i = -1;
          break;
          i = 3;
          break;
        } while (!paramString.equals("toLocaleLowerCase"));
        i = 2;
        break;
      } while (!paramString.equals("toString"));
      i = 1;
      break;
    } while (!paramString.equals("hasOwnProperty"));
    int i = 0;
    double d = 0.0D;
    Object localObject;
    String str;
    int j;
    switch (i)
    {
    default: 
      throw new IllegalArgumentException("Command not supported");
    case 16: 
      C2.n("indexOf", 2, paramList);
      localObject = o;
      if (paramList.size() <= 0) {
        paramString = s.d.g();
      } else {
        paramString = paramf3.b((s)paramList.get(0)).g();
      }
      if (paramList.size() >= 2) {
        d = paramf3.b((s)paramList.get(1)).f().doubleValue();
      }
      return new k(Double.valueOf(((String)localObject).indexOf(paramString, (int)C2.a(d))));
    case 15: 
      C2.n("replace", 2, paramList);
      s locals = s.d;
      localObject = locals.g();
      paramString = locals;
      if (!paramList.isEmpty())
      {
        str = paramf3.b((s)paramList.get(0)).g();
        paramString = locals;
        localObject = str;
        if (paramList.size() > 1)
        {
          paramString = paramf3.b((s)paramList.get(1));
          localObject = str;
        }
      }
      paramList = o;
      i = paramList.indexOf((String)localObject);
      if (i < 0) {
        return this;
      }
      if ((paramString instanceof n)) {
        paramString = ((n)paramString).b(paramf3, Arrays.asList(new s[] { new u((String)localObject), new k(Double.valueOf(i)), this }));
      }
      paramf3 = paramList.substring(0, i);
      paramString = paramString.g();
      paramList = paramList.substring(i + ((String)localObject).length());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramf3);
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(paramList);
      return new u(((StringBuilder)localObject).toString());
    case 14: 
      C2.n("substring", 2, paramList);
      paramString = o;
      if (!paramList.isEmpty()) {
        i = (int)C2.a(paramf3.b((s)paramList.get(0)).f().doubleValue());
      } else {
        i = 0;
      }
      if (paramList.size() > 1) {}
      for (j = (int)C2.a(paramf3.b((s)paramList.get(1)).f().doubleValue());; j = paramString.length()) {
        break;
      }
      i = Math.min(Math.max(i, 0), paramString.length());
      j = Math.min(Math.max(j, 0), paramString.length());
      return new u(paramString.substring(Math.min(i, j), Math.max(i, j)));
    case 13: 
      C2.n("split", 2, paramList);
      str = o;
      if (str.length() == 0) {
        return new g(new s[] { this });
      }
      paramString = new ArrayList();
      if (paramList.isEmpty())
      {
        paramString.add(this);
      }
      else
      {
        localObject = paramf3.b((s)paramList.get(0)).g();
        long l;
        if (paramList.size() > 1) {
          l = C2.m(paramf3.b((s)paramList.get(1)).f().doubleValue());
        } else {
          l = 2147483647L;
        }
        if (l == 0L) {
          return new g();
        }
        paramf3 = str.split(Pattern.quote((String)localObject), (int)l + 1);
        j = paramf3.length;
        if ((((String)localObject).isEmpty()) && (paramf3.length > 0))
        {
          k = paramf3[0].isEmpty();
          i = k;
          if (paramf3[(paramf3.length - 1)].isEmpty())
          {
            j = paramf3.length - 1;
            i = k;
          }
        }
        else
        {
          i = 0;
        }
        int k = j;
        int n = i;
        int m;
        if (paramf3.length > l) {
          m = j - 1;
        }
        for (n = i; n < m; n++) {
          paramString.add(new u(paramf3[n]));
        }
      }
      return new g(paramString);
    case 12: 
      C2.n("slice", 2, paramList);
      paramString = o;
      if (!paramList.isEmpty()) {
        d = paramf3.b((s)paramList.get(0)).f().doubleValue();
      } else {
        d = 0.0D;
      }
      d = C2.a(d);
      if (d < 0.0D) {
        d = Math.max(paramString.length() + d, 0.0D);
      } else {
        d = Math.min(d, paramString.length());
      }
      i = (int)d;
      if (paramList.size() > 1) {
        d = paramf3.b((s)paramList.get(1)).f().doubleValue();
      } else {
        d = paramString.length();
      }
      d = C2.a(d);
      if (d < 0.0D) {
        d = Math.max(paramString.length() + d, 0.0D);
      } else {
        d = Math.min(d, paramString.length());
      }
      return new u(paramString.substring(i, Math.max(0, (int)d - i) + i));
    case 11: 
      C2.n("match", 1, paramList);
      localObject = o;
      if (paramList.size() <= 0) {
        paramString = "";
      } else {
        paramString = paramf3.b((s)paramList.get(0)).g();
      }
      paramString = Pattern.compile(paramString).matcher((CharSequence)localObject);
      if (paramString.find()) {
        return new g(new s[] { new u(paramString.group()) });
      }
      return s.e;
    case 10: 
      C2.g("toUpperCase", 0, paramList);
      return new u(o.trim());
    case 9: 
      C2.g("toUpperCase", 0, paramList);
      return new u(o.toUpperCase(Locale.ENGLISH));
    case 8: 
      C2.n("lastIndexOf", 2, paramList);
      localObject = o;
      if (paramList.size() <= 0) {}
      for (paramString = s.d;; paramString = paramf3.b((s)paramList.get(0)))
      {
        paramString = paramString.g();
        break;
      }
      if (paramList.size() < 2) {
        d = NaN.0D;
      } else {
        d = paramf3.b((s)paramList.get(1)).f().doubleValue();
      }
      if (Double.isNaN(d)) {
        d = Double.POSITIVE_INFINITY;
      } else {
        d = C2.a(d);
      }
      return new k(Double.valueOf(((String)localObject).lastIndexOf(paramString, (int)d)));
    case 7: 
      C2.g("toLocaleUpperCase", 0, paramList);
      return new u(o.toUpperCase());
    case 6: 
      C2.n("search", 1, paramList);
      if (!paramList.isEmpty()) {}
      for (paramString = paramf3.b((s)paramList.get(0));; paramString = s.d)
      {
        paramString = paramString.g();
        break;
      }
      paramf3 = o;
      paramString = Pattern.compile(paramString).matcher(paramf3);
      if (paramString.find()) {
        return new k(Double.valueOf(paramString.start()));
      }
      return new k(Double.valueOf(-1.0D));
    case 5: 
      C2.g("toLowerCase", 0, paramList);
      return new u(o.toLowerCase(Locale.ENGLISH));
    case 4: 
      if (paramList.isEmpty()) {
        return this;
      }
      paramString = new StringBuilder(o);
      for (i = 0; i < paramList.size(); i++) {
        paramString.append(paramf3.b((s)paramList.get(i)).g());
      }
      return new u(paramString.toString());
    case 3: 
      C2.n("charAt", 1, paramList);
      if (!paramList.isEmpty()) {
        i = (int)C2.a(paramf3.b((s)paramList.get(0)).f().doubleValue());
      } else {
        i = 0;
      }
      paramString = o;
      if ((i >= 0) && (i < paramString.length())) {
        return new u(String.valueOf(paramString.charAt(i)));
      }
      return s.k;
    case 2: 
      C2.g("toLocaleLowerCase", 0, paramList);
      return new u(o.toLowerCase());
    case 1: 
      C2.g("toString", 0, paramList);
      return this;
    }
    C2.g("hasOwnProperty", 1, paramList);
    paramString = o;
    paramf3 = paramf3.b((s)paramList.get(0));
    if ("length".equals(paramf3.g())) {
      return s.i;
    }
    d = paramf3.f().doubleValue();
    if (d == Math.floor(d))
    {
      i = (int)d;
      if ((i >= 0) && (i < paramString.length())) {
        return s.i;
      }
    }
    return s.j;
  }
  
  public final String toString()
  {
    String str = o;
    StringBuilder localStringBuilder = new StringBuilder("\"");
    localStringBuilder.append(str);
    localStringBuilder.append("\"");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */