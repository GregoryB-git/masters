package W5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class s
  extends r
{
  public static void m(List paramList, Comparator paramComparator)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    if (paramList.size() > 1) {
      Collections.sort(paramList, paramComparator);
    }
  }
}

/* Location:
 * Qualified Name:     W5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */