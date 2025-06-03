package okhttp3;

import java.util.ArrayList;

public final class Headers$Builder
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

/* Location:
 * Qualified Name:     okhttp3.Headers.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */