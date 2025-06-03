package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum m
{
  public static final a p = new a(null);
  public final String o;
  
  public m(String paramString1)
  {
    o = paramString1;
  }
  
  public final String e()
  {
    return o;
  }
  
  public static final class a
  {
    public final m a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "rawValue");
      for (m localm : m.values()) {
        if (Intrinsics.a(localm.e(), paramString)) {
          return localm;
        }
      }
      paramString = null;
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     A1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */