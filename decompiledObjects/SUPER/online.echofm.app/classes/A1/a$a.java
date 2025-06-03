package A1;

import kotlin.jvm.internal.Intrinsics;

public final class a$a
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

/* Location:
 * Qualified Name:     A1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */