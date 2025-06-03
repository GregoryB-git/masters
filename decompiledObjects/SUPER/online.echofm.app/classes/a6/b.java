package a6;

import kotlin.jvm.internal.Intrinsics;

public abstract class b
{
  public static final a a(Enum[] paramArrayOfEnum)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfEnum, "entries");
    return new c(paramArrayOfEnum);
  }
}

/* Location:
 * Qualified Name:     a6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */