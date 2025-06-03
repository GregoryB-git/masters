package W5;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public class p
  extends o
{
  public static int l(Iterable paramIterable, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramIterable, "<this>");
    if ((paramIterable instanceof Collection)) {
      paramInt = ((Collection)paramIterable).size();
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     W5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */