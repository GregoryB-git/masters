package L5;

import Q3.c;
import Q3.d;
import java.util.HashMap;
import java.util.Map;

public class y
  extends Exception
{
  public final String o;
  public final String p;
  public final Map q;
  
  public y(String paramString1, String paramString2, Map paramMap)
  {
    o = paramString1;
    p = paramString2;
    if (paramMap != null) {}
    for (;;)
    {
      q = paramMap;
      break;
      paramMap = new HashMap();
    }
    q.put("code", paramString1);
    q.put("message", paramString2);
  }
  
  public static y a(c paramc)
  {
    int i = paramc.f();
    String str1;
    String str2;
    if (i != -25)
    {
      if (i != -24)
      {
        if (i != -4)
        {
          if (i != -3)
          {
            if (i != -2)
            {
              if (i != -1)
              {
                switch (i)
                {
                default: 
                  str1 = "An unknown error occurred";
                  str2 = "unknown";
                  break;
                case -6: 
                  str2 = "expired-token";
                  str1 = "The supplied auth token has expired.";
                  break;
                case -7: 
                  str2 = "invalid-token";
                  str1 = "The supplied auth token was invalid.";
                  break;
                case -8: 
                  str2 = "max-retries";
                  str1 = "The transaction had too many retries.";
                  break;
                case -9: 
                  str2 = "overridden-by-set";
                  str1 = "The transaction was overridden by a subsequent set.";
                  break;
                case -10: 
                  str2 = "unavailable";
                  str1 = "The service is unavailable.";
                  break;
                }
              }
              else
              {
                str2 = "data-stale";
                str1 = "The transaction needs to be run again with current data.";
              }
            }
            else
            {
              str2 = "failure";
              str1 = "The server indicated that this operation failed.";
            }
          }
          else
          {
            str2 = "permission-denied";
            str1 = "Client doesn't have permission to access the desired data.";
          }
        }
        else
        {
          str2 = "disconnected";
          str1 = "The operation had to be aborted due to a network disconnect.";
        }
      }
      else
      {
        str2 = "network-error";
        str1 = "The operation could not be performed due to a network error.";
      }
    }
    else
    {
      str2 = "write-cancelled";
      str1 = "The write was canceled by the user.";
    }
    if (str2.equals("unknown")) {
      return g(paramc.h());
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("details", paramc.g());
    return new y(str2, str1, localHashMap);
  }
  
  public static y b(d paramd)
  {
    return a(c.b(paramd));
  }
  
  public static y c(Exception paramException)
  {
    if (paramException == null) {
      return f();
    }
    return g(paramException.getMessage());
  }
  
  public static y f()
  {
    return g(null);
  }
  
  public static y g(String paramString)
  {
    HashMap localHashMap = new HashMap();
    String str = paramString;
    if (paramString == null) {
      str = "An unknown error occurred";
    }
    if (str.contains("Index not defined, add \".indexOn\""))
    {
      str = str.replaceFirst("java.lang.Exception: ", "");
      paramString = "index-not-defined";
    }
    else if (str.contains("Permission denied"))
    {
      paramString = "permission-denied";
      str = "Client doesn't have permission to access the desired data.";
    }
    else
    {
      paramString = "unknown";
    }
    return new y(paramString, str, localHashMap);
  }
  
  public Map d()
  {
    return q;
  }
  
  public String e()
  {
    return o;
  }
  
  public String getMessage()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     L5.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */