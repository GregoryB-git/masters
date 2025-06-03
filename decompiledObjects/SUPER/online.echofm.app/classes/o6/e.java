package o6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public abstract class e
{
  public static final long a(long paramLong, d paramd1, d paramd2)
  {
    Intrinsics.checkNotNullParameter(paramd1, "sourceUnit");
    Intrinsics.checkNotNullParameter(paramd2, "targetUnit");
    return paramd2.e().convert(paramLong, paramd1.e());
  }
  
  public static final long b(long paramLong, d paramd1, d paramd2)
  {
    Intrinsics.checkNotNullParameter(paramd1, "sourceUnit");
    Intrinsics.checkNotNullParameter(paramd2, "targetUnit");
    return paramd2.e().convert(paramLong, paramd1.e());
  }
}

/* Location:
 * Qualified Name:     o6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */