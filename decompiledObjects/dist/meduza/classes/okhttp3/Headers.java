package okhttp3;

import g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import okhttp3.internal.Util;

public final class Headers
{
  public final String[] a;
  
  public Headers(Builder paramBuilder)
  {
    paramBuilder = a;
    a = ((String[])paramBuilder.toArray(new String[paramBuilder.size()]));
  }
  
  public static void a(String paramString)
  {
    if (paramString != null)
    {
      if (!paramString.isEmpty())
      {
        int i = paramString.length();
        int j = 0;
        while (j < i)
        {
          int k = paramString.charAt(j);
          if ((k > 32) && (k < 127)) {
            j++;
          } else {
            throw new IllegalArgumentException(Util.l("Unexpected char %#04x at %d in header name: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(j), paramString }));
          }
        }
        return;
      }
      throw new IllegalArgumentException("name is empty");
    }
    throw new NullPointerException("name == null");
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      int i = paramString1.length();
      int j = 0;
      while (j < i)
      {
        int k = paramString1.charAt(j);
        if (((k > 31) || (k == 9)) && (k < 127)) {
          j++;
        } else {
          throw new IllegalArgumentException(Util.l("Unexpected char %#04x at %d in %s value: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(j), paramString2, paramString1 }));
        }
      }
      return;
    }
    throw new NullPointerException(g.e("value for name ", paramString2, " == null"));
  }
  
  public final String c(String paramString)
  {
    String[] arrayOfString = a;
    int i = arrayOfString.length;
    int j;
    do
    {
      j = i - 2;
      if (j < 0) {
        break;
      }
      i = j;
    } while (!paramString.equalsIgnoreCase(arrayOfString[j]));
    return arrayOfString[(j + 1)];
    paramString = null;
    return paramString;
  }
  
  public final String d(int paramInt)
  {
    return a[(paramInt * 2)];
  }
  
  public final Builder e()
  {
    Builder localBuilder = new Builder();
    Collections.addAll(a, a);
    return localBuilder;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Headers)) && (Arrays.equals(a, a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final String f(int paramInt)
  {
    return a[(paramInt * 2 + 1)];
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(a);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = a.length / 2;
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append(d(j));
      localStringBuilder.append(": ");
      localStringBuilder.append(f(j));
      localStringBuilder.append("\n");
    }
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    public final ArrayList a = new ArrayList(20);
    
    public final void a(String paramString)
    {
      int i = paramString.indexOf(":", 1);
      if (i != -1)
      {
        b(paramString.substring(0, i), paramString.substring(i + 1));
        return;
      }
      if (paramString.startsWith(":"))
      {
        b("", paramString.substring(1));
        return;
      }
      b("", paramString);
    }
    
    public final void b(String paramString1, String paramString2)
    {
      a.add(paramString1);
      a.add(paramString2.trim());
    }
    
    public final void c(String paramString)
    {
      int j;
      for (int i = 0; i < a.size(); i = j + 2)
      {
        j = i;
        if (paramString.equalsIgnoreCase((String)a.get(i)))
        {
          a.remove(i);
          a.remove(i);
          j = i - 2;
        }
      }
    }
    
    public final void d(String paramString1, String paramString2)
    {
      Headers.a(paramString1);
      Headers.b(paramString2, paramString1);
      c(paramString1);
      b(paramString1, paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.Headers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */