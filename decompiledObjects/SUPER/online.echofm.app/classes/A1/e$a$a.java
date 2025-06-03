package A1;

import kotlin.jvm.internal.Intrinsics;

public final class e$a$a
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

/* Location:
 * Qualified Name:     A1.e.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */