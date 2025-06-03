package O1;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public enum I
{
  public static final a p;
  public static final EnumSet q;
  public final long o;
  
  static
  {
    p = new a(null);
    EnumSet localEnumSet = EnumSet.allOf(I.class);
    Intrinsics.checkNotNullExpressionValue(localEnumSet, "allOf(SmartLoginOption::class.java)");
    q = localEnumSet;
  }
  
  public I(long paramLong)
  {
    o = paramLong;
  }
  
  public final long h()
  {
    return o;
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     O1.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */