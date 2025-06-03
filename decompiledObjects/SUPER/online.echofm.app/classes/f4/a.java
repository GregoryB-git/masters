package f4;

import java.io.IOException;
import java.util.Map;

public class a
{
  public final String a;
  public final Map b;
  
  public a(String paramString, Map paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public static a c(String paramString)
  {
    if (!paramString.startsWith("gauth|")) {
      return null;
    }
    paramString = paramString.substring(6);
    try
    {
      paramString = b.a(paramString);
      paramString = new a((String)paramString.get("token"), (Map)paramString.get("auth"));
      return paramString;
    }
    catch (IOException paramString)
    {
      throw new RuntimeException("Failed to parse gauth token", paramString);
    }
  }
  
  public Map a()
  {
    return b;
  }
  
  public String b()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     f4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */