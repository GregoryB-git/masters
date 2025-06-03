package w5;

import t5.a;
import y5.f;

public class a$c
{
  public final String a;
  public final String b;
  public final String c;
  
  public a$c(String paramString1, String paramString2)
  {
    a = paramString1;
    b = null;
    c = paramString2;
  }
  
  public a$c(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public static c a()
  {
    f localf = a.e().c();
    if (localf.l()) {
      return new c(localf.j(), "main");
    }
    throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      return c.equals(c);
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.hashCode() * 31 + c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DartEntrypoint( bundle path: ");
    localStringBuilder.append(a);
    localStringBuilder.append(", function: ");
    localStringBuilder.append(c);
    localStringBuilder.append(" )");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     w5.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */