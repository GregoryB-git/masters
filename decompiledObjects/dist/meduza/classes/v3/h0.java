package v3;

import java.util.HashSet;

public final class h0
{
  public static final HashSet<String> a = new HashSet();
  public static String b = "goog.exo.core";
  
  public static void a(String paramString)
  {
    try
    {
      if (a.add(paramString))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(b);
        localStringBuilder.append(", ");
        localStringBuilder.append(paramString);
        b = localStringBuilder.toString();
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     v3.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */