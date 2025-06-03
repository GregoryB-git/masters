package I4;

import F4.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

public abstract class j
{
  public static final Pattern a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");
  
  public static Long a(HttpMessage paramHttpMessage)
  {
    try
    {
      paramHttpMessage = paramHttpMessage.getFirstHeader("content-length");
      if (paramHttpMessage != null)
      {
        long l = Long.parseLong(paramHttpMessage.getValue());
        return Long.valueOf(l);
      }
    }
    catch (NumberFormatException paramHttpMessage)
    {
      a.e().a("The content-length value is not a valid number");
    }
    return null;
  }
  
  public static String b(HttpResponse paramHttpResponse)
  {
    paramHttpResponse = paramHttpResponse.getFirstHeader("content-type");
    if (paramHttpResponse != null)
    {
      paramHttpResponse = paramHttpResponse.getValue();
      if (paramHttpResponse != null) {
        return paramHttpResponse;
      }
    }
    return null;
  }
  
  public static boolean c(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (a.matcher(paramString).matches())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void d(G4.j paramj)
  {
    if (!paramj.l()) {
      paramj.u();
    }
    paramj.g();
  }
}

/* Location:
 * Qualified Name:     I4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */