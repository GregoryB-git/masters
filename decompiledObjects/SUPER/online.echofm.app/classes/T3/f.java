package T3;

import java.net.URI;

public class f
{
  public final String a;
  public final String b;
  public final boolean c;
  
  public f(String paramString1, String paramString2, boolean paramBoolean)
  {
    a = paramString1;
    b = paramString2;
    c = paramBoolean;
  }
  
  public static URI a(String paramString1, boolean paramBoolean, String paramString2, String paramString3)
  {
    String str;
    if (paramBoolean) {
      str = "wss";
    } else {
      str = "ws";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append("://");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("/.ws?ns=");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("&");
    localStringBuilder.append("v");
    localStringBuilder.append("=");
    localStringBuilder.append("5");
    paramString2 = localStringBuilder.toString();
    paramString1 = paramString2;
    if (paramString3 != null)
    {
      paramString1 = new StringBuilder();
      paramString1.append(paramString2);
      paramString1.append("&ls=");
      paramString1.append(paramString3);
      paramString1 = paramString1.toString();
    }
    return URI.create(paramString1);
  }
  
  public String b()
  {
    return a;
  }
  
  public String c()
  {
    return b;
  }
  
  public boolean d()
  {
    return c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("http");
    String str;
    if (c) {
      str = "s";
    } else {
      str = "";
    }
    localStringBuilder.append(str);
    localStringBuilder.append("://");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     T3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */