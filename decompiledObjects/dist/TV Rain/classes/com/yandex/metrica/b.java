package com.yandex.metrica;

@Deprecated
public enum b
{
  private final String a;
  
  static
  {
    b localb1 = new b("PHONE", 0, "phone");
    b = localb1;
    b localb2 = new b("TABLET", 1, "tablet");
    c = localb2;
    b localb3 = new b("TV", 2, "tv");
    d = localb3;
    e = new b[] { localb1, localb2, localb3 };
  }
  
  private b(String paramString)
  {
    a = paramString;
  }
  
  public static b a(String paramString)
  {
    b[] arrayOfb = values();
    for (int i = 0; i < 3; i++)
    {
      b localb = arrayOfb[i];
      if (a.equals(paramString)) {
        return localb;
      }
    }
    return null;
  }
  
  public String a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */