package S;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public abstract class e
{
  public static final d a()
  {
    return new a(null, true, 1, null);
  }
  
  public static final a b(d.b... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "pairs");
    a locala = new a(null, false, 1, null);
    locala.g((d.b[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    return locala;
  }
}

/* Location:
 * Qualified Name:     S.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */