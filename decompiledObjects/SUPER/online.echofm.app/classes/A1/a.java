package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum a
{
  public static final a o = new a(null);
  
  public static final class a
  {
    public final a a(String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "rawValue");
      if (Intrinsics.a(paramString, "MOBILE_APP_INSTALL")) {
        paramString = a.p;
      } else if (Intrinsics.a(paramString, "CUSTOM_APP_EVENTS")) {
        paramString = a.q;
      } else {
        paramString = a.r;
      }
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     A1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */