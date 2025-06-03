package l8;

import a9.d;
import a9.e;
import org.json.JSONObject;

public abstract class k
{
  public static final d a;
  
  static
  {
    e locale = new e();
    a locala = a.a;
    locale.a(k.class, locala);
    locale.a(b.class, locala);
    a = new d(locale);
  }
  
  public static b a(String paramString)
  {
    paramString = new JSONObject(paramString);
    String str1 = paramString.getString("rolloutId");
    String str2 = paramString.getString("parameterKey");
    String str3 = paramString.getString("parameterValue");
    String str4 = paramString.getString("variantId");
    long l = paramString.getLong("templateVersion");
    paramString = str3;
    if (str3.length() > 256) {
      paramString = str3.substring(0, 256);
    }
    return new b(str1, str2, paramString, str4, l);
  }
  
  public abstract String b();
  
  public abstract String c();
  
  public abstract String d();
  
  public abstract long e();
  
  public abstract String f();
}

/* Location:
 * Qualified Name:     l8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */