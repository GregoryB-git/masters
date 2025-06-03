package okhttp3.internal.http;

import okhttp3.HttpUrl;

public final class RequestLine
{
  public static String a(HttpUrl paramHttpUrl)
  {
    String str1 = paramHttpUrl.e();
    String str2 = paramHttpUrl.g();
    paramHttpUrl = str1;
    if (str2 != null)
    {
      paramHttpUrl = new StringBuilder();
      paramHttpUrl.append(str1);
      paramHttpUrl.append('?');
      paramHttpUrl.append(str2);
      paramHttpUrl = paramHttpUrl.toString();
    }
    return paramHttpUrl;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http.RequestLine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */