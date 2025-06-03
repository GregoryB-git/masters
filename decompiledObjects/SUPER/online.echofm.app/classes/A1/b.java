package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum b
{
  public static final a p = new a(null);
  public final String o;
  
  public b(String paramString1)
  {
    o = paramString1;
  }
  
  public final String e()
  {
    return o;
  }
  
  public static final class a
  {
    public final b a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "rawValue");
      for (b localb : b.values()) {
        if (Intrinsics.a(localb.e(), paramString)) {
          return localb;
        }
      }
      paramString = null;
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     A1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */