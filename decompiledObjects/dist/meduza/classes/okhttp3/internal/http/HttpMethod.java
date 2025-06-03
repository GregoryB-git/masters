package okhttp3.internal.http;

public final class HttpMethod
{
  public static boolean a(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("POST")) && (!paramString.equals("PATCH")) && (!paramString.equals("PUT")) && (!paramString.equals("DELETE")) && (!paramString.equals("MOVE"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean b(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("GET")) && (!paramString.equals("HEAD"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.HttpMethod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */