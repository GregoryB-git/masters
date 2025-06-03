package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum e$a
{
  public static final a p = new a(null);
  public final String o;
  
  public e$a(String paramString1)
  {
    o = paramString1;
  }
  
  public final String e()
  {
    return o;
  }
  
  public static final class a
  {
    public final e.a a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "rawValue");
      for (e.a locala : e.a.values()) {
        if (Intrinsics.a(locala.e(), paramString)) {
          return locala;
        }
      }
      paramString = null;
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     A1.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */