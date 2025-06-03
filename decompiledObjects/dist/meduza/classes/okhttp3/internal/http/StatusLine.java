package okhttp3.internal.http;

import g;
import java.net.ProtocolException;
import okhttp3.Protocol;

public final class StatusLine
{
  public final Protocol a;
  public final int b;
  public final String c;
  
  public StatusLine(Protocol paramProtocol, int paramInt, String paramString)
  {
    a = paramProtocol;
    b = paramInt;
    c = paramString;
  }
  
  public static StatusLine a(String paramString)
  {
    Protocol localProtocol = Protocol.b;
    boolean bool = paramString.startsWith("HTTP/1.");
    int i = 9;
    if (bool)
    {
      if ((paramString.length() >= 9) && (paramString.charAt(8) == ' '))
      {
        j = paramString.charAt(7) - '0';
        if (j != 0) {
          if (j == 1) {
            localProtocol = Protocol.c;
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
        return new StatusLine(localProtocol, k, paramString);
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    if (a == Protocol.b) {
      str = "HTTP/1.0";
    } else {
      str = "HTTP/1.1";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(' ');
    localStringBuilder.append(b);
    if (c != null)
    {
      localStringBuilder.append(' ');
      localStringBuilder.append(c);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.StatusLine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */