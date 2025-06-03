package A1;

import kotlin.jvm.internal.Intrinsics;

public final class m$a
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

/* Location:
 * Qualified Name:     A1.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */