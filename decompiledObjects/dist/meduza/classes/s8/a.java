package s8;

import g;
import ib.j;
import java.io.Serializable;
import java.net.ProtocolException;

public final class a
  implements c
{
  public final int b;
  public final Serializable c;
  public final Object d;
  
  public a(j paramj, int paramInt, String paramString)
  {
    c = paramj;
    b = paramInt;
    d = paramString;
  }
  
  public a(c[] paramArrayOfc)
  {
    b = 1024;
    c = paramArrayOfc;
    d = new b();
  }
  
  public static a a(String paramString)
  {
    j localj = j.b;
    boolean bool = paramString.startsWith("HTTP/1.");
    int i = 9;
    if (bool)
    {
      if ((paramString.length() >= 9) && (paramString.charAt(8) == ' '))
      {
        j = paramString.charAt(7) - '0';
        if (j != 0) {
          if (j == 1) {
            localj = j.c;
          } else {
            throw new ProtocolException(g.d("Unexpected status line: ", paramString));
          }
        }
      }
      else
      {
        throw new ProtocolException(g.d("Unexpected status line: ", paramString));
      }
    }
    else
    {
      if (!paramString.startsWith("ICY ")) {
        break label228;
      }
      i = 4;
    }
    int k = paramString.length();
    int j = i + 3;
    if (k >= j) {
      try
      {
        k = Integer.parseInt(paramString.substring(i, j));
        if (paramString.length() > j)
        {
          if (paramString.charAt(j) == ' ') {
            paramString = paramString.substring(i + 4);
          } else {
            throw new ProtocolException(g.d("Unexpected status line: ", paramString));
          }
        }
        else {
          paramString = "";
        }
        return new a(localj, k, paramString);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ProtocolException(g.d("Unexpected status line: ", paramString));
      }
    }
    throw new ProtocolException(g.d("Unexpected status line: ", paramString));
    label228:
    throw new ProtocolException(g.d("Unexpected status line: ", paramString));
  }
  
  public final StackTraceElement[] b(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if (paramArrayOfStackTraceElement.length <= b) {
      return paramArrayOfStackTraceElement;
    }
    c[] arrayOfc = (c[])c;
    int i = arrayOfc.length;
    int j = 0;
    StackTraceElement[] arrayOfStackTraceElement = paramArrayOfStackTraceElement;
    while (j < i)
    {
      c localc = arrayOfc[j];
      if (arrayOfStackTraceElement.length <= b) {
        break;
      }
      arrayOfStackTraceElement = localc.b(paramArrayOfStackTraceElement);
      j++;
    }
    paramArrayOfStackTraceElement = arrayOfStackTraceElement;
    if (arrayOfStackTraceElement.length > b) {
      paramArrayOfStackTraceElement = ((b)d).b(arrayOfStackTraceElement);
    }
    return paramArrayOfStackTraceElement;
  }
  
  public final String toString()
  {
    switch (a)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    if ((j)c == j.b) {
      str = "HTTP/1.0";
    } else {
      str = "HTTP/1.1";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(' ');
    localStringBuilder.append(b);
    if ((String)d != null)
    {
      localStringBuilder.append(' ');
      localStringBuilder.append((String)d);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     s8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */