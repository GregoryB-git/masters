package A1;

import kotlin.jvm.internal.Intrinsics;

public final class b$a
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

/* Location:
 * Qualified Name:     A1.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */