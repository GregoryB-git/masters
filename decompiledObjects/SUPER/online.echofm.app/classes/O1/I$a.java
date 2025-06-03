package O1;

import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class I$a
{
  public final EnumSet a(long paramLong)
  {
    EnumSet localEnumSet = EnumSet.noneOf(I.class);
    Iterator localIterator = I.e().iterator();
    while (localIterator.hasNext())
    {
      I localI = (I)localIterator.next();
      if ((localI.h() & paramLong) != 0L) {
        localEnumSet.add(localI);
      }
    }
    Intrinsics.checkNotNullExpressionValue(localEnumSet, "result");
    return localEnumSet;
  }
}

/* Location:
 * Qualified Name:     O1.I.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */