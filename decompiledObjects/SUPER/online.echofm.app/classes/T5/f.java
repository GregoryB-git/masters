package T5;

import t1.b;

public final class f
  implements AutoCloseable
{
  public f(String paramString)
  {
    a(paramString);
  }
  
  public static void a(String paramString)
  {
    b.c(c(paramString));
  }
  
  public static void b(String paramString, int paramInt)
  {
    b.a(c(paramString), paramInt);
  }
  
  public static String c(String paramString)
  {
    if (paramString.length() >= 124)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString.substring(0, 124));
      localStringBuilder.append("...");
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }
  
  public static void e() {}
  
  public static void h(String paramString, int paramInt)
  {
    b.d(c(paramString), paramInt);
  }
  
  public static f i(String paramString)
  {
    return new f(paramString);
  }
  
  public void close() {}
}

/* Location:
 * Qualified Name:     T5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */